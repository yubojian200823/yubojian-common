package com.yubojian.common.utils;

import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest2 
 * @Description: TODO
 * @author: 于博剑
 * @date: 2019年9月15日 上午8:47:19  
 */
public class DateUtilTest2 extends DateUtil{

	
	@Test
	public void testGetDateByMonthSub() {
		Date date = DateUtil.getDateByMonthSub(new Date(), 3);
		System.out.println(date);
	}

}
