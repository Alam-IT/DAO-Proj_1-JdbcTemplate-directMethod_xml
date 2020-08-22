package com.alamit.service;

import java.util.List;
import java.util.Map;

public interface ICustomerService {
	public int registerCustomer(int cid, String cname, long duePay, String custAddress);

	public Map<String, Object> getCustomerDetail(int cid) throws Exception;

	public List<Map<String, Object>> getAllCustomerDetail() throws Exception;

	public String removeCustomer(int cid);

	public int updateDue(int cid, int newDuePay);
}
