package com.atguigu.crowd.entity.vo;

import java.io.Serializable;

public class AddressVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String receiveName;

	private String phoneNum;

	private String address;

	private Integer memberId;
	
	public AddressVO() {
		
	}

	public AddressVO(Integer id, String receiveName, String phoneNum, String address, Integer memberId) {
		super();
		this.id = id;
		this.receiveName = receiveName;
		this.phoneNum = phoneNum;
		this.address = address;
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "AddressVO [id=" + id + ", receiveName=" + receiveName + ", phoneNum=" + phoneNum + ", address="
				+ address + ", memberId=" + memberId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
		result = prime * result + ((receiveName == null) ? 0 : receiveName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressVO other = (AddressVO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (phoneNum == null) {
			if (other.phoneNum != null)
				return false;
		} else if (!phoneNum.equals(other.phoneNum))
			return false;
		if (receiveName == null) {
			if (other.receiveName != null)
				return false;
		} else if (!receiveName.equals(other.receiveName))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReceiveName() {
		return receiveName;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
}
