
import java.awt.*; 
import java.awt.event.*;
import java.awt.image.*; 
import java.io.*; 
import javax.imageio.*;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
public class MyFrame  
{
	final static JFrame Window = new JFrame("Stock Builder");
	public static GridLayout myLayout = new GridLayout(10,1);
	final static JPanel MyStockImage = new JPanel();
	final static JPanel Messages = new JPanel(myLayout);
	final static JOptionPane PopUpMessage = new JOptionPane();
	final static ImageTest one = new ImageTest();
	final static Menu MyMenuBar = new Menu();
	
    public MyFrame()
    {
		
		Window.addWindowListener(new WindowAdapter()
		{                
			public void windowClosing(WindowEvent e)
			{                     
				System.exit(0);           
			}            
		
		}); 
		
		MyStockImage.add(one);
		
		//MyStockImage.add(Menu.barrelLenghtReminder);
		
		Window.setJMenuBar(MyMenuBar.getMenuBar());
		Window.setLayout(new GridBagLayout());
		Window.add(MyStockImage); 
		
		Messages.setPreferredSize(new Dimension(350,900));
		Window.add(Messages);    
		addObjectsToJPanel();
		Window.pack();   
		Window.setVisible(true);  
	}	
	public static void RePaint()
	{	
		Window.setJMenuBar(MyMenuBar.getMenuBar());
		Window.repaint();
	}
	public void addObjectsToJPanel()
	{
		//MyStockImage.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		//myLayout.layoutContainer(MyStockImage);
		//myLayout.preferredLayoutSize(MyStockImage);
		//Messages.setLayout(myLayout);
		myLayout.setVgap(50);
		myLayout.setHgap(1);
		
		Messages.add(Menu.actionTypeReminder);
		Messages.add(Menu.barrelLenghtReminder);
		Messages.add(Menu.opticReminder);
		Messages.add(Menu.opticMountReminder);
		Messages.add(Menu.magazineReminder);
		Messages.add(Menu.bipodReminder);
		Messages.add(Menu.monopodReminder);
		Messages.add(Menu.chassisColorReminder);
		Messages.add(Menu.gripColorReminder);
		Messages.add(Menu.totalReminder);
		
		
		/*
		GridBagConstraints myConstraints = new GridBagConstraints();
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 1;
		Messages.add(Menu.actionTypeReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 2;
		Messages.add(Menu.barrelLenghtReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 3;
		Messages.add(Menu.opticReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 4;
		Messages.add(Menu.opticMountReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 5;
		Messages.add(Menu.magazineReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 6;
		Messages.add(Menu.bipodReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 7;
		Messages.add(Menu.monopodReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 8;
		Messages.add(Menu.chassisColorReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 9;
		Messages.add(Menu.gripColorReminder, myConstraints);
		
		myConstraints.fill = GridBagConstraints.NONE;
		myConstraints.weightx = .1;
		myConstraints.weighty = .1;
		myConstraints.anchor = GridBagConstraints.NORTHEAST;
		//myConstraints.insets = new Insets(0,0,0,0);  //top padding
		myConstraints.ipady = 40;
		myConstraints.ipadx = 30;
		//myConstraints.gridheight = 1;
		//myConstraints.gridwidth = 1;   
		myConstraints.gridx = 1;
		myConstraints.gridy = 10;
		Messages.add(Menu.totalReminder, myConstraints);
		*/
	}
}

/**
RUN OUTPUT:

*/