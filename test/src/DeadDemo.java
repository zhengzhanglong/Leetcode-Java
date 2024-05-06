public class DeadDemo {
    static Object a = new Object();
    static Object b = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (a) {
                System.out.println("线程x获得锁a，继续申请锁b");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (b) {
                    System.out.println("线程x获得锁b");
                }
            }
        }, "x").start();
        new Thread(() -> {
            synchronized (b) {
                System.out.println("线程y获得锁b，继续申请锁a");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (a) {
                    System.out.println("线程y获得锁a");
                }
            }
        }, "y").start();

    }
}
