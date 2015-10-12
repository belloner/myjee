package com.sinotrans.myjee.springmvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinotrans.myjee.log4j.HelloLog4j;

@Controller
@RequestMapping("/welcome")
public class HelloWorldController {
	static Logger logger = Logger.getLogger(HelloWorldController.class);
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		model.addAttribute("james", "ffffffff");
		model.put("very", "hi");
		return "hello";
	}

	@RequestMapping("/listall")
	public String listAll(Map<String, Object> model) {
   
		List<Person> personList = getAll();
		model.put("personList", personList);

		System.out.println(" listall hello");

		//return "person/jPersonList";
		return "list";
	}
	public List<Person> getAll(){
		List<Person> listp=new ArrayList<Person>();
		Person p=new Person();
		p.setAge(40);
		p.setId(1);
		p.setName("jaems");
		Person p2=new Person();
		p2.setAge(40);
		p2.setId(1);
		p2.setName("jaems");
		listp.add(p);
		listp.add(p2);
		return listp;
	}
	@RequestMapping(value = "/pjson/{id:\\d+}", method = RequestMethod.GET)
	public @ResponseBody
	List<Person> getPerson2(@PathVariable("id") int id) {
		// 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
		
		return getAll();

	}
	@RequestMapping(value = "/person/{id:\\d+}", method = RequestMethod.GET)
	public @ResponseBody
	String getPerson(@PathVariable("id") int id) {

		JSONObject jsonObject = new JSONObject();
		//jsonObject.put("persons", getAll());
		jsonObject.put("msg",  "");

		return jsonObject.toJSONString();

	}

}
