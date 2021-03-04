package com.itguigu.webtest.controller;

import com.itguigu.webtest.mapper.DepartmentMapper;
import com.itguigu.webtest.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//@Controller
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/getDep")
    public List<Department> getDep(){
        List<Department> depList = departmentMapper.getDep();
        for (Department dep : depList){
            System.out.println(dep);
        }
        return depList;

    }

    @GetMapping("/insertDep")
    public String insertDep(){
//        Department department = new Department(4,"财务部",4);
        Department department = new Department();
        department.setDepartmentName("招待部");
        department.setFloor(1);
        departmentMapper.insertDep(department);
        return "insert successfully";
    }

    @GetMapping("/updateDep")
    public String updateDep(){
        Department department = new Department(1,"后勤部",1);
        departmentMapper.updateDep(department);
        return "update successfully";
    }

    @GetMapping("/deleteDep")
    public String deleteDep(){
        departmentMapper.deleteDep(1);
        return "delete successfully";
    }

    @GetMapping("/getDepById")
    public Department getDepById(){
        Department department = departmentMapper.getDepById(4);
        return department;
    }
}
