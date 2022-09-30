package Assignment10;

import java.util.HashMap;

public class ProductUtils {
    static HashMap<String,Grocery>grocery=new HashMap<>();
    static HashMap<String,Electronics>electronics=new HashMap<>();
    static HashMap<String,Kids>kids=new HashMap<>();

    public static HashMap<String, Electronics> getElectronics() {
        electronics.put("Mobile",new Electronics("Mobile",10000));
        electronics.put("Washing Machine",new Electronics("Washing Machine",15000));
        electronics.put("Dishwasher",new Electronics("Dishwasher",12000));
        return electronics;
    }
    public static HashMap<String,Grocery> getGrocery(){
        grocery.put("Rice",new Grocery("Rice",70));
        grocery.put("Milk",new Grocery("Milk",50));
        grocery.put("Biscuit",new Grocery("Biscuit",30));
        return grocery;
    }

    public static HashMap<String, Kids> getKids() {
        kids.put("Shirt",new Kids("Shirt",500));
        kids.put("TShirt",new Kids("TShirt",450));
        kids.put("Shoes",new Kids("Shoes",750));
        return kids;
    }
}
