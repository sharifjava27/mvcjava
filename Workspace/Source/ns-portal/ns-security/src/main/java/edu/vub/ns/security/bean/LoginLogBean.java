package edu.vub.ns.security.bean;

import java.util.Date;

import edu.vub.ns.webcore.bean.AbstractBean;


@SuppressWarnings("serial")
public class LoginLogBean extends AbstractBean {
	
	private String loginID;
	private String roleID;
	private String ipAddress;
	private Date loginTime;
	private Date logoutTime;
	private String loginStatus;
	private String orgID;
	private String instanceID;
	private String nodeID;
	
	public LoginLogBean() {}
	
	public LoginLogBean(LoginBean loginBean) {
		this.oid = loginBean.getSessionId();
		this.loginID = loginBean.getLoginID();
		this.loginTime = new Date();
		this.orgID = loginBean.getOrgID();
		this.instanceID = loginBean.getInstanceID();
		this.nodeID = loginBean.getNodeID();
	}
	
	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	
	public String getOrgID() {
		return orgID;
	}

	public void setOrgID(String orgID) {
		this.orgID = orgID;
	}

	public String getInstanceID() {
		return instanceID;
	}

	public void setInstanceID(String instanceID) {
		this.instanceID = instanceID;
	}

	public String getNodeID() {
		return nodeID;
	}

	public void setNodeID(String nodeID) {
		this.nodeID = nodeID;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public String getOperation() {
		return operation;
	}

	@Override
	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String getOid() {
		return oid;
	}

	@Override
	public void setOid(String oid) {
		this.oid = oid;
	}

}
