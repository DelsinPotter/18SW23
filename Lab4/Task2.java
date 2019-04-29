import java.util.*;
class Task2{
			public static void main(String args[]){
			Scanner sc= new Scanner(System.in);
			int table,start,end;
			System.out.println("Enter the number whose table is to be displayed->");
			table=sc.nextInt();
			System.out.println("Enter the starting point->");
			start=sc.nextInt();
			System.out.println("Enter the ending point->");
			end=sc.nextInt();
			for(int st=start;st<=end;st++){
			System.out.println(table+"x"+st+"="+(table*st));}
			}
}
