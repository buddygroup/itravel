package com.app.common.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.common.dao.entity.GroupsEntity;

/**
 * Repository : Groups.
 */
public interface GroupsJpaRepository extends JpaRepository<GroupsEntity, Integer> {

}
