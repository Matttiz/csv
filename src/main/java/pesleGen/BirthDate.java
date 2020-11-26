package pesleGen;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;



public class BirthDate {
    public final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    private Date date;

    public  BirthDate (){
        this.date = new Date();
    }

    public  BirthDate (Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public static void main(String[] args) throws IOException {



        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        BirthDate birthDate = new BirthDate();
        birthDate.getRandomDate(20,30);
        System.out.println(formatter.format(birthDate.getDate()));



    }




    public void getRandomDate (int startYear){
        Date dateEnd = new Date();
        startYear = getYear(dateEnd, startYear);
        Date startDate = new GregorianCalendar(startYear, Calendar.JANUARY, 1).getTime();
        generateDate(startDate, dateEnd);
    }


    public void getRandomDate (int endYear, int startYear){
        Date now = new Date();
        startYear = getYear(now, startYear);
        Date endDate = new Date();
        endYear = getYear(endDate, endYear);
        endDate = new GregorianCalendar(endYear, Calendar.JANUARY, 1).getTime();

        Date startDate = new GregorianCalendar(startYear, Calendar.JANUARY, 1).getTime();
        generateDate(startDate, endDate);
    }





    public void generateDate(Date dateStart, Date dateEnd) {
        Date randomDate = new Date(ThreadLocalRandom.current()
                .nextLong(dateStart.getTime(), dateEnd.getTime()));
         this.date = randomDate;
    }

    static int getYear(Date dateEnd, int startYear){
        if (startYear < 100){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateEnd);
            startYear = calendar.get(Calendar.YEAR) - startYear;
        }
        return startYear;
    }

}
