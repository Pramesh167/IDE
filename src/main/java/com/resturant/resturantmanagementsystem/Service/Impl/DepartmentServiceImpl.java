package com.resturant.resturantmanagementsystem.Service.Impl;

import com.resturant.resturantmanagementsystem.Service.DepartmentService;
import com.resturant.resturantmanagementsystem.dto.Department_dto;
import com.resturant.resturantmanagementsystem.entity.Department;
import com.resturant.resturantmanagementsystem.repo.DepartmentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepo departmentRepo;

    @Override
    public List<Department> getData() {
        return departmentRepo.findAll();
    }

    @Override
    public Optional<Department> getById(Integer id) {
        return departmentRepo.findById(id);
    }

    @Override

    public void saveData (Department_dto departmentDto){
        Department department =new Department();
        department.setId(departmentDto.getId());
        department.setDepartmentName(departmentDto.getDepartmentName());
        departmentRepo.save(department);

    }

    @Override
    public void deleteById(Integer id) {
        departmentRepo.deleteById(id);
    }
}
