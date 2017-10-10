import javax.swing.JOptionPane;

public class ArraysProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an array to hold all the months 
		String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", 
				"Oct", "Nov", "Dec"}; 
		//declare an array for days of rainfall each month
		int [] rainDays = new int [12];
		//get input
		String input; 
		for (int index = 0; index < months.length; index++) {
			input = JOptionPane.showInputDialog(null, "How many days in " + months[index] +
				" did it rain?");
			rainDays[index] = Integer.parseInt(input);
		
		}
		//print each month's rain days
		/*for (int index = 0; index < months.length; index++) {
			JOptionPane.showMessageDialog(null, "In " + months[index] + ", there were" 
					+ rainDays[index] + " days of rain.");
		}
		*/
		//calculate the average
		int sum = 0;
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
	}
}
