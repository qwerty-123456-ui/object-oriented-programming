class compute
{
        synchronized public void compute(int n)
        {
                for(int i=1;i<=10;i++)
                {
                        System.out.println(n +"*"+i+"="+(n*i));
                }
                try
                {
                        Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                        System.out.println(e);
                }
        }
}
class MyT extends Thread
{
        public compute c;
        int n;
        MyT(compute c,int n)
        {
                this.c=c;
                this.n=n;
        }
        public void run()
        {
                c.compute(n);
        }
}
class B9
{
        public static void main(String[] a)
        {
                compute c=new compute();
                MyT t1=new MyT(c,8);
                MyT t2=new MyT(c,9);
                t1.start();
                t2.start();
        }
}

