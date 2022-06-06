package com.xworkz.Java_Basics.Basics.Statements.Decisionmaking;

class JobEligibiltyAssignment {

	public static void main(String[] args) {

		String degree = "Engineering";
		Boolean java = false;
		Boolean python = false;
		Boolean backlog = true;

		if(degree == "Engineering" && backlog == false) {
         
            System.out.println("You are eligible to apply for this job");
		}

		else {

		   System.out.println("Sorry.... you are out of eligibility criteria");
		}

       if(java == true) {

       	System.out.println("Congrats!!! you can become a Java Developer");

       }

       else if(python == true) {

       	System.out.println("Congrats!!! you can become a Python Developer");
       }

       else {
       	System.out.println("You cannot become a software developer");
       }


	}
	
}