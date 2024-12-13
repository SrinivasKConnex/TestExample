package Test.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class sort {
	@Test
	public void sortArray() {

		Integer a[][] = { { 5, 6, 6, 2, 7, 1, 8, 9 }, { 5, 6, 1, 8 }, { 8, 4, 42 } };

		ArrayList<Integer> list = new ArrayList<>();

		for (Integer[] row : a) {
			list.addAll(Arrays.asList(row));
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

	@Test
	public void intTest() {

		int a = 98765;

		int r = 0;

		while (a > 0) {
			r = r * 10 + a % 10; // r=56789
			a /= 10; //

		}
		System.out.println(r);
	}

	@Test
	public void palindromString() {

		String a = "madama";

		int start = 0;

		int end = a.length() - 1;

		boolean isPalindrom = true;

		while (start < end) {
			if (a.charAt(start) == a.charAt(end)) {
				isPalindrom = true;
			} else {
				isPalindrom = false;
			}
			start++;
			end--;
		}
		System.out.println(isPalindrom ? "String is palindrom" : "String is not a palindrom");
	}

	@Test
	public void letterCount() {
		String text = "ahhoonndddd";

		StringBuffer appendString = new StringBuffer();

		int count = 1;

		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i) == text.charAt(i - 1)) {
				count++;
			} else {
				appendString.append(text.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		appendString.append(text.charAt(text.length() - 1)).append(count);
		System.out.println(appendString);

	}

	@Test
	public void sumoftheNumber() {
		long num = 987654321;
		long sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}

	@Test
	public void sentenceReverse() {
		String text = "Today is sunday Shashi";

		// int n=text.length();

		String splitText[] = text.split(" ");
		int n = splitText.length;
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(" " + splitText[i]);
		}

	}

	@Test
	public void checkTwoArraysAreEqual() {

		String a[] = { "shashi", "kumar", "dhavan" };
		String b[] = { "shashi", "kumar", "dhavan" };

		boolean same = true;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[i]) {
				same = true;
			} else {
				same = false;
				break;
			}

		}
		System.out.println(same ? "Arrays are Equels" : "Arrays Are Not Equels");

	}

	@Test
	public void getMostrepetedProduct() {

		String a[] = { "laptop", "mobile", "headset", "mobile", "charger" };

		String mostRepetedProd = "";
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			String currentRepeted = "";
			int currentCount = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					currentRepeted = a[i];
					currentCount++;
				}
			}
			if (currentCount > count) {
				mostRepetedProd = currentRepeted;
				count = currentCount;
			}
		}
		System.out.println("Most Sell product:" + mostRepetedProd + "(Count:" + count + ")");

	}

	@Test
	public void appendTextCount() {
		String actualText = "aadddskkkkk";
		StringBuffer appendString = new StringBuffer();
		int count = 1;
		for (int i = 1; i < actualText.length(); i++) {
			if (actualText.charAt(i) == actualText.charAt(i - 1)) {
				count++;
			} else {
				appendString.append(actualText.charAt(i - 1)).append(count);
				count=1;
			}
		}
		appendString.append(actualText.charAt(actualText.length()-1)).append(count);
		System.out.println(appendString);
	}
	
	@Test
	public void converToStringToInteger() {
		String actualText = "313616136";
		int num =Integer.parseInt(actualText);
		System.out.println(num);
		
		int num1=7879;
		String str=String.valueOf(num1);
		System.out.println(str);
		
	}

}
