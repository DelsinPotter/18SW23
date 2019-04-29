class Task6{
			public static void main(String[] args){
			String num=args[0];
			int count=0,find=Integer.parseInt(num);
			int[] a={5,6,7,8,9,10,11,12,13,14};
			for(int b=0;b<=9;b++){
			if(a[b]==find){
				System.out.println("The number is present at "+b);
			}
			if(a[b]!=find){
				count++;
			}
			}
			if(count==10){
				System.out.println("The number is not present in the array");
			}
			
			
			}

}
