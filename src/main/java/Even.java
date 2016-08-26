
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakob
 */
public class Even
{
    
    private int n = 0;

    public synchronized int next()
    {
        n++;
        n++;
        return n;
    }
    
        static Even even = new Even();
    public static class Thread1 extends Thread
    {
        public void run()
        {
            boolean finish = false;
            while(!finish)
            {
                
            System.out.println(even.next());
            
                try
                {
                    Thread1.sleep(1000);
                }
                catch (InterruptedException ex)
                {
                    Logger.getLogger(Even.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        Thread1 t = new Thread1();
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();
        Thread1 t4 = new Thread1();
        t1.start();
        t2.start();
        t3.start();
        t.start();
        t4.start();
    }
}
