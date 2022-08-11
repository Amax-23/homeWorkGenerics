
public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(3);
        MagicBox<Integer> magicBox1 = new MagicBox<>(2);
        magicBox1.add(100);
        magicBox.add(new String("Шарики"));
        magicBox.add(new String("Мишура"));
        magicBox.add(new String("Игры"));
        magicBox.add(new String("Хлопушка"));
        System.out.println("Случайная коробка - " + magicBox.pick());
        magicBox1.pick();
    }
}