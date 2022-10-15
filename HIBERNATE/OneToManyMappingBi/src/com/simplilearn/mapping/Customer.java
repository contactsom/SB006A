package com.simplilearn.mapping;

import java.util.Date;
import java.util.Set;

public class Customer {

	private int customerid;
	private String customername;
	private String customeremail;
	private long customerphone;
	private Date customerdob;
		// private String customerAddress Home Work 
	
	Set<Order> order;
	
	public Customer() {
		super();
	}

	public Customer(String customername, String customeremail, long customerphone, Date customerdob) {
		super();
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerphone = customerphone;
		this.customerdob = customerdob;
	}

	public Customer(String customername, String customeremail, long customerphone, Date customerdob,Set<Order> order) {
		super();
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerphone = customerphone;
		this.customerdob = customerdob;
		this.order = order;
	}
	
	public Customer(int customerid, String customername, String customeremail, long customerphone, Date customerdob,
			Set<Order> order) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerphone = customerphone;
		this.customerdob = customerdob;
		this.order = order;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public long getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(long customerphone) {
		this.customerphone = customerphone;
	}

	public Date getCustomerdob() {
		return customerdob;
	}

	public void setCustomerdob(Date customerdob) {
		this.customerdob = customerdob;
	}

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customeremail="
				+ customeremail + ", customerphone=" + customerphone + ", customerdob=" + customerdob + ", order="
				+ order + "]";
	}
	
}
