package com.atguigu.crowd.entity.vo;

import java.io.Serializable;

public class OrderProjectVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String projectName;

	private String launchName;

	private String returnContent;

	private Integer returnCount;

	private Integer supportPrice;

	private Integer freight;

	private Integer orderId;

	private Integer signalPurchase;

	private Integer purchase;
	
	public OrderProjectVO() {
		
	}

	public OrderProjectVO(Integer id, String projectName, String launchName, String returnContent, Integer returnCount,
			Integer supportPrice, Integer freight, Integer orderId, Integer signalPurchase, Integer purchase) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.launchName = launchName;
		this.returnContent = returnContent;
		this.returnCount = returnCount;
		this.supportPrice = supportPrice;
		this.freight = freight;
		this.orderId = orderId;
		this.signalPurchase = signalPurchase;
		this.purchase = purchase;
	}

	@Override
	public String toString() {
		return "OrderProjectVO [id=" + id + ", projectName=" + projectName + ", launchName=" + launchName
				+ ", returnContent=" + returnContent + ", returnCount=" + returnCount + ", supportPrice=" + supportPrice
				+ ", freight=" + freight + ", orderId=" + orderId + ", signalPurchase=" + signalPurchase + ", purchase="
				+ purchase + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((freight == null) ? 0 : freight.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((launchName == null) ? 0 : launchName.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((purchase == null) ? 0 : purchase.hashCode());
		result = prime * result + ((returnContent == null) ? 0 : returnContent.hashCode());
		result = prime * result + ((returnCount == null) ? 0 : returnCount.hashCode());
		result = prime * result + ((signalPurchase == null) ? 0 : signalPurchase.hashCode());
		result = prime * result + ((supportPrice == null) ? 0 : supportPrice.hashCode());
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
		OrderProjectVO other = (OrderProjectVO) obj;
		if (freight == null) {
			if (other.freight != null)
				return false;
		} else if (!freight.equals(other.freight))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (launchName == null) {
			if (other.launchName != null)
				return false;
		} else if (!launchName.equals(other.launchName))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (purchase == null) {
			if (other.purchase != null)
				return false;
		} else if (!purchase.equals(other.purchase))
			return false;
		if (returnContent == null) {
			if (other.returnContent != null)
				return false;
		} else if (!returnContent.equals(other.returnContent))
			return false;
		if (returnCount == null) {
			if (other.returnCount != null)
				return false;
		} else if (!returnCount.equals(other.returnCount))
			return false;
		if (signalPurchase == null) {
			if (other.signalPurchase != null)
				return false;
		} else if (!signalPurchase.equals(other.signalPurchase))
			return false;
		if (supportPrice == null) {
			if (other.supportPrice != null)
				return false;
		} else if (!supportPrice.equals(other.supportPrice))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getLaunchName() {
		return launchName;
	}

	public void setLaunchName(String launchName) {
		this.launchName = launchName;
	}

	public String getReturnContent() {
		return returnContent;
	}

	public void setReturnContent(String returnContent) {
		this.returnContent = returnContent;
	}

	public Integer getReturnCount() {
		return returnCount;
	}

	public void setReturnCount(Integer returnCount) {
		this.returnCount = returnCount;
	}

	public Integer getSupportPrice() {
		return supportPrice;
	}

	public void setSupportPrice(Integer supportPrice) {
		this.supportPrice = supportPrice;
	}

	public Integer getFreight() {
		return freight;
	}

	public void setFreight(Integer freight) {
		this.freight = freight;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getSignalPurchase() {
		return signalPurchase;
	}

	public void setSignalPurchase(Integer signalPurchase) {
		this.signalPurchase = signalPurchase;
	}

	public Integer getPurchase() {
		return purchase;
	}

	public void setPurchase(Integer purchase) {
		this.purchase = purchase;
	}
}
