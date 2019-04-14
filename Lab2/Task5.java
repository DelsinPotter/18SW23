class Task5{
			public static void main(String[] args){
			int a=4,b=8;
			System.out.println(a>>2);  //4=00000100 >> 00000001=1
			System.out.println(a);     //a=4
			System.out.println(a<<2);  //4=00000100 << 00010000=16
			System.out.println(~b);    //8=00001000 becomes 11110111 but using 2's compliment we get 00001000 + 1= 00001001=9 output is -9 because sign bit is 1
			System.out.println(a&2);   //4=00000100 & 00000010 =0
			
			
			
			}
}
