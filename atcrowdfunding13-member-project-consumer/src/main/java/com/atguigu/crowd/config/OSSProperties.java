package com.atguigu.crowd.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "aliyun.oss")
public class OSSProperties {
	
	private String endPoint;
	private String bucketName;
	private String accessKeyId;
	private String accessKeySecret;
	private String bucketDomain;
	
	public OSSProperties() {
		
	}
	
	public OSSProperties(String endPoint, String bucketName, String accessKeyId, String accessKeySecret,
			String bucketDomain) {
		super();
		this.endPoint = endPoint;
		this.bucketName = bucketName;
		this.accessKeyId = accessKeyId;
		this.accessKeySecret = accessKeySecret;
		this.bucketDomain = bucketDomain;
	}

	@Override
	public String toString() {
		return "OSSProperties [endPoint=" + endPoint + ", bucketName=" + bucketName + ", accessKeyId=" + accessKeyId
				+ ", accessKeySecret=" + accessKeySecret + ", bucketDomain=" + bucketDomain + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessKeyId == null) ? 0 : accessKeyId.hashCode());
		result = prime * result + ((accessKeySecret == null) ? 0 : accessKeySecret.hashCode());
		result = prime * result + ((bucketDomain == null) ? 0 : bucketDomain.hashCode());
		result = prime * result + ((bucketName == null) ? 0 : bucketName.hashCode());
		result = prime * result + ((endPoint == null) ? 0 : endPoint.hashCode());
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
		OSSProperties other = (OSSProperties) obj;
		if (accessKeyId == null) {
			if (other.accessKeyId != null)
				return false;
		} else if (!accessKeyId.equals(other.accessKeyId))
			return false;
		if (accessKeySecret == null) {
			if (other.accessKeySecret != null)
				return false;
		} else if (!accessKeySecret.equals(other.accessKeySecret))
			return false;
		if (bucketDomain == null) {
			if (other.bucketDomain != null)
				return false;
		} else if (!bucketDomain.equals(other.bucketDomain))
			return false;
		if (bucketName == null) {
			if (other.bucketName != null)
				return false;
		} else if (!bucketName.equals(other.bucketName))
			return false;
		if (endPoint == null) {
			if (other.endPoint != null)
				return false;
		} else if (!endPoint.equals(other.endPoint))
			return false;
		return true;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getAccessKeyId() {
		return accessKeyId;
	}

	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	public String getAccessKeySecret() {
		return accessKeySecret;
	}

	public void setAccessKeySecret(String accessKeySecret) {
		this.accessKeySecret = accessKeySecret;
	}

	public String getBucketDomain() {
		return bucketDomain;
	}

	public void setBucketDomain(String bucketDomain) {
		this.bucketDomain = bucketDomain;
	}
}
