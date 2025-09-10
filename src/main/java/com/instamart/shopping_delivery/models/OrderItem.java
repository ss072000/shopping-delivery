package com.instamart.shopping_delivery.models;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.ui.context.support.UiApplicationContextUtils;

import java.util.UUID;

@Data
@Entity
@Table(name = "orderItems")
public class OrderItem {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    UUID orderId;
    UUID productId;
    int quantity;
    int totalAmount;



}
