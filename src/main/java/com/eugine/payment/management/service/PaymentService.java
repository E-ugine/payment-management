package com.eugine.payment.management.service;

import com.eugine.payment.management.constants.Status;
import com.eugine.payment.management.entity.Payment;
import com.eugine.payment.management.exceptions.PaymentNotFoundException;
import com.eugine.payment.management.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElseThrow(() -> new PaymentNotFoundException("Payment Not Found:" + id));
    }
}