package execute;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LearnDateAndTime {
    public void formatDate() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);    // Format showing (2021-07-20T23:04:53.885593300) which is not a suitable

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(dtf.format(currentTime));   // Format showing (07/20/2021)

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("DD-mm-yyyy HH:mm:ss");
        System.out.println(dtf2.format(currentTime));   // Format showing (201-14-2021 23:14:27)

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        System.out.println(dtf3.format(currentTime));   // Format showing (20-24-2021 23:24:44)


        Date date = Calendar.getInstance().getTime();
        System.out.println(date);               // Format showing (Tue Jul 20 23:29:13 EDT 2021)
    }

}
