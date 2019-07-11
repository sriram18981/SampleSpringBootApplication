package com.org.project.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.project.sample.bean.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
