import java.util.Scanner;
class complex
{
    void addition(double r1,double i1,double r2,double i2)
    {
        double sum1=r1+r2;
        double sum2=i1+i2;
        if(sum2<=0)
        {
            System.out.println("Addition :"+sum1+" "+sum2+"i");
        }
        else
        {
            System.out.println("Addition :"+sum1+"+"+sum2+"i");
        }
    }
    void subtraction(double r1,double i1,double r2,double i2)
    {
        double sub1=r1-r2;
        double sub2=i1-i2;
        if(sub2<=0)
        {
            System.out.println("Subtraction :"+sub1+" "+sub2+"i");
        }
        else
        {
            System.out.println("Subtraction :"+sub1+"+"+sub2+"i");
        }
    }
    void multiplication(double r1,double i1,double r2,double i2)
    {
        double mul1=(r1*r2)-(i1*i2);
        double mul2=(r1*i2)+(r2*i1);
        if(mul2<=0)
        {
            System.out.println("Multiplication :"+mul1+" "+mul2+"i");
        }
        else
        {
            System.out.println("Multiplication :"+mul1+"+"+mul2+"i");
        }
    }
    void division(double r1,double i1,double r2,double i2)
    {   double denominator=(r2*r2)+(i2*i2);
        if(denominator == 0)
        {
            System.out.println("Cannot divide by zero");
            return;
        }
        double div1=((r1*r2)+(i1*i2))/denominator;
        double div2=((i1*r2)-(r1*i2))/denominator;
        if(div2<=0)
        {
            System.out.printf("Division :%.2f %.2fi\n",div1,div2);
        }
        else
        {
            System.out.printf("Division :%.2f + %.2fi\n",div1,div2);
        }
    }
}
class ComplexCalculator
{
     public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
        complex c = new complex();
        System.out.println("Enter Real and Imaginary part of 1st Number");
        int r1 = Sc.nextInt();
        int i1 = Sc.nextInt();
        System.out.println("Enter Real and Imaginary part of 2nd Number");
        int r2 = Sc.nextInt();
        int i2 = Sc.nextInt();
        c.addition(r1,i1,r2,i2);
        c.subtraction(r1,i1,r2,i2);
        c.multiplication(r1,i1,r2,i2);
        c.division(r1,i1,r2,i2);
        Sc.close();
    }
}