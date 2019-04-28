import java.lang.Math;
import java.util.*;
class BinaryToDecimal{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	String a=sc.nextLine();
	int ans=0,count=0;
	for(int j=a.length()-1;j>=0;j--){
	if(a.charAt(j)=='0'){
	
	}
	else if(a.charAt(j)=='1'){
	ans+=(Math.pow(2,count));
	}
	count++;}
	System.out.println(ans);
	}

}
