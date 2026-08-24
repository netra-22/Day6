package collection_framework;

import java.util.*;

public class Browser {
	Stack<String> history=new Stack<>(); 
		
		void visit(String url) {
			history.push(url);
		}
		
		void back() {
			if(history.isEmpty()) {
				System.out.println("Stack is empty");
			}
			else {
				history.pop();
			}
		}
		
		String getCurrentPage() {
			if(history.isEmpty()) {
				return "Stack is empty";
			}
			return history.peek();
		}
		
		void showAllHistory() {
			if(history.isEmpty()) {
				System.out.println("Stack is empty");
			}
			System.out.println("\nBrowser history:");
			ListIterator<String> it=history.listIterator(history.size());
			while(it.hasPrevious()) {
				System.out.println(it.previous());
			}
			
		}

}
