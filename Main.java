package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
          TimeSheetClass timeSheet=new TimeSheetClass();
          String staffname=timeSheet.enterStaffMemberName();
          double hourlyrate=timeSheet.enterHourlyRate();
          double cost=timeSheet.totalNumberHoursWorkedPerWeekAndCost(hourlyrate);
          System.out.println("Total cost for staff member " +staffname +" is "+cost);
    }

}


