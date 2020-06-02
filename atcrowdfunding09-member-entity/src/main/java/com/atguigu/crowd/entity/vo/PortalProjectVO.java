package com.atguigu.crowd.entity.vo;

public class PortalProjectVO {

	private Integer projectId;
	
	private String projectName;
	
	private String headerPicturePath;
	
	private Integer money;
	
	private String deployDate;
	
	private Integer percentage;
	
	private Integer supporter;
	
	public PortalProjectVO() {
		
	}
	
	public PortalProjectVO(Integer projectId, String projectName, String headerPicturePath, Integer money,
			String deployDate, Integer percentage, Integer supporter) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.headerPicturePath = headerPicturePath;
		this.money = money;
		this.deployDate = deployDate;
		this.percentage = percentage;
		this.supporter = supporter;
	}

	@Override
	public String toString() {
		return "PortalProjectVO [projectId=" + projectId + ", projectName=" + projectName + ", headerPicturePath="
				+ headerPicturePath + ", money=" + money + ", deployDate=" + deployDate + ", percentage=" + percentage
				+ ", supporter=" + supporter + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deployDate == null) ? 0 : deployDate.hashCode());
		result = prime * result + ((headerPicturePath == null) ? 0 : headerPicturePath.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
		result = prime * result + ((percentage == null) ? 0 : percentage.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((supporter == null) ? 0 : supporter.hashCode());
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
		PortalProjectVO other = (PortalProjectVO) obj;
		if (deployDate == null) {
			if (other.deployDate != null)
				return false;
		} else if (!deployDate.equals(other.deployDate))
			return false;
		if (headerPicturePath == null) {
			if (other.headerPicturePath != null)
				return false;
		} else if (!headerPicturePath.equals(other.headerPicturePath))
			return false;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		if (percentage == null) {
			if (other.percentage != null)
				return false;
		} else if (!percentage.equals(other.percentage))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (supporter == null) {
			if (other.supporter != null)
				return false;
		} else if (!supporter.equals(other.supporter))
			return false;
		return true;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getHeaderPicturePath() {
		return headerPicturePath;
	}

	public void setHeaderPicturePath(String headerPicturePath) {
		this.headerPicturePath = headerPicturePath;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getDeployDate() {
		return deployDate;
	}

	public void setDeployDate(String deployDate) {
		this.deployDate = deployDate;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public Integer getSupporter() {
		return supporter;
	}

	public void setSupporter(Integer supporter) {
		this.supporter = supporter;
	}
}
