package com.jamesfen.myjee.aop.xml;

public class StudentImpl implements  IStudent{
	public   void  addStudent(String name) {
		           System.out.println( " 欢迎  " + name + "  你加入Spring家庭! " );
		       } 
	
	public   void  removeStudent(String name) {
        System.out.println( " 他已转学：  " + name + "  ! " );
    }
}
