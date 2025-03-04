
package com.mycompany.alphatechfinal;

import java.util.Scanner;//imports scanner for user input
import java.text.DecimalFormat;//imports Decimal Format
public class AlphaTechFinal {

    private static final DecimalFormat decfor = new DecimalFormat("0.00");//Formats Decimal places to be only 2 places
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);//creates a new scanner for user input. sc will be used when need for user input
         
         System.out.println("Employee ID Registered: 001 and 002");
        System.out.print("Enter Employee ID: ");//Prints "Enter Employee ID" and doesn't go to next line
       String EmID = sc.nextLine();//User Input for Employee ID
         
         switch (EmID) {
            case "001":
                {
                    //This case will be used if user inputs 002 as Employee ID
                    System.out.println("Employee Name: Juztin Kristoffer P. Estacio");//Employee Details of 001
                    System.out.println("Employee ID: 001");
                    System.out.println("Gender: Male");
                    System.out.println("Birthday: December 7, 2005");
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//To add space for the Salary Calculator
                    System.out.println("Payment Calculator");//Salary Calculator Title
                    System.out.println();//Provides a line of space
                    
                    System.out.print("Basic Salary(Monthly Salary): P");//Prints/Shows Monthly rate. NOTE: decfor.format() is declared to make the decimal places be two places
                    double BasicSalary = sc.nextInt();//User Inputs the Basic Salary
                    
                    double DailyRate = BasicSalary / 20;//DR = Daily Rate. Daily rate divided by 20(days) 
                    
                    System.out.println("Daily Rate: P" + decfor.format(DailyRate));//Prints/Shows Daily rate
                    double DaysWorked = 0;
        
                    while(true){
                    System.out.print("Enter Days Worked during the Month(Maximum: 20 Days): ");
                    DaysWorked = sc.nextInt();//User input days worked. NOTE: User input 
                    if(DaysWorked > 0 && DaysWorked <= 20){
                    break;//This Statement will run over and over again unless the user inputs a valid number of Days Worked such as below and equal to 20 days
        }   
        System.out.println("Invalid Days Worked");
         }
                    System.out.print("Enter Overtime Hours: ");
                    double OvertimeHours = sc.nextInt();//User input Overtime Hours
                    
                    double OverTimePay = DailyRate * .10 //OverTimePay = Daily rate times 0.1 or 10%
                            ,Overtime = OvertimeHours * OverTimePay//Overtime = Overtime Hours times OTP
                            ,GrossIncome = DailyRate * DaysWorked + Overtime;  // Compute for Gross Income. Gross income = Daily Rate times Days Worked Plus Overtime Time
                    
                    double Benefits = 4500.00d; //B = Benefits
                    
                    System.out.println("Gross Income: P" + decfor.format(GrossIncome));//Prints/shows Gross Income
                    
                    System.out.println();//Prints a line for space
                    System.out.println("Benefits" );//Title of the next section
                    System.out.println();
                    System.out.println("Rice Subsidy: P1500.00");//Prints/shows Rice Subsidy Benefits
                    System.out.println("Phone Allowance: P2000.00");//Prints/shows Phone Allowance Benefits
                    System.out.println("Clothing Allowance: P1000.00");//Prints/shows Rice Clothing Allowance Benefits
                    System.out.println("Benefits: P" + decfor.format(Benefits));//Prints/Shows Total Benefits
                    System.out.println();//Prints a line for space
                    
                    System.out.println("Deductions");//Title of next section
                    
                    double SSS = BasicSalary * 0.045 // SSS = BasicSalary times 4.5%
                            ,Philhealth = BasicSalary * 0.03 // Philhealth = BasicSalary times 3%
                            ,PagIbig = BasicSalary * 0.02; // PagIbig = BasicSalary * 2%
                    
                    System.out.println("Social Security Systems Deductions: P" + decfor.format(SSS));
                    System.out.println("Philhealth Deduction: P" + decfor.format(Philhealth));
                    System.out.println("Pag-Ibig Deduction: P" + decfor.format(PagIbig));
                    
                    double TotalDeduction = SSS + Philhealth + PagIbig//These are Deductions without Withholding Tax Since it would be calculated with total deductions of SSS, Philhealht, and PagIbig
                           ,WithholdingTax = 0//WithHolding Tax is automatically 0, and would be declared inside if,elseif,else statements and would be calculated inside the conditions(If,elseif,else)
                          ,TaxableIncome = BasicSalary - TotalDeduction;//TaxableIncome will be used to calculate the Withholding Tax
                    
                        if (BasicSalary >= 20_833 && BasicSalary < 33_333) {//This will run  if Basic Salary is 20,833 to below 33,333
                        WithholdingTax = (TaxableIncome - 20_833) * 0.20;//This condition is based on The MotorPH Witholdding Tax Rate
                    }
                        else if (BasicSalary >= 33_333 && BasicSalary < 66_667) {//This will run  if Basic Salary is 33,333 to below 66,667
                        WithholdingTax = ((TaxableIncome - 33_333) * 0.25) + 2_500;//This condition is based on The MotorPH Witholdding Tax Rate
                    }
                        else if (BasicSalary >= 66_667 && BasicSalary < 166_667) {//This will run  if Basic Salary is 66,667 to below 166,667
                        WithholdingTax = ((TaxableIncome - 66_667) * 0.30) + 10_833;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else if (BasicSalary >= 166_667 && BasicSalary < 666_667) {//This will run  if Basic Salary is 166,667 to below 666,667
                        WithholdingTax = ((TaxableIncome - 66_667) * 0.32) + 40_833.33;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else if (BasicSalary >= 666_667) {//This will run  if Basic Salary is 666,667 and above
                        WithholdingTax = ((TaxableIncome - 666_667) * 0.35) + 200_833.33;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else{//This will run  if Basic Salary is 20,832 and below
                            WithholdingTax = 0;//Basic Salaries that are 20,832 and below it will have no withholding Tax
                        }
                        
                    System.out.println("Withholding Tax: P" + decfor.format(WithholdingTax));    
                    double FinalTotalDeductions = TotalDeduction + WithholdingTax; //Final Total Deductions = SSS plus Philhealth plus Pag-Ibig plus Withholding Tax
                    System.out.println("Total Deductions: P" + decfor.format(FinalTotalDeductions));//Prints/shows total deduction
                    
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//Space for final section
                    System.out.println();//Prints a new line for space
                    System.out.println("Summary");//Title of next final section
                    System.out.println();
                    System.out.println("Gross Income: P" + decfor.format(GrossIncome));//Prints/shows Gross Income
                    System.out.println("Benefits: P" + decfor.format(Benefits));//Prints/shows Benefits
                    System.out.println("Deductions: P" + decfor.format(FinalTotalDeductions));//Prints/shows Deductions
                    System.out.println();//Prints a new line for space
                    
                    double NetIncome = GrossIncome + Benefits - FinalTotalDeductions; // NetIncome = Gross income plus Benefits minus FinalTotalDeductions
                    System.out.println("Net Income: P" + decfor.format(NetIncome));// prints/shows Net Income
                    break;
                }
            case "002":
                {
                    //This case will be used if user inputs 002 as Employee ID
                    System.out.println("Employee Name: Mariah");//Employee Details of 001
                    System.out.println("Employee ID: 002");
                    System.out.println("Gender: Female");
                    System.out.println("Birthday: May 11, 2007");
                   System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//To add space for the Salary Calculator
                    System.out.println("Payment Calculator");//Salary Calculator Title
                    System.out.println();//Provides a line of space
                    
                    System.out.print("Basic Salary(Monthly Salary): P");//Prints/Shows Monthly rate. NOTE: decfor.format() is declared to make the decimal places be two places
                    double BasicSalary = sc.nextInt();//User Inputs the Basic Salary
                    
                    double DailyRate = BasicSalary / 20;//DR = Daily Rate. Daily rate divided by 20(days) 
                    
                    System.out.println("Daily Rate: P" + decfor.format(DailyRate));//Prints/Shows Daily rate
                    double DaysWorked = 0;
        
                    while(true){
                    System.out.print("Enter Days Worked during the Month(Maximum: 20 Days): ");
                    DaysWorked = sc.nextInt();//User input days worked. NOTE: User input 
                    if(DaysWorked > 0 && DaysWorked <= 20){
                    break;//This Statement will run over and over again unless the user inputs a valid number of Days Worked such as below and equal to 20 days
        }   
        System.out.println("Invalid Days Worked");
         }
                    System.out.print("Enter Overtime Hours: ");
                    double OvertimeHours = sc.nextInt();//User input Overtime Hours
                    
                    double OverTimePay = DailyRate * .10 //OverTimePay = Daily rate times 0.1 or 10%
                            ,Overtime = OvertimeHours * OverTimePay//Overtime = Overtime Hours times OTP
                            ,GrossIncome = DailyRate * DaysWorked + Overtime;  // Compute for Gross Income. Gross income = Daily Rate times Days Worked Plus Overtime Time
                    
                    double Benefits = 4500.00d; //B = Benefits
                    
                    System.out.println("Gross Income: P" + decfor.format(GrossIncome));//Prints/shows Gross Income
                    
                    System.out.println();//Prints a line for space
                    System.out.println("Benefits" );//Title of the next section
                    System.out.println();
                    System.out.println("Rice Subsidy: P1500.00");//Prints/shows Rice Subsidy Benefits
                    System.out.println("Phone Allowance: P2000.00");//Prints/shows Phone Allowance Benefits
                    System.out.println("Clothing Allowance: P1000.00");//Prints/shows Rice Clothing Allowance Benefits
                    System.out.println("Benefits: P" + decfor.format(Benefits));//Prints/Shows Total Benefits
                    System.out.println();//Prints a line for space
                    
                    System.out.println("Deductions");//Title of next section
                    
                    double SSS = BasicSalary * 0.045 // SSS = BasicSalary times 4.5%
                            ,Philhealth = BasicSalary * 0.03 // Philhealth = BasicSalary times 3%
                            ,PagIbig = BasicSalary * 0.02; // PagIbig = BasicSalary * 2%
                    
                    System.out.println("Social Security Systems Deductions: P" + decfor.format(SSS));
                    System.out.println("Philhealth Deduction: P" + decfor.format(Philhealth));
                    System.out.println("Pag-Ibig Deduction: P" + decfor.format(PagIbig));
                    
                    double TotalDeduction = SSS + Philhealth + PagIbig//These are Deductions without Withholding Tax Since it would be calculated with total deductions of SSS, Philhealht, and PagIbig
                           ,WithholdingTax = 0//WithHolding Tax is automatically 0, and would be declared inside if,elseif,else statements and would be calculated inside the conditions(If,elseif,else)
                          ,TaxableIncome = BasicSalary - TotalDeduction;//TaxableIncome will be used to calculate the Withholding Tax
                    
                        if (BasicSalary >= 20_833 && BasicSalary < 33_333) {//This will run  if Basic Salary is 20,833 to below 33,333
                        WithholdingTax = (TaxableIncome - 20_833) * 0.20;//This condition is based on The MotorPH Witholdding Tax Rate
                    }
                        else if (BasicSalary >= 33_333 && BasicSalary < 66_667) {//This will run  if Basic Salary is 33,333 to below 66,667
                        WithholdingTax = ((TaxableIncome - 33_333) * 0.25) + 2_500;//This condition is based on The MotorPH Witholdding Tax Rate
                    }
                        else if (BasicSalary >= 66_667 && BasicSalary < 166_667) {//This will run  if Basic Salary is 66,667 to below 166,667
                        WithholdingTax = ((TaxableIncome - 66_667) * 0.30) + 10_833;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else if (BasicSalary >= 166_667 && BasicSalary < 666_667) {//This will run  if Basic Salary is 166,667 to below 666,667
                        WithholdingTax = ((TaxableIncome - 66_667) * 0.32) + 40_833.33;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else if (BasicSalary >= 666_667) {//This will run  if Basic Salary is 666,667 and above
                        WithholdingTax = ((TaxableIncome - 666_667) * 0.35) + 200_833.33;//This condition is based on The MotorPH Witholdding Tax Rate
                    }   
                        else{//This will run  if Basic Salary is 20,832 and below
                            WithholdingTax = 0;//Basic Salaries that are 20,832 and below it will have no withholding Tax
                        }
                        
                    System.out.println("Withholding Tax: P" + decfor.format(WithholdingTax));    
                    double FinalTotalDeductions = TotalDeduction + WithholdingTax; //Final Total Deductions = SSS plus Philhealth plus Pag-Ibig plus Withholding Tax
                    System.out.println("Total Deductions: P" + decfor.format(FinalTotalDeductions));//Prints/shows total deduction
                    
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//Space for final section
                    System.out.println();//Prints a new line for space
                    System.out.println("Summary");//Title of next final section
                    System.out.println();
                    System.out.println("Gross Income: P" + decfor.format(GrossIncome));//Prints/shows Gross Income
                    System.out.println("Benefits: P" + decfor.format(Benefits));//Prints/shows Benefits
                    System.out.println("Deductions: P" + decfor.format(FinalTotalDeductions));//Prints/shows Deductions
                    System.out.println();//Prints a new line for space
                    
                    double NetIncome = GrossIncome + Benefits - FinalTotalDeductions; // NetIncome = Gross income plus Benefits minus FinalTotalDeductions
                    System.out.println("Net Income: P" + decfor.format(NetIncome));// prints/shows Net Income
                    break;
                }
            default://This is the default and will run if the user inputs Employee ID other than 001 or 002(Registered Employee ID)
                System.out.println("Invalid Employee ID");
                
        }
        
         
        
        
        
    }
}
