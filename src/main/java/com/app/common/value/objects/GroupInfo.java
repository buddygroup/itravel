package com.app.common.value.objects;

import java.io.Serializable;

public class GroupInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9036590244632968359L;

	String grpTypes;
	
	String grpName;
	
	String grpVsble;
	
	String adminName;

	String grpPics;
	
	String grpDesp;

	/**
	 * @return the grpTypes
	 */
	public String getGrpTypes() {
		return grpTypes;
	}

	/**
	 * @param grpTypes the grpTypes to set
	 */
	public void setGrpTypes(String grpTypes) {
		this.grpTypes = grpTypes;
	}

	/**
	 * @return the grpName
	 */
	public String getGrpName() {
		return grpName;
	}

	/**
	 * @param grpName the grpName to set
	 */
	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	/**
	 * @return the grpType
	 */
	public String getGrpVsble() {
		return grpVsble;
	}

	/**
	 * @param grpType the grpType to set
	 */
	public void setGrpVsble(String grpVsble) {
		this.grpVsble = grpVsble;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getGrpPics() {
		return grpPics;
	}

	public void setGrpPics(String grpPics) {
		this.grpPics = grpPics;
	}

	public String getGrpDesp() {
		return grpDesp;
	}

	public void setGrpDesp(String grpDesp) {
		this.grpDesp = grpDesp;
	}
	
	
}
