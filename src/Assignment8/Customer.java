package Assignment8;

    public class Customer implements Runnable {
        Thread t;
        Waiter q;
        public Customer(Waiter q)
        {
            this.q=q;
            t=new Thread(this);
            t.start();
        }
        @Override
        public void run() {
            int i=0;
            while(i<1)
            {
                q.getServe();
                i++;
            }

        }

    }

