package com.icomteq.erp.company.administration.persistence.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icomteq.erp.company.administration.persistence.master.model.MasterAppliance;

@Repository
public interface MasterApplianceRepository extends JpaRepository<MasterAppliance, Integer> {

}
