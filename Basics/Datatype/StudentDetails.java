class StudentDetails{
	public static void main(String args[])
	{
		Student S1 = new Student();

		S1.Stud = "Student 1";
		S1.ID = 001;
		S1.Name = "Akash";
		S1.DOB = "13/11/1997";
		S1.Age = 24;

		S1.StudDetails();


		Student S2 = new Student();

		S2.Stud = "Student 2";
		S2.ID = 002;
		S2.Name = "Abdul";
		S2.DOB = "04/05/1996";
		S2.Age = 25;

		S2.StudDetails();


		Student S3 = new Student();

		S3.Stud = "Student 3";
		S3.ID = 003;
		S3.Name = "Arpit";
		S3.DOB = "22/08/1998";
		S3.Age = 23;

		S3.StudDetails();



		Student S4 = new Student();

		S4.Stud = "Student 4";
		S4.ID = 004;
		S4.Name = "Subramani";
		S4.DOB = "10/01/1998";
		S4.Age = 23;

		S4.StudDetails();



		Student S5 = new Student();

		S5.Stud = "Student 5";
		S5.ID = 005;
		S5.Name = "Arun";
		S5.DOB = "06/07/1997";
		S5.Age = 24;

		S5.StudDetails();
	}
}