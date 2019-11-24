package com.fq.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    DeptRepository deptRepository;

    @GetMapping("/jpa/{id}")
    public Dept getUser(@PathVariable("id") Integer id) {
        Dept user = deptRepository.findOne(id);
        return user;
    }

    @GetMapping("/jpa")
    public List<Dept> findAll() {
        return deptRepository.findAll();
    }
}
