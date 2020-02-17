package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	
	JFrame window;
	JPanel panel;
	Random random = new Random();
	JButton[] buttonArray;
	int hiddenButton;
	
	public static void main(String[] args) throws InterruptedException {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() throws InterruptedException {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		int length = Integer.parseInt(JOptionPane.showInputDialog("Enter a two-digit positive integer:"));
		buttonArray = new JButton[length];
		
		for (int i = 0; i < buttonArray.length; i++) {
			buttonArray[i] = new JButton();
			buttonArray[i].addActionListener(this);
		}
		
		//JOptionPane.showMessageDialog(window, "Try to find the hidden button in this window.");
		
		hiddenButton = random.nextInt(length);
		buttonArray[hiddenButton].setText("ME");
		
		for (JButton button : buttonArray) {panel.add(button);}
		window.add(panel);
		window.setVisible(true);
		
		Thread.sleep(400);

		window.remove(panel);
		for (JButton button : buttonArray) {panel.remove(button);}
		buttonArray[hiddenButton].setText("");
		for (JButton button : buttonArray) {panel.add(button);}
		window.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if (buttonClicked == buttonArray[hiddenButton]) {JOptionPane.showMessageDialog(window, "You WIN!");}
		//18. else tell them to try again
		else {JOptionPane.showMessageDialog(window, "Try Again");}
	}
}
