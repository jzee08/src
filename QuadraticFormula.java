import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class QuadraticFormula {
	
	/* Second Program
	 * I will be solving the quadratic equation in the form of ax
	 */

	public static void main(String[] args) {
		double a, b, c;
		
		DecimalFormat df = new DecimalFormat("#.###");
		
		JOptionPane.showMessageDialog(null, "Second Program. \n By, Joe Phinazee");
		JOptionPane.showMessageDialog(null, "This program will solve the equation in the form of (ax^2 + bx + c = 0) ");
		
		while (true) {
		try {
		a = Double.parseDouble(JOptionPane.showInputDialog("Enter variable a:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Enter variable b:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Enter variable c:"));
	
		break;
		}
		catch (NumberFormatException s){
			JOptionPane.showMessageDialog(null, "Error!! Enter a valid character");
		}
		} 
		double D = Math.pow(b,2) - 4*a*c;
		
		if (D > 0 ){
				double x1 = (-b + Math.sqrt(D))/(2*a);
		double x2 = (-b - Math.sqrt(D))/(2*a);
		double i=Math.sqrt(-1);
		double x3 = (-b + (Math.sqrt(D))*i)/(2*a);
		double x4 = (-b - (Math.sqrt(D))*i)/(2*a);
			JOptionPane.showMessageDialog(null, "there are two solutions:" + df.format(x1)+"and"+ df.format(x2));
		}
		else if (D == 0) {
			double x1 = -b/2*a;
			JOptionPane.showMessageDialog(null, "The solutions is:"+df.format(x1));
		}
		else {
			double x3= -b/(2*a);
			double x4= Math.sqrt(Math.abs(D))/(2*a);
			JOptionPane.showMessageDialog(null, "The solutions are"+ df.format(x3)+ "+-" + df.format(x4) + "i");
			

		}

	}

	}



