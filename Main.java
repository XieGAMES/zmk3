
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ===================== ЗАДАНИЕ 1 =====================
        System.out.println("=== Задание 1 ===");
        ArrayList<Integer> speeds = new ArrayList<>();
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (int speed : speeds) {
            sum += speed;
        }
        int averageSpeed = sum / speeds.size();
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");
        System.out.println();

        // ===================== ЗАДАНИЕ 2 =====================
        System.out.println("=== Задание 2 ===");
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("Расписание кормлений:");
        // Индексы: Крокодил(1), Слон(4), Шиншилла(0), Лев(2), Медведь(3)
        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));
        System.out.println();

        // ===================== ЗАДАНИЕ 3 =====================
        System.out.println("=== Задание 3 ===");
        // Используем тот же список animals, что и в задании 2 (он уже содержит 5 животных)
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nМеню:");
            System.out.println("1 - Показать всех животных");
            System.out.println("2 - Добавить животное");
            System.out.println("3 - Удалить животное");
            System.out.println("4 - Очистить список");
            System.out.println("5 - Проверить наличие животного");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    if (animals.isEmpty()) {
                        System.out.println("Список животных пуст.");
                    } else {
                        System.out.println("Список животных:");
                        for (String animal : animals) {
                            System.out.println(animal);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Введите название животного для добавления: ");
                    String newAnimal = scanner.nextLine();
                    animals.add(newAnimal);
                    System.out.println("Животное добавлено.");
                    break;

                case 3:
                    if (animals.isEmpty()) {
                        System.out.println("Список пуст, удалять нечего.");
                    } else {
                        System.out.print("Введите название животного для удаления: ");
                        String toRemove = scanner.nextLine();
                        if (animals.remove(toRemove)) {
                            System.out.println("Животное удалено.");
                        } else {
                            System.out.println("Животное не найдено в списке.");
                        }
                    }
                    break;

                case 4:
                    if (animals.isEmpty()) {
                        System.out.println("Список уже пуст.");
                    } else {
                        animals.clear();
                        System.out.println("Список очищен.");
                    }
                    break;

                case 5:
                    System.out.print("Введите название животного для поиска: ");
                    String toFind = scanner.nextLine();
                    if (animals.contains(toFind)) {
                        System.out.println("Такое животное есть в зоопарке.");
                    } else {
                        System.out.println("Такое животное не найдено.");
                    }
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        } while (choice != 0);

        scanner.close();
    }
}