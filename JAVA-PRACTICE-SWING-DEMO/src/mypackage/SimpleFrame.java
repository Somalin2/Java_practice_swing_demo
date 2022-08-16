package mypackage;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SimpleFrame extends JFrame {
	
	public SimpleFrame() {
		initUI();
		createMenuBar();
	}
	private void initUI() {
		setTitle("Simple Frame Example");
		setSize(900, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void createMenuBar() {
		var menuBar =new JMenuBar();
		
		var fileMenu= new JMenu("File");
		
		var eMenuItem =new JMenuItem("Exit");
		var aMenuItem= new JMenuItem("Add");
		
		fileMenu.add(aMenuItem);
		fileMenu.add(eMenuItem);
		fileMenu.add(eMenuItem);
		
		var editMenu =new JMenu("Edit");
		var copyMenuItem = new JMenuItem("Update");
		editMenu.add(copyMenuItem);
		
		var Setting= new JMenu("Setting");
		var Color = new JMenuItem("Color");
		Setting.add(Color);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(Setting);
		
		setJMenuBar(menuBar);		
	}
}
