package com.fq.springboot.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author qianfang, at 2019-11-24, 19:55
 **/
public interface DeptRepository extends JpaRepository<Dept, Integer> {

    @Query(value = "select dept_no, dept_name, db_source from dept", nativeQuery = true)
    List<Dept> listAll();

    /**
     * 通过 :param 和 @Param结合 传递参数
     */
    @Query(nativeQuery = true, value = "select dept_no,dept_name,db_source from dept where dept_no = :id")
    Dept findbyid(@Param("id") Integer id);

    /**
     * 通过 ?1 指明传递参数位置
     *
     * @param name
     * @return
     */
    @Query(nativeQuery = true, value = "select dept_no,dept_name,db_source from dept where dept_name = ?1")
    List<Dept> findbyname(String name);

    /**
     * 可以添加 @Modifying 注解 支持 update 和 delete 操作
     * service 层要添加  @Transactional
     */
    @Modifying
    @Query(nativeQuery = true, value = "update dept set dept_name=:deptName where dept_no = :id")
    Integer updateById(@Param("id") Integer id, @Param("deptName") String deptName);
}
