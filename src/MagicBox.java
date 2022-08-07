import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private int cell;

    public MagicBox(int cell) {
        this.cell = cell;
        T[] items = (T[]) new Object[cell];
        this.items = items;
        System.out.println("Cоздана коробка с содержимым - " + Arrays.toString(items));
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В коробку добавлено -" + item + "-");
                return true;
            }
        }
        System.out.println("Места для добавления -" + item + "- нет!");
        return false;
    }

    public void pick() throws RuntimeException {
        int cellFree = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                cellFree += 1;
            }
        }
        if (cellFree != 0) {
            RuntimeException e = new RuntimeException("Свободных ячеек в коробке осталось - " + cellFree + " шт.");
            System.out.println(e);

        } else {
            Random random = new Random();
            int randomInt = random.nextInt(cell);
            System.out.println("Вам случайно выпадает  - " + items[randomInt]);
        }
    }
}















