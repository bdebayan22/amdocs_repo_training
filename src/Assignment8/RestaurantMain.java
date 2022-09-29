package Assignment8;


    public class RestaurantMain {

        public static void main(String[] args) {
            Waiter q=new Waiter();
            new Chef(q);
            new Customer(q);

        }

    }

