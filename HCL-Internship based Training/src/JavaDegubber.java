import java.time.LocalDate;
public class JavaDegubber {

    public static void main(String[] args) {

        String[] dateComponents = {"2001","02","15"};

        if(dateComponents.length >= 3 ) {

            String date = dateComponents[2];
            String month = dateComponents[1];
            String year = dateComponents[0];
            String Date = year +"-"+month+"-"+date;

            LocalDate curDate = LocalDate.parse(Date);

            if(curDate == null) {
                System.out.println("The Date entered is invalid");
            }
            else {
                System.out.println("The current date is: "+curDate);
            }
        }
        else {
            System.out.println("The date components are invalid");
        }
    }
}
