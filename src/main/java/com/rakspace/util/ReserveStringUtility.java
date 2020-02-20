package com.rakspace.util;

import org.springframework.util.StringUtils;

public class ReserveStringUtility {

public static String reserve(String str) {
StringBuilder reverseBuilder = new StringBuilder();
try {
if (!StringUtils.isEmpty(str)) {
String[] split = str.split(" ");

for (int i = split.length; i >= 1; i--) {
reverseBuilder.append(split[i - 1]).append(" ");
}
}
} catch (Exception e) {
e.printStackTrace();

}
return reverseBuilder.toString();
}
}
