package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScientificCalculator {
    public ScientificCalculator() {

    }

    public static void main(String ar[]) {
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        System.out.println("Welcome to the scientific calculator. This is the new UI .Select \n 1. to perform Square root \n 2. to perform Factorial \n 3. to perform natural logarithm \n 4. to perform power \n");
        int choice;
        Scanner scanner=new Scanner(System.in);
        try{
            choice=scanner.nextInt();
            if(choice<1 || choice>4)
                throw new InputMismatchException();
        }catch(InputMismatchException e){
            e.getLocalizedMessage();
            System.out.println("Please enter a valid choice");
            return;
        }
        double arg1,arg2;
        arg2=0;
        try{
            System.out.println("Enter the argument\n");
            arg1=scanner.nextDouble();
            if(choice==4){
                System.out.println("Enter the power\n");
                arg2=scanner.nextDouble();
            }
        }catch(InputMismatchException e){
            System.out.println("Please enter valid argument(s)");
            e.getLocalizedMessage();
            return;
        }
        System.out.println("Output is : "+scientificCalculator.getCalculations(arg1,arg2,choice));




    }
    public String getCalculations(double arg1,double arg2,int choice){
        if(choice==1)
            return getSquareRoot(arg1);
        if(choice==2)
            return getFactorial(arg1);
        if(choice==3)
            return getNaturalLogarithm(arg1);
        return getPower(arg1,arg2);
    }
    public String getSquareRoot(double arg){
        return Double.toString(Math.sqrt(arg));
    }
    public String getFactorial(double arg){
        double result=1;
        for(int i=1;i<=arg;i++)
            result*=arg;
        return Double.toString(result);
    }

    public String getNaturalLogarithm(double arg){
        double result=0;
        try {
            result = Math.log(arg);
        }catch(Exception e){
            return e.getLocalizedMessage();
        }
        return Double.toString(result);
    }

    public String getPower(double arg1,double arg2){
        return Double.toString(Math.pow(arg1,arg2));
    }
}