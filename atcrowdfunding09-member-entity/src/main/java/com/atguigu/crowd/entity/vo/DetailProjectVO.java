package com.atguigu.crowd.entity.vo;

import java.util.List;

public class DetailProjectVO {

	private Integer projectId;
	
	private String projectName;
	
	private String projectDesc;
	
	private Integer followerCount;
	
	private Integer status;
	
	private Integer day;
	
	private String statusText;
	
	private Integer money;
	
	private Integer supportMoney;
	
	private Integer percentage;
	
	private String deployDate;
	
	private Integer lastDay;
	
	private Integer supporterCount;
	
	private String headerPicturePath;
	
	private List<String> detailPicturePathList;
	
	private List<DetailReturnVO> detailReturnVOList;
	
	public DetailProjectVO() {
		
	}
	
	public DetailProjectVO(Integer projectId, String projectName, String projectDesc, Integer followerCount,
			Integer status, Integer day, String statusText, Integer money, Integer supportMoney, Integer percentage,
			String deployDate, Integer lastDay, Integer supporterCount, String headerPicturePath,
			List<String> detailPicturePathList, List<DetailReturnVO> detailReturnVOList) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.followerCount = followerCount;
		this.status = status;
		this.day = day;
		this.statusText = statusText;
		this.money = money;
		this.supportMoney = supportMoney;
		this.percentage = percentage;
		this.deployDate = deployDate;
		this.lastDay = lastDay;
		this.supporterCount = supporterCount;
		this.headerPicturePath = headerPicturePath;
		this.detailPicturePathList = detailPicturePathList;
		this.detailReturnVOList = detailReturnVOList;
	}

	@Override
	public String toString() {
		return "DetailProjectVO [projectId=" + projectId + ", projectName=" + projectName + ", projectDesc="
				+ projectDesc + ", followerCount=" + followerCount + ", status=" + status + ", day=" + day
				+ ", statusText=" + statusText + ", money=" + money + ", supportMoney=" + supportMoney + ", percentage="
				+ percentage + ", deployDate=" + deployDate + ", lastDay=" + lastDay + ", supporterCount="
				+ supporterCount + ", headerPicturePath=" + headerPicturePath + ", detailPicturePathList="
				+ detailPicturePathList + ", detailReturnVOList=" + detailReturnVOList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((deployDate == null) ? 0 : deployDate.hashCode());
		result = prime * result + ((detailPicturePathList == null) ? 0 : detailPicturePathList.hashCode());
		result = prime * result + ((detailReturnVOList == null) ? 0 : detailReturnVOList.hashCode());
		result = prime * result + ((followerCount == null) ? 0 : followerCount.hashCode());
		result = prime * result + ((headerPicturePath == null) ? 0 : headerPicturePath.hashCode());
		result = prime * result + ((lastDay == null) ? 0 : lastDay.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
		result = prime * result + ((percentage == null) ? 0 : percentage.hashCode());
		result = prime * result + ((projectDesc == null) ? 0 : projectDesc.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusText == null) ? 0 : statusText.hashCode());
		result = prime * result + ((supportMoney == null) ? 0 : supportMoney.hashCode());
		result = prime * result + ((supporterCount == null) ? 0 : supporterCount.hashCode());
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
		DetailProjectVO other = (DetailProjectVO) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (deployDate == null) {
			if (other.deployDate != null)
				return false;
		} else if (!deployDate.equals(other.deployDate))
			return false;
		if (detailPicturePathList == null) {
			if (other.detailPicturePathList != null)
				return false;
		} else if (!detailPicturePathList.equals(other.detailPicturePathList))
			return false;
		if (detailReturnVOList == null) {
			if (other.detailReturnVOList != null)
				return false;
		} else if (!detailReturnVOList.equals(other.detailReturnVOList))
			return false;
		if (followerCount == null) {
			if (other.followerCount != null)
				return false;
		} else if (!followerCount.equals(other.followerCount))
			return false;
		if (headerPicturePath == null) {
			if (other.headerPicturePath != null)
				return false;
		} else if (!headerPicturePath.equals(other.headerPicturePath))
			return false;
		if (lastDay == null) {
			if (other.lastDay != null)
				return false;
		} else if (!lastDay.equals(other.lastDay))
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
		if (projectDesc == null) {
			if (other.projectDesc != null)
				return false;
		} else if (!projectDesc.equals(other.projectDesc))
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
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (statusText == null) {
			if (other.statusText != null)
				return false;
		} else if (!statusText.equals(other.statusText))
			return false;
		if (supportMoney == null) {
			if (other.supportMoney != null)
				return false;
		} else if (!supportMoney.equals(other.supportMoney))
			return false;
		if (supporterCount == null) {
			if (other.supporterCount != null)
				return false;
		} else if (!supporterCount.equals(other.supporterCount))
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

	public String getProjectDesc() {
		return projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public Integer getFollowerCount() {
		return followerCount;
	}

	public void setFollowerCount(Integer followerCount) {
		this.followerCount = followerCount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getSupportMoney() {
		return supportMoney;
	}

	public void setSupportMoney(Integer supportMoney) {
		this.supportMoney = supportMoney;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public String getDeployDate() {
		return deployDate;
	}

	public void setDeployDate(String deployDate) {
		this.deployDate = deployDate;
	}

	public Integer getLastDay() {
		return lastDay;
	}

	public void setLastDay(Integer lastDay) {
		this.lastDay = lastDay;
	}

	public Integer getSupporterCount() {
		return supporterCount;
	}

	public void setSupporterCount(Integer supporterCount) {
		this.supporterCount = supporterCount;
	}

	public String getHeaderPicturePath() {
		return headerPicturePath;
	}

	public void setHeaderPicturePath(String headerPicturePath) {
		this.headerPicturePath = headerPicturePath;
	}

	public List<String> getDetailPicturePathList() {
		return detailPicturePathList;
	}

	public void setDetailPicturePathList(List<String> detailPicturePathList) {
		this.detailPicturePathList = detailPicturePathList;
	}

	public List<DetailReturnVO> getDetailReturnVOList() {
		return detailReturnVOList;
	}

	public void setDetailReturnVOList(List<DetailReturnVO> detailReturnVOList) {
		this.detailReturnVOList = detailReturnVOList;
	}
}
