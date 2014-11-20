package com.vintek.database.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PasswordHistory implements Serializable {
	private static final long serialVersionUID = -2825789388968017549L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="Password1")
	private String password1;

	@Column(name="Password2")
	private String password2;

	@Column(name="Password3")
	private String password3;

	@Column(name="Password4")
	private String password4;

	@Column(name="Password5")
	private String password5;

	@Column(name="Password6")
	private String password6;

	@Column(name="Password7")
	private String password7;

	@Column(name="Password8")
	private String password8;

	@Column(name="UserID")
	private int userID;

	public PasswordHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword1() {
		return this.password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return this.password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getPassword3() {
		return this.password3;
	}

	public void setPassword3(String password3) {
		this.password3 = password3;
	}

	public String getPassword4() {
		return this.password4;
	}

	public void setPassword4(String password4) {
		this.password4 = password4;
	}

	public String getPassword5() {
		return this.password5;
	}

	public void setPassword5(String password5) {
		this.password5 = password5;
	}

	public String getPassword6() {
		return this.password6;
	}

	public void setPassword6(String password6) {
		this.password6 = password6;
	}

	public String getPassword7() {
		return this.password7;
	}

	public void setPassword7(String password7) {
		this.password7 = password7;
	}

	public String getPassword8() {
		return this.password8;
	}

	public void setPassword8(String password8) {
		this.password8 = password8;
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}