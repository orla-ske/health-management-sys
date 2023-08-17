package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long>{
    Privilege findByName(String name);

    @Override 
    void delete(Privilege privilege);
}
