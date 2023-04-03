package com.example.orderRestfulServer.models;

import lombok.Data;

import javax.persistence.*;

@Table(name = "check_order_status")
@Entity
@Data
public class CheckOrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_number")
    private String order_number;

    @Column(name = "company_id")
    private String company_id;

    @Column(name = "order_status")
    private String order_status;
}
