package mx.iteso.singleton;

/**
 * Created by mavg_ on 10/28/2015.
 */


/*The easier way to create a thread-safe singleton
 class is to make the global access method synchronized,
 so that only one thread can execute this method
 at a time.

 Above implementation works fine and provides thread-safety
 but it reduces the performance because of cost associated
 with the synchronized method, although we need it only for
 the first few threads who might create the separate instances

 the second one is the reduce performance*/

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
/*
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

*/