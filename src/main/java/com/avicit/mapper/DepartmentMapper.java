package com.avicit.mapper;

import com.avicit.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 采用注解方式
 * Created by zhaoc on 2018/7/12
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Update("update department set departmentName={departmentName} where id={#id}")
    public int updateDept(Department department);
}
