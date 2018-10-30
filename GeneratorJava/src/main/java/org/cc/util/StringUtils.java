package org.cc.util;

public class StringUtils {

	public static String firstLetterToUpper(String s) {
		if (s == null || s.length() == 0) {
			return s;
		} else {
			return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
		}
	}
}
