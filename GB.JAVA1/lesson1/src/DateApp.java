import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateApp {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        System.out.println("=============");

        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
        LocalDate dateTo = LocalDate.of(2018, Month.JULY, 29);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
        // END

        System.out.println("=============");

        // Вызов метода
        // Обязательно указывать имя класса
        DateApp.showCurrentDate(); // => "Today is: 2022-08-25"

        System.out.println("=============");

    }

    public static void showCurrentDate() {
        // Встроенный метод в Java для получения текущего времени и даты
        var currentDate = LocalDate.now();
        var text = "Today is: " + currentDate;
        System.out.println(text);
    }

}

