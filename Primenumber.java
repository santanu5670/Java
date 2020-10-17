import java.util.*;

 // Compiler version JDK 11.0.2

 class Primenumber
 {
   public static void main(String args[])
   { 
    int i,j,a,b,flag,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the lower range");
    a=sc.nextInt();
    System.out.println("Enter the upper range");
    b=sc.nextInt();
    System.out.print("Prime Numbers are=");
    for(i=a;i<=b;i++)
    {
      if (i == 1 || i == 0) 
       continue;
     flag=1;
      for(j=2;j<=i/2;j++)
      {
        if(i%j==0){
        flag=0;
        break;
      }
    }
      if(flag==1){
    System.out.print("\t"+i);
    count++;
   }
 }
 System.out.printf("\n Number of Prime numbers between %d to %d is= ",a,b);
 System.out.println(count);
}
}