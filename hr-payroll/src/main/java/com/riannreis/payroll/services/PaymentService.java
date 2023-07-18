package com.riannreis.payroll.services;

import org.springframework.stereotype.Service;

import com.riannreis.payroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
	

}
