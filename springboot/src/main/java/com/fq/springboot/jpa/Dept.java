package com.fq.springboot.jpa;


import lombok.Data;

import javax.persistence.*;

/**
 * @author qianfang, at 2019-11-24, 19:49
 **/
@Entity
@Table(name = "dept")
@Data
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dept_no")
    private Integer deptId;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "db_source")
    private String daSource;
}
