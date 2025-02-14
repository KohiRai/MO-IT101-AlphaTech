package com.mycompany.alphatech;

import java.util.Scanner;//imports scanner for user input
import java.text.DecimalFormat;//imports Decimal Format
public class AlphaTech {

    private static final DecimalFormat decfor = new DecimalFormat("0.00");//Formats Decimal places to be only 2 places
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);//creates a new scanner for user input. sc will be used when need for user input
              
        System.out.print("Enter Employee ID: ");//Prints "Enter Employee ID" and doesn't go to next line
       String EmID = sc.nextLine();//User Input for Employee ID
        
        if("001".equals(EmID)){//If statement if user inputs 001 as Employee ID
            System.out.println("Employee Name: Juztin Kristoffer P. Estacio");//Employee Details of 001
            System.out.println("Employee ID: 001");
            System.out.println("Gender: Male");
            System.out.println("Birthday: December 7, 2005");
            
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//To add space for the Salary Calculator
           
        
        
        System.out.println("Payment Calculator");//Salary Calculator Title
        System.out.println();//Provides a line of space
        
        
        double MR = 53500.00;// MR = Montly Rate.    
        double DR = MR / 20;//DR = Daily Rate. Daily rate divided by 20(days) 
        
       
        System.out.println("Monthly Rate: P" + decfor.format(MR));//Prints/Shows Monthly rate. NOTE: decfor.format() is declared to make the decimal places be two places
        
        System.out.println("Daily Rate: P" + decfor.format(DR));//Prints/Shows Daily rate
        
        System.out.print("Enter Days Worked: ");//NOTE: Println - Prints a whole line then automatically moves to next line. Print - Only prints the text but doesn't move to the next line
        double DW = sc.nextInt();//User input days worked. NOTE: User input 
        
        System.out.print("Enter Overtime Hours: ");
        double OH = sc.nextInt();//User input Overtime Hours
        
        //NOTE: In calculating MDAS rule is used
        double OTP = DR * .10 //OTP = Overtime Time Pay. OTP = Daily rate times 0.1 or 10%
                ,OT = OH * OTP//OT = Overtime. OT = Overtime Hours times OTP
                ,GI = DR * DW + OT ; // Compute for Gross Income. Gross income = Daily Rate times Days Worked Plus Overtime Time
        double B = 4500.00d; //B = Benefits
       
        
        System.out.println("Gross Income: P" + decfor.format(GI));//Prints/shows Gross Income
        System.out.println();//Prints a line for space
        
        System.out.println("Benefits" );//Title of the next section
        System.out.println();
        System.out.println("Rice Subsidy: P1500.00");//Prints/shows Rice Subsidy Benefits
        System.out.println("Phone Allowance: P2000.00");//Prints/shows Phone Allowance Benefits
        System.out.println("Clothing Allowance: P1000.00");//Prints/shows Rice Clothing Allowance Benefits
        System.out.println("Benefits: P" + decfor.format(B));//Prints/Shows Total Benefits
        
        System.out.println();//Prints a line for space
        System.out.println("Deductions");//Title of next section
        System.out.print("Enter Social Security Systems Deduction: P");
        double SSS = sc.nextInt();//User input SSS Deduction
        
        System.out.print("Enter Philhealth Deduction: P");
        double PH = sc.nextInt();//User input Philhealth Deduction
        
        System.out.print("Enter Pag-Ibig Deduction: P");
        double PI = sc.nextInt();//User input Pag-Ibig Deduction
        
        System.out.print("Enter Withholding tax Deduction: P");
        double WT = sc.nextInt();//User input Withholding tax Deduction
        
        double TD = SSS + PH + PI + WT; //TD = Total Deductions. Total Deductions = SSS plus Philhealth plus Pag-Ibig plus Withgolding Tax
        
        System.out.println("Total Deductions: P" + decfor.format(TD));//Prints/shows total deduction
        System.out.println();
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//Space for final section
        System.out.println();//Prints a new line for space

        
        System.out.println("Summary");//Title of next final section
        System.out.println();
        System.out.println("Gross Income: P" + decfor.format(GI));//Prints/shows Gross Income
        System.out.println("Benefits: P" + decfor.format(B));//Prints/shows Benefits
        System.out.println("Deductions: P" + decfor.format(TD));//Prints/shows Deductions
        System.out.println();//Prints a new line for space
        
        double NI = GI + B - TD; // NI = Net Income. NI = Gross income plus Benefits minus Deductions
        System.out.println("Net Income: P" + decfor.format(NI));// prints/shows Net Income
        }
        
        else if("002".equals(EmID)){//If else statement. This code will run if employee ID asked that the user inputs is "002"
            System.out.println("Employee Name: Manny Pacquiao");
            System.out.println("Employee ID: 001");
            System.out.println("Gender: Male");
            System.out.println("Birthday: December 17, 1978");
            
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//To add space for the salary Calculator
           
        
        
       System.out.println("Payment Calculator");//Salary Calculator Title
        System.out.println();//Provides a line of space
        
        
        double MR = 53500.00;// MR = Montly Rate.    
        double DR = MR / 20;//DR = Daily Rate. Daily rate divided by 20(days) 
        
       
        System.out.println("Monthly Rate: P" + decfor.format(MR));//Prints/Shows Monthly rate. NOTE: decfor.format() is declared to make the decimal places be two places
        
        System.out.println("Daily Rate: P" + decfor.format(DR));//Prints/Shows Daily rate
        
        System.out.print("Enter Days Worked: ");//NOTE: Println - Prints a whole line then automatically moves to next line. Print - Only prints the text but doesn't move to the next line
        double DW = sc.nextInt();//User input days worked. NOTE: User input 
        
        System.out.print("Enter Overtime Hours: ");
        double OH = sc.nextInt();//User input Overtime Hours
        
        //NOTE: In calculating MDAS rule is used
        double OTP = DR * .10 //OTP = Overtime Time Pay. OTP = Daily rate times 0.1 or 10%
                ,OT = OH * OTP//OT = Overtime. OT = Overtime Hours times OTP
                ,GI = DR * DW + OT ; // Compute for Gross Income. Gross income = Daily Rate times Days Worked Plus Overtime Time
        double B = 4500.00d; //B = Benefits
       
        
        System.out.println("Gross Income: P" + decfor.format(GI));//Prints/shows Gross Income
        System.out.println();//Prints a line for space
        
        System.out.println("Benefits" );//Title of the next section
        System.out.println();
        System.out.println("Rice Subsidy: P1500.00");//Prints/shows Rice Subsidy Benefits
        System.out.println("Phone Allowance: P2000.00");//Prints/shows Phone Allowance Benefits
        System.out.println("Clothing Allowance: P1000.00");//Prints/shows Rice Clothing Allowance Benefits
        System.out.println("Benefits: P" + decfor.format(B));//Prints/Shows Total Benefits
        
        System.out.println();//Prints a line for space
        System.out.println("Deductions");//Title of next section
        System.out.print("Enter Social Security Systems Deduction: P");
        double SSS = sc.nextInt();//User input SSS Deduction
        
        System.out.print("Enter Philhealth Deduction: P");
        double PH = sc.nextInt();//User input Philhealth Deduction
        
        System.out.print("Enter Pag-Ibig Deduction: P");
        double PI = sc.nextInt();//User input Pag-Ibig Deduction
        
        System.out.print("Enter Withholding tax Deduction: P");
        double WT = sc.nextInt();//User input Withholding tax Deduction
        
        double TD = SSS + PH + PI + WT; //TD = Total Deductions. Total Deductions = SSS plus Philhealth plus Pag-Ibig plus Withgolding Tax
        
        System.out.println("Total Deductions: P" + decfor.format(TD));//Prints/shows total deduction
        System.out.println();
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//Space for final section
        System.out.println();//Prints a new line for space

        
        System.out.println("Summary");//Title of next final section
        System.out.println();
        System.out.println("Gross Income: P" + decfor.format(GI));//Prints/shows Gross Income
        System.out.println("Benefits: P" + decfor.format(B));//Prints/shows Benefits
        System.out.println("Deductions: P" + decfor.format(TD));//Prints/shows Deductions
        System.out.println();//Prints a new line for space
        
        double NI = GI + B - TD; // NI = Net Income. NI = Gross income plus Benefits minus Deductions
        System.out.println("Net Income: P" + decfor.format(NI));// prints/shows Net Income
        }
        else //This code will run if the user inputs an Employee ID that isn't registered.
        {
            System.out.println("No Employee Registered with Inserted Employee ID");
        }
        
         
        
        
        
    }
}

