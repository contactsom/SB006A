package com.simplilearn.student;

/*POJO*/
public class Student {

	int stuid;
	String stuname;
	String stuemail;
	int phone;
	
	public Student() {
	}
	
	public Student(String stuname, String stuemail, int phone) {
		super();
		this.stuname = stuname;
		this.stuemail = stuemail;
		this.phone = phone;
	}
	
	public Student(int stuid, String stuname, String stuemail, int phone) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuemail = stuemail;
		this.phone = phone;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStuemail() {
		return stuemail;
	}

	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stuemail=" + stuemail + ", phone=" + phone + "]";
	}
	
}
