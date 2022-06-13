package com.icomteq.erp.company.administration.payload;

import java.util.List;

import com.icomteq.erp.company.administration.enums.PermissionAccess;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModuleDto {

	private Short moduleId;

	private Short parentModuleId;

	private String fullDisplayName;

	private String description;

	private byte menuLevel;

	private String url;

	private String iconPath;

	private String requiresSelected;

	private byte showInNavigationMenu;

	private boolean showWhenDisabled;

	private byte systemRequiredFlag;

	private String shortDisplayName;

	private byte recordActiveFlag;

	private String displayNameOverride;

	private Short orderSequence;

	private String iconPathOverride;

	private byte showInNavigationMenuOverride;

	private PermissionAccess permissionAccess;

	private boolean hasChildren;

	private String urloverride;

	private String tooltipText;

	private String alertText;

	private String dialogText;
	
	private String urlParam;

	private List<ModuleDto> childModules;

}
