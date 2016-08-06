package com.app.common.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.common.dao.entity.UsersEntity;


@Repository
public interface UserRepository extends JpaRepository<UsersEntity, Integer>{
	List<UsersEntity> findById(Integer id);

}
