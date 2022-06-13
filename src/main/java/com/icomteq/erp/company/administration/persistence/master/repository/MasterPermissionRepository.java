package com.icomteq.erp.company.administration.persistence.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icomteq.erp.company.administration.persistence.master.model.MasterPermission;
import com.icomteq.erp.company.administration.persistence.master.model.MasterPermissionId;

@Repository
public interface MasterPermissionRepository extends JpaRepository<MasterPermission, MasterPermissionId>{
	
}
