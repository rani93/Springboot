package com.cn.cnpayment.dal;

import com.cn.cnpayment.entity.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**  Note: Session annotation will be imported through "org.hibernate" whereas for transactional & EntityManager 
 	  annotations, you must import the Jakarta package as shown below:

	                       import jakarta.transaction.Transactional;

	  **/


/**
 				Complete the PaymentDALImpl class as mentioned below:

 								Tasks:-

				 a. Autowire EntityManager.

				 b. Override the following methods:

				 1. getById(int id) : This method fetches the payment entity from
				 the database for a specific id.

				 2. getAllPayments() : This method fetches the list of payments from
				 the database.

				 3. getByPaymentType(String paymentType) : This method fetches the list
				 of payments from the database based on the paymentType received.

				 4. getByPaymentDescription(String keyword) : This method fetches the list
				 of payments from the database based on the keyword received.

				 5. addPayment(Payment payment) : This method saves a payment entity into the
				 database.

 **/

@Repository

public class PaymentDALImpl implements PaymentDAL {

	@Override
	public Payment getById(int id) {
		return null;
	}

	@Override
	public List<Payment> getAllPayments() {
		return List.of();
	}

	@Override
	public List<Payment> getByPaymentType(String paymentType) {
		return List.of();
	}

	@Override
	public List<Payment> getByPaymentDescription(String keyword) {
		return List.of();
	}

	@Override
	public void addPayment(Payment payment) {

	}
}
