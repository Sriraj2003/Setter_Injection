package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args)
	{
		//hold the neame and location of spring bean cfg file in Resource object
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/ApplicationContext.xml");
		//create BeanFactory springcontainer(IOC contianer)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		System.out.println("-------------------------------------");
		//get target spring bean class obj injected with dependent spirng bean class obj
		Object object=factory.getBean("wmg");
		//type casting
		WishMessageGenerator generator=(WishMessageGenerator)object;
		//invoke the b.method
		String msg=generator.generateMessage("raja");
		System.out.println("WishMessage is::"+msg);
		
		
	}
}
