package spring_sample_xml_anno;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.service.CustomerService;

public class Test {
	
	@InjectMocks
	private CustomerService cs;
	
	@Mock
	private CustomerRepository cr;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	/*@Test
	public void springTest(){
		Customer c = new Customer();
		c.setFirstName("vijay");
		cs.findAll()
	}*/

}
