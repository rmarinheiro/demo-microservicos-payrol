package payroll.payrolms.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import payroll.payrolms.entities.Worker;

@Component
//@FeignClient(name = "hr-worker",url="localhost:8001",path = "/workers")
@FeignClient(name = "hr-worker",path = "/workers")
public interface WorkerFeignClients {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id);

}
