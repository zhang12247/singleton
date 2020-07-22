package Singleton.Lazy;

import Singleton.Lazy.LazyInnerClassSingleton;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
//        LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton simpleSingleton = LazyDoubleCheckSingleton.getInstance();
//        LazyInnerClassSingleton simpleSingleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);
    }
}
