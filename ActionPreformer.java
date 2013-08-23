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
	
		if (e.getSource() == Menu.reset)
		{
			int i;
			// retracts all menus and enables the rifle type selection
			
			Object[] message = { "If you Continue your saves will be deleted.  Click 'ok' to continue"};
			i = MyFrame.PopUpMessage.showConfirmDialog(null, message, "Attention", MyFrame.PopUpMessage.OK_CANCEL_OPTION);
			
			if (i == JOptionPane.OK_OPTION)
			{ 
				while (1 < Menu.menuBar.getMenuCount())
				{
					Menu.menuBar.remove(1);
				}
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = false;
				}
				for (i = 0; i < Menu.NumberSaveFiles; i++)
				{
					Menu.rifleType[i] = 0;
					Menu.actionType[i] = 0;
					Menu.barrelLenght[i] = 0;
					Menu.optics[i] = 0;
					Menu.opticMount[i] = 0;
					Menu.magazine[i] = 0;
					Menu.bipod[i] = 0;
					Menu.monopod[i] = 0;
					Menu.chassisColor[i] = 0;
					Menu.gripColor[i] = 0;
				}
				Menu.rifleTypeCost = 0;
				Menu.actionTypeCost = 0;
				Menu.barrelLenghtCost = 0;
				Menu.opticsCost = 0;
				Menu.opticMountCost = 0;
				Menu.magazineCost = 0;
				Menu.bipodCost = 0;
				Menu.monopodCost = 0;
				Menu.chassisColorCost = 0;
				Menu.gripColorCost = 0;
				Menu.RecountMoney();
				Menu.actionTypeReminder.setText("");
				Menu.barrelLenghtReminder.setText("");
				Menu.opticReminder.setText("");
				Menu.opticMountReminder.setText("");
				Menu.magazineReminder.setText("");
				Menu.bipodReminder.setText("");
				Menu.monopodReminder.setText("");
				Menu.chassisColorReminder.setText("");
				Menu.gripColorReminder.setText("");
				MyFrame.one.setRifleType(0);
				MyFrame.one.setActionType(0);
				MyFrame.one.setBarrelLenght(0);
				MyFrame.one.setOptics(0);
				MyFrame.one.setOpticMount(0);
				MyFrame.one.setMagazine(0);
				MyFrame.one.setBipod(0);
				MyFrame.one.setMonopod(0);
				MyFrame.one.setChassisColor(0);
				MyFrame.one.setGripColor(0);
				
			}
		}
		else if (e.getSource() == Menu.rifleTypeM14)
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
			Menu.magazine[5] = 0;
			Menu.magazineReminder.setText("Magazine: None");
			Menu.magazineCost = 0;
			if (Menu.done[5] == false)
			{
				Menu.addM14Bipod();
				Menu.done[5] = true;
			}
		}
		else if (e.getSource() == Menu.bipodHarris)
		{
			// sets the Bipod image to "Harris"
			MyFrame.one.setBipod(1);
			Menu.bipodMenu.setForeground(new Color(0, 100, 0));
			Menu.bipod[5] = 1;
			Menu.bipodReminder.setText("Bipod: Harris($50)");
			Menu.bipodCost = 50;
			if (Menu.done[6] == false)
			{
				Menu.addM14Monopod();
				Menu.done[6] = true;
			}
		}
		else if (e.getSource() == Menu.bipodGGG)
		{
			// sets the Bipod image to "GG&G"
			MyFrame.one.setBipod(2);
			Menu.bipodMenu.setForeground(new Color(0, 100, 0));
			Menu.bipod[5] = 2;
			Menu.bipodReminder.setText("Bipod: GG&G($100)");
			Menu.bipodCost = 100;
			if (Menu.done[6] == false)
			{
				Menu.addM14Monopod();
				Menu.done[6] = true;
			}
		}
		else if (e.getSource() == Menu.bipodAtlas)
		{
			// sets the Bipod image to "Atlas"
			MyFrame.one.setBipod(3);
			Menu.bipodMenu.setForeground(new Color(0, 100, 0));
			Menu.bipod[5] = 3;
			Menu.bipodReminder.setText("Bipod: Atlas($150)");
			Menu.bipodCost = 150;
			if (Menu.done[6] == false)
			{
				Menu.addM14Monopod();
				Menu.done[6] = true;
			}
		}
		else if (e.getSource() == Menu.bipodNone)
		{
			// sets the Bipod image to None
			MyFrame.one.setBipod(0);
			Menu.bipodMenu.setForeground(new Color(100, 0, 0));
			Menu.bipod[5] = 0;
			Menu.bipodReminder.setText("Bipod: None");
			Menu.bipodCost = 0;
			if (Menu.done[6] == false)
			{
				Menu.addM14Monopod();
				Menu.done[6] = true;
			}
		}
		else if (e.getSource() == Menu.monopodBT)
		{
			// sets the Monopod image to "BT"
			MyFrame.one.setMonopod(1);
			Menu.monopodMenu.setForeground(new Color(0, 100, 0));
			Menu.monopod[5] = 1;
			Menu.monopodReminder.setText("Monopod: BT($50)");
			Menu.monopodCost = 50;
			if (Menu.done[7] == false)
			{
			Menu.addM14ChassisColor();
			Menu.done[7] = true;
			}
		}
		else if (e.getSource() == Menu.monopodNone)
		{
			// sets the Monopod image to "None"
			MyFrame.one.setMonopod(0);
			Menu.monopodMenu.setForeground(new Color(100, 0, 0));
			Menu.monopod[5] = 0;
			Menu.monopodReminder.setText("Monopod: None");
			Menu.monopodCost = 0;
			if (Menu.done[7] == false)
			{
				Menu.addM14ChassisColor();
				Menu.done[7] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorBallisticWhite)
		{
			// sets the ChassisColor image to "Ballistic White"
			MyFrame.one.setChassisColor(1);
			Menu.chassisColorMenu.setForeground(new Color(0, 100, 0));
			Menu.chassisColor[5] = 1;
			Menu.chassisColorReminder.setText("ChassisColor: Ballistic White($5000)");
			Menu.chassisColorCost = 5000;
		
			// Calls next menu
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorGritTan)
		{
			// sets the ChassisColor image to "Grit Tan"
			MyFrame.one.setChassisColor(2);
			Menu.chassisColorMenu.setForeground(new Color(0, 100, 0));
			Menu.chassisColor[5] = 2;
			Menu.chassisColorReminder.setText("ChassisColor: Grit Tan($100)");
			Menu.chassisColorCost = 100;
			// Calls next menu
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorCoyoteBrown)
		{
			// sets the ChassisColor image to "Coyote Brown"
			MyFrame.one.setChassisColor(3);
			Menu.chassisColorMenu.setForeground(new Color(0, 100, 0));
			Menu.chassisColor[5] = 3;
			Menu.chassisColorReminder.setText("ChassisColor: Coyote Brown($150)");
			Menu.chassisColorCost = 150;
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorDarkEarth)
		{
			// sets the ChassisColor image to "Dark Earth"
			MyFrame.one.setChassisColor(4);
			Menu.chassisColorMenu.setForeground(new Color(0, 100, 0));
			Menu.chassisColor[5] = 4;
			Menu.chassisColorReminder.setText("ChassisColor: Dark Earth($200)");
			Menu.chassisColorCost = 200;
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorOliveDrab)
		{
			// sets the ChassisColor image to "Olive Drab"
			MyFrame.one.setChassisColor(5);
			Menu.chassisColorMenu.setForeground(new Color(0, 100, 0));
			Menu.chassisColor[5] = 5;
			Menu.chassisColorReminder.setText("ChassisColor: Olive Drab($250)");
			Menu.chassisColorCost = 250;
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorLowLightGreen)
		{
			// sets the ChassisColor image to "Lowlight Green"
			MyFrame.one.setChassisColor(6);
			Menu.chassisColorMenu.setForeground(new Color(0, 100, 0));
			Menu.chassisColor[5] = 6;
			Menu.chassisColorReminder.setText("ChassisColor: Lowlight Green($275)");
			Menu.chassisColorCost = 275;
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorSwatBlack)
		{
			// sets the ChassisColor image to "Swat Black"
			MyFrame.one.setChassisColor(7);
			Menu.chassisColorMenu.setForeground(new Color(0, 100, 0));
			Menu.chassisColor[5] = 7;
			Menu.chassisColorReminder.setText("ChassisColor: Swat Black($300)");
			Menu.chassisColorCost = 300;
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorGIBrown)
		{
			// sets the ChassisColor image to "GI Brown"
			MyFrame.one.setChassisColor(8);
			Menu.chassisColorMenu.setForeground(new Color(0, 100, 0));
			Menu.chassisColor[5] = 8;
			Menu.chassisColorReminder.setText("ChassisColor: GI Brown($350)");
			Menu.chassisColorCost = 350;
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.chassisColorNone)
		{
			// sets the ChassisColor image to "GI Brown"
			MyFrame.one.setChassisColor(0);
			Menu.chassisColorMenu.setForeground(new Color(100, 0, 0));
			Menu.chassisColor[5] = 0;
			Menu.chassisColorReminder.setText("ChassisColor: None");
			Menu.chassisColorCost = 0;
			if (Menu.done[8] == false)
			{
				Menu.addM14GripColor();
				Menu.done[8] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorBallisticWhite)
		{
			// sets the GripColor image to "Ballistic White"
			MyFrame.one.setGripColor(1);
			Menu.gripColorMenu.setForeground(new Color(0, 100, 0));
			Menu.gripColor[5] = 1;
			Menu.gripColorReminder.setText("GripColor: Ballistic White($50)");
			Menu.gripColorCost = 50;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorGritTan)
		{
			// sets the GripColor image to "Grit Tan"
			MyFrame.one.setGripColor(2);
			Menu.gripColorMenu.setForeground(new Color(0, 100, 0));
			Menu.gripColor[5] = 2;
			Menu.gripColorReminder.setText("GripColor: Grit Tan($100)");
			Menu.gripColorCost = 100;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorCoyoteBrown)
		{
			// sets the GripColor image to "Coyote Brown"
			MyFrame.one.setGripColor(3);
			Menu.gripColorMenu.setForeground(new Color(0, 100, 0));
			Menu.gripColor[5] = 3;
			Menu.gripColorReminder.setText("GripColor: Coyote Brown($150)");
			Menu.gripColorCost = 150;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorDarkEarth)
		{
			// sets the GripColor image to "Dark Earth"
			MyFrame.one.setGripColor(4);
			Menu.gripColorMenu.setForeground(new Color(0, 100, 0));
			Menu.gripColor[5] = 4;
			Menu.gripColorReminder.setText("GripColor: Dark Earth($200)");
			Menu.gripColorCost = 200;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorOliveDrab)
		{
			// sets the GripColor image to "Olive Drab"
			MyFrame.one.setGripColor(5);
			Menu.gripColorMenu.setForeground(new Color(0, 100, 0));
			Menu.gripColor[5] = 5;
			Menu.gripColorReminder.setText("GripColor: Olive Drab($250)");
			Menu.gripColorCost = 250;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorLowLightGreen)
		{
			// sets the GripColor image to "Lowlight Green"
			MyFrame.one.setGripColor(6);
			Menu.gripColorMenu.setForeground(new Color(0, 100, 0));
			Menu.gripColor[5] = 6;
			Menu.gripColorReminder.setText("GripColor: Lowlight Green($300)");
			Menu.gripColorCost = 300;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorSwatBlack)
		{
			// sets the GripColor image to "Swat Black"
			MyFrame.one.setGripColor(7);
			Menu.gripColorMenu.setForeground(new Color(0, 100, 0));
			Menu.gripColor[5] = 7;
			Menu.gripColorReminder.setText("GripColor: Swat Black($350)");
			Menu.gripColorCost = 350;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorGIBrown)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setGripColor(8);
			Menu.gripColorMenu.setForeground(new Color(0, 100, 0));
			Menu.gripColor[5] = 8;
			Menu.gripColorReminder.setText("GripColor: GI Brown($400)");
			Menu.gripColorCost = 400;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.gripColorNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setGripColor(0);
			Menu.gripColorMenu.setForeground(new Color(100, 0, 0));
			Menu.gripColor[5] = 0;
			Menu.gripColorReminder.setText("GripColor: None");
			Menu.gripColorCost = 0;
			if (Menu.done[9] == false)
			{
				Menu.addCheekRestType();
				Menu.done[9] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorBW)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(1);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 1;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorGT)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(2);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 2;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorCB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(3);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 3;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorDE)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(4);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 4;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorOD)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(5);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 5;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorSB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(6);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 6;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorLG)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(7);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 7;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorGIB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(8);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 8;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorBW)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(9);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 9;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorGT)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(10);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 10;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorCB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(11);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 11;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorDE)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(12);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 12;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorOD)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(13);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 13;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorLG)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(14);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 14;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorSB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(15);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 15;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorGIB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(16);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 16;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorBW)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(17);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 17;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorGT)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(18);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 18;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorCB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(19);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 19;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorDE)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(20);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 20;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorOD)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(21);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 21;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorLG)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(22);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 22;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorSB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(23);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 23;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorGIB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(24);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 24;
			Menu.cheekRestTypeReminder.setText("GripColor: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.cheekRestTypeNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setCheekRestType(0);
			Menu.cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
			Menu.cheekRestType[5] = 0;
			Menu.cheekRestTypeReminder.setText("CheekRestType: None");
			Menu.cheekRestTypeCost = 0;
			if (Menu.done[10] == false)
			{
				Menu.addButtPad();
				Menu.done[10] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadSpacerColorBW)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(1);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 1;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadSpacerColorGT)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(2);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 2;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadSpacerColorCB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(3);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 3;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadSpacerColorDE)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(4);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 4;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadSpacerColorOD)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(5);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 5;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadSpacerColorLG)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(6);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 6;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadSpacerColorSB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(7);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 7;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadSpacerColorGIB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(8);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 8;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttPadNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtPad(0);
			Menu.buttPadMenu.setForeground(new Color(100, 0, 0));
			Menu.buttPad[5] = 0;
			Menu.buttPadReminder.setText("ButtPadSpacerColor: None");
			Menu.buttPadCost = 0;
			if (Menu.done[11] == false)
			{
				Menu.addButtSpacer();
				Menu.done[11] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ1)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(1);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 1;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ2)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(2);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 2;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ3)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(3);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 3;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ4)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(4);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 4;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ5)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(5);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 5;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ6)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(6);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 6;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ7)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(7);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 7;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ8)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(8);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 8;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQ9)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(9);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 9;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.buttSpacerQNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setButtSpacer(0);
			Menu.buttSpacerMenu.setForeground(new Color(100, 0, 0));
			Menu.buttSpacer[5] = 0;
			Menu.buttSpacerReminder.setText("ButtPadSpacerColor: None");
			Menu.buttSpacerCost = 0;
			if (Menu.done[12] == false)
			{
				Menu.addPalmRest();
				Menu.done[12] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestColorBW)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(1);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 1;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestColorGT)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(2);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 2;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestColorCB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(3);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 3;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestColorDE)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(4);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 4;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestColorOD)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(5);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 5;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestColorLG)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(6);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 6;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestColorSB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(7);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 7;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestColorGIB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(8);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 8;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.palmRestNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setPalmRest(0);
			Menu.palmRestMenu.setForeground(new Color(100, 0, 0));
			Menu.palmRest[5] = 0;
			Menu.palmRestReminder.setText("PalmRest: None");
			Menu.palmRestCost = 0;
			if (Menu.done[13] == false)
			{
				Menu.addOffHandRest();
				Menu.done[13] = true;
			}
		}
		else if (e.getSource() == Menu.offHandRestYes)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setOffHandRest(1);
			Menu.offHandRestMenu.setForeground(new Color(100, 0, 0));
			Menu.offHandRest[5] = 1;
			Menu.offHandRestReminder.setText("OffHandRest: Yes");
			Menu.offHandRestCost = 0;
			if (Menu.done[14] == false)
			{
				Menu.addHandGuard();
				Menu.done[14] = true;
			}
		}
		else if (e.getSource() == Menu.offHandRestNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setOffHandRest(0);
			Menu.offHandRestMenu.setForeground(new Color(100, 0, 0));
			Menu.offHandRest[5] = 0;
			Menu.offHandRestReminder.setText("OffHandRest: None");
			Menu.offHandRestCost = 0;
			if (Menu.done[14] == false)
			{
				Menu.addHandGuard();
				Menu.done[14] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardStandardColorBW)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(1);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 1;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardStandardColorGT)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(2);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 2;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardStandardColorCB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(3);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 3;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardStandardColorDE)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(4);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 4;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardStandardColorOD)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(5);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 5;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardStandardColorLG)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(6);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 6;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardStandardColorSB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(7);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 7;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardStandardColorGIB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(8);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 8;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardVentedColorBW)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(9);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 9;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardVentedColorGT)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(10);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 10;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardVentedColorCB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(11);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 11;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardVentedColorDE)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(12);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 12;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardVentedColorOD)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(13);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 13;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardVentedColorLG)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(14);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 14;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardVentedColorSB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(15);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 15;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardVentedColorGIB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(16);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 16;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardCutoutColorBW)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(17);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 17;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardCutoutColorGT)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(18);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 18;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardCutoutColorCB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(19);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 19;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardCutoutColorDE)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(20);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 20;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardCutoutColorOD)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(21);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 21;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardCutoutColorLG)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(22);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 22;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardCutoutColorSB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(23);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 23;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardCutoutColorGIB)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(24);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 24;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.handGuardNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setHandGuard(25);
			Menu.handGuardMenu.setForeground(new Color(100, 0, 0));
			Menu.handGuard[5] = 25;
			Menu.handGuardReminder.setText("HandGuard: None");
			Menu.handGuardCost = 0;
			if (Menu.done[15] == false)
			{
				Menu.addSlingPlate();
				Menu.done[15] = true;
			}
		}
		else if (e.getSource() == Menu.slingPlateYes)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSlingPlate(1);
			Menu.slingPlateMenu.setForeground(new Color(100, 0, 0));
			Menu.slingPlate[5] = 1;
			Menu.slingPlateReminder.setText("SlingPlate: Yes");
			Menu.slingPlateCost = 0;
			if (Menu.done[16] == false)
			{
				Menu.addFlushRail();
				Menu.done[16] = true;
			}
		}
		else if (e.getSource() == Menu.slingPlateNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSlingPlate(0);
			Menu.slingPlateMenu.setForeground(new Color(100, 0, 0));
			Menu.slingPlate[5] = 0;
			Menu.slingPlateReminder.setText("SlingPlate: None");
			Menu.slingPlateCost = 0;
			if (Menu.done[16] == false)
			{
				Menu.addFlushRail();
				Menu.done[16] = true;
			}
		}
		else if (e.getSource() == Menu.flushRailYes)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setFlushRail(1);
			Menu.flushRailMenu.setForeground(new Color(100, 0, 0));
			Menu.flushRail[5] = 1;
			Menu.flushRailReminder.setText("FlushRail: Yes");
			Menu.flushRailCost = 0;
			if (Menu.done[17] == false)
			{
				Menu.addSideRailAdapter();
				Menu.done[17] = true;
			}
		}
		else if (e.getSource() == Menu.flushRailNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setFlushRail(0);
			Menu.flushRailMenu.setForeground(new Color(100, 0, 0));
			Menu.flushRail[5] = 0;
			Menu.flushRailReminder.setText("FlushRail: None");
			Menu.flushRailCost = 0;
			if (Menu.done[17] == false)
			{
				Menu.addSideRailAdapter();
				Menu.done[17] = true;
			}
		}
		else if (e.getSource() == Menu.sideRailAdaptersYes)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSideRailAdapters(1);
			Menu.sideRailAdaptersMenu.setForeground(new Color(100, 0, 0));
			Menu.sideRailAdapters[5] = 1;
			Menu.sideRailAdaptersReminder.setText("sideRailAdapters: Yes");
			Menu.sideRailAdaptersCost = 0;
			if (Menu.done[18] == false)
			{
				Menu.addSidePicatinnyRail();
				Menu.done[18] = true;
			}
		}
		else if (e.getSource() == Menu.sideRailAdaptersNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSideRailAdapters(0);
			Menu.sideRailAdaptersMenu.setForeground(new Color(100, 0, 0));
			Menu.sideRailAdapters[5] = 0;
			Menu.sideRailAdaptersReminder.setText("sideRailAdapters: None");
			Menu.sideRailAdaptersCost = 0;
			if (Menu.done[18] == false)
			{
				Menu.addSidePicatinnyRail();
				Menu.done[18] = true;
			}
		}
		else if (e.getSource() == Menu.sidePicatinnyRail2inch1)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSidePicatinnyRail(1);
			Menu.sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.sidePicatinnyRail[5] = 1;
			Menu.sidePicatinnyRailReminder.setText("sideRailAdapters: None");
			Menu.sidePicatinnyRailCost = 0;
			if (Menu.done[19] == false)
			{
				Menu.addBottomPicatinnyRail();
				Menu.done[19] = true;
			}
		}
		else if (e.getSource() == Menu.sidePicatinnyRail2inch2)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSidePicatinnyRail(2);
			Menu.sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.sidePicatinnyRail[5] = 2;
			Menu.sidePicatinnyRailReminder.setText("sideRailAdapters: None");
			Menu.sidePicatinnyRailCost = 0;
			if (Menu.done[19] == false)
			{
				Menu.addBottomPicatinnyRail();
				Menu.done[19] = true;
			}
		}
		else if (e.getSource() == Menu.sidePicatinnyRail4inch1)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSidePicatinnyRail(3);
			Menu.sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.sidePicatinnyRail[5] = 3;
			Menu.sidePicatinnyRailReminder.setText("sideRailAdapters: None");
			Menu.sidePicatinnyRailCost = 0;
			if (Menu.done[19] == false)
			{
				Menu.addBottomPicatinnyRail();
				Menu.done[19] = true;
			}
		}
		else if (e.getSource() == Menu.sidePicatinnyRail4inch2)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSidePicatinnyRail(4);
			Menu.sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.sidePicatinnyRail[5] = 4;
			Menu.sidePicatinnyRailReminder.setText("sideRailAdapters: None");
			Menu.sidePicatinnyRailCost = 0;
			if (Menu.done[19] == false)
			{
				Menu.addBottomPicatinnyRail();
				Menu.done[19] = true;
			}
		}
		else if (e.getSource() == Menu.sidePicatinnyRail6inch1)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSidePicatinnyRail(5);
			Menu.sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.sidePicatinnyRail[5] = 5;
			Menu.sidePicatinnyRailReminder.setText("sideRailAdapters: None");
			Menu.sidePicatinnyRailCost = 0;
			if (Menu.done[19] == false)
			{
				Menu.addBottomPicatinnyRail();
				Menu.done[19] = true;
			}
		}
		else if (e.getSource() == Menu.sidePicatinnyRail6inch2)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSidePicatinnyRail(6);
			Menu.sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.sidePicatinnyRail[5] = 6;
			Menu.sidePicatinnyRailReminder.setText("sideRailAdapters: None");
			Menu.sidePicatinnyRailCost = 0;
			if (Menu.done[19] == false)
			{
				Menu.addBottomPicatinnyRail();
				Menu.done[19] = true;
			}
		}
		else if (e.getSource() == Menu.sidePicatinnyRail9inch1)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSidePicatinnyRail(7);
			Menu.sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.sidePicatinnyRail[5] = 7;
			Menu.sidePicatinnyRailReminder.setText("sideRailAdapters: None");
			Menu.sidePicatinnyRailCost = 0;
			if (Menu.done[19] == false)
			{
				Menu.addBottomPicatinnyRail();
				Menu.done[19] = true;
			}
		}
		else if (e.getSource() == Menu.sidePicatinnyRail9inch2)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setSidePicatinnyRail(8);
			Menu.sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.sidePicatinnyRail[5] = 8;
			Menu.sidePicatinnyRailReminder.setText("sideRailAdapters: None");
			Menu.sidePicatinnyRailCost = 0;
			if (Menu.done[19] == false)
			{
				Menu.addBottomPicatinnyRail();
				Menu.done[19] = true;
			}
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail2inch)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBottomPicatinnyRail(1);
			Menu.bottomPicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.bottomPicatinnyRail[5] = 1;
			Menu.bottomPicatinnyRailReminder.setText("BottomPicatinnyRail: None");
			Menu.bottomPicatinnyRailCost = 0;
			if (Menu.done[20] == false)
			{
				Menu.addBipodAdapter();
				Menu.done[20] = true;
			}
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail4inch)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBottomPicatinnyRail(2);
			Menu.bottomPicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.bottomPicatinnyRail[5] = 2;
			Menu.bottomPicatinnyRailReminder.setText("BottomPicatinnyRail: None");
			Menu.bottomPicatinnyRailCost = 0;
			if (Menu.done[20] == false)
			{
				Menu.addBipodAdapter();
				Menu.done[20] = true;
			}
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail6inch)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBottomPicatinnyRail(3);
			Menu.bottomPicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.bottomPicatinnyRail[5] = 3;
			Menu.bottomPicatinnyRailReminder.setText("BottomPicatinnyRail: None");
			Menu.bottomPicatinnyRailCost = 0;
			if (Menu.done[20] == false)
			{
				Menu.addBipodAdapter();
				Menu.done[20] = true;
			}
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail9inch)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBottomPicatinnyRail(4);
			Menu.bottomPicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.bottomPicatinnyRail[5] = 4;
			Menu.bottomPicatinnyRailReminder.setText("BottomPicatinnyRail: None");
			Menu.bottomPicatinnyRailCost = 0;
			if (Menu.done[20] == false)
			{
				Menu.addBipodAdapter();
				Menu.done[20] = true;
			}
		}
		else if (e.getSource() == Menu.bottomPicatinnyRailNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBottomPicatinnyRail(0);
			Menu.bottomPicatinnyRailMenu.setForeground(new Color(100, 0, 0));
			Menu.bottomPicatinnyRail[5] = 0;
			Menu.bottomPicatinnyRailReminder.setText("BottomPicatinnyRail: None");
			Menu.bottomPicatinnyRailCost = 0;
			if (Menu.done[20] == false)
			{
				Menu.addBipodAdapter();
				Menu.done[20] = true;
			}
		}
		else if (e.getSource() == Menu.bipodAdapterYes)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBipodAdapter(1);
			Menu.bipodAdapterMenu.setForeground(new Color(100, 0, 0));
			Menu.bipodAdapter[5] = 1;
			Menu.bipodAdapterReminder.setText("BipodAdapter: Yes");
			Menu.bipodAdapterCost = 0;
			if (Menu.done[21] == false)
			{
				Menu.addLugSlide();
				Menu.done[21] = true;
			}
		}
		else if (e.getSource() == Menu.bipodAdapterNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBipodAdapter(0);
			Menu.bipodAdapterMenu.setForeground(new Color(100, 0, 0));
			Menu.bipodAdapter[5] = 0;
			Menu.bipodAdapterReminder.setText("BipodAdapter: None");
			Menu.bipodAdapterCost = 0;
			if (Menu.done[21] == false)
			{
				Menu.addLugSlide();
				Menu.done[21] = true;
			}
		}
		else if (e.getSource() == Menu.lugSlideStandard)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setLugSlide(1);
			Menu.lugSlideMenu.setForeground(new Color(100, 0, 0));
			Menu.lugSlide[5] = 1;
			Menu.lugSlideReminder.setText("LugSlide: None");
			Menu.lugSlideCost = 0;
			if (Menu.done[22] == false)
			{
				Menu.addBarrelTensioner();
				Menu.done[22] = true;
			}
		}
		else if (e.getSource() == Menu.lugSlideTitanium)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setLugSlide(2);
			Menu.lugSlideMenu.setForeground(new Color(100, 0, 0));
			Menu.lugSlide[5] = 2;
			Menu.lugSlideReminder.setText("LugSlide: None");
			Menu.lugSlideCost = 0;
			if (Menu.done[22] == false)
			{
				Menu.addBarrelTensioner();
				Menu.done[22] = true;
			}
		}
		else if (e.getSource() == Menu.lugSlideNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setLugSlide(0);
			Menu.lugSlideMenu.setForeground(new Color(100, 0, 0));
			Menu.lugSlide[5] = 0;
			Menu.lugSlideReminder.setText("LugSlide: None");
			Menu.lugSlideCost = 0;
			if (Menu.done[22] == false)
			{
				Menu.addBarrelTensioner();
				Menu.done[22] = true;
			}
		}
		else if (e.getSource() == Menu.barrelTensionerYes)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBarrelTensioner(1);
			Menu.barrelTensionerMenu.setForeground(new Color(100, 0, 0));
			Menu.barrelTensioner[5] = 1;
			Menu.barrelTensionerReminder.setText("BarrelTensioner: Yes");
			Menu.barrelTensionerCost = 0;
			if (Menu.done[23] == false)
			{
				Menu.addQDSlingSwivels();
				Menu.done[23] = true;
			}
		}
		else if (e.getSource() == Menu.barrelTensionerNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setBarrelTensioner(0);
			Menu.barrelTensionerMenu.setForeground(new Color(100, 0, 0));
			Menu.barrelTensioner[5] = 0;
			Menu.barrelTensionerReminder.setText("BarrelTensioner: None");
			Menu.barrelTensionerCost = 0;
			if (Menu.done[23] == false)
			{
				Menu.addQDSlingSwivels();
				Menu.done[23] = true;
			}
		}
		else if (e.getSource() == Menu.QDSlingSwivelsYes)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setQDSlingSwivels(1);
			Menu.QDSlingSwivelsMenu.setForeground(new Color(100, 0, 0));
			Menu.QDSlingSwivels[5] = 1;
			Menu.QDSlingSwivelsReminder.setText("BarrelTensioner: None");
			Menu.QDSlingSwivelsCost = 0;
		}
		else if (e.getSource() == Menu.QDSlingSwivelsNone)
		{
			// sets the GripColor image to "GI Brown"
			MyFrame.one.setQDSlingSwivels(0);
			Menu.QDSlingSwivelsMenu.setForeground(new Color(100, 0, 0));
			Menu.QDSlingSwivels[5] = 0;
			Menu.QDSlingSwivelsReminder.setText("BarrelTensioner: None");
			Menu.QDSlingSwivelsCost = 0;
		}
		else if (e.getSource() == Menu.save[0])
		{
			Menu.rifleType[0] = MyFrame.one.getRifleType();
			Menu.actionType[0] = MyFrame.one.getActionType();
			Menu.barrelLenght[0] = MyFrame.one.getBarrelLenght();
			Menu.optics[0] = MyFrame.one.getOptics();
			Menu.opticMount[0] = MyFrame.one.getOpticMount();
			Menu.magazine[0] = MyFrame.one.getMagazine();
			Menu.bipod[0] = MyFrame.one.getBipod();
			Menu.monopod[0] = MyFrame.one.getMonopod();
			Menu.chassisColor[0] = MyFrame.one.getChassisColor();
			Menu.gripColor[0] = MyFrame.one.getGripColor();
		}
		else if (e.getSource() == Menu.save[1])
		{
			Menu.rifleType[1] = MyFrame.one.getRifleType();
			Menu.actionType[1] = MyFrame.one.getActionType();
			Menu.barrelLenght[1] = MyFrame.one.getBarrelLenght();
			Menu.optics[1] = MyFrame.one.getOptics();
			Menu.opticMount[1] = MyFrame.one.getOpticMount();
			Menu.magazine[1] = MyFrame.one.getMagazine();
			Menu.bipod[1] = MyFrame.one.getBipod();
			Menu.monopod[1] = MyFrame.one.getMonopod();
			Menu.chassisColor[1] = MyFrame.one.getChassisColor();
			Menu.gripColor[1] = MyFrame.one.getGripColor();
		}
		else if (e.getSource() == Menu.save[2])
		{
			Menu.rifleType[2] = MyFrame.one.getRifleType();
			Menu.actionType[2] = MyFrame.one.getActionType();
			Menu.barrelLenght[2] = MyFrame.one.getBarrelLenght();
			Menu.optics[2] = MyFrame.one.getOptics();
			Menu.opticMount[2] = MyFrame.one.getOpticMount();
			Menu.magazine[2] = MyFrame.one.getMagazine();
			Menu.bipod[2] = MyFrame.one.getBipod();
			Menu.monopod[2] = MyFrame.one.getMonopod();
			Menu.chassisColor[2] = MyFrame.one.getChassisColor();
			Menu.gripColor[2] = MyFrame.one.getGripColor();
		}
		else if (e.getSource() == Menu.save[3])
		{
			Menu.rifleType[3] = MyFrame.one.getRifleType();
			Menu.actionType[3] = MyFrame.one.getActionType();
			Menu.barrelLenght[3] = MyFrame.one.getBarrelLenght();
			Menu.optics[3] = MyFrame.one.getOptics();
			Menu.opticMount[3] = MyFrame.one.getOpticMount();
			Menu.magazine[3] = MyFrame.one.getMagazine();
			Menu.bipod[3] = MyFrame.one.getBipod();
			Menu.monopod[3] = MyFrame.one.getMonopod();
			Menu.chassisColor[3] = MyFrame.one.getChassisColor();
			Menu.gripColor[3] = MyFrame.one.getGripColor();
		}
		else if (e.getSource() == Menu.save[4])
		{
			Menu.rifleType[4] = MyFrame.one.getRifleType();
			Menu.actionType[4] = MyFrame.one.getActionType();
			Menu.barrelLenght[4] = MyFrame.one.getBarrelLenght();
			Menu.optics[4] = MyFrame.one.getOptics();
			Menu.opticMount[4] = MyFrame.one.getOpticMount();
			Menu.magazine[4] = MyFrame.one.getMagazine();
			Menu.bipod[4] = MyFrame.one.getBipod();
			Menu.monopod[4] = MyFrame.one.getMonopod();
			Menu.chassisColor[4] = MyFrame.one.getChassisColor();
			Menu.gripColor[4] = MyFrame.one.getGripColor();
		}
		else if (e.getSource() == Menu.load[0])
		{
			MyFrame.one.setRifleType(Menu.rifleType[0]);
			MyFrame.one.setActionType(Menu.actionType[0]);
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[0]);
			MyFrame.one.setOptics(Menu.optics[0]);
			MyFrame.one.setOpticMount(Menu.opticMount[0]);
			MyFrame.one.setMagazine(Menu.magazine[0]);
			MyFrame.one.setBipod(Menu.bipod[0]);
			MyFrame.one.setMonopod(Menu.monopod[0]);
			MyFrame.one.setChassisColor(Menu.chassisColor[0]);
			MyFrame.one.setGripColor(Menu.gripColor[0]);
		}
		else if (e.getSource() == Menu.load[1])
		{
			MyFrame.one.setRifleType(Menu.rifleType[1]);
			MyFrame.one.setActionType(Menu.actionType[1]);
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[1]);
			MyFrame.one.setOptics(Menu.optics[1]);
			MyFrame.one.setOpticMount(Menu.opticMount[1]);
			MyFrame.one.setMagazine(Menu.magazine[1]);
			MyFrame.one.setBipod(Menu.bipod[1]);
			MyFrame.one.setMonopod(Menu.monopod[1]);
			MyFrame.one.setChassisColor(Menu.chassisColor[1]);
			MyFrame.one.setGripColor(Menu.gripColor[1]);
		}
		else if (e.getSource() == Menu.load[2])
		{
			MyFrame.one.setRifleType(Menu.rifleType[2]);
			MyFrame.one.setActionType(Menu.actionType[2]);
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[2]);
			MyFrame.one.setOptics(Menu.optics[2]);
			MyFrame.one.setOpticMount(Menu.opticMount[2]);
			MyFrame.one.setMagazine(Menu.magazine[2]);
			MyFrame.one.setBipod(Menu.bipod[2]);
			MyFrame.one.setMonopod(Menu.monopod[2]);
			MyFrame.one.setChassisColor(Menu.chassisColor[2]);
			MyFrame.one.setGripColor(Menu.gripColor[2]);
		}
		else if (e.getSource() == Menu.load[3])
		{
			MyFrame.one.setRifleType(Menu.rifleType[3]);
			MyFrame.one.setActionType(Menu.actionType[3]);
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[3]);
			MyFrame.one.setOptics(Menu.optics[3]);
			MyFrame.one.setOpticMount(Menu.opticMount[3]);
			MyFrame.one.setMagazine(Menu.magazine[3]);
			MyFrame.one.setBipod(Menu.bipod[3]);
			MyFrame.one.setMonopod(Menu.monopod[3]);
			MyFrame.one.setChassisColor(Menu.chassisColor[3]);
			MyFrame.one.setGripColor(Menu.gripColor[3]);
		}
		else if (e.getSource() == Menu.load[4])
		{
			MyFrame.one.setRifleType(Menu.rifleType[4]);
			MyFrame.one.setActionType(Menu.actionType[4]);
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[4]);
			MyFrame.one.setOptics(Menu.optics[4]);
			MyFrame.one.setOpticMount(Menu.opticMount[4]);
			MyFrame.one.setMagazine(Menu.magazine[4]);
			MyFrame.one.setBipod(Menu.bipod[4]);
			MyFrame.one.setMonopod(Menu.monopod[4]);
			MyFrame.one.setChassisColor(Menu.chassisColor[4]);
			MyFrame.one.setGripColor(Menu.gripColor[4]);
		}
		else if (e.getSource() == Menu.brandLRBM25)
		{
			
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD OR REAR LUG ~ (IMAGE AND BALOON NOTE)
			
			//* BARREL - 20 INCH ~ (IMAGE)
			
			//* MAGAZINE - 20 RD ~ (IMAGE)
			
			//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)
			
			//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 050;
			Menu.RecountMoney();
			if (Menu.done[0] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
		}
		else if (e.getSource() == Menu.brandLRBM14)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD OR REAR LUG ~ (IMAGE AND BALOON NOTE)
			
			//* BARREL - 20 INCH ~ (IMAGE)
			
			//* MAGAZINE - 20 RD ~ (IMAGE)
			
			//* GAS SYSTEM - Non-UNITIZED ~ (BALLOON NOTE)
			
			//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandSpringfieldSupermatchM1A)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - REAR LUG ~ (IMAGE)
			
			//* BARREL - 20 INCH ~ (IMAGE)
			
			//* MAGAZINE - 20 RD ~ (IMAGE)
			
			//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandSpringfieldNationalM1A)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandSpringfieldM25Whitefeather)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - REAR LUG ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)

			//* OPTIC MOUNT - M25 ~ (IMAGE)
		}
		else if (e.getSource() == Menu.brandSpringfieldM21Tactical)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandSpringfieldLoadedM1A)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandSpringfieldStandardM1A)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandSpringfieldScoutM1A)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 18 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandSpringfieldSocomII)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 16 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)

			//* OPTIC MOUNT - SOCOM11 TOP RAIL ~ (IMAGE AND BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandSpringfieldSocom16)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
									
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 16 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandArmscorp)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandNorinco)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandPolytech)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - STANDARD ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.brandUSGISelectfire)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
			// Set rifle type to Othergun
			//* RECEIVER - SELCETFIRE ~ (IMAGE)

			//* BARREL - 20 INCH ~ (IMAGE)

			//* MAGAZINE - 20 RD ~ (IMAGE)

			//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

			//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
		}
		else if (e.getSource() == Menu.quickBuild)
		{
			int i;
			MyFrame.one.setRifleType(3);
			Menu.rifleTypeCost = 150;
			Menu.RecountMoney();
			if (Menu.done[1] == false)
			{
				Menu.addM14ActionType();
				Menu.addM14BarrelLenght();
				Menu.addM14Optics();
				Menu.addM14OpticMount();
				Menu.addM14Magazine();
				Menu.addM14Bipod();
				Menu.addM14Monopod();
				Menu.addM14ChassisColor();
				Menu.addM14GripColor();
				// call next menu
				for (i = 0; i < 10; i++)
				{
					Menu.done[i] = true;
				}
			}
		}
		else if (e.getSource() == Menu.imageExporter)
		{
			// Set rifle type to Rem 700
			try
			{
			
			File outputfile = new File(System.getProperty("user.home") + "/Desktop\\" + MyFrame.PopUpMessage.showInputDialog(null, "Please Print Desired Save File Name.  The image will be saved to your Desktop") + ".png");
			ImageIO.write(Menu.createImage(MyFrame.MyStockImage), "png", outputfile);
			}
			//catch (AWTException j)
			//{
			
			//}
			catch (IOException k)
			{
			
			}
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