package com.resturant.resturantmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table
@Getter
@Setter
@Entity
public class Department {
    @Id
    @SequenceGenerator(name ="users_seq_gen",sequenceName = "users_id_seq",allocationSize = 1)
    @GeneratedValue(generator = "users_seq_gen",strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name="department_name",length=50,nullable = false)
    private  String departmentName;
}
