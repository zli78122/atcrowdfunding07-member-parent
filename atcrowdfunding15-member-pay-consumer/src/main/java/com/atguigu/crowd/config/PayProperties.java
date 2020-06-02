package com.atguigu.crowd.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ali.pay")
public class PayProperties {

	private String appId;
	
	private String merchantPrivateKey;
	
	private String alipayPublicKey;
	
	private String notifyUrl;
	
	private String returnUrl;
	
	private String signType;
	
	private String charset;
	
	private String gatewayUrl;
	
	public PayProperties() {
		
	}

	public PayProperties(String appId, String merchantPrivateKey, String alipayPublicKey, String notifyUrl,
			String returnUrl, String signType, String charset, String gatewayUrl) {
		super();
		this.appId = appId;
		this.merchantPrivateKey = merchantPrivateKey;
		this.alipayPublicKey = alipayPublicKey;
		this.notifyUrl = notifyUrl;
		this.returnUrl = returnUrl;
		this.signType = signType;
		this.charset = charset;
		this.gatewayUrl = gatewayUrl;
	}

	@Override
	public String toString() {
		return "PayProperties [appId=" + appId + ", merchantPrivateKey=" + merchantPrivateKey + ", alipayPublicKey="
				+ alipayPublicKey + ", notifyUrl=" + notifyUrl + ", returnUrl=" + returnUrl + ", signType=" + signType
				+ ", charset=" + charset + ", gatewayUrl=" + gatewayUrl + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alipayPublicKey == null) ? 0 : alipayPublicKey.hashCode());
		result = prime * result + ((appId == null) ? 0 : appId.hashCode());
		result = prime * result + ((charset == null) ? 0 : charset.hashCode());
		result = prime * result + ((gatewayUrl == null) ? 0 : gatewayUrl.hashCode());
		result = prime * result + ((merchantPrivateKey == null) ? 0 : merchantPrivateKey.hashCode());
		result = prime * result + ((notifyUrl == null) ? 0 : notifyUrl.hashCode());
		result = prime * result + ((returnUrl == null) ? 0 : returnUrl.hashCode());
		result = prime * result + ((signType == null) ? 0 : signType.hashCode());
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
		PayProperties other = (PayProperties) obj;
		if (alipayPublicKey == null) {
			if (other.alipayPublicKey != null)
				return false;
		} else if (!alipayPublicKey.equals(other.alipayPublicKey))
			return false;
		if (appId == null) {
			if (other.appId != null)
				return false;
		} else if (!appId.equals(other.appId))
			return false;
		if (charset == null) {
			if (other.charset != null)
				return false;
		} else if (!charset.equals(other.charset))
			return false;
		if (gatewayUrl == null) {
			if (other.gatewayUrl != null)
				return false;
		} else if (!gatewayUrl.equals(other.gatewayUrl))
			return false;
		if (merchantPrivateKey == null) {
			if (other.merchantPrivateKey != null)
				return false;
		} else if (!merchantPrivateKey.equals(other.merchantPrivateKey))
			return false;
		if (notifyUrl == null) {
			if (other.notifyUrl != null)
				return false;
		} else if (!notifyUrl.equals(other.notifyUrl))
			return false;
		if (returnUrl == null) {
			if (other.returnUrl != null)
				return false;
		} else if (!returnUrl.equals(other.returnUrl))
			return false;
		if (signType == null) {
			if (other.signType != null)
				return false;
		} else if (!signType.equals(other.signType))
			return false;
		return true;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMerchantPrivateKey() {
		return merchantPrivateKey;
	}

	public void setMerchantPrivateKey(String merchantPrivateKey) {
		this.merchantPrivateKey = merchantPrivateKey;
	}

	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}

	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getGatewayUrl() {
		return gatewayUrl;
	}

	public void setGatewayUrl(String gatewayUrl) {
		this.gatewayUrl = gatewayUrl;
	}
}
