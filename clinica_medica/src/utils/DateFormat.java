package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;

public class DateFormat {
    public static boolean isDateValid(String strDate) {
        String dateFormat = "dd/MM/uuuu";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
        .ofPattern(dateFormat)
        .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
           return false;
        } 
    }
    
    public static boolean isHourValid(String hora){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        sdf.setLenient(false);
        try{
            sdf.parse(hora);
        }catch(ParseException e){
            return false;
        }
        return true;
    }
    
    public static boolean oneDayLeft(String startDate, String endDate){
        if(!DateFormat.isDateValid(startDate) || !DateFormat.isDateValid(endDate)) return false;
        String[] startDatetime = startDate.split("/");
        String[] endDatetime = endDate.split("/");
        if(startDatetime[2].equals(endDatetime[2])){
            if(startDatetime[1].equals(endDatetime[1])){
                int end = Integer.parseInt(endDatetime[0]);
                int start = Integer.parseInt(startDatetime[0]);
                if(end - start == 1){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String getCurrentDate(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(date);
    }
    
    public static boolean isBeforeAndSameMonthYear(String currentDate, String date){
        if(!DateFormat.isDateValid(currentDate) || !DateFormat.isDateValid(date)) return false;
        String[] d = date.split("/");
        String[] cd = currentDate.split("/");
        if(d[2].equals(cd[2]) && d[1].equals(cd[1])){
            int currentDay = Integer.parseInt(cd[0]);
            int day = Integer.parseInt(d[0]);
            if(day <= currentDay){
                return true;
            };
        }
        return false;
    }
   
}
