package com.atguigu.crowd.entity.vo;

import java.util.List;

public class PortalTypeVO {

	private Integer id;
	
	private String name;
	
	private String remark;

	private List<PortalProjectVO> portalProjectVOList;
	
	public PortalTypeVO() {
		
	}

	public PortalTypeVO(Integer id, String name, String remark, List<PortalProjectVO> portalProjectVOList) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
		this.portalProjectVOList = portalProjectVOList;
	}

	@Override
	public String toString() {
		return "PortalTypeVO [id=" + id + ", name=" + name + ", remark=" + remark + ", portalProjectVOList="
				+ portalProjectVOList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((portalProjectVOList == null) ? 0 : portalProjectVOList.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
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
		PortalTypeVO other = (PortalTypeVO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (portalProjectVOList == null) {
			if (other.portalProjectVOList != null)
				return false;
		} else if (!portalProjectVOList.equals(other.portalProjectVOList))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<PortalProjectVO> getPortalProjectVOList() {
		return portalProjectVOList;
	}

	public void setPortalProjectVOList(List<PortalProjectVO> portalProjectVOList) {
		this.portalProjectVOList = portalProjectVOList;
	}
}
