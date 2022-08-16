package questions;
import java.util.Scanner;
public class questions 
{
static Scanner sc= new Scanner(System.in);
	static void clrscr()
	{ 
			   System.out.flush();  
	}
	static void swap()
	{
		int a,b;
		System.out.println("input a ");
		a= sc.nextInt();
		System.out.println("input b ");
		b= sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("your swapped numbers are a= "+a+" b= "+b);		
	}
	static void area()
	{
		double a,b;
		System.out.println("input length ");
		a= sc.nextDouble();
		System.out.println("input width");
		b= sc.nextDouble();
		System.out.println("total area is "+a*b);
	}
	static void temprature()
	{
		double a,b;
		System.out.println("input temprature in celcius ");
		a= sc.nextDouble();
		b=( a * 1.8)+32;
		System.out.println("temprature in fahrenheit is "+b);
	}
	static void interest()
	{
		double si,p,r,t;
		System.out.println("input principle amount ");
		p= sc.nextDouble();
		System.out.println("input rate ");
		r= sc.nextDouble();
		System.out.println("input time ");
		t= sc.nextDouble();
		si=(p*r*t)/100;
		System.out.println("calculated interst is "+si);
	}
	static void triangle()
	{
		int a,b,c;
		System.out.println("input angle 1 ");
		a= sc.nextInt();
		System.out.println("input angle 2 ");
		b= sc.nextInt();
		System.out.println("input angle 3 ");
		c= sc.nextInt();
		int sum=a+b+c;
		if(sum!=180)
		System.out.println("sum of angles is "+sum+"triangle cannot be formed try other values ");
		else if(a==b&&b==c&&c==60)
		System.out.println("your triangle is an equilateral triangle and acute triangle");		
		else if(a<90&&b<90&&c<90)
		System.out.println("your triangle is an acute triangle");	
		else if(a>90||b>90||c>90)
		System.out.println("your triangle is an obtuse triangle");	
		else if(a==90||b==90||c==90)
		System.out.println("your triangle is an right angle triangle");	
	}
	static void result() {
		int a,b,c,avg;
		System.out.println("input marks of subject 1 ");
		a= sc.nextInt();
		System.out.println("input marks of subject 2 ");
		b= sc.nextInt();
		System.out.println("input marks of subject 3 ");
		c= sc.nextInt();
		avg=(a+b+c)/3;
		if(a<30||b<30||c<30)
			System.out.println("you did not pass in all subjects , Better luck next time. ");
		else if(avg>=90)
			System.out.println("your grade is A , Well done you are one of the top students");
		else if(avg>70)
			System.out.println("your grade is B , good efforts you can still improve");
		else if(avg>50)
			System.out.println("your grade is C , you have potential to score higher");
		else if(avg>30)
			System.out.println("your grade is D , you are clear for now but keep learning");
		
		
	}
	static void greater() {
		int a,b,c;
		System.out.println("input number 1 ");
		a= sc.nextInt();
		System.out.println("input number 2 ");
		b= sc.nextInt();
		System.out.println("input number 3 ");
		c= sc.nextInt();
		System.out.println("largest number is "+((a>b)?(a>c?a:b):(b>c?b:c)));
	}
	/*static void threearea()
	{int choice;
		System.out.println("input your shape \n1 circle \n2 square \n rectangle");
		if(choice==1)
		{
			0
		}
	}*/
public static void main(String[] args) {
		int a = 1;
		while(a!=0)
		{
		clrscr();
		System.out.println("\n\nSelect your operation \n1 Swap numbers \n2 Calculate area \n3 Convert temprature \n4 Calculate interest \n5 Type of triangle \n6 Result of Student \n7 Greatest of 3 number \nInput your choice press 0 to exit  ");
		a= sc.nextInt();
		
		switch(a)
		{
		case 1:swap();break;
		case 2:area();break;
		case 3:temprature();break;
		case 4:interest();break;
		case 5:triangle();break;
		case 6:result();break;
		case 7:greater();break;
		default:System.out.println("exited with code 0 ");
		}
		}
	}
}
