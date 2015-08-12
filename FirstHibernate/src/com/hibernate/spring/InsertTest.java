package com.hibernate.spring;

import javax.annotation.Resource;

public class InsertTest {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory = new XmlBeanFactory(r);  
      
    EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
      
    Employee e=new Employee();  
    e.setId(114);  
    e.setName("varun");  
    e.setSalary(50000);  
      
    dao.saveEmployee(e);  
      
}  
}  
