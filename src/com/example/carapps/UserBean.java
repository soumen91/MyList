package com.example.carapps;

public class UserBean {
	private String mName;
	private String mAddress;
	public UserBean(String mName,String mAddress)
	{
		this.mName = mName;
		this.mAddress = mAddress;
	}
	
	
	public String getName() {
		return mName;
	}
	public void setName(String mName) {
		this.mName = mName;
	}
	public String getAddress() {
		return mAddress;
	}
	public void setAddress(String mAddress) {
		this.mAddress = mAddress;
	}
	
	

}
