package com.atguigu.crowd.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.crowd.entity.po.MemberPO;
import com.atguigu.crowd.entity.vo.AddressVO;
import com.atguigu.crowd.entity.vo.DetailProjectVO;
import com.atguigu.crowd.entity.vo.OrderProjectVO;
import com.atguigu.crowd.entity.vo.OrderVO;
import com.atguigu.crowd.entity.vo.PortalTypeVO;
import com.atguigu.crowd.entity.vo.ProjectVO;
import com.atguigu.crowd.util.ResultEntity;

@FeignClient("atguigu-crowd-mysql")
public interface MySQLRemoteService {
	
	@RequestMapping("/get/memberpo/by/login/acct/remote")
	ResultEntity<MemberPO> getMemberPOByLoginAcctRemote(@RequestParam("loginacct") String loginacct);
	
	@RequestMapping("/save/member/remote")
	ResultEntity<String> saveMember(@RequestBody MemberPO memberPO);
	
	@RequestMapping("/save/project/vo/remote")
	ResultEntity<String> saveProjectVORemote(@RequestBody ProjectVO projectVO, @RequestParam("memberId") Integer memberId);

	@RequestMapping("/get/portal/type/project/data/remote")
	ResultEntity<List<PortalTypeVO>> getPortalTypeProjectDataRemote();
	
	@RequestMapping("/get/project/detail/remote/{projectId}")
	ResultEntity<DetailProjectVO> getDetailProjectVORemote(@PathVariable("projectId") Integer projectId);
	
	@RequestMapping("/get/order/project/vo/remote")
	ResultEntity<OrderProjectVO> getOrderProjectVORemote(@RequestParam("projectId") Integer projectId, @RequestParam("returnId") Integer returnId);

	@RequestMapping("/get/address/vo/remote")
	ResultEntity<List<AddressVO>> getAddressVORemote(@RequestParam("memberId") Integer memberId);

	@RequestMapping("/save/address/remote")
	ResultEntity<String> saveAddressRemote(@RequestBody AddressVO addressVO);
	
	@RequestMapping("/save/order/remote")
	ResultEntity<String> saveOrderRemote(@RequestBody OrderVO orderVO);
}
