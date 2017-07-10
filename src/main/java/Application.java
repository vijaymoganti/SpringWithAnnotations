import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		CustomerService service1 = applicationContext.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getLastName());
		System.out.println(service);
		System.out.println(service1	);
		
		applicationContext.close();
		
	}

}
