package AdditionalTasks;

public class Task10 {

        public static String string = "helloworld";

        public static void main(String[] args) {
            System.out.println(string);

            while (string.length() > 2) {
                string = string.substring(1, string.length() - 1);
                System.out.println(string);
            }
        }
    }

