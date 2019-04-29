class Task5{
			public static void main(String[] args){
			int[] a={3,9,2,10,15,1};
			int count0=0,count1=0,count2=0,count3=0,count4=0,count5=0;
			for(int b=0;b<=5;b++){
			if(a[0]>a[b]){
			count0++;}
			
			}
			for(int b=0;b<=5;b++){
			if(a[1]>a[b]){
			count1++;}}
			for(int b=0;b<=5;b++){
			if(a[2]>a[b]){
			count2++;}}
			for(int b=0;b<=5;b++){
			if(a[3]>a[b]){
			count3++;}}
			for(int b=0;b<=5;b++){
			if(a[4]>a[b]){
			count4++;}}
			for(int b=0;b<=5;b++){
			if(a[5]>a[b]){
			count5++;}}
			
			
			if(count0==5){System.out.println(a[0]);}
			if(count1==5){System.out.println(a[1]);}
			if(count2==5){System.out.println(a[2]);}
			if(count3==5){System.out.println(a[3]);}
			if(count4==5){System.out.println(a[4]);}
			if(count5==5){System.out.println(a[5]);}
			
}}

