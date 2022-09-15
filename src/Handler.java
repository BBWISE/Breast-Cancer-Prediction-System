import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Handler extends OutPart implements ActionListener {
		
	public void actionPerformed (ActionEvent event) {
			
		if(event.getSource()==tutorialButton) {
			mainCard.show(mainPageCenter, "Main Menu");
		}
			
		else if(event.getSource()==predictionButton) {
			predictionPage();
		}
		else if(event.getSource()==predictButton) {
			
			Naive_Bayes nb = new Naive_Bayes();
			
			if(age.getText().toString().equals("")
					|| BMI.getText().toString().equals("")
					|| Glucose.getText().toString().equals("")
					|| Insulin.getText().toString().equals("")
					|| HOMA.getText().toString().equals("")
					|| Leptin.getText().toString().equals("")
					|| Adiponectin.getText().toString().equals("")
					|| Resistin.getText().toString().equals("")
					|| MCP.getText().toString().equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please check the missing field and enter neccessary values.");
			}
			else {
				double age1 = Double.parseDouble(age.getText().toString());
				double bmi = Double.parseDouble(BMI.getText().toString());
				double glucose = Double.parseDouble(Glucose.getText().toString());
				double insulin = Double.parseDouble(Insulin.getText().toString()); 
				double homa = Double.parseDouble(HOMA.getText().toString());
				double leptin = Double.parseDouble(Leptin.getText().toString()); 
				double adiponectin = Double.parseDouble(Adiponectin.getText().toString());
				double resistin = Double.parseDouble(Resistin.getText().toString());
				double mcp = Double.parseDouble(MCP.getText().toString());
				
				if(age1>0
						&& bmi>=0
						&& glucose>=0
						&& insulin>=0
						&& homa>=0
						&& leptin>=0
						&& adiponectin>=0
						&& resistin>=0
						&& mcp>=0) {
					
					
					nb.calculat(age1, bmi, glucose, insulin, homa, leptin, adiponectin, resistin, mcp);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please input correct values.");
				}
			}
		}
		
	}
}
