import java.util.*;
class Task2{
			public static void main(String[] args){
			Scanner scan= new Scanner(System.in);
			int cost=0,units;
			System.out.println("Please enter number of units consumed");
			units=scan.nextInt();
			if(units<=50){
			System.out.println(units*10);}
			if(units<=100&&units>50){
			int a,b;
			a=units-50;
			b=(a*15)+500;
			System.out.println(b);}
			if(units>100&&units<=200){
			int a,b;
			a=units-100;
			b=(a*20)+1250;
			System.out.println(b);}
			if(units>200&&units<=300){
			int a,b;
			a=units-200;
			b=(a*25)+3250;
			System.out.println(units*10);}
			if(units>300){
			int a,b;
			a=units-300;
			b=(a*30)+5750;
			System.out.println(units*10);}
}}