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

public class MousePreformer implements MouseListener 
{ 
	public MousePreformer()
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
		if (e.getSource() == Menu.rifleTypeM14)
		{
			
		}
		else if (e.getSource() == Menu.rifleTypeRem700)
		{
			
		}
		else if (e.getSource() == Menu.actionTypeStandard)
		{
			MyFrame.one.setActionType(1);
		}
		else if (e.getSource() == Menu.actionTypeRearLug)
		{
			MyFrame.one.setActionType(2);
		}
		else if (e.getSource() == Menu.actionTypeM25)
		{
			MyFrame.one.setActionType(3);
		}
		else if (e.getSource() == Menu.actionTypeNone)
		{
			MyFrame.one.setActionType(0);
		}
		else if (e.getSource() == Menu.barrelLenght16Inch)
		{
			MyFrame.one.setBarrelLenght(1);
		}
		else if (e.getSource() == Menu.barrelLenght18Inch)
		{
			MyFrame.one.setBarrelLenght(2);
		}
		else if (e.getSource() == Menu.barrelLenght20Inch)
		{
			MyFrame.one.setBarrelLenght(3);
		}
		else if (e.getSource() == Menu.barrelLenghtNone)
		{
			MyFrame.one.setBarrelLenght(0);
		}
		else if (e.getSource() == Menu.opticsScope)
		{
			MyFrame.one.setOptics(1);
		}
		else if (e.getSource() == Menu.opticsReflexSight)
		{
			MyFrame.one.setOptics(2);
		}
		else if (e.getSource() == Menu.opticsNone)
		{
			MyFrame.one.setOptics(0);
		}
		else if (e.getSource() == Menu.opticMountBrooksStyle)
		{
			MyFrame.one.setOpticMount(1);
		}
		else if (e.getSource() == Menu.opticMountBarrelMountedPicatinny)
		{
			MyFrame.one.setOpticMount(2);
		}
		else if (e.getSource() == Menu.opticMountM25)
		{
			MyFrame.one.setOpticMount(3);
		}
		else if (e.getSource() == Menu.opticMountSocomShort)
		{
			MyFrame.one.setOpticMount(4);
		}
		else if (e.getSource() == Menu.opticMountSocomExtended)
		{
			MyFrame.one.setOpticMount(5);
		}
		else if (e.getSource() == Menu.opticMountNone)
		{
			MyFrame.one.setOpticMount(0);
		}
		else if (e.getSource() == Menu.magazine5RD)
		{
			MyFrame.one.setMagazine(1);
		}
		else if (e.getSource() == Menu.magazine10RD)
		{
			MyFrame.one.setMagazine(2);
		}
		else if (e.getSource() == Menu.magazine20RD)
		{
			MyFrame.one.setMagazine(3);
		}
		else if (e.getSource() == Menu.magazineNone)
		{
			MyFrame.one.setMagazine(0);
		}
		else if (e.getSource() == Menu.bipodHarris)
		{
			MyFrame.one.setBipod(1);
		}
		else if (e.getSource() == Menu.bipodGGG)
		{
			MyFrame.one.setBipod(2);
		}
		else if (e.getSource() == Menu.bipodAtlas)
		{
			MyFrame.one.setBipod(3);
		}
		else if (e.getSource() == Menu.bipodNone)
		{
			MyFrame.one.setBipod(0);
		}
		else if (e.getSource() == Menu.monopodBT)
		{
			MyFrame.one.setMonopod(1);
		}
		else if (e.getSource() == Menu.monopodNone)
		{
			MyFrame.one.setMonopod(0);
		}
		else if (e.getSource() == Menu.chassisColorBallisticWhite)
		{
			MyFrame.one.setChassisColor(1);
		}
		else if (e.getSource() == Menu.chassisColorGritTan)
		{
			MyFrame.one.setChassisColor(2);
		}
		else if (e.getSource() == Menu.chassisColorCoyoteBrown)
		{
			MyFrame.one.setChassisColor(3);
		}
		else if (e.getSource() == Menu.chassisColorDarkEarth)
		{
			MyFrame.one.setChassisColor(4);
		}
		else if (e.getSource() == Menu.chassisColorOliveDrab)
		{
			MyFrame.one.setChassisColor(5);
		}
		else if (e.getSource() == Menu.chassisColorLowLightGreen)
		{
			MyFrame.one.setChassisColor(6);
		}
		else if (e.getSource() == Menu.chassisColorSwatBlack)
		{
			MyFrame.one.setChassisColor(7);
		}
		else if (e.getSource() == Menu.chassisColorGIBrown)
		{
			MyFrame.one.setChassisColor(8);
		}
		else if (e.getSource() == Menu.chassisColorNone)
		{
			MyFrame.one.setChassisColor(0);
		}
		else if (e.getSource() == Menu.gripColorBallisticWhite)
		{
			MyFrame.one.setGripColor(1);
		}
		else if (e.getSource() == Menu.gripColorGritTan)
		{
			MyFrame.one.setGripColor(2);
		}
		else if (e.getSource() == Menu.gripColorCoyoteBrown)
		{
			MyFrame.one.setGripColor(3);
		}
		else if (e.getSource() == Menu.gripColorDarkEarth)
		{
			MyFrame.one.setGripColor(4);
		}
		else if (e.getSource() == Menu.gripColorOliveDrab)
		{
			MyFrame.one.setGripColor(5);
		}
		else if (e.getSource() == Menu.gripColorLowLightGreen)
		{
			MyFrame.one.setGripColor(6);
		}
		else if (e.getSource() == Menu.gripColorSwatBlack)
		{
			MyFrame.one.setGripColor(7);
		}
		else if (e.getSource() == Menu.gripColorGIBrown)
		{
			MyFrame.one.setGripColor(8);
		}
		else if (e.getSource() == Menu.gripColorNone)
		{
			MyFrame.one.setGripColor(0);
		}
		
