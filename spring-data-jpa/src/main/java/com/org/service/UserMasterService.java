package com.org.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.UserMaster;

public interface UserMasterService extends JpaRepository<UserMaster, Long> {

}
