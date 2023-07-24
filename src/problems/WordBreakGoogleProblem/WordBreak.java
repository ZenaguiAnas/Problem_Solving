package com.WordBreakGoogleProblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

	

	class Option{
		int nextIndex;
		ArrayList<String> listofwords = new ArrayList<String>();
	
	public Option(int nextIndex, ArrayList<String> listofwords) {
		this.nextIndex = nextIndex;
		this.listofwords.addAll(listofwords);}
	}
public class WordBreak {
	
	Set<String> dic = new HashSet<>();
	
	public WordBreak () {
		dic.add("i");
		dic.add("like");
		dic.add("sam");
		dic.add("sung");
		dic.add("samsung");
		dic.add("and");
		dic.add("xiaomi");
	}

	
	public static void main(String[] args) {
		new WordBreak().Break("ilikesamsungandxiaomi");

	}
	
	public void Break(String word) {
		Queue<Option> q = new LinkedList<Option>();
		q.add(new Option(0, new ArrayList<String>()));
		
		while(!q.isEmpty()) {
			Option option = q.poll();
			
			if(option.nextIndex >= word.length()) {
				System.out.println(option.listofwords);
			}
			
			else {
		
				for(int i=option.nextIndex; i<= word.length(); i++) {
					String oneword = word.substring(option.nextIndex,i);
					if(dic.contains(oneword)) {
					Option newOption = new Option(i, option.listofwords);
					newOption.listofwords.add(oneword);
					q.add(newOption);
					
					}
					
				}
			}
		}
	}
}

