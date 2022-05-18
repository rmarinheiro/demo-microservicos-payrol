package payroll.payrolms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@RibbonClient(name = "hr-worker")
@EnableEurekaClient
public class PayrolMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrolMsApplication.class, args);
	}

}
