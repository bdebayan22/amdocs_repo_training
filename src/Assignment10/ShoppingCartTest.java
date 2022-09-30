package Assignment10;

import java.util.HashMap;
import java.util.Scanner;

import static Assignment10.ProductUtils.*;

public class ShoppingCartTest {
    public static void main(String[] args) throws CustException{
        Scanner sc=new Scanner(System.in);
        HashMap<String,Cart> cart=new HashMap<>();
        HashMap<String,Grocery>groceryHashMap=getGrocery();
        HashMap<String,Electronics>electronicsHashMap=getElectronics();
        HashMap<String,Kids>kidsHashMap=getKids();
        int i=0;
        int price=0;
        int price1=0;
        int status=0;
        while(i!=1) {
            System.out.println("Select your choice--");
            System.out.println("1.Add to Cart 2.Remove from Cart 3.Show bill 4.Show Category bill 5.Exit");
            switch (sc.nextInt())
            {
                case 1:System.out.println("Select Category of products--1.Grocery 2.Electronics 3.Kids");
                switch (sc.nextInt())
                {
                    case 1:System.out.println("Select the grocery product from the list--");
                         System.out.println(groceryHashMap);
                         String prod=sc.next();
                         if(groceryHashMap.containsKey(prod))
                         {
                             Grocery grocery1=groceryHashMap.get(prod);
                             cart.put(grocery1.getName(),new Cart(grocery1.getName(),grocery1.getPrice(),"Grocery"));
                         }
                         else
                         {
                             throw new CustException("Grocery Product not found");
                         }
                         break;
                    case 2: System.out.println("Select the electronics product from the list--");
                        System.out.println(electronicsHashMap);
                        String prod1=sc.next();
                        if(electronicsHashMap.containsKey(prod1))
                        {
                            Electronics electronics1=electronicsHashMap.get(prod1);
                            cart.put(electronics1.getName(),new Cart(electronics1.getName(),electronics1.getPrice(),"Electronics"));
                        }
                        else
                        {
                            throw new CustException("Electronics Product not found");
                        }
                        break;
                    case 3:System.out.println("Select the kids product from the list--");
                        System.out.println(kidsHashMap);
                        String prod2=sc.next();
                        if(kidsHashMap.containsKey(prod2))
                        {
                            Kids kids1=kidsHashMap.get(prod2);
                            cart.put(kids1.getName(),new Cart(kids1.getName(),kids1.getPrice(),"Kids"));
                        }
                        else
                        {
                            throw new CustException("Kids Product not found");
                        }
                        break;
                    default:throw new CustException("Wrong product option selected");
                }
                break;
                case 2:
                    System.out.println("Enter the product which you want to remove--");
                    System.out.println(cart);
                    String removeProd=sc.next();
                    if(cart.containsKey(removeProd))
                    {
                        cart.remove(removeProd);
                        System.out.println("Product removed from cart");
                    }
                    else {
                        throw new CustException("Wrong product name entered");
                    }
                    break;
                case 3:
                    for (Cart p: cart.values())
                        price=price+p.getPrice();
                    System.out.println("Total price="+price);
                    price=0;
                    break;
                case 4:
                    System.out.println("Enter Category to see category wise total amount");
                    String cat=sc.next();
                    price1=0;
                    for(Cart p1:cart.values())
                    {
                        if(p1.getCategory().contains(cat))
                        {
                            price1=price1+p1.getPrice();
                        }
                    }
                    System.out.println("Price for "+cat+" category="+price1);
                    break;
                case 5:
                    i=1;
                    System.out.println("Thanks for shopping with us..");
                    break;
                default:throw new CustException("Wrong option selected");

            }
        }
    }
}
