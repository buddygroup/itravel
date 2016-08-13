package com.app.common.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.common.dao.entity.GroupTypeEntity;

/**
 * Repository : GroupType.
 */
public interface GroupTypeJpaRepository extends JpaRepository<GroupTypeEntity, Integer> {

}
