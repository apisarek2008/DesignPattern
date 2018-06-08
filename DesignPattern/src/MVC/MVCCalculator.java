package MVC;

public class MVCCalculator {
	
	public static void main(String[] args) {
		
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorControler theControler = new CalculatorControler(theView, theModel);
		
		theView.setVisible(true);
		
	}

}
