import java.time.LocalDate;
import java.time.format.*;
public class JavaDataTime {
    public static void main(String[] args) {
        String date = args[0];
        String month = args[1];
        String year = args[2];
        String Date = year + "-" + month + "-" + date;
        LocalDate localDate = LocalDate.parse(Date);
        System.out.println("The Current date is:"+localDate.format(DateTimeFormatter.ISO_DATE));
   }
}
