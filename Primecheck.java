import java.util.*;
class Prime{
	int i,n,flag=0;
    Scanner sc=new Scanner(System.in);
    void input(){
    	System.out.println("Enter The Number");
    	n=sc.nextInt();
    }
    void calculate(){
    	for(i=2;i<=n/2;i++){
    		if(n%i==0){
    			flag=1;
    			break;
    		}
    	}
    	if(flag==1){
    		System.out.println("The Number is not prime");
    	}
    	else{
    		System.out.println("The Number is Prime");
    	}
    }
}
class Primecheck{
	public static void main(String args[]){
	Prime ob=new Prime();
	ob.input();
	ob.calculate();
}
}