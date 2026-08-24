package collection_framework;
import java.util.*;
public class BrowserHistoryUsingStack {
		public static void main(String[] args) {
		Browser b=new Browser();
		b.visit("www.google.com");
		b.visit("www.leetcode.com");
		b.visit("www.instagram.com");
		b.visit("www.gmail.com");
		b.back();
		
		b.showAllHistory();
		System.out.println("\nCurrent page: "+b.getCurrentPage());

	}

}
