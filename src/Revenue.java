import java.util.Scanner;

public class Revenue {
    public static void main(String[] args){
        calculateSale();
    }
    static void calculateSale(){

        float unitprice=0f;
        int quantity=0;
        float revenue=0f;
        float discount_rate=0f, discount_amount=0f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter unit price:");
        unitprice=sc.nextFloat();
        System.out.print("Enter quantity:");
        quantity=sc.nextInt();
        if(quantity<100)
            revenue=unitprice*quantity;
        else if(quantity>=100 && quantity<=120)
        {
            discount_rate=(float)15/100;
            revenue=unitprice*quantity;
            discount_amount=revenue*discount_rate;
            revenue-=discount_amount;
        }

        else if(quantity>120)
        {
            discount_rate=(float)20/100;
            revenue=unitprice*quantity;
            discount_amount=revenue*discount_rate;
            revenue-=discount_amount;
        }
        System.out.println("The revenue from sale:"+revenue+"$");
        System.out.println("Discount:"+discount_amount+"$("+discount_rate*100+"%)");
    }

}
