class Task1{
public static void starSeries(int d){
			for(int a=1;a<=d;a++){
				System.out.print('*');
			}
			
		}
		public static void main(String[] args){
		char a='*';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
			System.out.print(a);}
		System.out.println(" ");}
		System.out.println(" ");
		System.out.println(" ");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
			System.out.print(a);}
			System.out.println(" ");
		
		}
		System.out.println(" ");
		for(int v=1;v<=5;v++){
					for(int space=v;space<5;space++){
					System.out.print(" ");
					}
					for(int star=1;star<=(2*v-1);star++){
					System.out.print('*');}
					System.out.println(' ');}
			}
		}
