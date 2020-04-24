package com.ananth.Springftest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Car car = new Car();
    	//Vehicle obj = new Car();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	// gerBean will give object of object of vehicle 
    	//Vehicle obj = (Vehicle) context.getBean("vehicle");
//    	Vehicle obj = (Vehicle) context.getBean("bike");
//       	
    	Car obj = (Car) context.getBean("car");
    	obj.drive();
    	
//    	Tyre t = (Tyre) context.getBean("tyre");
//    	System.out.println(t);
    	
    }
}
