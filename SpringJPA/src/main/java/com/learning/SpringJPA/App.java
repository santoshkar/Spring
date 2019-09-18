package com.learning.SpringJPA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.config.AppConfig;
import com.learning.model.Employee;
import com.learning.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx =  
        		new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService empService = ctx.getBean(EmployeeService.class);
        
        /*Employee emp = new Employee();
        emp.setName("Sudhakar");
        emp.setDeptId(1);
        empService.createNewEmployee(emp);
        */
        
        Employee e = empService.getEmployeeById(1L);
        System.out.println(e);
        
        
    }
}
