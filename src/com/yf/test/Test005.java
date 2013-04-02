package com.yf.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	List<String> red=new ArrayList<String>();
	List<String> blue=new ArrayList<String>();
	blue.add("02");
	blue.add("05");
	blue.add("08");
	blue.add("11");
	List<String> result=new ArrayList<String>();
	red.add("02");
	red.add("03");
	red.add("09");
	red.add("10");
	red.add("13");
	red.add("17");
	red.add("19");
	red.add("20");
	red.add("29");
	red.add("31");
	Random r=new Random();
	Random r1=new Random();
	int i=4;
	int rand=4;
	while(i>0){
		
		int index=r.nextInt(rand);
		result.add(blue.get(index));
		red.remove(index);
		result.add(",");
		i--;
	}
	
	for(String str:result){
		System.out.print(str);
	}
		
	}
}
