package com.kingshuk.multithreading.threadprogramming.threadingin2017.practicingyield;

public class YieldTest implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("The thread "+Thread.currentThread().getName()+" is printing "+i);
            Thread.yield();
        }
    }
}
