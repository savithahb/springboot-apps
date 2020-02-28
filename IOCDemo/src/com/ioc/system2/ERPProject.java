package com.ioc.system2;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.ioc.events.MyEventPublisher;

//import org.springframework.stereotype.Component;

//@Component

public class ERPProject implements Project, InitializingBean, DisposableBean{
	
	@Autowired
	MyEventPublisher publish;
	
	
	public ERPProject ()
	
	{
	System.out.println("ERP Project Instantiated");
	System.out.println(hashCode());
	}
	@Override
	public void details () {
		System.out.println("ERP Project Started");
		publish.publish("ERP Project Data");
			
	}
	
		@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After Properties Set");
		
	}
		@PreDestroy
		public void doTask() {
			System.out.println("Destruction task");
		}
		
		@Override
		public void destroy() throws Exception{
			System.out.println("In Destroy **");
			System.out.println("Finalization Task");
			
		}

}
