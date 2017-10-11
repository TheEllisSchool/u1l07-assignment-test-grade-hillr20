import javax.swing.JOptionPane;

public class ArraysProject1 {

	public static void main(String[] args) {
		
	//}
		// TODO Auto-generated method stub
		//declare an array to hold all the months 
		String [] grades = {}; 
		//declare an array for days of rainfall each month
		//int [] rainDays = new int [12];
		//get input
		//String input; 
		String input = JOptionPane.showInputDialog(null, "How many grades are you going to"
					+ " input?");
		//int size;
		int size = Integer.parseInt(input);
		//int size = input;
		double [] grade = new double[size];
		for (int index = 0; index < grades.length; index++) {
			input = JOptionPane.showInputDialog(null, "What was your grade?");
			grade[index] = Integer.parseInt(input);
		//double [] grade = new double[size];
		}
		/*for (int index = 0; index < grades.length; index++) {
			JOptionPane.showMessageDialog(null, "Your grade in " + grades[index] + ", was" 
					+ grade[index]);
			
		}
		*/
		int sum = 0;
		for (int index = 0; index < size; index++) {
			sum += grade[index];
		}	
		//calculate average
		double average = sum/grades.length;
		JOptionPane.showMessageDialog(null, "Average is: " + average);
		//find the highest
		double highest = grade[0];
		for (int i = 0; i < grades.length; i++) {
			if (grade[i] > highest) {
			highest = grade[i];
			}
		}
		//determine highest and lowest score
		double lowest = grade[0];
		for (int i = 0; i < grades.length; i++) {
			if (grade[i] < lowest) {
				lowest = grade[i];
			}
		}
	}	
		
}	

		//print each month's rain days
		/*for (int index = 0; index < months.length; index++) {
			JOptionPane.showMessageDialog(null, "In " + months[index] + ", there were" 
					+ rainDays[index] + " days of rain.");
		}
		*/
		//calculate the average
		/*int sum = 0;
		for (int index = 0; index < months.length; index++) {
			sum += rainDays[index];
			
		}
		double average = sum/rainDays.length;
		JOptionPane.showMessageDialog(null, "Average is: " + average);
		//find the highest
		int highest = rainDays[0];
		for (int i = 0; i < rainDays.length; i++) {
			if (rainDays[i] > highest) {
			highest = rainDays[i];
			}
		}
		JOptionPane.showMessageDialog(null, "Highest is: " + highest);
	//}
	//Test Grade calculator 
	//calculate the average
	//determine highest and lowest scores
	//calculate the average with the lowest score dropped
	*/
		/*String numTestGrades[];
		int size;
		int arr;
	
		int arraySize number = new arraySize();
		int number.showDialog();
	
		size = new Integer(JOptionPane.showInputDialog("Enter Array Size:"));
		size();

		arr=size; 
		int[] number=new int[arr];
		System.out.println("The size of array is "+arr);
		for(int index=0;index<arr;index++){
			System.out.print("Enter number: ");
			number[index]=input.nextInt();
		}
		System.out.print("The input value before sorting: ");
		for(int index=0;index<arr;index++){
			System.out.print(" "+number[index]);
		}
		System.out.println();
		System.out.print("After Sorting: ");
		Arrays.sort(number);
		for(int index=0;index<arr;index++){

			System.out.print(" "+number[index]);
	
	
*/