package com.alamit.dao;

import java.util.List;
import java.util.Map;

public interface ICustomerDao {
	public int insert(int cid, String cname, long duePay, String custAddress);

	public Map<String, Object> listCustomerDetail(int cid);

	public List<Map<String, Object>> listAllCustomerDetail();

	public int deleteCustomer(int cid);

	public int updateCustomerDuePay(int cid, int newDuePay);
}
