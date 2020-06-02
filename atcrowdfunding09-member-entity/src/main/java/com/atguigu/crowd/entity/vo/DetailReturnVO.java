package com.atguigu.crowd.entity.vo;

public class DetailReturnVO {

	// 回报信息主键
	private Integer returnId;

	// 当前档位需支持的金额
	private Integer supportMoney;

	// 单笔限购，取值为0时无限额，取值为1时有限额
	private Integer signalPurchase;

	// 具体限额数量
	private Integer purchase;

	// 当前该档位支持者数量
	private Integer supproterCount;

	// 运费，取值为0时表示包邮
	private Integer freight;

	// 众筹成功后多少天发货
	private Integer returnDate;

	// 回报内容
	private String content;
	
	public DetailReturnVO() {
		
	}

	public DetailReturnVO(Integer returnId, Integer supportMoney, Integer signalPurchase, Integer purchase,
			Integer supproterCount, Integer freight, Integer returnDate, String content) {
		super();
		this.returnId = returnId;
		this.supportMoney = supportMoney;
		this.signalPurchase = signalPurchase;
		this.purchase = purchase;
		this.supproterCount = supproterCount;
		this.freight = freight;
		this.returnDate = returnDate;
		this.content = content;
	}

	@Override
	public String toString() {
		return "DetailReturnVO [returnId=" + returnId + ", supportMoney=" + supportMoney + ", signalPurchase="
				+ signalPurchase + ", purchase=" + purchase + ", supproterCount=" + supproterCount + ", freight="
				+ freight + ", returnDate=" + returnDate + ", content=" + content + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((freight == null) ? 0 : freight.hashCode());
		result = prime * result + ((purchase == null) ? 0 : purchase.hashCode());
		result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
		result = prime * result + ((returnId == null) ? 0 : returnId.hashCode());
		result = prime * result + ((signalPurchase == null) ? 0 : signalPurchase.hashCode());
		result = prime * result + ((supportMoney == null) ? 0 : supportMoney.hashCode());
		result = prime * result + ((supproterCount == null) ? 0 : supproterCount.hashCode());
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
		DetailReturnVO other = (DetailReturnVO) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (freight == null) {
			if (other.freight != null)
				return false;
		} else if (!freight.equals(other.freight))
			return false;
		if (purchase == null) {
			if (other.purchase != null)
				return false;
		} else if (!purchase.equals(other.purchase))
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		if (returnId == null) {
			if (other.returnId != null)
				return false;
		} else if (!returnId.equals(other.returnId))
			return false;
		if (signalPurchase == null) {
			if (other.signalPurchase != null)
				return false;
		} else if (!signalPurchase.equals(other.signalPurchase))
			return false;
		if (supportMoney == null) {
			if (other.supportMoney != null)
				return false;
		} else if (!supportMoney.equals(other.supportMoney))
			return false;
		if (supproterCount == null) {
			if (other.supproterCount != null)
				return false;
		} else if (!supproterCount.equals(other.supproterCount))
			return false;
		return true;
	}

	public Integer getReturnId() {
		return returnId;
	}

	public void setReturnId(Integer returnId) {
		this.returnId = returnId;
	}

	public Integer getSupportMoney() {
		return supportMoney;
	}

	public void setSupportMoney(Integer supportMoney) {
		this.supportMoney = supportMoney;
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

	public Integer getSupproterCount() {
		return supproterCount;
	}

	public void setSupproterCount(Integer supproterCount) {
		this.supproterCount = supproterCount;
	}

	public Integer getFreight() {
		return freight;
	}

	public void setFreight(Integer freight) {
		this.freight = freight;
	}

	public Integer getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Integer returnDate) {
		this.returnDate = returnDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
