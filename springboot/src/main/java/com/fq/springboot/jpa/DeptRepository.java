package com.fq.springboot.jpa;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qianfang, at 2019-11-24, 19:55
 **/
public interface DeptRepository extends JpaRepository<Dept, Integer> {
}
