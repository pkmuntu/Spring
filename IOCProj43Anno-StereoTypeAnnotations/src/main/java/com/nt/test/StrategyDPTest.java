package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 Flipkart fpkt=null,fpkt1=null;
		//create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get Bean
		//fpkt=ctx.getBean("flipkart",Flipkart.class);
		 fpkt=ctx.getBean(Flipkart.class);
		 fpkt1=ctx.getBean(Flipkart.class);
		 System.out.println(fpkt.hashCode()+"   "+fpkt1.hashCode());
		//invoke the methods
		System.out.println(fpkt.shopping(new String[] {"PPEKit"," MASK","Sanitizer"},new float[] {2000,500,200}));
		//close container
		((AbstractApplicationContext) ctx).close(); 
	}//main
}//class
