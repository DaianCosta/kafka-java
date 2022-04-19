package br.com.daian.ecommerce;

import java.math.BigDecimal;

public class Order {
    private final String id;
    private final String orderId;
    private final BigDecimal amount;

    public Order(String id, String orderId, BigDecimal amount) {
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
    }
}
