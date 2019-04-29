import java.util.*;
class Task7{
			
			public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter number of elements=");
			int ptr,n=sc.nextInt();
			int[] data=new int[n];
			for(int x=0;x<n;x++){
			data[x]=sc.nextInt();
			}
			for(int k=1;k<n;k++){
			ptr=0;
			while(ptr<(n-k)){
			if(data[ptr]>data[ptr+1])
			{
			int sw=data[ptr+1];
			data[ptr+1]=data[ptr];
			data[ptr]=sw;
			}
			ptr++;
			
			
			}
			
			
			}
}}
