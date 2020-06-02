package com.atguigu.crowd.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aliyun.api.gateway.demo.util.HttpUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrowdTest {
	
	private Logger logger = LoggerFactory.getLogger(CrowdTest.class);
	
	@Test
	public void testSendMessage() {
		String host = "https://feginesms.market.alicloudapi.com";
		String path = "/codeNotice";
		String method = "GET";
		String appcode = "2823ead6b6cb46519f398871507a8d8f";
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "APPCODE " + appcode);
		Map<String, String> querys = new HashMap<String, String>();
		// 验证码
		querys.put("param", "1001");
		// 手机号
		querys.put("phone", "18931007018");
		// 签名编号
		querys.put("sign", "1");
		// 模板编号
		querys.put("skin", "1");

		try {
			/**
			 * 重要提示如下: HttpUtils请从
			 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
			 * 或者直接下载： http://code.fegine.com/HttpUtils.zip
			 *
			 * 相应的依赖请参照
			 * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
			 * 相关jar包（非pom）直接下载： http://code.fegine.com/aliyun-jar.zip
			 */
			HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
			StatusLine statusLine = response.getStatusLine();
			
			// 状态码: 200 正常；400 URL无效；401 appCode错误；403 次数用完；500 API网管错误
			int statusCode = statusLine.getStatusCode();
			logger.info("code = " + statusCode);
			
			String reasonPhrase = statusLine.getReasonPhrase();
			logger.info("reason = " + reasonPhrase);
			
			logger.info(EntityUtils.toString(response.getEntity()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
