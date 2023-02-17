import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeclarationOfLove {
    public static void main(String[] args) {
        double length;
        int letter = 62; //Length for 3 letter
        int space = 12; //Length for 1 space
        double lengthDeclaration;
        lengthDeclaration = 15 * letter + 3 * space;
        boolean condition;
        condition = true;
        while (condition) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Введите длинну забора в сантиметрах");
                length = sc.nextDouble();
                if (lengthDeclaration > length) {
                    System.out.println("Признание не поместится на заборе длиной " + length + " см");
                } else System.out.println("Признание поместится на заборе длиной " + length + " см");
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Введено некооректное значение!!! Длина забора это число");
            }
        }
    }
}
