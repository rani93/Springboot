package com.cn.cnpayment.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cn.cnpayment.entity.Payment;
import com.cn.cnpayment.service.PaymentService;
import java.util.List;

 /**
  # Complete the PaymentController class, methods to handle HTTP requests with
  required annotations for the following APIs: **/
@RestController
@RequestMapping("/payment")
public class PaymentController {

	// Add proper annotation for auto-wiring PaymentService object.
	PaymentService paymentService;


	// a. GET "/payment/id/{id}" : It retrieves a specific payment by id.
	public Payment getPaymentById(@PathVariable int id)
	{
	// 1. Call the required service method
	// 2. Add proper annotation for Get Mapping and attach the path variable to the method parameter.
		return null;
	}


	// b. GET "/payment/allPayments" : It retrieves a list of all payments.
	public List<Payment> getAllPayments()
	{
	// 1. Call the required service method.
	// 2. Add proper annotation for Get Mapping.
		return null;
	}


	// c. GET "/payment/paymentType/{paymentType}" : It retrieves a payment by type.
	public List<Payment> getPaymentByPaymentType(@PathVariable String paymentType)
	{
	// 1. Call the required service method.
	// 2. Add proper annotation for Get Mapping, attach path variable to the method parameter.
		return null;
	}


	// d. GET "/payment/description/{keyword}" : It retrieves a payment by description keyword.
	public List<Payment> getPaymentByDescriptionKeyword(@PathVariable String keyword)
	{
	// 1. Call the required service method.
	// 2. Add proper annotation for Get Mapping, attach path variable to the method parameter.
		return null;
	}


	// e. POST "/payment/save" (Body: Payment Object) : It saves a new payment.
	public void addPayment(@RequestBody Payment payment){
	// 1. Call the required service method.
	// 2. Add proper annotation for Post Mapping and request body.
	}



}
