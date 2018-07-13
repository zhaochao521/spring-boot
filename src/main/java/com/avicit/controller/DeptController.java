package com.avicit.controller;

import com.avicit.bean.Department;
import com.avicit.bean.Employee;
import com.avicit.mapper.DepartmentMapper;
import com.avicit.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoc on 2018/7/12
 */

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartMent(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);

    }


}
