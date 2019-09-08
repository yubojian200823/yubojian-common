package com.yubojian.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

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

	
}
