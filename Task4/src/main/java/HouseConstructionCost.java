import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class HouseConstructionCost
{
    String material;
    int area;
    String auto;
    int price;
    HouseConstructionCost(String material,int area,String automation)
    {
        this.material=material;
        this.area=area;
        this.auto=automation;
        this.price=0;
    }
    int calcCost()
    {
        if(material.equalsIgnoreCase("average"))
        {
            if(auto.equalsIgnoreCase("fully"))
                price+=1900*area;
            else
                price+=1200*area;
        }
        else if(material.equalsIgnoreCase("medium"))
        {
            if(auto.equalsIgnoreCase("fully"))
                price+=2200*area;
            else
                price+=1500*area;
        }
        else if(material.equalsIgnoreCase("high"))
        {
            if(auto.equalsIgnoreCase("fully"))
                price+=2500*area;
            else
                price+=1800*area;
        }
        return price;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter material type");
        String material= sc.nextLine();
        System.out.println("Enter area");
        int area= sc.nextInt();
        System.out.println("Enter automation type");
        String auto=sc.next();
        HouseConstructionCost cost=new HouseConstructionCost(material,area,auto);
        int finalPrice=cost.calcCost();
        System.out.println("Hous Construction Cost is "+ finalPrice);
    }
}
