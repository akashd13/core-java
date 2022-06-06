package com.xworkz.Java_Basics.Basics.Statements.Decisionmaking;

class Ifelseif {
	
	public static void main(String[] args) {

		boolean withdraw = true;
		boolean ministatement = false;
		boolean balanceenquiry = false;

		if(withdraw){
			System.out.println("Enter the amount");

		}

		else if(ministatement) {
			System.out.println("Collect the statement");
        }
                                                               //Cannot exist independently
        else if(balanceenquiry){
        	System.out.println("Account balance = 0 ");
        }

        else{
        	System.out.println("You did not enter anything");
        }
	}
}