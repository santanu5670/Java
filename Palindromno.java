import java.util.*;
class Palindromno{
	public static void main(String args[]){
		int n,q,r,s=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        n=sc.nextInt();
        q=n;
        while(n>0){
        	r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==q){
        	System.out.println("The Number is Palindrom");
        }
        else{
        	System.out.println("The Number is Not Palindrom");
        }
	}
}