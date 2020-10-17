import java.util.*;
class Strong{
	public static void main(String args[]){
		int i,n,q,r,s=0,fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		q=n;
		while(q>0){
			fact=1;
			r=q%10;
			for(i=1;i<=r;i++){
				fact=fact*i;
			}
			s=s+fact;
			q=q/10;
		}
		if(s==n){
			System.out.println("The Number is Strong");
		}
		else{
			System.out.println("The Number is not Strong");
		}
	}
}