package com.icomteq.erp.company.administration.persistence.company.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CompanyAccessPermissionId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ProfileID", nullable = false)
	private short profileId;

	@Column(name = "ModuleID", nullable = false)
	private short moduleId;

	@Column(name = "MemberModuleID", nullable = false)
	private short memberModuleId;

}
