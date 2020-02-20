import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
class CalculateInterest {
    int principal;
    int rate;
    int time;
    double simpleInt;
    double compoundInt;

    public CalculateInterest(int principal, int rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double simpleInterest() {
        simpleInt = (principal * rate * time) / 100;
        return simpleInt;
    }

    public double compoundInterest() {
        double value = Math.pow((1 - rate / 100), time);
        compoundInt = principal * (value - 1);
        return compoundInt;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int principal = s.nextInt();
        int rate = s.nextInt();
        int time = s.nextInt();
        CalculateInterest CalculateInterest = new CalculateInterest(principal, rate, time);
        double si = CalculateInterest.simpleInterest();
        double ci = CalculateInterest.compoundInterest();
        System.out.println("Simple Interest : "+ si +"Compound Interest: "+ci);
    }
}
