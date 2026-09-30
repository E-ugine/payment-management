package com.eugine.payment.management.entity;

import java.math.BigDecimal;
import com.eugine.payment.management.constants.Status;

public class Payment {
    Long id;
    BigDecimal amount;
    String currency;
    Status status;
    String description;
}
