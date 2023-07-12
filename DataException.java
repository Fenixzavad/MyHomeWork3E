public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println( "Исключение: DataNotCorrectFormat");
        System.out.printf("Некоректный формат: %s", i);
        System.out.println();
    }
}