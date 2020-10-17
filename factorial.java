import java.util.*;
class fact{
	int i,f=1,n;
	Scanner sc=new Scanner(System.in);
	void input()
	{
	System.out.println("Enter the number");
	n=sc.nextInt();
    }
    void calculate(){
	for(i=1;i<=n;i++)
	{
		f=f*i;
	}
	System.out.println("The Result is="+f);
}
}
class factorial{
	 public static void main(String[] args) {
		fact f=new fact();
		f.input();
		f.calculate();
	}
}
