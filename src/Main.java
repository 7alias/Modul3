import java.util.Scanner;
public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean isCorrectName = false;
            while (!isCorrectName) {
                System.out.println("Введите ФИО тремя словами:");
                String name = scanner.nextLine(); //Считывает строку из System.in
                //проверяем что длина имени более 1 символа
                isCorrectName = NameCheck.checkName(name);
                System.out.println(name);
                //разделяем слова на массив слов
                String words[] = name.split(" ");
                //проверяем что слов в имени ровно 3:
                if (words.length == 3) {
                    System.out.println("Верно, ФИО:");
                    //сортируем по длине слова: от меньшего к большему
                    NameCheck.sortByLength(words);
                    //форматируем ФИО
                    name = NameCheck.formatName(words);
                    //обрезаем пробелы до и после
                    name = name.trim();
                    //печатаем результат
                    System.out.println(name);
                    break;
                } else {
                    if (!isCorrectName) System.out.println("Введите корректное ФИО!");
                    isCorrectName = false;
                }
            }
        }

    }
