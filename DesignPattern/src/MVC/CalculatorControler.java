package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorControler {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	
	public CalculatorControler(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new calculateListener());
		
	}
	class calculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getsecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			}catch(NumberFormatException ex) {
				theView.displayErrorMessage("You need 2 integers....");
			}
		}
		
	}

}
