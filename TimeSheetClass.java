package com.company;

import java.util.Scanner;

/**
 * Created by madhurichakinala on 22/8/18.
 */
public class TimeSheetClass {
    Scanner scanner = new Scanner(System.in);

    public String enterStaffMemberName()
    {
        System.out.print("Enter staff name");
        String name = scanner.next();
        return name;
    }

    public double enterHourlyRate()
    {
        double hourlyrate =0;
        String s1;
        while(true)
        {
            try
            {
                System.out.print("Enter hourly rate between 0 and 50 range");
                s1 = scanner.next();
                hourlyrate=Integer.parseInt(s1);
                if(hourlyrate<50 && hourlyrate>0)
                {
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not a valid input, please try again.");
            }
        }
        return hourlyrate;
    }

    public double totalNumberHoursWorkedPerWeekAndCost(double hourlyrate)
    {
        String[] Day = {"Sunday", "Monday", "Tuesday","Wednesday", "Thursday", "Friday","Saturday"};
        double[] hours=new double[7];
        double sumofhours=0;
        double cost;
        for(int i=0;i<7;i++)
        {
            System.out.print("Enter Number of hours worked on "+Day[i]);
            hours[i] = enterNoOfHours();
            sumofhours=sumofhours+hours[i];
        }
        System.out.println("Total number of hours worked during this week" + sumofhours);
        cost=((sumofhours*hourlyrate)+(hours[0]*0.015*hourlyrate)+(hours[6]*0.02*hourlyrate));
        return cost;
    }

    public float enterNoOfHours()
    {
        float hours =0;
        String s1;
        while(true)
        {
            try
            {
                s1 = scanner.next();
                hours=Integer.parseInt(s1);
                if(hours<24 && hours>0)
                {
                    break;
                }
                else
                {
                    System.out.println("Enter hours between 0 to 24");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not a valid input, please try again.");
            }
        }
        return hours;
    }


}
