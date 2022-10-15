package com.simplilearn.mapping;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ACUSTOMER_DETAILS_BI")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private int customerid;
	
	@Column(name="CUSTOMER_NAME")
	private String customername;
	
	@Column(name="CUSTOMER_EMAIL")
	private String customeremail;
	
	@Column(name="CUSTOMER_PHONE")
	private long customerphone;
	
	@Column(name="CUSTOMER_DOB")
	private Date customerdob;
		// private String customerAddress Home Work 
	
	
	@OneToMany(mappedBy = "customer")
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
