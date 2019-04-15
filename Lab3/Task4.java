class Task4{
			public static void main(String[] args){
			String x=args[0],y=args[1],c=args[2];
			int a=Integer.parseInt(x),b=Integer.parseInt(y);
			char oper=c.charAt(0);
			switch(oper){
			case '+':
			System.out.println(a+b);
			break;
			case '-':
			System.out.println(a-b);
			break;
			case '*':
			System.out.println(a*b);
			break;
			case '/':
			System.out.println(a/b);
			break;
			}
}}