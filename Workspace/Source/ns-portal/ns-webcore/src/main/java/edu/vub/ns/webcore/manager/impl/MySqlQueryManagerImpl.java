package edu.vub.ns.webcore.manager.impl;

import edu.vub.ns.webcore.manager.QueryManager;
import edu.vub.ns.webcore.util.Constant;
import edu.vub.ns.webcore.util.Table;

public class MySqlQueryManagerImpl implements QueryManager, Constant {
	
	@Override
	public String updateFeatureJSON() {
		String sql = "update "+Table.LOGIN+"  set FEATUREJSON = ? , UPDATEDBY = ?, UPDATEDON = ? where LOGINID = ?";
		return sql;
	}
	
	public String getLoginLogBySessionID(String oid) {
		String sql = "SELECT * FROM "+Table.LOGIN_LOG+" where oid = '"+oid+"'  ";
		return sql;
	}

}





