package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		if(t>0 && t<=10){
			int n=0;
			int count=0;
			int diff=0;
			int a[], b[];
			for(int c=0;c<t;c++){
				n=sc.nextInt();
				if(n>0 && n<=10000){
					a=new int[n];
					b=new int[n];
					for(int i=0;i<n;i++){
						a[i]=sc.nextInt();
					}
					for(int i=0;i<n;i++){
						b[i]=sc.nextInt();
					}
					for(int i=0;i<n;i++){
						if(i==0){
							diff=a[i];
							if(diff>=b[i])
								count++;
						}
						else{
							diff=a[i]-a[i-1];
							if(diff>=b[i])
								count++;
						}
					}
					System.out.println(count);
				}
			}
		
		}
	}
		

}
