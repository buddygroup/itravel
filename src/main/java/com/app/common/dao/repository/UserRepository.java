package com.app.common.dao.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.common.dao.entity.UsersEntity;
import java.lang.Integer;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<UsersEntity, Serializable>{
	List<UsersEntity> findById(Integer id);
}
