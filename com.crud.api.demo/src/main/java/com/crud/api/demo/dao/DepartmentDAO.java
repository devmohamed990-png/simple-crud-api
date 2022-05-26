package com.crud.api.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.api.demo.model.Department;

@Repository
public interface DepartmentDAO extends JpaRepository<Department, Integer> {

}