package com.adi.test;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Vector;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.adi.config.AppConfig;
import com.adi.service.DepartmentService;
import com.adi.service.EmployeeService;

public class MainTest {
	@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String args[]) throws Exception {
		ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService empService =ctx.getBean("myEmployeeService",EmployeeService.class);
		DepartmentService deptService=ctx.getBean("myDepartmentService",DepartmentService.class);
		System.out.println("Employee Service ="+empService);
		System.out.println("DAO in Employee Service ="+empService.getEmployeedao());
		System.out.println("Dpeartment Service ="+deptService);
		System.out.println("DAO in Department Service ="+deptService.getEmployeedao());
		
		Field f=ClassLoader.class.getDeclaredField("classes");
		f.setAccessible(true);
		Vector<Class> classes=(Vector<Class>) f.get(ctx.getClassLoader());
		for(Iterator iterator=classes.iterator(); iterator.hasNext();) {
			Class class1=(Class)iterator.next();
			if(class1.getName().contains("com.adi")) {
				System.out.println("==>"+class1.getName());
			}
		}
		ctx.close();
	}
}
