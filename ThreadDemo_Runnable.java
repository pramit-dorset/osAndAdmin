class Task2 implements Runnable //extends Thread
{  
    public void run()
    {
        System.out.println("Entering Print Function in the Class");
        
        for(int i=0; i<= 30; i++)
            System.out.println(">> From Task2 - Count=" + i);
        
            System.out.println("Exiting Print Function in the Class");
    }
}

class GeneralTask
{
    int genTaskNum;
    String genTaskName;
}

class Task4 extends GeneralTask implements Runnable
{
    public void run()
    {
        System.out.println("Entering Print Function in the Class");
        
        for(int i=0; i<=30; i++)
            System.out.println(">> From Task4 - Count=" + i);
        
            System.out.println("Exiting Print Function in the Class");
    }
}

class ThreadDemo_Runnable{
    public static void main(String[] args) {
        
        //Task 1
        System.out.println("** Starting Main ** ");
        
        //Task 2
        //Task2 t2 = new Task2();
        //Task4 t4 = new Task4();

        Runnable t2 = new Task2();
        Runnable t4 = new Task4();

        Thread t2Thread = new Thread(t2);
        Thread t4Thread = new Thread(t4);

        t2Thread.start();
        t4Thread.start();
        
        //Task3
        System.out.println("** Ending Main **");   
    }

        
}
