package hw;
import java.util.Scanner;
/*
 * Topic: è®ä½¿?¨?è¼¸?¥ä¸?æ­??´?¸ï¼å©?¨?½å¼å¼?«?¾?ºä¸???çºæ´?¸?¸??è?è©²?¸??ç?å?çºæ­¤ä?æ­??´?¸ï¼æ?ä?æ­£?´?¸ä¸¦ä?è½?¾?º??çºæ´?¸ï¼è¥?¾ä¸å°??ï?è?å°?º?No?ã??
 ä¾å??: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author:  105021118  ¾G¾åª´
 */
public class hw01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		fun(n);
	}
	public static void fun(int x){
		String str=" ";
		int sum=0,count=0;
		for(int i=1;i<x;i++){
			sum=0;
			str=" "+i;
			int j=i;
			while(sum<x){
				sum+=j++;
				if(sum<x){
					str+="+"+j;
				}
				if(sum==x){
					count++;
					System.out.println(str);
				}
			}
			if(count==0){
				System.out.println("No");
			}
		}
	}

}
