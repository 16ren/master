package com.ych.parknew;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="park")
public class Park {
	
	@DatabaseField(index=true,unique=true)
	private String mac;
	@DatabaseField
	private String openkey;
	@DatabaseField
	private String closekey;
	@DatabaseField
	private String name;
	@DatabaseField
	private String address;
	@DatabaseField
	private String describe;
	@DatabaseField(id=true)
	private String Serialnumber;
	@DatabaseField
	private int state;
	public Park() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Park( String mac, String openkey, String closekey, String name, String address, String describe, String serialnumber) {
		super();
		this.mac = mac;
		this.openkey = openkey;
		this.closekey = closekey;
		this.name = name;
		this.address = address;
		this.describe = describe;
		this.Serialnumber = serialnumber;
	}


	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getOpenkey() {
		return openkey;
	}
	public void setOpenkey(String openkey) {
		this.openkey = openkey;
	}
	public String getClosekey() {
		return closekey;
	}
	public void setClosekey(String closekey) {
		this.closekey = closekey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getSerialnumber() {
		return Serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		Serialnumber = serialnumber;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Park [mac=" + mac + ", openkey=" + openkey + ", closekey=" + closekey + ", name=" + name + ", address=" + address + ", describe=" + describe + ", Serialnumber=" + Serialnumber
				+ ", state=" + state + "]";
	}

}
