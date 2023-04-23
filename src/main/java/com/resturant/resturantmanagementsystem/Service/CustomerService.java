package com.resturant.resturantmanagementsystem.Service;

import com.resturant.resturantmanagementsystem.dto.CustomerDto;
import com.resturant.resturantmanagementsystem.dto.Department_dto;
import com.resturant.resturantmanagementsystem.entity.Customer;
import com.resturant.resturantmanagementsystem.entity.Department;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getData();

    Optional<Customer> getById(Integer id);


    void saveData(CustomerDto customerDto);

    void deleteById(Integer id);

}
