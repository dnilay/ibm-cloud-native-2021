package com.example.departmentservice.service;

import com.example.departmentservice.model.Department;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    public Department createDepartment(Department department);
    public List<Department> displayAllDepartment();
    public Optional<Department> findDepartment(String id);
}
