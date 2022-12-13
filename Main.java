import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Notebook[] notebook = new Notebook[5];

        notebook[0] = new Notebook("Пентиум2", 2,100);
        notebook[1] = new Notebook("Пентиум3", 4, 250);
        notebook[2] = new Notebook("Селерон5", 6, 500);
        notebook[3] = new Notebook("Игровой", 16, 1000);
        notebook[4] = new Notebook("Классик", 8, 500);

        System.out.print("Введите количество оперативки: ");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            show(notebook, scanner.nextInt());
        } else {
            System.out.print("Введены некорректные данные!");
        }
    }

    public static void show(Notebook[] notebooks, int ram) {

        for (int i=0; i<notebooks.length; i++) {
            if (notebooks[i].getRam() == ram) {
                notebooks[i].print();
            }
        }
    }
}
