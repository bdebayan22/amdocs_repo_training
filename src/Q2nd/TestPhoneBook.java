package Day6.Q2nd;

import java.util.HashMap;
import java.util.Scanner;

public class TestPhoneBook {
    public static void main(String[] args) throws PhoneBookException{
        Scanner sc=new Scanner(System.in);
        int i=0;
        HashMap<Integer,PhoneBook> phoneBook=new HashMap<>();
        while(i!=1)
        {
            System.out.println("1.Add Number 2.Display all contacts 3.Search number 4.Remove number 5.Exit");
        switch (sc.nextInt())
        {
            case 1:System.out.println("Enter Name and number to add--");
            String name=sc.next();
            int num=sc.nextInt();
            if(phoneBook.containsKey(num))
                throw new PhoneBookException("Number already exist");
            else
                phoneBook.put(num,new PhoneBook(name,num));
            break;
            case 2:
            if(phoneBook.isEmpty())
                System.out.println("Phone book is empty");
            else {
                System.out.println("All contacts");
                for (PhoneBook ph : phoneBook.values())
                    System.out.println(ph);
            }
            break;
            case 3:System.out.println("Enter number to search");
                   int phno=sc.nextInt();
                   if(phoneBook.containsKey(phno))
                       System.out.println(phoneBook.get(phno));
                   else
                       throw new PhoneBookException("Number not found");
            break;
            case 4:System.out.println("Enter number to remove");
                   int phno1=sc.nextInt();
                   if(phoneBook.containsKey(phno1)) {
                       phoneBook.remove(phno1);
                       System.out.println("Number removed from phonebook");
                   }
                   else
                       throw new PhoneBookException("Number to found");
                   break;
            case 5:i=1;
            break;
            default:throw new PhoneBookException("Wrong option selected");
        }
        }
    }
}
