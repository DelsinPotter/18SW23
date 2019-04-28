import java.util.*;
class DecimalToBinary{
					public static void main(String[] args){
					System.out.println("Enter decimal number");
					Scanner sc=new Scanner(System.in);
					int x=sc.nextInt(),y,z;
					
			
			String g="";
			
			
			while(x!=1){
			y=x%2;
			if(y==1){
				g+='1';
			}
			else if(y==0){
				g+='0';
			}
			x=(int)x/2;
			}
			g+='1';
			for(int size=g.length()-1;size>=0;size--){
				System.out.print(g.charAt(size));
			}
			}
					
					
					}

