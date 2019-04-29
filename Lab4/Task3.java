import java.util.*;
class Task3{
			public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number till which sum is to be calculated->");
			int sum=0,N=sc.nextInt();
			if(N==0){
				System.out.println("Error, Please enter a number greater than 1");
			}
			if(N!=0){
			for(int st=1;st<=N;st++){
			sum+=st;}
			System.out.println("Sum is "+sum);
			}
			
			
			}}
