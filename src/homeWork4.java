public class homeWork4 {
    public static void main(String[] args) {

        String[] strings = new String[] {
                "Первое",
                "Второе",
                "Третье",
                "Четвертое",
                "Пятое",
                "Шестое",
                "Седьмое",
                "Восьмое",
                "Девятое",
                "Десятое",
                "Второе",
                "Четвертое",
                "Пятое",
                "Второе",
                "Десятое"
        };

        countString.printString(strings);

        System.out.println("--------------");

        phoneBook.add("Васильев", "+79822256162");
        phoneBook.add("Иванов", "+79836516121");
        phoneBook.add("Иванов", "+79836516122");
        phoneBook.add("Петров", "+79836516144");
        phoneBook.add("Иванов", "+79836516123");
        phoneBook.add("Васильев", "+79822256162");
        phoneBook.get("Васильев");
        phoneBook.get("Иванов");
        phoneBook.get("Петров");

    }
}
