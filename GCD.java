import java.util.*;
class GCD{
	public static void main(String args[]){
		int i,a,b,gcd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		for(i=1;i<=a && i<=b;i++){
			if((a%i==0)&&(b%i==0)){
				gcd=i;
			}
		}
		System.out.println("GCD is "+a+" and "+b+" is= "+gcd);
	}
}