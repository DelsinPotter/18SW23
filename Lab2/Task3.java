class Task3{
			public static void main(String[] args){
			float a=(float)2.5,b=(float)24.5,c=(float)48.3,d=(float)87.7,e=(float)43.5;  // We have to do explicit casting because of automatic conversion to double
			double average;
			System.out.println("Numbers are");
			System.out.println(a+" "+b+" "+c+" "+d+" "+e);
			average=(a+b+c+d+e)/5;   //here the casting is automatically done because java automatically converts expression values to double
			System.out.println(average);
			
			
			}
}
