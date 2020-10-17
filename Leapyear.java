import java.util.*;
class Leapyear{
	public static void main(String args[]){
    int y;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Year");
    y=sc.nextInt();
    if (y%4==0 && y%100!=0)
    {
    	System.out.println("The Year is leapyear");
    }
    	else if (y%400==0)
    	{
    		System.out.println("The Year is leapyear");
    	}
    	else{
    		System.out.println("The Year is not leapyear");
    	}
}
}
