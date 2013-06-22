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
		else if (e.getSource() == Menu.opticMountNone)
		{
			
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
		else if (e.getSource() == Menu.opticMountNone)
		{
			
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