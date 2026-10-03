package com.eugine.payment.management.entity;

import java.math.BigDecimal;
import com.eugine.payment.management.constants.Status;
import  jakarta.persistence.*;

@Entity  // tells Hibernate that this Java class corresponds to a database table
public class Payment {
    @Id // Informs Hibernate that this specific field is the PK.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // "Automatically generate this field, doesn't come in with the rest of the fields"
    private Long id;
    private BigDecimal amount;
    private String currency;
    private Status status;
    private String description;

    // In order for packages outside entity to be able to read variables within the Payment class
    // we use setter and getter access modifiers.
    // We don't want outside packages to mutate payments fields without control

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // no-args constructor.
    // No parametrs or body.
    //Used right when a  new payment is being created, before 'id' exists
    // and before Spring/JPA has anything to populate.
    // Every field would start out as null
    public Payment() {

    }

    // all-args constructor.
    //takes all fields and does assignemtn

    public Payment(BigDecimal amount, String currency, Status status, String description) {
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.description = description;
    }
}



