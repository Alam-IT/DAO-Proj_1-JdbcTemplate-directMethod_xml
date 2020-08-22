package com.alamit.service;

import java.util.List;
import java.util.Map;

import com.alamit.dao.ICustomerDao;

public class CustomerService implements ICustomerService {
	private ICustomerDao dao;

	public void setDao(ICustomerDao dao) {
		this.dao = dao;
	}

	public int registerCustomer(int cid, String cname, long duePay, String custAddress) {

		return 0;
	}

	public Map<String, Object> getCustomerDetail(int cid) throws Exception {
		Map<String, Object> map = dao.listCustomerDetail(cid);
		if (map != null) {
			return map;
		} else {
			throw new Exception("Customer not found");
		}

	}

	public List<Map<String, Object>> getAllCustomerDetail() throws Exception {

		List<Map<String, Object>> list = dao.listAllCustomerDetail();
		if (list != null) {
			return list;
		} else {
			throw new Exception("Customer not found");
		}
	}

	public String removeCustomer(int cid) {
		int result = dao.deleteCustomer(cid);
		if (result == 0)
			return cid + "Customer not found";
		else

			return "Customer deleted";
	}

	public int updateDue(int cid, int newDuePay) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
