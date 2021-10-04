import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public  class phoneBook {
    private static HashMap<String, ArrayList<String>> book = new HashMap<>();

    public static void add(String secName, String number){
        if (book.containsKey(secName)){
            if (!book.get(secName).contains(number)) {
                book.get(secName).add(number);
            }else {
                System.out.println("Номер "+ number + " у абонента "+ secName + " уже есть в базе");
            }
        }else{
            book.put(secName,new ArrayList<>(Arrays.asList(number)));
        }
    }

    public static void get(String secName){
        System.out.println("--------------");
        System.out.println("Фамилия:");
        System.out.println(secName);
        System.out.println("номера телефонов:");
        ArrayList<String> arr= book.get(secName);
        for (String n : arr){
            System.out.println(n);
        }
        System.out.println("--------------");
    }

}
