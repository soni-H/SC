package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScientificCalculator {
    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);
    public ScientificCalculator() {

    }

    public static void main(String ar[]) {
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        System.out.println("Hi there, welcome to the scientific calculator");
        while(true) {
            System.out.println("Please select \n 1. to perform Square root \n 2. to perform Factorial \n 3. to perform natural logarithm \n 4. to perform power \n 5. to exit");
            int choice = 0;
            Scanner scanner = new Scanner(System.in);
            try {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 5)
                    throw new InputMismatchException();
            } catch (InputMismatchException e) {
                e.getLocalizedMessage();
                System.out.println("Please enter a valid choice");
                logger.error("User entered invalid choice : " + choice);
                return;
            }
            if(choice==5){
                System.out.println("Thank you. Bye !!");
                return;
            }
            double arg1, arg2;
            arg2 = 0;
            try {
                System.out.println("Enter the argument\n");
                arg1 = scanner.nextDouble();
                if (choice == 4) {
                    System.out.println("Enter the power\n");
                    arg2 = scanner.nextDouble();
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid argument(s)");
                logger.error("User entered invalid argument(s)");
                e.getLocalizedMessage();
                return;
            }
            System.out.println("Output is : " + scientificCalculator.getCalculations(arg1, arg2, choice));
        }
    }
    public double getCalculations(double arg1,double arg2,int choice){
        if(choice==1)
            return getSquareRoot(arg1);
        if(choice==2)
            return getFactorial(arg1);
        if(choice==3)
            return getNaturalLogarithm(arg1);
        return getPower(arg1,arg2);
    }
    public double getSquareRoot(double arg){
        logger.info("Square root of "+arg+" : "+Math.sqrt(arg));
        return Math.sqrt(arg);
    }
    public double getFactorial(double arg){
        double result=1;
        for(int i=1;i<=arg;i++)
            result*=i;
        logger.info("Factorial of "+arg+" : "+result);
        return result;
    }

    public double getNaturalLogarithm(double arg){
        double result=0;
        try {
            result = Math.log(arg);
            logger.info("Natural Logarithm of "+arg+" : "+result);
        }catch(Exception e){
            logger.error(e.getLocalizedMessage());
            return -1;
        }
        return result;
    }

    public double getPower(double arg1,double arg2){
        logger.info("Power of "+arg1+" raise to the power of "+arg2+" : "+Math.pow(arg1,arg2));
        return Math.pow(arg1,arg2);
    }
}