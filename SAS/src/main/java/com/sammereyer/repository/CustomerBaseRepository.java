package com.sammereyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sammereyer.domain.CustomerBase;

@Repository
public interface CustomerBaseRepository extends JpaRepository<CustomerBase, Long> {

}
