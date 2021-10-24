package com.devsuperior.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		/*Worker worker = restTemplate.getForObject(workerHost + "/worker/{id}", Worker.class, uriVariables);*/
		/*return new Payment("Bob", 200.0, days);*/
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}


/*http://localhost:8001/workers/1*/