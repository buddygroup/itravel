package com.app.common.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.common.dao.entity.ContentTypeEntity;

/**
 * Repository : ContentType.
 */
public interface ContentTypeJpaRepository extends JpaRepository<ContentTypeEntity, Integer> {

}
