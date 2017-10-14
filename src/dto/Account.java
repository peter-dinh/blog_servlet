package dto;

import java.util.Date;

public class Account {
	private int id;
	private String Username;
	private String Password;
	private String Name;
	private boolean Sex;
	private String Address;
	private String Phone;
	private String Mail;
	private Date Birthday;
	private int Type_account;
	private Date Date_Register;
	private boolean Active;
	private String key;
	private boolean Online;
	private String Avatar;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean isSex() {
		return Sex;
	}
	public void setSex(boolean sex) {
		Sex = sex;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public Date getBirthday() {
		return Birthday;
	}
	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}
	public int getType_account() {
		return Type_account;
	}
	public void setType_account(int type_account) {
		Type_account = type_account;
	}
	public Date getDate_Register() {
		return Date_Register;
	}
	public void setDate_Register(Date date_Register) {
		Date_Register = date_Register;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public boolean isOnline() {
		return Online;
	}
	public void setOnline(boolean online) {
		Online = online;
	}
	public String getAvatar() {
		return Avatar;
	}
	public void setAvatar(String avatar) {
		Avatar = avatar;
	}
}
