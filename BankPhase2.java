package BankofFahimProject;

import java.util.Scanner;

public class BankPhase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("           WELCOME TO THE BANK OF FAHIM");
		System.out.println("Established in 2020 in New York, by Fahim Alam Shakie");
		System.out.println("    Our Bank is FDIC insured, ID NO: 414524242");
		System.out.println();
		System.out.println();
		Scanner input = new Scanner (System.in);
		double money=0;
		int choice=0;
		double temp=0;
		String first;
		String last;
		System.out.println("What is your first name?");
		first=input.nextLine();
		System.out.println("What is your last name?");
		last=input.nextLine();
		System.out.println("Please enter you initial Deposit: ");
		money=input.nextDouble();
		double sample=0;
		double sample1=0;
		
		if(money>0) {
			
			System.out.println("Your current balance is: "+"$"+money);
		
		
			while(choice!=7) {
				System.out.print("1.) Display Balance"+"   "); System.out.print(" 5.) Account Summary");
				System.out.println();
				System.out.print("2.) Deposit Money"+"   ");System.out.print("   6.) Simple Interest Calc");	
				System.out.println();
				System.out.print("3.) Withdraw Money"+"   ");System.out.print("  7.) Exit");
				System.out.println();
				System.out.print("4.) Standard Roi Calc"+" ");System.out.print(" 8.) List of Policies");
				choice = input.nextInt();
				switch(choice) {
				
				
				case 1: System.out.println();
						System.out.println("Current Balance: "+ "$"+ money+"0");
						System.out.println();
						break;
				
				case 2: System.out.println();
						System.out.println("How much would you like to deposit?");
						double A=input.nextDouble();
						if(A>0) {
						temp = money;
						double newM= money + A;
						money = newM;
						System.out.println();
						System.out.println("Your previous Balance was: "+"$"+temp);
						System.out.println("Your new Balance is: "+ "$"+ money);
						System.out.println();}
						else
							{
							System.out.println("You have entered an invalid amount");
							};break;
						
						
				case 3: System.out.println();
						System.out.println("How much would you like to withdraw?");		
						double B=input.nextDouble();
						if(B<=money) {
						temp = money;
						double newP= money - B;
						money= newP;
						System.out.println("Your previous Balance was: "+"$"+temp);
						System.out.println("Your new Balance is: "+ "$"+ money);
						System.out.println();}
						else
							{
							System.out.println("You do not have sufficient funds to carry out this transaction.");
							System.out.println("Please select a lesser amount");
							};break;
						
				case 4: System.out.println();
						System.out.println("You have chosen to calculate standard ROI");
						System.out.println();
						System.out.println("Your standard APR is 2%");
						System.out.println();
						System.out.println("You current balance is: "+"$"+money+"0");
						System.out.println();
						System.out.println("How many months do you want to calculted ROI for?");
						System.out.println();
						sample=money;
						int ROImonth=input.nextInt();
						for (int i = 1; i <=ROImonth; i++) {
							temp=sample;
							double ROICalc=(sample*0.02)/12;
							double newB= ROICalc+sample;
							System.out.println("For Month "+i+" Your Balance is: "+"$"+newB);
							sample=newB;					
							};
							System.out.println();
							System.out.println();break;
							
				case 5: System.out.println();
						System.out.println("You have chosen to view your Account Summary:");
						System.out.println();
						System.out.println("Name: "+ first+" "+last);
						System.out.println("Balance: "+"$"+money+"0");
						System.out.println();break;
						
				
				case 6: sample1=money;
						System.out.println();
						System.out.println("You have chosen the Simple interest calculator");
						System.out.println("Is your Current Balance your Principle Balance?");
						String C=input.next();
						if(C.equals("yes") || C.equals("Yes")) {
							System.out.println("What interest rate would you like to calcualte?");
							double R=input.nextDouble();
							System.out.println("How many years would you like to calcualte?");
							double T=input.nextDouble();
							System.out.println("Your Simple Interest ending Balance is: "+"$"+
									(sample1*(1+((R/100)*T)))+"0");
					
							}else if (C.equals("No") || C.equals("no"))
							{
							System.out.println("What is your Principle Balance? ");
							double Principle=input.nextDouble();
							System.out.println("What interest rate would you like to calcualte?");
							double R=input.nextDouble();
							System.out.println("How many years would you like to calcualte?");
							double T=input.nextDouble();
							System.out.println("Your Simple Interest ending Balance is: "+"$"+
									(Principle*(1+((R/100)*T)))+"0");
							}
							else 
							{System.out.println("You entered an invalid input, Please pick write Yes of No");}
							System.out.println();
							break;
							
				case 7: System.out.println();
						System.out.println("Thank you for your business "+first+"!");
						System.out.println("Your Ending Balance: "+ "$"+money+"0");
						System.out.println("Have a Great Day!");
						System.out.println();break;
						
				case 8: System.out.println();
						System.out.println("This is a fake bank, their are no policies!");
						System.out.println();break;
				
			}
				
		}}
		
		
		
		else {System.out.println("You have entered an invalid amount");}

		

	}

}
