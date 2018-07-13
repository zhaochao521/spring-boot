package com.avicit.mapper;

import com.avicit.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * 使用xml文件方式
 * Created by zhaoc on 2018/7/13
 */
@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);
}
