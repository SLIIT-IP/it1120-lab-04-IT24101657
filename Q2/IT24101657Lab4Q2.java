import java.util.Scanner;
public class IT24101657Lab4Q2
{
	
		public static void main (String[]args)
		{
	
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter exam marks(out of 100):");
			double number = input.nextDouble();
			if(number>100)
			{
				System.out.print("Invalid input for exam marks.Terminating program");
			}
			System.out.print("Please Lab submission marks(out of 100):");
			double numberK = input.nextDouble();
			if(number>100)
			{
				System.out.print("Invalid input for exam marks.Terminating program:");
			}
			
			System.out.print("Please enter the precentage given for the exam:");
			int numberN = input.nextInt();
			if(number<50)
			{
				System.out.print("The percentages must add ou to 100.Terminating program");
			}
			System.out.print("Please enter the precentage given for the Lab submission:");
			int numberZ = input.nextInt();
			if(number<50)
			{
				System.out.print("The percentages must add ou to 100.Terminating program");
			}
			double finalMark = (number + numberK)/2;
			System.out.println("Final Exam Mark is :" + finalMark);
		}
}		