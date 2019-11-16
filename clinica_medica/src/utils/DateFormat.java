package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.text.SimpleDateFormat;
import java.text.ParseException;

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
}
