package com.vem.daysndays.user.repository;

import com.vem.daysndays.user.data.entity.RoleEntity;
import com.vem.daysndays.user.data.model.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByName(ERole name);
}