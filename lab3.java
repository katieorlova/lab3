import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    public static void main(String[] args){
        System.out.print("Введите дату в формате dd/mm/yyyy:");
        Pattern p = Pattern.compile("^((0[1-9]|1\\d|2[0-9])\\/(0[1-9]|1[0-2])\\/(19\\d\\d|[2-9]\\d\\d\\d))$|^((30)\\/(0[469]|11)\\/(19\\d\\d|[2-9]\\d\\d\\d))$|^((31)\\/(0[13578]|1[02])\\/(19\\d\\d|[2-9]\\d\\d\\d))$");
        Matcher m = p.matcher(new Scanner(System.in).nextLine());
        if (m.find()) {
            System.out.println("Верный формат");
        }
        else {
            System.out.println("Неверный формат или дата");
        }
    }
}