		MyFrame.RePaint();
	}
	public void mouseExited(MouseEvent e)
	{
		
		if (e.getSource() == Menu.rifleTypeM14)
		{
			
		}
		else if (e.getSource() == Menu.rifleTypeRem700)
		{
			
		}
		else if (e.getSource() == Menu.actionTypeStandard)
		{
			MyFrame.one.setActionType(Menu.actionType[5]);
		}
		else if (e.getSource() == Menu.actionTypeRearLug)
		{
			MyFrame.one.setActionType(Menu.actionType[5]);
		}
		else if (e.getSource() == Menu.actionTypeM25)
		{
			MyFrame.one.setActionType(Menu.actionType[5]);
		}
		else if (e.getSource() == Menu.actionTypeNone)
		{
			MyFrame.one.setActionType(Menu.actionType[5]);
		}
		else if (e.getSource() == Menu.barrelLenght16Inch)
		{
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[5]);
		}
		else if (e.getSource() == Menu.barrelLenght18Inch)
		{
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[5]);
		}
		else if (e.getSource() == Menu.barrelLenght20Inch)
		{
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[5]);
		}
		else if (e.getSource() == Menu.barrelLenghtNone)
		{
			MyFrame.one.setBarrelLenght(Menu.barrelLenght[5]);
		}
		else if (e.getSource() == Menu.opticsScope)
		{
			MyFrame.one.setOptics(Menu.optics[5]);
		}
		else if (e.getSource() == Menu.opticsReflexSight)
		{
			MyFrame.one.setOptics(Menu.optics[5]);
		}
		else if (e.getSource() == Menu.opticsNone)
		{
			MyFrame.one.setOptics(Menu.optics[5]);
		}
		else if (e.getSource() == Menu.opticMountBrooksStyle)
		{
			MyFrame.one.setOpticMount(Menu.opticMount[5]);
		}
		else if (e.getSource() == Menu.opticMountBarrelMountedPicatinny)
		{
			MyFrame.one.setOpticMount(Menu.opticMount[5]);
		}
		else if (e.getSource() == Menu.opticMountM25)
		{
			MyFrame.one.setOpticMount(Menu.opticMount[5]);
		}
		else if (e.getSource() == Menu.opticMountSocomShort)
		{
			MyFrame.one.setOpticMount(Menu.opticMount[5]);
		}
		else if (e.getSource() == Menu.opticMountSocomExtended)
		{
			MyFrame.one.setOpticMount(Menu.opticMount[5]);
		}
		else if (e.getSource() == Menu.opticMountNone)
		{
			MyFrame.one.setOpticMount(Menu.opticMount[5]);
		}
		else if (e.getSource() == Menu.magazine5RD)
		{
			MyFrame.one.setMagazine(Menu.magazine[5]);
		}
		else if (e.getSource() == Menu.magazine10RD)
		{
			MyFrame.one.setMagazine(Menu.magazine[5]);
		}
		else if (e.getSource() == Menu.magazine20RD)
		{
			MyFrame.one.setMagazine(Menu.magazine[5]);
		}
		else if (e.getSource() == Menu.magazineNone)
		{
			MyFrame.one.setMagazine(Menu.magazine[5]);
		}
		else if (e.getSource() == Menu.bipodHarris)
		{
			MyFrame.one.setBipod(Menu.bipod[5]);
		}
		else if (e.getSource() == Menu.bipodGGG)
		{
			MyFrame.one.setBipod(Menu.bipod[5]);
		}
		else if (e.getSource() == Menu.bipodAtlas)
		{
			MyFrame.one.setBipod(Menu.bipod[5]);
		}
		else if (e.getSource() == Menu.bipodNone)
		{
			MyFrame.one.setBipod(Menu.bipod[5]);
		}
		else if (e.getSource() == Menu.monopodBT)
		{
			MyFrame.one.setMonopod(Menu.monopod[5]);
		}
		else if (e.getSource() == Menu.monopodNone)
		{
			MyFrame.one.setMonopod(Menu.monopod[5]);
		}
		else if (e.getSource() == Menu.chassisColorBallisticWhite)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.chassisColorGritTan)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.chassisColorCoyoteBrown)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.chassisColorDarkEarth)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.chassisColorOliveDrab)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.chassisColorLowLightGreen)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.chassisColorSwatBlack)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.chassisColorGIBrown)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.chassisColorNone)
		{
			MyFrame.one.setChassisColor(Menu.chassisColor[5]);
		}
		else if (e.getSource() == Menu.gripColorBallisticWhite)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		else if (e.getSource() == Menu.gripColorGritTan)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		else if (e.getSource() == Menu.gripColorCoyoteBrown)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		else if (e.getSource() == Menu.gripColorDarkEarth)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		else if (e.getSource() == Menu.gripColorOliveDrab)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		else if (e.getSource() == Menu.gripColorLowLightGreen)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		else if (e.getSource() == Menu.gripColorSwatBlack)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		else if (e.getSource() == Menu.gripColorGIBrown)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		else if (e.getSource() == Menu.gripColorNone)
		{
			MyFrame.one.setGripColor(Menu.gripColor[5]);
		}
		MyFrame.RePaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		MyFrame.RePaint();
	}
	public void mousePressed(MouseEvent e)
	{
		MyFrame.RePaint();
	}
	public void mouseClicked(MouseEvent e)
	{
		MyFrame.RePaint();
	}
	
	
	
}