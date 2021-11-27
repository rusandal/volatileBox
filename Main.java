import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        new Thread(null, box::on, "Пользователь").start();
        new Thread(null, box::off, "Коробка").start();
    }
}
