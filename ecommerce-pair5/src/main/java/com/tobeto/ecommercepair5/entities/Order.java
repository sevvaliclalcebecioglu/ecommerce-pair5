package com.tobeto.ecommercepair5.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;
import java.util.List;

@Table(name = "orders")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "shipment_date")
    private LocalDateTime shipmentDate;

    @Column(name = "delivered_date")
    private LocalDateTime deliveredDate;

    @Column(name = "returned_date")
    private LocalDateTime returnedDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @JsonIgnore
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

}
