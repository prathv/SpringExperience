import com.springexperience.service.CustomerService;
import com.springexperience.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findall().get(0).getFirstname());
	}

}
