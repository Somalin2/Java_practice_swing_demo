package mypackage;

import javax.swing.JFrame;

public class SimpleFrame extends JFrame {
	
	public SimpleFrame() {
		initUI();
	}
	private void initUI() {
		setTitle("Simple Frame Example");
		setSize(900, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
