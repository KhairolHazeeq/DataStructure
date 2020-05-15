/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q4;

/**
 *
 * @author User
 */

import java.util.Calendar;
import java.util.TimeZone;

public class LAB3Q4 {

    public static void main(String[] args) {
        int dayslapse = 0;
        Calendar today = Calendar.getInstance(TimeZone.getDefault());
        String date = today.getTime().toString();// tunjuk the full date and time
        String dateFormat = today.get(Calendar.DAY_OF_MONTH) + "/" + today.get(Calendar.MONTH) + "/" + today.get(Calendar.YEAR);// utk print dalam format soalan
        System.out.println("Today Date (dd/mm/yyyy): " + dateFormat);

        String day = getDay(dateFormat);//method utk dpt hari
        System.out.println("Today is on " + day);

        String sDate = "18/8/2015";
        System.out.println("Searched Date (dd/mm/yyyy): " + sDate);
        System.out.println("Searched Date is on ");
        
        findDay(dateFormat, sDate, dayslapse,day);// terpaksa pakai ni and bukan method *getDay()* sebab soalan nak pakai rec
    }

    static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static String getDay(String dateFormat) {
        if(dateFormat.contains("Sun")) {
            return days[0];
        } else if (dateFormat.contains("Mon")) {
            return days[1];
        } else if (dateFormat.contains("Tue")) {
            return days[2];
        } else if (dateFormat.contains("Wed")) {
            return days[3];
        } else if (dateFormat.contains("Thu")) {
            return days[4];
        } else if (dateFormat.contains("Fri")) {
            return days[5];
        } else {
            return days[6];
        }
    }

    public static void findDay(String dateFormat, String sDate, int dayslapse, String day1) {
        String[] eachPart = dateFormat.split("/");
        int day = Integer.parseInt(eachPart[0]);
        int month = Integer.parseInt(eachPart[1]);
        int year = Integer.parseInt(eachPart[2]);
        System.out.println("1: "+day+"/"+month+"/"+year);
        dayslapse++;
        day--;

        if (day == 0){
            day = 31;
            month--;
                if (month == 2){
                    if (year % 400 == 0) 
                    day = 29;
                    else if (year % 100 != 0 && year % 4 == 0)
                    day = 29;
                    else
                    day = 28;           
                }
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    day = 30;
                }
        }
        
        if (month == 0) {
            year--;
            month = 12;
        }

        String newDateFormat = day + "/" + month + "/" + year;
        System.out.println("2: "+newDateFormat);
        System.out.println(dayslapse);
        if (newDateFormat.equals(sDate)){
           int dayInTheWeek = dayslapse%7;//sbb nak buang all the minggus and just get the remainding days
           int dayIndexNum = getDayIndex(day1);// kita tau remaining days but kita tak tau remaining days dari which initial day
           int hasilTolak = dayIndexNum - dayInTheWeek;
            System.out.println(days[hasilTolak]);
        } else {
            findDay(newDateFormat, sDate, dayslapse,day1);
        }

    }
    
    private static int getDayIndex(String day) {
        for (int i = 0; i < days.length; i++) {
            if(days[i].contains(day)) 
                return i;
        }
        return -1;
    }

}

