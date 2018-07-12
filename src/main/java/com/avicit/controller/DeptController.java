package com.avicit.controller;

import com.avicit.bean.Department;
import com.avicit.mapper.DepartmentMapper;
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

    @GetMapping("/dept/{id}")
    public Department getDepartMent(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }


}
