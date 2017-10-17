import java.util.List;

import com.pluralsight.spring.Customer;
import com.pluralsight.spring.service.CustomerService;
import com.pluralsight.spring.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		CustomerService service=new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstname());
			
	
		
	}
	

}
