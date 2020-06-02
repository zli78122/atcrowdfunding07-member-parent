package com.atguigu.crowd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.crowd.entity.po.MemberPO;
import com.atguigu.crowd.entity.po.MemberPOExample;
import com.atguigu.crowd.entity.po.MemberPOExample.Criteria;
import com.atguigu.crowd.mapper.MemberPOMapper;
import com.atguigu.crowd.service.api.MemberService;

// 类上的 @Transactional注解 只作用于读操作
@Transactional(readOnly = true)
@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberPOMapper memberPOMapper;
	
	// 给每一个写操作单独设置 @Transactional注解
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class, readOnly = false)
	@Override
	public void saveMember(MemberPO memberPO) {
		memberPOMapper.insertSelective(memberPO);
	}

	@Override
	public MemberPO getMemberPOByLoginAcct(String loginacct) {
		// 1.创建Example对象
		MemberPOExample example = new MemberPOExample();
		// 2.创建Criteria对象
		Criteria criteria = example.createCriteria();
		// 3.封装查询条件
		criteria.andLoginacctEqualTo(loginacct);
		// 4.执行查询
		List<MemberPO> list = memberPOMapper.selectByExample(example);
		// 5.获取结果
		if (list == null || list.size() == 0) {
			return null;
		}
		return list.get(0);
	}
}
