package design2;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b;
        Scanner in =new Scanner (System.in);
        System.out.println("enter a value");
        a=in.nextInt();
        System.out.println("enter b value");
        b=in.nextInt();
        System.out.println("sum="+(a+b));
        System.out.println("sub="+(a-b));
        System.out.println("mul="+(a*b));
        System.out.println("div="+(a/b));

	}

}
