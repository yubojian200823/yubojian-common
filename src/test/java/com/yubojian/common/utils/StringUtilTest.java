package com.yubojian.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
	}

	@Test
	public void testHasText() {
	}

	@Test
	public void testRandomChineseString() {
	 for(int i=0;i<10;i++) {
		 String string = StringUtil.randomChineseString();
		 System.out.print(string+" ");
	 }
	}

	
	@Test
	public void testRandomChineseString2() {
		 for(int i=0;i<10;i++) {
			 String string = StringUtil.randomSimpleChinese();
			 System.out.print(string+" ");
		 }
		
	}
	@Test
	public void testRandomChineseStringInt() {
		String string = StringUtil.randomChineseString(10);
		System.out.println(string);
		
		
	}

	@Test
	public void testGenerateChineseName() {
		 for(int i=0;i<10;i++) {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
		 }
	}
//测试tohtml方法
	@Test
	public void TestTohtml() {
		String string="9月5日一大早，又有了新情况。\r\n" + 
				"上午9点多，传出中美经贸高级别磋商超大号传媒\r\n" + 
				"NSBBKCL。";
			String html = StringUtil.toHtml(string);
			System.out.println(html);
	}
//	测试手机号工具类是否正确
	@Test
	public void TestisPhone() {
		String phone="12533339999";
		boolean flag = StringUtil.isPhone(phone);
		if(flag) {
			System.out.println("该手机号正确");
		}else {
			System.out.println("该手机号有误");
		}
	}
//  测试邮箱号是否正确
	@Test
	public void TestisEmail() {
		String email="A2533339999@qq.com";
		boolean flag = StringUtil.isEmail(email);
		if(flag) {
			System.out.println("该邮箱正确");
		}else {
			System.out.println("该邮箱有误");
		}
	}

	
}
