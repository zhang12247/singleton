package Singleton.Lazy;

public class LazyDoubleCheckSingleton {
//    private volatile static LazyDoubleCheckSingleton lazy = null;
    private static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
