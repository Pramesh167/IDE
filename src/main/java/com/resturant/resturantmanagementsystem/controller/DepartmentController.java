package com.resturant.resturantmanagementsystem.controller;

import com.resturant.resturantmanagementsystem.Service.DepartmentService;
import com.resturant.resturantmanagementsystem.dto.Department_dto;
import com.resturant.resturantmanagementsystem.entity.Department;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("form")
    public String getFormPage(){
        return  "ddepartmentForm";
    }

    @GetMapping
    public List<Department> getData(){
        return departmentService.getData();
    }
    @GetMapping("getById/{id}")
    public Optional<Department> getById(@PathVariable Integer id){
        return departmentService.getById(id);
    }

    @DeleteMapping ("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        departmentService.deleteById(id);
        return "deleted successfully";

    }

////
//    @GetMapping("getData")
//    public String getData(){
//        return "fetched data";
//    }

    @PostMapping("save")
    public  String saveData (@Valid Department_dto departmentDto){
        departmentService.saveData(departmentDto);
        System.out.println(departmentDto);
        return "data saved";
    }


}
