package com.example.ams.model;

public class contactModel {
	private String name;
	private String num;
	private String mailId;
	private String address;
	private String endSubcription;
	private String dateOfJoining;
	private Boolean activeStatus;
	 
	public contactModel(String name, String num, String mailId, String address, String endSubcription,
			String dateOfJoining, Boolean activeStatus) {
		this.name = name;
		this.num = num;
		this.mailId = mailId;
		this.address = address;
		this.endSubcription = endSubcription;
		this.dateOfJoining = dateOfJoining;
		this.activeStatus = activeStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEndSubcription() {
		return endSubcription;
	}

	public void setEndSubcription(String endSubcription) {
		this.endSubcription = endSubcription;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Override
	public String toString() {
		return "contactModel [name=" + name + ", num=" + num + ", mailId=" + mailId + ", address=" + address
				+ ", endSubcription=" + endSubcription + ", dateOfJoining=" + dateOfJoining + ", activeStatus="
				+ activeStatus + "]";
	}
	
	
	
}
