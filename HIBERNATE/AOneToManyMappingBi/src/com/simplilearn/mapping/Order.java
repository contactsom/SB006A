package com.simplilearn.mapping;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AORDER_INFO_BI")
public class Order {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ORDER_ID")
		private int orderid;
		
		@Column(name="ORDER_QTY")
		private int orderQty;
		
		@Column(name="ORDER_COST")
		private Double ordercost;
		
		@Column(name="ORDER_DATE")
		private Date orderdate;
		
		@Column(name="ORDER_STATUS")
		private String orderstatus;
		
		@ManyToOne
		@JoinColumn(name="customerid", referencedColumnName = "CUSTOMER_ID")
		Customer customer;
		
		public Order() {
			super();
			
		}

		public Order(int orderQty, Double ordercost, Date orderdate, String orderstatus) {
			super();
			this.orderQty = orderQty;
			this.ordercost = ordercost;
			this.orderdate = orderdate;
			this.orderstatus = orderstatus;
		}

		public Order(int orderQty, Double ordercost, Date orderdate, String orderstatus,
				Customer customer) {
			super();
			this.orderQty = orderQty;
			this.ordercost = ordercost;
			this.orderdate = orderdate;
			this.orderstatus = orderstatus;
			this.customer = customer;
		}
		
		public Order(int orderid, int orderQty, Double ordercost, Date orderdate, String orderstatus,
				Customer customer) {
			super();
			this.orderid = orderid;
			this.orderQty = orderQty;
			this.ordercost = ordercost;
			this.orderdate = orderdate;
			this.orderstatus = orderstatus;
			this.customer = customer;
		}

		public int getOrderid() {
			return orderid;
		}

		public void setOrderid(int orderid) {
			this.orderid = orderid;
		}

		public int getOrderQty() {
			return orderQty;
		}

		public void setOrderQty(int orderQty) {
			this.orderQty = orderQty;
		}

		public Double getOrdercost() {
			return ordercost;
		}

		public void setOrdercost(Double ordercost) {
			this.ordercost = ordercost;
		}

		public Date getOrderdate() {
			return orderdate;
		}

		public void setOrderdate(Date orderdate) {
			this.orderdate = orderdate;
		}

		public String getOrderstatus() {
			return orderstatus;
		}

		public void setOrderstatus(String orderstatus) {
			this.orderstatus = orderstatus;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		@Override
		public String toString() {
			return "Order [orderid=" + orderid + ", orderQty=" + orderQty + ", ordercost=" + ordercost + ", orderdate="
					+ orderdate + ", orderstatus=" + orderstatus + ", customer=" + customer + "]";
		}
		
}
