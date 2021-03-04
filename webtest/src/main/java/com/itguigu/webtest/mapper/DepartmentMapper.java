package com.itguigu.webtest.mapper;

import com.itguigu.webtest.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {

    /*返回部门列表*/
    public List<Department> getDep();

    /*根据id查询部门*/
    public Department getDepById(Integer id);

    /*增加部门*/
    public void insertDep(Department department);

    /*更新部门*/
    public void updateDep(Department department);

    /*删除部门*/
    public void deleteDep(Integer id);
}
