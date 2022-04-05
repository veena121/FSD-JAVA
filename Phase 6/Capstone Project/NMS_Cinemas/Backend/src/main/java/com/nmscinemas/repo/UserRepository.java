package com.nmscinemas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nmscinemas.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
