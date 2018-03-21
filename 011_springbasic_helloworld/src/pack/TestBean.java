package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct=new ClassPathXmlApplicationContext("beans.xml");
		((AbstractApplicationContext)ct).registerShutdownHook();
		Course c=(Course) ct.getBean("restbean");
		c.getInformation();

	}

}
