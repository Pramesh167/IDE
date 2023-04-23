package com.resturant.resturantmanagementsystem.Service.Impl;
import com.resturant.resturantmanagementsystem.Service.CustomerService;
import com.resturant.resturantmanagementsystem.dto.CustomerDto;
import com.resturant.resturantmanagementsystem.entity.Customer;
import com.resturant.resturantmanagementsystem.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    @Override
    public List<Customer> getData() {
        return customerRepo.findAll();
    }

    @Override
    public Optional<Customer> getById(Integer id) {
        return customerRepo.findById(id);
    }


    @Override
    public void saveData (CustomerDto customerDto){
        Customer customer =new Customer();
        customer.setId(customerDto.getId());
        customer.setCustomerName(customerDto.getCustomerName());
        customerRepo.save(customer);

    }
    @Override
    public void deleteById(Integer id) {
        customerRepo.deleteById(id);

    }

}
