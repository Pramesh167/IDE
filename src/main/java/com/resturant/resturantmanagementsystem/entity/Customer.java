package com.resturant.resturantmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class Customer {
    @Id
    private  Integer id;

    @Column(name="customerName",length=50,nullable = false)
    private  String customerName;


    @ManyToOne
    @JoinColumn(name = "department_id",referencedColumnName = "id",foreignKey = @ForeignKey(name="fk_department_id"))
    private  Department department;
}
