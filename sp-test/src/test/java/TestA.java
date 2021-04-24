import org.junit.Test;
import org.sp.config.AppConfig;
import org.sp.service.ServiceA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestA {

	@Test
	public void testAno(){
		System.out.println(1111111);
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ServiceA serviceA = ac.getBean(ServiceA.class);
		serviceA.callB();
	}
}
