package com.eugine.payment.management.repository;

import com.eugine.payment.management.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  PaymentRepository extends JpaRepository<Payment, Long> {

}
