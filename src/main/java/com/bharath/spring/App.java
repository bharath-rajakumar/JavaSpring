package com.bharath.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/bharath/spring/beans/beans.xml");
        Person person = (Person)context.getBean("person");
        person.speak();

        System.out.println(person);

        ((FileSystemXmlApplicationContext)context).close();
    }
}
