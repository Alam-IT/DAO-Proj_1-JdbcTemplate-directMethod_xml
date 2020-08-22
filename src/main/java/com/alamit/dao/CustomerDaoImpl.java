package com.alamit.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDaoImpl implements ICustomerDao {
	private static final String GET_All_Customer_by_No = "SELECT CID,CNAME,DUEPAY,CUST_ADDRESS FROM CUSTOMER WHERE CID=?";
	private static final String GET_All_Customer = "SELECT CID,CNAME,DUEPAY,CUST_ADDRESS FROM CUSTOMER";

	private static final String delete_cust = "DELETE FROM CUSTOMER WHERE CID=?";
	private static final String update_customer_duePay = "UPDATE CUSTOMER SET DUEPAY=? WHERE CID=?";
	private static final String INSERT_QUERY = "INSERT INTO CUSTOMER(CID,CNAME,DUEPAY,CUST_ADDRESS) VALUES(?,?,?,?)";

	private JdbcTemplate jt;

	// setter injection
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(int cid, String cname, long duePay, String custAddress) {

		int insertResult = jt.update(INSERT_QUERY, cid, cname, duePay, custAddress);
		return insertResult;
	}

	public Map<String, Object> listCustomerDetail(int cid) {
		Map<String, Object> map = jt.queryForMap(GET_All_Customer_by_No, cid);
		return map;
	}

	public List<Map<String, Object>> listAllCustomerDetail() {
		List<Map<String, Object>> list = jt.queryForList(GET_All_Customer);
		return list;
	}

	public int deleteCustomer(int cid) {
		int update = jt.update(delete_cust, cid);
		return update;
	}

	public int updateCustomerDuePay(int cid, int newDuePay) {
		int result = jt.update(update_customer_duePay, newDuePay, cid);
		return result;
	}

}
