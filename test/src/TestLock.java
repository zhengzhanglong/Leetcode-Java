import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 105; i++) ticket.sell();
        }, "A").start();
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 105; i++) ticket.sell();
        }, "B").start();
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 105; i++) ticket.sell();
        }, "C").start();
    }
}

class Ticket{
    private int num = 100;
    ReentrantLock lock = new ReentrantLock(true);
    public void sell(){
        lock.lock();
        try {
            if(num > 0){
                System.out.println(Thread.currentThread().getName()+"卖出第：\t"+(num--)+"\t 还剩下："+num);
            }
        }finally {
            lock.unlock();
        }
    }
}
