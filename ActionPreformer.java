/** 
 * @student.info 
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */
import java.awt.*; 
import java.awt.event.*;
import java.awt.image.*; 
import java.io.*; 
import javax.imageio.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ActionPreformer implements ActionListener 
{ 
	public ActionPreformer()
	{
		
	}
    public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == Menu.rifleTypeM14)
		{
			// Set rifle type to m-14
			MyFrame.one.setRifleType(1);
			Menu.rifleTypeCost = 50;
			// call next menu
			if (Menu.done[0] == false)
			{
				Menu.addM14ActionType();
				Menu.done[0] = true;
			}
		}
		else if (e.getSource() == Menu.rifleTypeRem700)
		{
			// Set rifle type to Rem 700
			MyFrame.one.setRifleType(2);
			Menu.rifleTypeCost = 100;
			// call next menu
			if (Menu.done[0] == false)
			{
				Menu.addM14ActionType();
				Menu.done[0] = true;
			}
		}
		else if (e.getSource() == Menu.actionTypeStandard)
		{
			 // sets the action type image to "standard"
			MyFrame.one.setActionType(1);
			Menu.actionType[5] = 1;
			Menu.actionTypeReminder.setText("Action Type: Standard($50)");
			Menu.actionTypeCost = 50;
		
			Menu.actionTypeMenu.setForeground(new Color(0, 100, 0));
			// repaints the Jframe
			// Calls next menu
			if (Menu.done[1] == false)
			{
				Menu.addM14BarrelLenght();
				Menu.done[1] = true;
			}
		}
		else if (e.getSource() == Menu.actionTypeRearLug)
		{
			// sets the action type image to "Rear Lug"
			MyFrame.one.setActionType(2);
			Menu.actionType[5] = 2;
			Menu.actionTypeCost = 100;
			Menu.actionTypeReminder.setText("Action Type: Rear Lug($100)");
			Menu.actionTypeMenu.setForeground(new Color(0, 100, 0));
			// Calls next menu
			if (Menu.done[1] == false)
			{
				Menu.addM14BarrelLenght();
				Menu.done[1] = true;
			}
		}
		else if (e.getSource() == Menu.actionTypeM25)
		{
			// sets the action type image to "M-25"
			Menu.actionTypeMenu.setForeground(new Color(0, 100, 0));
			MyFrame.one.setActionType(3);
			Menu.actionType[5] = 3;
			Menu.actionTypeCost = 150;
			Menu.actionTypeReminder.setText("Action Type: M-25($150)");
			// Calls next menu
			if (Menu.done[1] == false)
			{
				Menu.addM14BarrelLenght();
				Menu.done[1] = true;
			}
		}
		else if (e.getSource() == Menu.actionTypeNone)
		{
			 // sets the action type image to "M-25"
			MyFrame.one.setActionType(0);
			Menu.actionType[5] = 0;
			Menu.actionTypeCost = 0;
			Menu.actionTypeReminder.setText("Action Type: None");
			Menu.actionTypeMenu.setForeground(new Color(100, 0, 0));
			if (Menu.done[1] == false)
			{
				Menu.addM14BarrelLenght();
				Menu.done[1] = true;
			}
		}
		else if (e.getSource() == Menu.barrelLenght16Inch)
		{
			// sets the Barrel Lenght image to 16
			MyFrame.one.setBarrelLenght(1);
			Menu.barrelLenghtMenu.setForeground(new Color(0, 100, 0));
			Menu.barrelLenght[5] = 1;
			Menu.barrelLenghtReminder.setText("Barrel Lenght: 16 Inch($50)");
			Menu.barrelLenghtCost = 50;
			if (Menu.done[2] == false)
			{
				Menu.addM14Optics();
				Menu.done[2] = true;
			}
		}
		else if (e.getSource() == Menu.barrelLenght18Inch)
		{
			// sets the Barrel Lenght image to 18
			MyFrame.one.setBarrelLenght(2);
			Menu.barrelLenghtMenu.setForeground(new Color(0, 100, 0));
			Menu.barrelLenght[5] = 2;
			Menu.barrelLenghtReminder.setText("Barrel Lenght: 18 Inch($100)");
			Menu.barrelLenghtCost = 100;
			if (Menu.done[2] == false)
			{
				Menu.addM14Optics();
				Menu.done[2] = true;
			}
		}
		else if (e.getSource() == Menu.barrelLenght20Inch)
		{
			// sets the Barrel Lenght image to 16
			MyFrame.one.setBarrelLenght(3);
			Menu.barrelLenghtMenu.setForeground(new Color(0, 100, 0));
			Menu.barrelLenght[5] = 3;
			Menu.barrelLenghtReminder.setText("Barrel Lenght: 20 Inch($150)");
			Menu.barrelLenghtCost = 150;
			if (Menu.done[2] == false)
			{
				Menu.addM14Optics();
				Menu.done[2] = true;
			}
		}
		else if (e.getSource() == Menu.barrelLenghtNone)
		{
			// sets the Barrel Lenght image to 16
			MyFrame.one.setBarrelLenght(0);
			Menu.barrelLenghtMenu.setForeground(new Color(100, 0, 0));
			Menu.barrelLenght[5] = 0;
			Menu.barrelLenghtReminder.setText("Barrel Lenght: None");
			Menu.barrelLenghtCost = 0;
			// repaints the Jframe
			MyFrame.RePaint();
			// Calls next menu
			if (Menu.done[2] == false)
			{
				Menu.addM14Optics();
				Menu.done[2] = true;
			}
		}
		else if (e.getSource() == Menu.opticsScope)
		{
			// sets the Optics Image to "Scope"
			MyFrame.one.setOptics(1);
			Menu.opticsMenu.setForeground(new Color(0, 100, 0));
			Menu.optics[5] = 1;
			Menu.opticReminder.setText("Optics: Scope($50)");
			Menu.opticsCost = 50;
			// Calls next menu
			if (Menu.done[3] == false)
			{
				Menu.addM14OpticMount();
				Menu.done[3] = true;
			}
		}
		else if (e.getSource() == Menu.opticsReflexSight)
		{
			// sets the Optics Image to "Reflex Sight"
			MyFrame.one.setOptics(2);
			Menu.opticsMenu.setForeground(new Color(0, 100, 0));
			Menu.optics[5] = 2;
			Menu.opticReminder.setText("Optics: Reflex Sight($100)");
			Menu.opticsCost = 100;
			if (Menu.done[3] == false)
			{
				Menu.addM14OpticMount();
				Menu.done[3] = true;
			}
		}
		else if (e.getSource() == Menu.opticsNone)
		{
			// sets the Optics Image to "None"
			MyFrame.one.setOptics(0);
			Menu.opticsMenu.setForeground(new Color(100, 0, 0));
			Menu.optics[5] = 0;
			Menu.opticReminder.setText("Optics: None");
			Menu.opticsCost = 0;
			if (Menu.done[3] == false)
			{
				Menu.addM14OpticMount();
				Menu.done[3] = true;
			}
		}
		else if (e.getSource() == Menu.opticMountBrooksStyle)
		{
			// sets the Opticmount image to "Brooks Style"
			MyFrame.one.setOpticMount(1);
			Menu.opticMountMenu.setForeground(new Color(0, 100, 0));
			Menu.opticMount[5] = 1;
			Menu.opticMountReminder.setText("OpticMount: Brooks Style($50)");
			Menu.opticMountCost = 50;
			if (Menu.done[4] == false)
			{
				Menu.addM14Magazine();
				Menu.done[4] = true;
			}
		}
		else if (e.getSource() == Menu.opticMountBarrelMountedPicatinny)
		{
			// sets the Opticmount image to "Barrel Mounted Picatinny"
			MyFrame.one.setOpticMount(2);
			Menu.opticMountMenu.setForeground(new Color(0, 100, 0));
			Menu.opticMount[5] = 2;
			Menu.opticMountReminder.setText("OpticMount: Barrel Mounted Picatinny($100)");
			Menu.opticMountCost = 100;
			if (Menu.done[4] == false)
			{
				Menu.addM14Magazine();
				Menu.done[4] = true;
			}
		}
		else if (e.getSource() == Menu.opticMountM25)
		{
			// sets the Opticmount image to "M-25"
			MyFrame.one.setOpticMount(3);
			Menu.opticMountMenu.setForeground(new Color(0, 100, 0));
			Menu.opticMount[5] = 3;
			Menu.opticMountReminder.setText("OpticMount: M-25($150)");
			Menu.opticMountCost = 150;
			if (Menu.done[4] == false)
			{
				Menu.addM14Magazine();
				Menu.done[4] = true;
			}
		}
		else if (e.getSource() == Menu.opticMountSocomShort)
		{
			// sets the Opticmount image to "Socom - Short"
			MyFrame.one.setOpticMount(4);
			Menu.opticMountMenu.setForeground(new Color(0, 100, 0));
			Menu.opticMount[5] = 4;
			Menu.opticMountReminder.setText("OpticMount: Socom - Short($200)");
			Menu.opticMountCost = 200;
			if (Menu.done[4] == false)
			{
				Menu.addM14Magazine();
				Menu.done[4] = true;
			}
		}
		else if (e.getSource() == Menu.opticMountSocomExtended)
		{
			// sets the Opticmount image to "Socom - Extended"
			MyFrame.one.setOpticMount(5);
			Menu.opticMountMenu.setForeground(new Color(0, 100, 0));
			Menu.opticMount[5] = 5;
			Menu.opticMountReminder.setText("OpticMount: Socom - Extended($250)");
			Menu.opticMountCost = 250;
			if (Menu.done[4] == false)
			{
				Menu.addM14Magazine();
				Menu.done[4] = true;
			}
		}
		else if (e.getSource() == Menu.opticMountNone)
		{
			// sets the Opticmount Image to "None"
			MyFrame.one.setOpticMount(0);
			Menu.opticMountMenu.setForeground(new Color(100, 0, 0));
			Menu.opticMount[5] = 0;
			Menu.opticMountReminder.setText("OpticMount: None");
			Menu.opticMountCost = 0;
			if (Menu.done[4] == false)
			{
				Menu.addM14Magazine();
				Menu.done[4] = true;
			}
		}
		else if (e.getSource() == Menu.magazine5RD)
		{
			// sets the Magazine image to "5 RD"
			MyFrame.one.setMagazine(1);
			Menu.magazineMenu.setForeground(new Color(0, 100, 0));
			Menu.magazine[5] = 1;
			Menu.magazineReminder.setText("Magazine: 5 RD($50)");
			Menu.magazineCost = 50;
			if (Menu.done[5] == false)
			{
				Menu.addM14Bipod();
				Menu.done[5] = true;
			}
		}
		else if (e.getSource() == Menu.magazine10RD)
		{
			// sets the Magazine image to "10 RD"
			MyFrame.one.setMagazine(2);
			Menu.magazineMenu.setForeground(new Color(0, 100, 0));
			Menu.magazine[5] = 2;
			Menu.magazineReminder.setText("Magazine: 10 RD($100)");
			Menu.magazineCost = 100;
			if (Menu.done[5] == false)
			{
				Menu.addM14Bipod();
				Menu.done[5] = true;
			}
		}
		else if (e.getSource() == Menu.magazine20RD)
		{
			 // sets the Magazine image to "15 RD"
			MyFrame.one.setMagazine(3);
			Menu.magazineMenu.setForeground(new Color(0, 100, 0));
			Menu.magazine[5] = 3;
			Menu.magazineReminder.setText("Magazine: 15 RD($150)");
			Menu.magazineCost = 150;
			if (Menu.done[5] == false)
			{
				Menu.addM14Bipod();
				Menu.done[5] = true;
			}
		}
		else if (e.getSource() == Menu.magazineNone)
		{
			// sets the Magazine image to "15 RD"
			MyFrame.one.setMagazine(0);
			Menu.magazineMenu.setForeground(new Color(100, 0, 0));
			// repaints the Jframe
			Menu.magazine[5] = 0;
			Menu.magazineReminder.setText("Magazine: None");
			Menu.magazineCost = 0;
			if (Menu.done[5] == false)
			{
				Menu.addM14Bipod();
				Menu.done[5] = true;
			}
		}
		else if (e.getSource() == Menu.opticMountNone)
		{
			
		}
		System.out.println(e.getActionCommand());
		System.out.println(e.getModifiers());
		System.out.println(e.getWhen());
		System.out.println(e.getSource());
		// repaints the Jframe
		Menu.RecountMoney();
		MyFrame.RePaint();
		// Calls next menu
    } 

	
}

/**
RUN OUTPUT:

*/