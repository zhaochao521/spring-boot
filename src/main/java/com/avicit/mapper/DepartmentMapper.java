package com.avicit.mapper;

import com.avicit.bean.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by zhaoc on 2018/7/12
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Insert("insert into department departmentName values(#{departmentName})")
    public int  insertDept(String department);

    @Update("update department set departmentName={departmentName} where id={#id}")
    public int updateDept(Department department);
}
