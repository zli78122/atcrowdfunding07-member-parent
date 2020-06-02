package com.atguigu.crowd.entity.vo;

import java.io.Serializable;

public class OrderVO implements Serializable {

	private static final long serialVersionUID = 1L;

	// 主键
	private Integer id;

	// 订单号
	private String orderNum;

	// 支付宝流水单号
	private String payOrderNum;

	// 订单金额
	private Double orderAmount;

	// 是否开发票
	private Integer invoice;

	// 发票抬头
	private String invoiceTitle;

	// 订单备注
	private String orderRemark;

	// 收货地址id
	private String addressId;

	private OrderProjectVO orderProjectVO;
	
	public OrderVO() {
		
	}

	public OrderVO(Integer id, String orderNum, String payOrderNum, Double orderAmount, Integer invoice,
			String invoiceTitle, String orderRemark, String addressId, OrderProjectVO orderProjectVO) {
		super();
		this.id = id;
		this.orderNum = orderNum;
		this.payOrderNum = payOrderNum;
		this.orderAmount = orderAmount;
		this.invoice = invoice;
		this.invoiceTitle = invoiceTitle;
		this.orderRemark = orderRemark;
		this.addressId = addressId;
		this.orderProjectVO = orderProjectVO;
	}

	@Override
	public String toString() {
		return "OrderVO [id=" + id + ", orderNum=" + orderNum + ", payOrderNum=" + payOrderNum + ", orderAmount="
				+ orderAmount + ", invoice=" + invoice + ", invoiceTitle=" + invoiceTitle + ", orderRemark="
				+ orderRemark + ", addressId=" + addressId + ", orderProjectVO=" + orderProjectVO + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressId == null) ? 0 : addressId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((invoice == null) ? 0 : invoice.hashCode());
		result = prime * result + ((invoiceTitle == null) ? 0 : invoiceTitle.hashCode());
		result = prime * result + ((orderAmount == null) ? 0 : orderAmount.hashCode());
		result = prime * result + ((orderNum == null) ? 0 : orderNum.hashCode());
		result = prime * result + ((orderProjectVO == null) ? 0 : orderProjectVO.hashCode());
		result = prime * result + ((orderRemark == null) ? 0 : orderRemark.hashCode());
		result = prime * result + ((payOrderNum == null) ? 0 : payOrderNum.hashCode());
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
		OrderVO other = (OrderVO) obj;
		if (addressId == null) {
			if (other.addressId != null)
				return false;
		} else if (!addressId.equals(other.addressId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (invoice == null) {
			if (other.invoice != null)
				return false;
		} else if (!invoice.equals(other.invoice))
			return false;
		if (invoiceTitle == null) {
			if (other.invoiceTitle != null)
				return false;
		} else if (!invoiceTitle.equals(other.invoiceTitle))
			return false;
		if (orderAmount == null) {
			if (other.orderAmount != null)
				return false;
		} else if (!orderAmount.equals(other.orderAmount))
			return false;
		if (orderNum == null) {
			if (other.orderNum != null)
				return false;
		} else if (!orderNum.equals(other.orderNum))
			return false;
		if (orderProjectVO == null) {
			if (other.orderProjectVO != null)
				return false;
		} else if (!orderProjectVO.equals(other.orderProjectVO))
			return false;
		if (orderRemark == null) {
			if (other.orderRemark != null)
				return false;
		} else if (!orderRemark.equals(other.orderRemark))
			return false;
		if (payOrderNum == null) {
			if (other.payOrderNum != null)
				return false;
		} else if (!payOrderNum.equals(other.payOrderNum))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getPayOrderNum() {
		return payOrderNum;
	}

	public void setPayOrderNum(String payOrderNum) {
		this.payOrderNum = payOrderNum;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getInvoice() {
		return invoice;
	}

	public void setInvoice(Integer invoice) {
		this.invoice = invoice;
	}

	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getOrderRemark() {
		return orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public OrderProjectVO getOrderProjectVO() {
		return orderProjectVO;
	}

	public void setOrderProjectVO(OrderProjectVO orderProjectVO) {
		this.orderProjectVO = orderProjectVO;
	}
}
