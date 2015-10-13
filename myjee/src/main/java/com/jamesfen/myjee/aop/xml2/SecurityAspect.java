package com.jamesfen.myjee.aop.xml2;

import org.aspectj.lang.ProceedingJoinPoint;

public class SecurityAspect {
	/**
	 * 权限检查
	 */
	public void checkAuthority() {
		System.out.println("方法调用前，先检查权限!");
	}
	
	
    public Object doAround(ProceedingJoinPoint jp) throws java.lang.Throwable {
        System.out.println("执行目标方法之前，模拟开始事物...");
        // 执行目标方法，并保存目标方法执行后的返回值
        Object rvt = jp.proceed(new Integer[]{3,4});
        System.out.println("执行目标方法之后，结束为："+rvt.toString());
        return rvt + "新增的内容";
    }
}

