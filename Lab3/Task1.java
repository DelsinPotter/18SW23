import java.util.*;
class Task1{
			public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter marks for C++");
			int x=scan.nextInt(),y,z;
			System.out.println("Enter marks for Data Structures");
			y=scan.nextInt();
			System.out.println("Enter marks for Operating Systems");
			z=scan.nextInt();
			int h=x+y+z;
			System.out.println("Total marks= "+h+" out of 300");
			double perct=(h/3);
			System.out.println("Percentage is "+perct+'%');
			if(perct>90){
				System.out.println("Grade=A");
			}
			else if (perct<=90&&perct>=80){
				System.out.println("Grade=B");
			}
			else if (perct<80&&perct>=70){
				System.out.println("Grade=C");
			}
			else if (perct<70&&perct>=60){
				System.out.println("Grade=D");
			}
			else if (perct<60){
				System.out.println("Grade=Fail");
			}
			
			
}}
