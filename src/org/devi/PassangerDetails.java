package org.devi;

import java.util.Date;

public class PassangerDetails {

	private String passangerName;
	private int age;
	private String gender;
	private String email;
	private long phone;
	private Date date;
	private Coach coach;
	private Berth berth;
//		super();
//		this.passangerName = passangerName;
//		this.age = age;
//		this.gender = gender;
//		this.email = email;
//		this.phone = phone;
//		this.date = date;
//		this.coach = coach;
//		this.berth = berth;
	

	public PassangerDetails(String passangerName, int passangerAge, String passangerGender, String passangerEmail,
			long passangerPhone, Berth passangerBerth, Coach passangerCoach, Date passangerDate) {
		super();
		this.passangerName = passangerName;
		this.age = passangerAge;
		this.gender = passangerGender;
		this.email = passangerEmail;
		this.phone = passangerPhone;
		this.date = passangerDate;
		this.coach = passangerCoach;
		this.berth = passangerBerth;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public Berth getBerth() {
		return berth;
	}

	public void setBerth(Berth berth) {
		this.berth = berth;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void passangerDetails() {
		System.out.println("PassangerDetails [passangerName=" + passangerName + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + ", phone=" + phone + "]");
	}

}
