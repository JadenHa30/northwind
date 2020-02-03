package com.example.northwind;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.example.northwind.OrdersTaxStatus")
@Table(name = "orders_tax_status")
public class OrdersTaxStatus {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Byte id;
  @Column(name = "\"tax_status_name\"", nullable = false)
  private String taxStatusName;
}