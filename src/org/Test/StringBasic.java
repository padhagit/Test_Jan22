package org.Test;

public class StringBasic {

	public static void main(String[] args) {
		
		String s = "Greens Technology";
		
		//to find how many character in length
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(5);
		System.out.println(charAt);
		
		int indexOf = s.indexOf('y');
		System.out.println(indexOf);
		
		int indexOf2 = s.indexOf('o');
		System.out.println(indexOf2);
		
		int lastIndexOf = s.lastIndexOf('o');
		System.out.println(lastIndexOf);
		
		boolean contains = s.contains("Greens");
		System.out.println(contains);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("Green");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("y");
		System.out.println(endsWith);
		
		String a = "Jeevesh"; String b = "jeevesh";
		
		boolean equals = a.equals(b);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
		System.out.println(equalsIgnoreCase);
		
		String c = "Jeevesh"; String d = "Jeeven";
		
		int compareTo = c.compareTo(d);
		System.out.println(compareTo);
		
		String e = "Padha"; String f = "Java";
		
		String concat = e.concat(f);
		System.out.println(concat);
		
		String substring = s.substring(1);
		System.out.println(substring);
		
		String substring2 = s.substring(4, 17);
		System.out.println(substring2);
		
		String replace = s.replace('s', 'J' );
		System.out.println(replace);
		
		String replaceall = s.replaceAll(s, "java");
		System.out.println(replaceall);
		
		
		
		
		
		
		
		
		
	}

}
