package com.yubojian.common.utils;


import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(0, 5);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		//获取从1-120岁之间的10个随机年龄
		int[] is = RandomUtil.subRandom(1, 120, 10);
		for (int i : is) {
			System.out.println(i);
			
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i =0;i<4;i++) {
			System.out.print(RandomUtil.randomCharacter());
		}
	}

	@Test
	public void testRandomString() {
		
		System.out.print(RandomUtil.randomString(6));
	}

}
