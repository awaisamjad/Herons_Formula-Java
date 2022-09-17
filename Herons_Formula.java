import java.util.Scanner;
public class Herons_Formula {
    public static void main(String args[]) 
    {   
       
      Scanner sc= new Scanner(System.in);
      double a, b, c;
      String unit;
        //Taking the user input
        System.out.println("Enter unit of Measurement:");
        unit= sc.nextLine();
        System.out.println("Enter first side:");
        a= sc.nextDouble();
        System.out.println("Enter second side:");
        b= sc.nextDouble();
        System.out.println("Enter third side:");
        c= sc.nextDouble();
        
        if((a+b)>c && (a+c)>b && (b+c)>a) //Checking if the triangle with the given sides exist
        {
            double s=(a+b+c)/2; //Finding the semi-perimeter
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c)); //Using heron's formula to find the area
            System.out.println("Area:  "+ area + unit + " squared");
          }
        else  
           System.out.println("This trinagle cannot exist. Check dimensions again");
   }
}