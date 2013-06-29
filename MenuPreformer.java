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

public class MenuPreformer implements MenuListener 
{
    public MenuPreformer()
    {
		
		
		
    } 
	public void menuCanceled(MenuEvent e)
	{
		
	}
	public void menuDeselected(MenuEvent e)
	{
		//actionTypeMenu.setForeground(new Color(0, 0, 0));
		Menu.menuBar.updateUI();
		MyFrame.RePaint();
	}
	public void menuSelected(MenuEvent e)
	{
		//actionTypeMenu.setForeground(new Color(0, 0, 0));
		Menu.menuBar.updateUI();
		MyFrame.RePaint();
		
	}
}

/**
RUN OUTPUT:

*/