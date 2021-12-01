package Thread;

public class TwoThread {
    public static void main(String[] args) {

        Object lock = new Object();
        new StepThread(lock).start();
        new StepThread(lock).start();

    }
    static class StepThread extends Thread{
        private Object lock;
        public StepThread(Object object){
            this.lock = object;
        }
        /*Выводим имя потока, далее поток засыпает перед этим уведомив другой поток, о том, что его очередь
        * После вызова первым потоком lock.notify() второй поток не просыпается сразу, а ждет, пока lock не будет
        * освобожден.  */

        @Override
        public void run() {
            while (true){
                synchronized (lock){
                    try{
                        System.out.println("Левой");
                        lock.notify();
                        Thread.sleep(1000);
                        System.out.println("Правой");
                        lock.notify();
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
