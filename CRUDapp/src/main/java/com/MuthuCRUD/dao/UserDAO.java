package com.MuthuCRUD.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.MuthuCRUD.model.Userinfo;

public interface UserDAO extends CrudRepository<Userinfo, Integer> {

	Optional<Userinfo> findByName(String username);



}
