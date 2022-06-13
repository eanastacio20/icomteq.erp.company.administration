package com.icomteq.erp.company.administration.persistence.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icomteq.erp.company.administration.persistence.master.model.MasterModuleTree;
import com.icomteq.erp.company.administration.persistence.master.model.MasterModuleTreeId;

@Repository
public interface MasterModuleTreeRepository extends JpaRepository<MasterModuleTree, MasterModuleTreeId> {

}
