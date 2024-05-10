class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a thread using the Thread class
        MyThread myThread = new MyThread();
        
        // Starting the thread
        myThread.start();
        
        // Getting the name of the thread
        System.out.println("Thread name: " + myThread.getName());
        
        // Checking if the thread is alive
        System.out.println("Is thread alive? " + myThread.isAlive());
        
        // Putting the current thread to sleep
        try {
            System.out.println("Putting main thread to sleep...");
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        // Setting the name of the thread
        myThread.setName("MyThread");
        System.out.println("Updated thread name: " + myThread.getName());
        
        // Checking thread priority
        System.out.println("Thread priority: " + myThread.getPriority());
        
        // Setting thread priority
        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Updated thread priority: " + myThread.getPriority());
        
        // Checking if the thread is alive after sleeping
        System.out.println("Is thread alive? " + myThread.isAlive());
        
        // Waiting for the thread to finish
        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for MyThread to finish");
        }
        
        System.out.println("Main thread exiting...");
    }
}
