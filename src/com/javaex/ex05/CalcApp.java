package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in); 
    	Add add = new Add();
    	Sub sub = new Sub();
    	Div div = new Div();
    	Mul mul = new Mul();
    	
    	while(true) {
    		System.out.print(">>");
    		String cal01 = sc.next();
    		
    		if (cal01.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}
    		
    		String[] iArray = cal01.split(" ");
    		int num01 = Integer.parseInt(iArray[0]);
    		int num02 = Integer.parseInt(iArray[2]);
    		
    		switch(iArray[1]) {
    			
    		case "+" : 
    			add.setValue(num01, num02);
    			System.out.println(add.calculate());
    			break;
    			
    		case "-" :
    			sub.setValue(num01, num02);
    			System.out.println(sub.calculate());
    			break;
    			
    		case "/" :
    			div.setValue(num01, num02);
    			System.out.println(div.calculate());
    			break;
    			
    		case "*" :
    			mul.setValue(num01, num02);
    			System.out.println(mul.calculate());
    			break;
    			
    		default : 
    			System.out.println("알 수 없는 연산입니다.");
    			break;
    		}
    	
    		sc.close();
    	}
    	
    	
    }
}
