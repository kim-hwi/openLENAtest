package io.openlena.ctl.util;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testIsBlank() {
		StringUtil strUtil = new StringUtil();
		String strNull = null;
		String str = "TEST";
		String str2 = "";
		String strWhiteSpace= " ABC DEF";
		assertTrue(strUtil.isBlank(strNull));
		assertTrue(!strUtil.isBlank(str));
		assertTrue(strUtil.isBlank(str2));
		assertTrue(!strUtil.isBlank(strWhiteSpace));
		assertTrue(!strUtil.isBlank(strWhiteSpace));
	}

	@Test
	public void testIsNumeric() {
		StringUtil strUtil = new StringUtil();
		String strNull = null;
		String str = "TEST";
		String str2 = "";
		String strWhiteSpace= " ABC DEF";
		assertTrue(!strUtil.isNumeric(strNull));
		assertTrue(!strUtil.isNumeric(str));
		assertTrue(!strUtil.isNumeric(str2));
		assertTrue(!strUtil.isNumeric(strWhiteSpace));
	}

	@Test
	public void testArryIsNumeric() {
		StringUtil strUtil = new StringUtil();
		String[] strNull = {null, null};
		String[] str = {"TEST","TEST"};
		String[] str2 = {"",""};
		String[] strWhiteSpace= {" ABC DEF"," ABC DEF"};
		assertTrue(!strUtil.isNumeric(strNull));
		assertTrue(!strUtil.isNumeric(str));
		assertTrue(!strUtil.isNumeric(str2));
		assertTrue(!strUtil.isNumeric(strWhiteSpace));
	}
}
