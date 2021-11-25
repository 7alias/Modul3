public class NameCheck {


    static String formatName(String[] words) {
//соединяет отсортированные слова в единую строку
        String fio = "";
        for (int i = 0; i < words.length; i++) {
            words[i] = NameCheck.firstUpperCase(words[i]);
            fio = fio.concat(words[i] + " ");
        }
        return fio;
    }

    static String[] sortByLength(String[] words) {
        int size = words.length;
//сортировка пузырьком
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
//сравнивает каждый элемент массива со следующим
                if (words[i].length() > words[j].length()) {
//переставляет элементы массива
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }

    static boolean checkName(String name) {
        name = name.trim(); //обрезает пробелы до и после
        boolean state = false;
        if (name.length() > 0) {
            //проверяет что длина имени больше 1 символа
            state = true;
        }
        return state;
    }

    static String firstUpperCase(String word) {
        if (word == null || word.isEmpty()) return ""; //или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        //делает первую букву слова большой а остальные маленькими
    }

}

