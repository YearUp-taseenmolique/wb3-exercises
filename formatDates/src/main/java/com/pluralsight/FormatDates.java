package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main (String[] args){

     ZonedDateTime now = ZonedDateTime.now();

     DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
     DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
     DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
     DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
     DateTimeFormatter format5 = DateTimeFormatter.ofPattern("h:mm a 'on' dd-MMM-yyyy");

     System.out.println(now.format(format1));
     System.out.println(now.format(format2));
     System.out.println(now.format(format3));
     System.out.println(now.withZoneSameInstant(ZoneOffset.UTC).format(format4));


     ZonedDateTime localNow = ZonedDateTime.now();
     System.out.println(localNow.format(format5));



    }
}