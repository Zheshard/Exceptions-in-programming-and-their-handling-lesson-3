import java.util.Scanner;

public class InputData {

    public static String enterData() {
        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Введите данные (Фамилия Имя Отчество датарождения номертелефона пол), разделенные пробелом:");
        return scanner.nextLine();
    }

}
