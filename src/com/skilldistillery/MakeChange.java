package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of the item: ");
		double price = input.nextDouble();
		System.out.print("Enter the amount of money provided: ");
		double amountProvided = input.nextDouble();
		if(price<amountProvided) {
			cashBack(price, amountProvided);
		}
		if(price==amountProvided) {
			printMessage();
		}
		else if(price>amountProvided) {
			System.out.println("\t\tInsufficient amount provided\n\t\tTransaction Cancelled");
		}
		input.close();
	}
	public static void cashBack(double price, double amountProvided){
		System.out.println("The change back is: ");
		double amountOwed = amountProvided - price;
		if(amountOwed%20 >0){
			int num20s = (int)((amountOwed)/20);
			if(num20s>1) {
			System.out.println(num20s+" 20 dollar bills");}
			if(num20s==1) {
				System.out.println(num20s+" 20 dollar bill");}
			amountProvided = amountOwed-(num20s*20);}
		
		if(amountOwed%10 >0) {
			int num10s = (int)((amountOwed)/10);
			if(num10s>1) {
			System.out.println(num10s+" 10 dollar bills");}
			if(num10s==1) {
				System.out.println(num10s+" 10 dollar bill");
			}
			amountOwed = amountOwed-(num10s*10);}
		
		if(amountOwed%5 >0) {
			int num5s = (int)((amountOwed)/5);
			if(num5s>1) {
				System.out.println(num5s+" 5 dollar bills");}
			if(num5s==1) {
				System.out.println(num5s+" 5 dollar bill");
			}
			amountOwed = amountOwed-(num5s*5);}
		
		if(amountOwed%1 >0) {
			int num1s = (int)((amountOwed)/1);
			if(num1s>1) {
				System.out.println(num1s+" 1 dollar bills");}
			if(num1s==1) {
				System.out.println(num1s+" 1 dollar bill");
			}
			amountOwed = amountOwed-(num1s*1);
		}
		if(amountOwed%0.25>0) {
			int quarters = (int)((amountOwed)/0.25);
			if(quarters>1) {
				System.out.println(quarters+" quarters");
			}
			if(quarters==1) {
				System.out.println(quarters+" quarter");
			}
			amountOwed = amountOwed-(quarters*0.25);
		}
		if(amountOwed%0.10>0) {
			int dimes = (int)((amountOwed)/0.10);
			if(dimes>1) {
				System.out.println(dimes+" dimes");
			}
			if(dimes==1) {
				System.out.println(dimes+" dime");
			}
			amountOwed = amountOwed-(dimes*0.10);
		}
		if(amountOwed%0.05>0) {
			int nickels = (int)((amountOwed)/0.05);
			if(nickels>1) {
				System.out.println(nickels+" nickels");
			}
			if(nickels==1) {
				System.out.println(nickels+" nickel");
			}
			amountOwed = amountOwed-(nickels*0.05);
		}
		if(amountOwed%0.01>0) {
			int pennies = (int)((amountOwed/0.01)+0.5);
			if(pennies>1) {
				System.out.println(pennies+" pennies");
			}
			if(pennies==1) {
				System.out.println(pennies+" penny");
			}
			amountOwed = amountOwed-(pennies*0.01);
		}
		printMessage();
	}
		
public static void printMessage() {
System.out.println("\t\tTransaction Approved");
System.out.println("Thank you for your patronange. Please come again!");}
}

