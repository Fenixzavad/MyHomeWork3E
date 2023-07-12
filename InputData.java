import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, номер телефона - цифры): ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 8) {
                return arrayData;
            } else if (arrayData.length < 8){
                System.out.println("Вы ввели не все данные, попробуйте еще раз!");
            } else System.out.println("Вы ввели больше данных, попробуйте еще раз!");
        }

    }
}