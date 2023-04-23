package com.resturant.resturantmanagementsystem.Service;

import com.resturant.resturantmanagementsystem.dto.Department_dto;
import com.resturant.resturantmanagementsystem.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    List<Department> getData();

    Optional<Department> getById(Integer id);

    void saveData(Department_dto departmentDto);

    void deleteById(Integer id);
}
