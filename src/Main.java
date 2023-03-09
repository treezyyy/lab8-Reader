import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        reader[] array = new reader[5];
        for(int i = 0; i < 5; i++){
           System.out.println("Введите ФИО");
           String initials = in.next();
           System.out.println("Введите факулььтет");
           String facult = in.next();
           System.out.println("Введите дату рождения");
           String bithdate = in.next();
           System.out.println("Введите номер телефона");
           String phone = in.next();
           array[i] = new reader(initials, bithdate, phone, facult);
        }
        String[] collections = new String[] {"Пушкин", "Высоцкий", "Есенин", "Малышев"};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0].TakeBook(4));
        System.out.println(array[0].TakeBook(collections));
        System.out.println(array[0].ReturnBook(4));
        System.out.println(array[0].ReturnBook(collections));
        System.out.println("номер билета "+ array[3].initials + " - " + array[3].TicketNumber);
    }
}