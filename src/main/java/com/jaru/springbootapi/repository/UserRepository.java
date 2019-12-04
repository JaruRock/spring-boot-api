package com.jaru.springbootapi.repository;

import com.jaru.springbootapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users us WHERE us.first_name like %?1%" , nativeQuery = true)
    List<User> findByUserFirstNameContaining(String firstName);
}
