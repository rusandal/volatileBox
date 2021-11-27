public class Box {
    volatile static boolean myValue;
    private static final int sleepTimeUser = 2000;
    private static int counter = 5;

    public void on (){
        while (counter>0){
            myValue=false;
            System.out.println("Включил");
            try {
                System.out.println(Thread.currentThread().getName()+ " спит 2 сек");
                Thread.sleep(sleepTimeUser);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter--;
        }
        System.out.println("Пользователь ушел");
    }
    public void off (){
        while (counter>0){
            while(!myValue){
                myValue=true;
                System.out.println("Выключил");
            }
        }
    }
}
