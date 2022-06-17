package com.ojas._SpringFramework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ojas.spring.Student1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\ojas\\spr\\spring.xml"));
    	Student1 stu=(Student1)factory.getBean("stu");
    	stu.display();
    
    
    
    }
}
