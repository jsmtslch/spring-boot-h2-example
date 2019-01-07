package com.example.demo.h2.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.h2.domain.Student;

@Repository
public class StudentJdbcRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Student findByID(Long id){
		return jdbcTemplate.queryForObject("select * from student where id=?", new Object[]{
				id
		}, new BeanPropertyRowMapper<Student>(Student.class));
	}
}
