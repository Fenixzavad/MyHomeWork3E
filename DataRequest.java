import java.io.FileWriter;
import java.util.Scanner;

public class DataRequest {

    private String firstName;
    private String lastName;
    private String middleName;
    private long numberPhone;
    private final Scanner scan = new Scanner(System.in);

    // Методы для присваивания значений полям
    private void EnterFirstName() {
        System.out.println("Введите Имя:");
        firstName = scan.nextLine();
        if (firstName.equals("")) {
            throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова!");
        }
    }

    private void EnterLastName() {
        System.out.println("Введите Фамилию:");
        lastName = scan.nextLine();
        if (lastName.equals("")) {
            throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова!");
        }
    }

    private void EnterMiddleName() {
        System.out.println("Введите Отчество");
        middleName = scan.nextLine();
        if (middleName.equals("")) {
            throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова!");
        }
    }

    private void EnterNumberPhone() {
        try {
            System.out.println("Введите номер моб.телефона:");
            String number = scan.nextLine();
            if (number.equals("")) {
                throw new RuntimeException("Вводимое значение не может быть пустым,\nпопробуйте снова!");
            }
            numberPhone = Long.parseLong(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Не верный формат, попробуйте снова!");
        }
    }


    // Метод для вывода в консоль получившихля значений
    private void OutPutData() {
        System.out.println("\nFirst name \t- \t" + firstName + "\n" + "Last name \t- \t" + lastName + "\n" + "Middle name \t- \t" + middleName + "\n"  + "Number phone \t- \t" + numberPhone );
    }

    // Метод соединения всех методов в один
    private void DataEnter() {
        EnterFirstName();
        EnterLastName();
        EnterMiddleName();
        EnterNumberPhone();
        OutPutData();
    }

    // Метод  сохранения данных в файл
    public void SaveDataEnter() {

        DataEnter();
        String file = "data/" + lastName + ".txt";
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("<" + firstName + "> " + "<" + lastName + "> " + "<" + middleName + "> " + "<" + numberPhone + "> \n");
        } catch (Exception e) {
            System.out.println("Неверный ввод данных!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public long getNumberPhone() {
        return numberPhone;
    }}

    
