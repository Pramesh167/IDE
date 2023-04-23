package com.resturant.resturantmanagementsystem.controller;
import com.resturant.resturantmanagementsystem.Service.CustomerService;
import com.resturant.resturantmanagementsystem.dto.CustomerDto;
import com.resturant.resturantmanagementsystem.entity.Customer;
import com.resturant.resturantmanagementsystem.entity.Department;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;
    @GetMapping
    public List<Customer> getData(){
        return customerService.getData();
    }

    @GetMapping("getById/{id}")
    public Optional<Customer> getById(@PathVariable Integer id){
        return customerService.getById(id);
    }

    @DeleteMapping ("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
        return "deleted successfully";

    }


    @PostMapping("save")
    public  String saveData (@Valid CustomerDto customerDto){
        customerService.saveData(customerDto);
        System.out.println(customerDto);
        return "data saved";
    }


}
