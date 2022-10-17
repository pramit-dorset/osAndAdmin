// class NewTask{
//     void newPrintingTask()
//     {
//         for (int counter = 0 ; counter <=10; counter++)
//             System.out.println(">> From NewTask:" + "Count=" + counter );
//     }
// }

class NewTask extends Thread 
{
    @Override
    public void run()
    {
        for (int counter = 0 ; counter <=10; counter++)
            System.out.println(">> From NewTask:" + "Count=" + counter );
    }
}

// class NewTask implements Runnable 
// {
//     @Override
//     public void run()
//     {
//         for (int counter = 0 ; counter <=10; counter++)
//             System.out.println(">> From NewTask:" + "Count=" + counter );
//     }
// }

public class ThreadDemo {

    public static void main(String[] args) {
        
        // Series of Printing Operations

        //Task 1:

        System.out.println("---- Starting Main Program ----");


        //Task 2:


        NewTask newTask1 = new NewTask();
        newTask1.start();
        
        // Runnable newTaskR = new NewTask();
        // Thread task = new Thread(newTaskR);
        // task.start();



        //Task 3
        for (int counter = 0 ; counter <=10; counter++)
            System.out.println("-- From Main:" + "Count=" + counter );

        
        //Task 3;
        System.out.println("---- Ending Main Program ----");

    }

}