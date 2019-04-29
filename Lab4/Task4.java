import java.util.*;
class Task4{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of rows=");
				int r,c;
			r=sc.nextInt();
			System.out.println("Enter number of columns=");
			c=sc.nextInt();
			int a[][]=new int[r][c],b[][]=new int[r][c],sum[][]=new int[r][c];
			System.out.println("Enter first array=");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					a[i][j]=sc.nextInt();
					}
					System.out.println(" ");	}
			System.out.println("Enter second array=");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					b[i][j]=sc.nextInt();}
					System.out.println(" ");	}
					System.out.println("Result is \n");
					
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
				sum[i][j]=a[i][j]+b[i][j];				
			}
			}
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
				int row=i+1,column=j+1;
				System.out.println("a"+row+column+"="+sum[i][j]);
				
				
			}}
			
}}
