
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

public class Menu 
{
	public static final int NumberSaveFiles = 5;
	public static boolean[] done = new boolean[10];
	public static JMenu menu, submenu, submenu2, submenu3;
	public static JMenu actionTypeMenu, barrelLenghtMenu, opticsMenu, opticMountMenu, magazineMenu, bipodMenu, monopodMenu, chassisColorMenu, gripColorMenu;
	public static JMenuItem menuItem, actionTypeStandard, actionTypeRearLug, actionTypeM25, actionTypeNone, barrelLenght16Inch, barrelLenght18Inch, barrelLenght20Inch, barrelLenghtNone, opticsScope, opticsReflexSight, opticsNone, opticMountBrooksStyle, opticMountBarrelMountedPicatinny
	, opticMountM25, opticMountSocomShort, opticMountSocomExtended, opticMountNone, magazine5RD, magazine10RD, magazine20RD, magazineNone, bipodHarris, bipodGGG, bipodAtlas, bipodNone, monopodBT, monopodNone, chassisColorBallisticWhite
	, chassisColorGritTan, chassisColorCoyoteBrown, chassisColorDarkEarth, chassisColorOliveDrab, chassisColorLowLightGreen, chassisColorTitaniumGrey, chassisColorSwatBlack, chassisColorGIBrown, chassisColorNone
	, gripColorBallisticWhite, gripColorGritTan, gripColorCoyoteBrown, gripColorDarkEarth, gripColorOliveDrab, gripColorLowLightGreen, gripColorTitaniumGrey, gripColorSwatBlack, gripColorGIBrown, gripColorNone, rifleTypeM14, rifleTypeRem700;
	public static JMenuBar menuBar = new JMenuBar();
	public static JLabel actionTypeReminder = new JLabel("", JLabel.LEADING);
	public static JLabel barrelLenghtReminder = new JLabel("", JLabel.LEADING);
	public static JLabel opticReminder = new JLabel("", JLabel.LEADING);
	public static JLabel opticMountReminder = new JLabel("", JLabel.LEADING);
	public static JLabel magazineReminder = new JLabel("", JLabel.LEADING);
	public static JLabel bipodReminder = new JLabel("", JLabel.LEADING);
	public static JLabel monopodReminder = new JLabel("", JLabel.LEADING);
	public static JLabel chassisColorReminder = new JLabel("", JLabel.LEADING);
	public static JLabel gripColorReminder = new JLabel("", JLabel.LEADING);
	public static JLabel totalReminder = new JLabel("Total: $0", JLabel.LEADING);
	public static int rifleTypeCost = 0;
	public static int actionTypeCost = 0;
	public static int barrelLenghtCost = 0;
	public static int opticsCost = 0;
	public static int opticMountCost = 0;
	public static int magazineCost = 0;
	public static int bipodCost = 0;
	public static int monopodCost = 0;
	public static int chassisColorCost = 0;
	public static int gripColorCost = 0;
	public static int[] rifleType = new int[NumberSaveFiles + 1];
	public static int[] actionType = new int[NumberSaveFiles + 1];
	public static int[] barrelLenght = new int[NumberSaveFiles + 1];
	public static int[] optics = new int[NumberSaveFiles + 1];
	public static int[] opticMount = new int[NumberSaveFiles + 1];
	public static int[] magazine = new int[NumberSaveFiles + 1];
	public static int[] bipod = new int[NumberSaveFiles + 1];
	public static int[] monopod = new int[NumberSaveFiles + 1];
	public static int[] chassisColor = new int[NumberSaveFiles + 1];
	public static int[] gripColor = new int[NumberSaveFiles + 1];
	public static BufferedImage Stock;
	public static ActionPreformer ALisener = new ActionPreformer();
	public static MousePreformer MLisener = new MousePreformer();
	public Menu()
	{	
		int i;
		for (i = 0; i < 10; i++)
		{
			done[i] = false;
		}
		
		ToolTipManager.sharedInstance().setInitialDelay(200);
		//ToolTipManager.sharedInstance().setDismissDelay(300);
		ToolTipManager.sharedInstance().setReshowDelay(100);
		actionTypeReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		barrelLenghtReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		opticReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		opticMountReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		magazineReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		bipodReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		monopodReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		chassisColorReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		gripColorReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		totalReminder.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
		createNewMenu();
	}
	private void createNewMenu()
	{
		
		menu = new JMenu("File");
		//menu.setForeground(new Color(0, 255, 255) );
		menuBar.add(menu);
		submenu = new JMenu("Build Rifle");
		submenu.setToolTipText("Start here to begin building your very own unique stock!!");
		submenu2 = new JMenu("Rifle Type");
		submenu2.setToolTipText("Choose this option to begin building you stock");
		submenu2.add(addNewMenuItem(1,1,0));
		submenu2.add(addNewMenuItem(1,2,0));
		submenu.add(submenu2);
		submenu.addSeparator();
		submenu2 = new JMenu("Brand");
		submenu2.setToolTipText("<html>Choose this option if your experienced<br>and/or want to start from a template");
		submenu2.add(addNewMenuItem(1,3,1));
		submenu2.add(addNewMenuItem(1,3,2));
		submenu3 = new JMenu("Socom Brands");
		submenu3.add(addNewMenuItem(1,3,3));
		submenu3.add(addNewMenuItem(1,3,4));
		submenu3.add(addNewMenuItem(1,3,5));
		submenu3.add(addNewMenuItem(1,3,6));
		submenu3.add(addNewMenuItem(1,3,7));
		submenu3.add(addNewMenuItem(1,3,8));
		submenu3.add(addNewMenuItem(1,3,9));
		submenu3.add(addNewMenuItem(1,3,10));
		submenu2.add(addNewMenuItem(1,3,11));
		submenu2.add(submenu3);
		submenu2.add(addNewMenuItem(1,3,12));
		submenu2.add(addNewMenuItem(1,3,13));
		submenu2.add(addNewMenuItem(1,3,14));
		submenu2.add(addNewMenuItem(1,3,15));
		submenu2.add(addNewMenuItem(1,3,16));
		submenu.add(submenu2);
		menu.add(submenu);
		submenu = new JMenu("Save");
		submenu.add(addNewMenuItem(1,4,1));
		menu.add(submenu);
		submenu.add(addNewMenuItem(1,4,2));
		menu.add(submenu);
		submenu.add(addNewMenuItem(1,4,3));
		menu.add(submenu);
		submenu.add(addNewMenuItem(1,4,4));
		menu.add(submenu);
		submenu.add(addNewMenuItem(1,4,5));
		menu.add(submenu);
		submenu = new JMenu("Load");
		submenu.add(addNewMenuItem(1,5,1));
		menu.add(submenu);
		submenu.add(addNewMenuItem(1,5,2));
		menu.add(submenu);
		submenu.add(addNewMenuItem(1,5,3));
		menu.add(submenu);
		submenu.add(addNewMenuItem(1,5,4));
		menu.add(submenu);
		submenu.add(addNewMenuItem(1,5,5));
		menu.add(submenu);
		menu.add(addNewMenuItem(1,6,0));
		menuItem = new JMenuItem("Reset");
		menuItem.addActionListener(new ActionListener() 
		{
			
            public void actionPerformed(ActionEvent e)
			{
				int i;
                // retracts all menus and enables the rifle type selection
				
				Object[] message = { "If you Continue your saves will be deleted.  Click 'ok' to continue"};
				i = MyFrame.PopUpMessage.showConfirmDialog(null, message, "Attention", MyFrame.PopUpMessage.OK_CANCEL_OPTION);
				
				if(i == JOptionPane.OK_OPTION)
				{ 
					while (1 < menuBar.getMenuCount())
					{
						menuBar.remove(1);
					}
					for (i = 0; i < 10; i++)
					{
						done[i] = false;
					}
					for (i = 0; i < NumberSaveFiles; i++)
					{
						rifleType[i] = 0;
						actionType[i] = 0;
						barrelLenght[i] = 0;
						optics[i] = 0;
						opticMount[i] = 0;
						magazine[i] = 0;
						bipod[i] = 0;
						monopod[i] = 0;
						chassisColor[i] = 0;
						gripColor[i] = 0;
					}
					rifleTypeCost = 0;
					actionTypeCost = 0;
					barrelLenghtCost = 0;
					opticsCost = 0;
					opticMountCost = 0;
					magazineCost = 0;
					bipodCost = 0;
					monopodCost = 0;
					chassisColorCost = 0;
					gripColorCost = 0;
					RecountMoney();
					actionTypeReminder.setText("");
					barrelLenghtReminder.setText("");
					opticReminder.setText("");
					opticMountReminder.setText("");
					magazineReminder.setText("");
					bipodReminder.setText("");
					monopodReminder.setText("");
					chassisColorReminder.setText("");
					gripColorReminder.setText("");
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
					MyFrame.RePaint();
				}
			}
        });
		//menu.setForeground(new Color(0, 100, 0));
		//menu.setBackground(new Color(0, 125, 125));
		menu.add(menuItem);

		//addMenuItems();
	}
	public static void addM14ActionType()
	{
		actionTypeMenu = new JMenu("2. Action Type");
		actionTypeMenu.setToolTipText("Choose Your actions type for your stock here");
		actionTypeMenu.setMnemonic(KeyEvent.VK_M);
        actionTypeMenu.addMenuListener(new MenuListener()
		{
			
				public void menuCanceled(MenuEvent e)
				{
					
				}
				public void menuDeselected(MenuEvent e)
				{
					
				}
				public void menuSelected(MenuEvent e)
				{
					
					//actionTypeMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
				
		});
		actionTypeMenu.add(addNewMenuItem(2,1,0));
		actionTypeMenu.add(addNewMenuItem(2,2,0));
		actionTypeMenu.add(addNewMenuItem(2,3,0));
		actionTypeMenu.add(addNewMenuItem(2,4,0));
		actionTypeMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(actionTypeMenu);
		
		MyFrame.RePaint();
	}
	public static void addM14BarrelLenght()
	{
		barrelLenghtMenu = new JMenu("3. Barrel Length");
		barrelLenghtMenu.setMnemonic(KeyEvent.VK_M);
        barrelLenghtMenu.addMenuListener(new MenuListener()
		{
			
				public void menuCanceled(MenuEvent e)
				{

				}
				public void menuDeselected(MenuEvent e)
				{

				}
				public void menuSelected(MenuEvent e)
				{
					
				//	barrelLenghtMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
			
		});
		barrelLenghtMenu.add(addNewMenuItem(3,1,0));
		barrelLenghtMenu.add(addNewMenuItem(3,2,0));
		barrelLenghtMenu.add(addNewMenuItem(3,3,0));
		barrelLenghtMenu.add(addNewMenuItem(3,4,0));
		barrelLenghtMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(barrelLenghtMenu);
		MyFrame.RePaint();
	}
	public static void addM14Optics()
	{
		opticsMenu = new JMenu("4. Optics");
		opticsMenu.setMnemonic(KeyEvent.VK_M);
        opticsMenu.addMenuListener(new MenuListener()
		{
		
				public void menuCanceled(MenuEvent e)
				{

				}
				public void menuDeselected(MenuEvent e)
				{

				}
				public void menuSelected(MenuEvent e)
				{
					
					//opticsMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
			
		});
		opticsMenu.add(addNewMenuItem(4,1,0));
		opticsMenu.add(addNewMenuItem(4,2,0));
		opticsMenu.add(addNewMenuItem(4,3,0));
		opticsMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(opticsMenu);
		MyFrame.RePaint();
	}
	public static void addM14OpticMount()
	{
		opticMountMenu = new JMenu("5. OpticMount");
		opticMountMenu.setMnemonic(KeyEvent.VK_M);
        opticMountMenu.addMenuListener(new MenuListener()
		{
			
				public void menuCanceled(MenuEvent e)
				{

				}
				public void menuDeselected(MenuEvent e)
				{

				}
				public void menuSelected(MenuEvent e)
				{
					
					//opticMountMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
			
		});
		opticMountMenu.add(addNewMenuItem(5,1,0));
		opticMountMenu.add(addNewMenuItem(5,2,0));
		opticMountMenu.add(addNewMenuItem(5,3,0));
		opticMountMenu.add(addNewMenuItem(5,4,0));
		opticMountMenu.add(addNewMenuItem(5,5,0));
		opticMountMenu.add(addNewMenuItem(5,6,0));
		opticMountMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(opticMountMenu);
		MyFrame.RePaint();
	}
	public static void addM14Magazine()
	{
		magazineMenu = new JMenu("6. Magazine");
		magazineMenu.setMnemonic(KeyEvent.VK_M);
        magazineMenu.addMenuListener(new MenuListener()
		{
			
				public void menuCanceled(MenuEvent e)
				{

				}
				public void menuDeselected(MenuEvent e)
				{

				}
				public void menuSelected(MenuEvent e)
				{
					
					//magazineMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
		});
		magazineMenu.add(addNewMenuItem(6,1,0));
		magazineMenu.add(addNewMenuItem(6,2,0));
		magazineMenu.add(addNewMenuItem(6,3,0));
		magazineMenu.add(addNewMenuItem(6,4,0));
		magazineMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(magazineMenu);
		MyFrame.RePaint();
	}
	public static void addM14Bipod()
	{
		bipodMenu = new JMenu("7. Bipod");
		bipodMenu.setMnemonic(KeyEvent.VK_M);
        bipodMenu.addMenuListener(new MenuListener()
		{
			
				public void menuCanceled(MenuEvent e)
				{

				}
				public void menuDeselected(MenuEvent e)
				{

				}
				public void menuSelected(MenuEvent e)
				{
					
					//bipodMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
			
		});
		bipodMenu.add(addNewMenuItem(7,1,0));
		bipodMenu.add(addNewMenuItem(7,2,0));
		bipodMenu.add(addNewMenuItem(7,3,0));
		bipodMenu.add(addNewMenuItem(7,4,0));
		bipodMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(bipodMenu);
		MyFrame.RePaint();
	}
	public static void addM14Monopod()
	{
		monopodMenu = new JMenu("8. Monopod");
		monopodMenu.setMnemonic(KeyEvent.VK_M);
        monopodMenu.addMenuListener(new MenuListener()
		{
			
				public void menuCanceled(MenuEvent e)
				{

				}
				public void menuDeselected(MenuEvent e)
				{

				}
				public void menuSelected(MenuEvent e)
				{
					
					//monopodMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
			
		});
		monopodMenu.add(addNewMenuItem(8,1,0));
		monopodMenu.add(addNewMenuItem(8,2,0));
		monopodMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(monopodMenu);
		MyFrame.RePaint();
	}
	public static void addM14ChassisColor()
	{
		chassisColorMenu = new JMenu("9. Chassis Color");
		chassisColorMenu.setMnemonic(KeyEvent.VK_M);
        chassisColorMenu.addMenuListener(new MenuListener()
		{
			
				public void menuCanceled(MenuEvent e)
				{

				}
				public void menuDeselected(MenuEvent e)
				{

				}
				public void menuSelected(MenuEvent e)
				{
					
					//chassisColorMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
			
		});
		chassisColorMenu.add(addNewMenuItem(9,1,0));
		chassisColorMenu.add(addNewMenuItem(9,2,0));
		chassisColorMenu.add(addNewMenuItem(9,3,0));
		chassisColorMenu.add(addNewMenuItem(9,4,0));
		chassisColorMenu.add(addNewMenuItem(9,5,0));
		chassisColorMenu.add(addNewMenuItem(9,6,0));
		chassisColorMenu.add(addNewMenuItem(9,7,0));
		chassisColorMenu.add(addNewMenuItem(9,8,0));
		chassisColorMenu.add(addNewMenuItem(9,9,0));
		chassisColorMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(chassisColorMenu);
		MyFrame.RePaint();
	}
	public static void addM14GripColor()
	{
		gripColorMenu = new JMenu("10. Grip Color");
		gripColorMenu.setMnemonic(KeyEvent.VK_M);
        gripColorMenu.addMenuListener(new MenuListener()
		{
			
				public void menuCanceled(MenuEvent e)
				{

				}
				public void menuDeselected(MenuEvent e)
				{
					
					//gripColorMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
				public void menuSelected(MenuEvent e)
				{
					
					//gripColorMenu.setForeground(new Color(0, 0, 0));
					menuBar.updateUI();
					MyFrame.RePaint();
					
				}
			
		});
		gripColorMenu.add(addNewMenuItem(10,1,0));
		gripColorMenu.add(addNewMenuItem(10,2,0));
		gripColorMenu.add(addNewMenuItem(10,3,0));
		gripColorMenu.add(addNewMenuItem(10,4,0));
		gripColorMenu.add(addNewMenuItem(10,5,0));
		gripColorMenu.add(addNewMenuItem(10,6,0));
		gripColorMenu.add(addNewMenuItem(10,7,0));
		gripColorMenu.add(addNewMenuItem(10,8,0));
		gripColorMenu.add(addNewMenuItem(10,9,0));
		gripColorMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(gripColorMenu);
		MyFrame.RePaint();
	}
	public JMenuBar getMenuBar()
	{
		return menuBar;
	}  
	public static JMenuItem addNewMenuItem(int myImageArrayType, int myImageType, int myExtendedMenus)
	{
		
		if (myImageArrayType == 1)
		{
			if (myImageType == 1)
			{
				
				rifleTypeM14 = new JMenuItem("M-14");
				rifleTypeM14.setToolTipText("<html>Great for shooting...;<br>" + " Cost: $50");
				rifleTypeM14.addActionListener(ALisener);
/*				
				{
					public void actionPerformed(ActionEvent e)
					{
						// Set rifle type to m-14
						MyFrame.one.setRifleType(1);
						rifleTypeCost = 50;
					    RecountMoney();
						MyFrame.RePaint();
						// call next menu
						if (done[0] == false)
						{
							addM14ActionType();
							done[0] = true;
						}
						
					}
				});
*/			return rifleTypeM14;
			}
			else if (myImageType == 2)
			{
				rifleTypeRem700 = new JMenuItem("REM 700");
				rifleTypeRem700.setToolTipText("<html>better quality than the M-14 series for some reson;<br>" + " Cost: $100");
				rifleTypeRem700.addActionListener(ALisener);
/*
				{
					public void actionPerformed(ActionEvent e)
					{
						// Set rifle type to Rem 700
						MyFrame.one.setRifleType(2);
						rifleTypeCost = 100;
					   RecountMoney();
						MyFrame.RePaint();
						// call next menu
						if (done[0] == false)
						{
							addM14ActionType();
							done[0] = true;
						}
					}
				});
*/			return rifleTypeRem700;
			}
			else if (myImageType == 3)
			{
				
				if (myExtendedMenus == 1)
				{	
					menuItem = new JMenuItem("LRB M25");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD OR REAR LUG ~ (IMAGE AND BALOON NOTE)
							
							//* BARREL - 20 INCH ~ (IMAGE)
							
							//* MAGAZINE - 20 RD ~ (IMAGE)
							
							//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)
							
							//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 2)
				{	
					menuItem = new JMenuItem("LRB M14");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD OR REAR LUG ~ (IMAGE AND BALOON NOTE)
							
							//* BARREL - 20 INCH ~ (IMAGE)
							
							//* MAGAZINE - 20 RD ~ (IMAGE)
							
							//* GAS SYSTEM - Non-UNITIZED ~ (BALLOON NOTE)
							
							//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 3)
				{	
					menuItem = new JMenuItem("Springfield Supermatch M1A");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - REAR LUG ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 4)
				{	
					menuItem = new JMenuItem("Springfield National M1A");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 5)
				{	
					menuItem = new JMenuItem("Springfield M25 Whitefeather");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - REAR LUG ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)

							//* OPTIC MOUNT - M25 ~ (IMAGE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 6)
				{	
					menuItem = new JMenuItem("Springfield M21 Tactical");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 7)
				{	
					menuItem = new JMenuItem("Springfield Loaded M1A");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - YES ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 8)
				{	
					menuItem = new JMenuItem("Springfield Standard M1A");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 9)
				{	
					menuItem = new JMenuItem("Springfield Scout M1A");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 18 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 10)
				{	
					menuItem = new JMenuItem("Springfield Socom II (Top Rail Only)");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 16 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)

							//* OPTIC MOUNT - SOCOM11 TOP RAIL ~ (IMAGE AND BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 11)
				{	
					menuItem = new JMenuItem("Springfield Socom 16");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 16 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)

							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 12)
				{	
					menuItem = new JMenuItem("Armscorp");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 13)
				{	
					menuItem = new JMenuItem("Norinco");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 14)
				{	
					menuItem = new JMenuItem("Polytech");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - STANDARD ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else if (myExtendedMenus == 15)
				{	
					menuItem = new JMenuItem("USGI Selectfire");
					menuItem.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							//* RECEIVER - SELCETFIRE ~ (IMAGE)

							//* BARREL - 20 INCH ~ (IMAGE)

							//* MAGAZINE - 20 RD ~ (IMAGE)

							//* GAS SYSTEM - NON-UNITIZED ~ (BALLOON NOTE)

							//* GLASS BEDDED FACTORY STOCK - NO ~ (BALLOON NOTE)
							
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								// call next menu
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}
							MyFrame.RePaint();
						}
					});
				}
				else
				{	
					menuItem = new JMenuItem("Quick Build");
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							int i;
							// Set rifle type to Othergun
							MyFrame.one.setRifleType(3);
							rifleTypeCost = 150;
					   RecountMoney();
							MyFrame.RePaint();
							// call next menu
							if (done[1] == false)
							{
								addM14ActionType();
								addM14BarrelLenght();
								addM14Optics();
								addM14OpticMount();
								addM14Magazine();
								addM14Bipod();
								addM14Monopod();
								addM14ChassisColor();
								addM14GripColor();
								for (i = 0; i < 10; i++)
								{
									done[i] = true;
								}
							}	
						}
					});
				}
			}
			else if (myImageType == 4)
			{
				if (myExtendedMenus == 1)
				{
					menuItem = new JMenuItem("SaveFile" + 1);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							rifleType[0] = MyFrame.one.getRifleType();
							actionType[0] = MyFrame.one.getActionType();
							barrelLenght[0] = MyFrame.one.getBarrelLenght();
							optics[0] = MyFrame.one.getOptics();
							opticMount[0] = MyFrame.one.getOpticMount();
							magazine[0] = MyFrame.one.getMagazine();
							bipod[0] = MyFrame.one.getBipod();
							monopod[0] = MyFrame.one.getMonopod();
							chassisColor[0] = MyFrame.one.getChassisColor();
							gripColor[0] = MyFrame.one.getGripColor();
						}
					});
				}	
				else if (myExtendedMenus == 2)
				{	
					menuItem = new JMenuItem("SaveFile " + 2);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							rifleType[1] = MyFrame.one.getRifleType();
							actionType[1] = MyFrame.one.getActionType();
							barrelLenght[1] = MyFrame.one.getBarrelLenght();
							optics[1] = MyFrame.one.getOptics();
							opticMount[1] = MyFrame.one.getOpticMount();
							magazine[1] = MyFrame.one.getMagazine();
							bipod[1] = MyFrame.one.getBipod();
							monopod[1] = MyFrame.one.getMonopod();
							chassisColor[1] = MyFrame.one.getChassisColor();
							gripColor[1] = MyFrame.one.getGripColor();
						}
					});
				}	
				else if (myExtendedMenus == 3)
				{		
					menuItem = new JMenuItem("SaveFile " + 3);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							rifleType[2] = MyFrame.one.getRifleType();
							actionType[2] = MyFrame.one.getActionType();
							barrelLenght[2] = MyFrame.one.getBarrelLenght();
							optics[2] = MyFrame.one.getOptics();
							opticMount[2] = MyFrame.one.getOpticMount();
							magazine[2] = MyFrame.one.getMagazine();
							bipod[2] = MyFrame.one.getBipod();
							monopod[2] = MyFrame.one.getMonopod();
							chassisColor[2] = MyFrame.one.getChassisColor();
							gripColor[2] = MyFrame.one.getGripColor();
						}
					});
				}	
				else if (myExtendedMenus == 4)
				{		
					menuItem = new JMenuItem("SaveFile " + 4);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							rifleType[3] = MyFrame.one.getRifleType();
							actionType[3] = MyFrame.one.getActionType();
							barrelLenght[3] = MyFrame.one.getBarrelLenght();
							optics[3] = MyFrame.one.getOptics();
							opticMount[3] = MyFrame.one.getOpticMount();
							magazine[3] = MyFrame.one.getMagazine();
							bipod[3] = MyFrame.one.getBipod();
							monopod[3] = MyFrame.one.getMonopod();
							chassisColor[3] = MyFrame.one.getChassisColor();
							gripColor[3] = MyFrame.one.getGripColor();
						}
					});
				}	
				else
				{		
					menuItem = new JMenuItem("SaveFile " + 5);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							rifleType[4] = MyFrame.one.getRifleType();
							actionType[4] = MyFrame.one.getActionType();
							barrelLenght[4] = MyFrame.one.getBarrelLenght();
							optics[4] = MyFrame.one.getOptics();
							opticMount[4] = MyFrame.one.getOpticMount();
							magazine[4] = MyFrame.one.getMagazine();
							bipod[4] = MyFrame.one.getBipod();
							monopod[4] = MyFrame.one.getMonopod();
							chassisColor[4] = MyFrame.one.getChassisColor();
							gripColor[4] = MyFrame.one.getGripColor();
						}
					});
				
				}
			}
			else if (myImageType == 5)
			{
				
				if (myExtendedMenus == 1)
				{	
					menuItem = new JMenuItem("LoadFile " + 1);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							// Set rifle type to Rem 700
							
							MyFrame.one.setRifleType(rifleType[0]);
							MyFrame.one.setActionType(actionType[0]);
							MyFrame.one.setBarrelLenght(barrelLenght[0]);
							MyFrame.one.setOptics(optics[0]);
							MyFrame.one.setOpticMount(opticMount[0]);
							MyFrame.one.setMagazine(magazine[0]);
							MyFrame.one.setBipod(bipod[0]);
							MyFrame.one.setMonopod(monopod[0]);
							MyFrame.one.setChassisColor(chassisColor[0]);
							MyFrame.one.setGripColor(gripColor[0]);
							MyFrame.RePaint();
						
							
						}
					});
				}	
				else if (myExtendedMenus == 2)
				{		
					menuItem = new JMenuItem("LoadFile " + 2);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							// Set rifle type to Rem 700
							
							MyFrame.one.setRifleType(rifleType[1]);
							MyFrame.one.setActionType(actionType[1]);
							MyFrame.one.setBarrelLenght(barrelLenght[1]);
							MyFrame.one.setOptics(optics[1]);
							MyFrame.one.setOpticMount(opticMount[1]);
							MyFrame.one.setMagazine(magazine[1]);
							MyFrame.one.setBipod(bipod[1]);
							MyFrame.one.setMonopod(monopod[1]);
							MyFrame.one.setChassisColor(chassisColor[1]);
							MyFrame.one.setGripColor(gripColor[1]);
							MyFrame.RePaint();
						
							
						}
					});
				}	
				else if (myExtendedMenus == 3)
				{	
					menuItem = new JMenuItem("LoadFile " + 3);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							// Set rifle type to Rem 700
							
							MyFrame.one.setRifleType(rifleType[2]);
							MyFrame.one.setActionType(actionType[2]);
							MyFrame.one.setBarrelLenght(barrelLenght[2]);
							MyFrame.one.setOptics(optics[2]);
							MyFrame.one.setOpticMount(opticMount[2]);
							MyFrame.one.setMagazine(magazine[2]);
							MyFrame.one.setBipod(bipod[2]);
							MyFrame.one.setMonopod(monopod[2]);
							MyFrame.one.setChassisColor(chassisColor[2]);
							MyFrame.one.setGripColor(gripColor[2]);
							MyFrame.RePaint();
						
							
						}
					});
				}	
				else if (myExtendedMenus == 4)
				{		
					menuItem = new JMenuItem("LoadFile " + 4);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							// Set rifle type to Rem 700
							
							MyFrame.one.setRifleType(rifleType[3]);
							MyFrame.one.setActionType(actionType[3]);
							MyFrame.one.setBarrelLenght(barrelLenght[3]);
							MyFrame.one.setOptics(optics[3]);
							MyFrame.one.setOpticMount(opticMount[3]);
							MyFrame.one.setMagazine(magazine[3]);
							MyFrame.one.setBipod(bipod[3]);
							MyFrame.one.setMonopod(monopod[3]);
							MyFrame.one.setChassisColor(chassisColor[3]);
							MyFrame.one.setGripColor(gripColor[3]);
							MyFrame.RePaint();
						
							
						}
					});
				}	
				else
				{		
					menuItem = new JMenuItem("LoadFile " + 5);
					menuItem.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e)
						{
							// Set rifle type to Rem 700
							
							MyFrame.one.setRifleType(rifleType[4]);
							MyFrame.one.setActionType(actionType[4]);
							MyFrame.one.setBarrelLenght(barrelLenght[4]);
							MyFrame.one.setOptics(optics[4]);
							MyFrame.one.setOpticMount(opticMount[4]);
							MyFrame.one.setMagazine(magazine[4]);
							MyFrame.one.setBipod(bipod[4]);
							MyFrame.one.setMonopod(monopod[4]);
							MyFrame.one.setChassisColor(chassisColor[4]);
							MyFrame.one.setGripColor(gripColor[4]);
							MyFrame.RePaint();
						
							
						}
					});
				}
			}
			else
			{
				menuItem = new JMenuItem("Export Current Image");
				menuItem.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						// Set rifle type to Rem 700
						try
						{
							
							File outputfile = new File(System.getProperty("user.home") + "/Desktop\\" + MyFrame.PopUpMessage.showInputDialog(null, "Please Print Desired Save File Name.  The image will be saved to your Desktop") + ".png");
							ImageIO.write(createImage(MyFrame.MyStockImage), "png", outputfile);
						}
						//catch (AWTException j)
						//{
							
						//}
						catch (IOException k)
						{
							
						}
				
					}
				});
			}
		}
		else if (myImageArrayType == 2)
		{
			if (myImageType == 1)
			{
				actionTypeStandard = new JMenuItem("Standard");
				actionTypeStandard.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setActionType(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setActionType(actionType[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				actionTypeStandard.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the action type image to "standard"
					   MyFrame.one.setActionType(1);
					   actionType[5] = 1;
					   actionTypeReminder.setText("Action Type: Standard($50)");
					   actionTypeCost = 50;
					   RecountMoney();
					   actionTypeMenu.setForeground(new Color(0, 100, 0));
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[1] == false)
						{
							addM14BarrelLenght();
							done[1] = true;
						}
					}
				});
				*/
				return actionTypeStandard;
			}
			else if (myImageType == 2)
			{
				actionTypeRearLug = new JMenuItem("Rear Lug");
				actionTypeRearLug.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setActionType(2);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setActionType(actionType[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				actionTypeRearLug.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the action type image to "Rear Lug"
					   MyFrame.one.setActionType(2);
					   actionType[5] = 2;
					   actionTypeCost = 100;
					   RecountMoney();
					   actionTypeReminder.setText("Action Type: Rear Lug($100)");
					   actionTypeMenu.setForeground(new Color(0, 100, 0));
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[1] == false)
						{
							addM14BarrelLenght();
							done[1] = true;
						}
					}
				});
				*/
				return actionTypeRearLug;
			}
			else if (myImageType == 3)
			{
				actionTypeM25 = new JMenuItem("M-25");
				actionTypeM25.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setActionType(3);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setActionType(actionType[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				actionTypeM25.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the action type image to "M-25"
					   actionTypeMenu.setForeground(new Color(0, 100, 0));
					   MyFrame.one.setActionType(3);
					   actionType[5] = 3;
					   actionTypeCost = 150;
					   RecountMoney();
					   actionTypeReminder.setText("Action Type: M-25($150)");
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[1] == false)
						{
							addM14BarrelLenght();
							done[1] = true;
						}
					}
				});
				*/
				return actionTypeM25;
			}
			else 
			{
				actionTypeNone = new JMenuItem("None");
				actionTypeNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setActionType(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setActionType(actionType[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				actionTypeNone.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the action type image to "M-25"
					   MyFrame.one.setActionType(0);
					   actionType[5] = 0;
					   actionTypeCost = 0;
					   RecountMoney();
					   actionTypeReminder.setText("Action Type: None");
					   actionTypeMenu.setForeground(new Color(100, 0, 0));
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[1] == false)
						{
							addM14BarrelLenght();
							done[1] = true;
						}
					}
				});
				*/
				return actionTypeNone;
			}
		}
		else if (myImageArrayType == 3)
		{
			if (myImageType == 1)
			{
				barrelLenght16Inch = new JMenuItem("16 Inch");
				barrelLenght16Inch.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setBarrelLenght(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setBarrelLenght(barrelLenght[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				barrelLenght16Inch.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
						// sets the Barrel Lenght image to 16
						MyFrame.one.setBarrelLenght(1);
						barrelLenghtMenu.setForeground(new Color(0, 100, 0));
						barrelLenght[5] = 1;
						barrelLenghtReminder.setText("Barrel Lenght: 16 Inch($50)");
						barrelLenghtCost = 50;
					    // repaints the Jframe
					    MyFrame.RePaint();
					    // Calls next menu
					    if (done[2] == false)
					 	{
							addM14Optics();
							done[2] = true;
						}
					   
					}
				});
				*/
				return barrelLenght16Inch;
			}
			else if (myImageType == 2)
			{
				barrelLenght18Inch = new JMenuItem("18 Inch");
				barrelLenght18Inch.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setBarrelLenght(2);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setBarrelLenght(barrelLenght[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				barrelLenght18Inch.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Barrel Lenght image to 16
					   MyFrame.one.setBarrelLenght(2);
						barrelLenghtMenu.setForeground(new Color(0, 100, 0));
					   barrelLenght[5] = 2;
					   barrelLenghtReminder.setText("Barrel Lenght: 18 Inch($100)");
					   barrelLenghtCost = 100;
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[2] == false)
						{
							addM14Optics();
							done[2] = true;
						}
					}
				});
				*/
				return barrelLenght18Inch;
			}
			else if (myImageType == 3)
			{
				barrelLenght20Inch = new JMenuItem("20 Inch");
				barrelLenght20Inch.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setBarrelLenght(3);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setBarrelLenght(barrelLenght[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				barrelLenght20Inch.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Barrel Lenght image to 16
					   MyFrame.one.setBarrelLenght(3);
						barrelLenghtMenu.setForeground(new Color(0, 100, 0));
					   barrelLenght[5] = 3;
					   barrelLenghtReminder.setText("Barrel Lenght: 20 Inch($150)");
					   barrelLenghtCost = 150;
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[2] == false)
						{
							addM14Optics();
							done[2] = true;
						}
					}
				});
				*/
				return barrelLenght20Inch;
			}
			else
			{
				barrelLenghtNone = new JMenuItem("None");
				barrelLenghtNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setBarrelLenght(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setBarrelLenght(barrelLenght[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				barrelLenghtNone.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Barrel Lenght image to 16
					   MyFrame.one.setBarrelLenght(0);
					   barrelLenghtMenu.setForeground(new Color(100, 0, 0));
					   barrelLenght[5] = 0;
					   barrelLenghtReminder.setText("Barrel Lenght: None");
					   barrelLenghtCost = 0;
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[2] == false)
						{
							addM14Optics();
							done[2] = true;
						}
					}
				});
				*/
				return barrelLenghtNone;
			}
		}
		else if (myImageArrayType == 4)
		{
			if (myImageType == 1)
			{
				opticsScope = new JMenuItem("Scope");
				opticsScope.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOptics(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOptics(optics[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticsScope.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Optics Image to "Scope"
					   MyFrame.one.setOptics(1);
					   opticsMenu.setForeground(new Color(0, 100, 0));
					   optics[5] = 1;
					   opticReminder.setText("Optics: Scope($50)");
					   opticsCost = 50;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[3] == false)
						{
							addM14OpticMount();
							done[3] = true;
						}
					   
					}
				});
				*/
				return opticsScope;
			}
			else if (myImageType == 2)
			{
				opticsReflexSight = new JMenuItem("Reflex Sight");
				opticsReflexSight.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOptics(2);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOptics(optics[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticsReflexSight.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Optics Image to "Reflex Sight"
					   MyFrame.one.setOptics(2);
					   opticsMenu.setForeground(new Color(0, 100, 0));
					   optics[5] = 2;
					   opticReminder.setText("Optics: Reflex Sight($100)");
					   opticsCost = 100;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[3] == false)
						{
							addM14OpticMount();
							done[3] = true;
						}
					}
				});
				*/
				return opticsReflexSight;
			}
			else 
			{
				opticsNone = new JMenuItem("None");
				opticsNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOptics(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOptics(optics[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticsNone.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Optics Image to "None"
					   MyFrame.one.setOptics(0);
					   opticsMenu.setForeground(new Color(100, 0, 0));
					   optics[5] = 0;
					   opticReminder.setText("Optics: None");
					   opticsCost = 0;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[3] == false)
						{
							addM14OpticMount();
							done[3] = true;
						}
					}
				});
				*/
				return opticsNone;
			}
		}
		else if (myImageArrayType == 5)
		{
			if (myImageType == 1)
			{
				opticMountBrooksStyle = new JMenuItem("Brooks Style");
				opticMountBrooksStyle.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOpticMount(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOpticMount(opticMount[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticMountBrooksStyle.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Opticmount image to "Brooks Style"
					   MyFrame.one.setOpticMount(1);
					   opticMountMenu.setForeground(new Color(0, 100, 0));
					   opticMount[5] = 1;
					   opticMountReminder.setText("OpticMount: Brooks Style($50)");
					   opticMountCost = 50;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[4] == false)
						{
							addM14Magazine();
							done[4] = true;
						}
						
					}
				});
				*/
				return opticMountBrooksStyle;
			}
			else if (myImageType == 2)
			{
				opticMountBarrelMountedPicatinny = new JMenuItem("Barrel Mounted Picatinny");
				opticMountBarrelMountedPicatinny.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOpticMount(2);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOpticMount(opticMount[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticMountBarrelMountedPicatinny.addActionListener(ALisener); 
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Opticmount image to "Barrel Mounted Picatinny"
					   MyFrame.one.setOpticMount(2);
					   opticMountMenu.setForeground(new Color(0, 100, 0));
					   // repaints the Jframe
					   opticMount[5] = 2;
					   opticMountReminder.setText("OpticMount: Barrel Mounted Picatinny($100)");
					   opticMountCost = 100;
					   RecountMoney();
					   // Calls next menu
					   if (done[4] == false)
						{
							addM14Magazine();
							done[4] = true;
						}
					}
				});
				*/
				return opticMountBarrelMountedPicatinny;
			}
			else if (myImageType == 3)
			{
				opticMountM25 = new JMenuItem("M-25");
				opticMountM25.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOpticMount(3);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOpticMount(opticMount[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticMountM25.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Opticmount image to "M-25"
					   MyFrame.one.setOpticMount(3);
					   opticMountMenu.setForeground(new Color(0, 100, 0));
					   opticMount[5] = 3;
					   opticMountReminder.setText("OpticMount: M-25($150)");
					   opticMountCost = 150;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[4] == false)
						{
							addM14Magazine();
							done[4] = true;
						}
					}
				});
				*/
				return opticMountM25;
			}
			else if (myImageType == 4)
			{
				opticMountSocomShort = new JMenuItem("Socom - Short");
				opticMountSocomShort.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOpticMount(4);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOpticMount(opticMount[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticMountSocomShort.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Opticmount image to "Socom - Short"
					   MyFrame.one.setOpticMount(4);
					   opticMountMenu.setForeground(new Color(0, 100, 0));
					   opticMount[5] = 4;
					   opticMountReminder.setText("OpticMount: Socom - Short($200)");
					   opticMountCost = 200;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[4] == false)
						{
							addM14Magazine();
							done[4] = true;
						}
					}
				});
				*/
				return opticMountSocomShort;
			}
			else if (myImageType == 5)
			{
				opticMountSocomExtended = new JMenuItem("Socom - Extended");
				opticMountSocomExtended.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOpticMount(5);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOpticMount(opticMount[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticMountSocomExtended.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Opticmount image to "Socom - Extended"
					   MyFrame.one.setOpticMount(5);
					   opticMountMenu.setForeground(new Color(0, 100, 0));
					   opticMount[5] = 5;
					   opticMountReminder.setText("OpticMount: Socom - Extended($250)");
					   opticMountCost = 250;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[4] == false)
						{
							addM14Magazine();
							done[4] = true;
						}
					}
				});
				*/
				return opticMountSocomExtended;
			}
			else 
			{
				opticMountNone = new JMenuItem("None");
				opticMountNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setOpticMount(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setOpticMount(opticMount[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				opticMountNone.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Opticmount Image to "None"
					   MyFrame.one.setOpticMount(0);
					   opticMountMenu.setForeground(new Color(100, 0, 0));
					   opticMount[5] = 0;
					   opticMountReminder.setText("OpticMount: None");
					   opticMountCost = 0;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[4] == false)
						{
							addM14Magazine();
							done[4] = true;
						}
					}
				});
				*/
				return opticMountNone;
			}
		}
		else if (myImageArrayType == 6)
		{
			if (myImageType == 1)
			{
				magazine5RD = new JMenuItem("5 RD");
				magazine5RD.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setMagazine(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setMagazine(magazine[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				magazine5RD.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Magazine image to "5 RD"
					   MyFrame.one.setMagazine(1);
					   magazineMenu.setForeground(new Color(0, 100, 0));
					   magazine[5] = 1;
					   magazineReminder.setText("Magazine: 5 RD($50)");
					   magazineCost = 50;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[5] == false)
						{
							addM14Bipod();
							done[5] = true;
						}
					   
					}
				});
				*/
				return magazine5RD;
			}
			else if (myImageType == 2)
			{
				magazine10RD = new JMenuItem("10 RD");
				magazine10RD.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setMagazine(2);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setMagazine(magazine[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				magazine10RD.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Magazine image to "10 RD"
					   MyFrame.one.setMagazine(2);
					   magazineMenu.setForeground(new Color(0, 100, 0));
					   magazine[5] = 2;
					   magazineReminder.setText("Magazine: 10 RD($100)");
					   magazineCost = 100;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[5] == false)
						{
							addM14Bipod();
							done[5] = true;
						}
					}
				});
				*/
				return magazine10RD;
			}
			else if (myImageType == 3)
			{
				magazine20RD = new JMenuItem("20 RD");
				magazine20RD.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setMagazine(3);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setMagazine(magazine[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				magazine20RD.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Magazine image to "15 RD"
					   MyFrame.one.setMagazine(3);
					   magazineMenu.setForeground(new Color(0, 100, 0));
					   magazine[5] = 3;
					   magazineReminder.setText("Magazine: 15 RD($150)");
					   magazineCost = 150;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[5] == false)
						{
							addM14Bipod();
							done[5] = true;
						}
					}
				});
				*/
				return magazine20RD;
			}
			else
			{
				magazineNone = new JMenuItem("None");
				magazineNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setMagazine(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setMagazine(magazine[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				magazineNone.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Magazine image to "15 RD"
					   MyFrame.one.setMagazine(0);
					   magazineMenu.setForeground(new Color(100, 0, 0));
					   // repaints the Jframe
					   magazine[5] = 0;
					   magazineReminder.setText("Magazine: None");
					   magazineCost = 0;
					   RecountMoney();
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[5] == false)
						{
							addM14Bipod();
							done[5] = true;
						}
					}
				});
				*/
				return magazineNone;
			}
		}
		else if (myImageArrayType == 7)
		{
			if (myImageType == 1)
			{
				bipodHarris = new JMenuItem("Harris");
				bipodHarris.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setBipod(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setBipod(bipod[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				bipodHarris.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Bipod image to "Harris"
					   MyFrame.one.setBipod(1);
					   bipodMenu.setForeground(new Color(0, 100, 0));
					   bipod[5] = 1;
					   bipodReminder.setText("Bipod: Harris($50)");
					   bipodCost = 50;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					   if (done[6] == false)
						{
							addM14Monopod();
							done[6] = true;
						}
					}
				});
				*/
				return bipodHarris;
			}
			else if (myImageType == 2)
			{
				bipodGGG = new JMenuItem("GG&G");
				bipodGGG.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setBipod(2);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setBipod(bipod[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				bipodGGG.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Bipod image to "GG&G"
					   MyFrame.one.setBipod(2);
					   bipodMenu.setForeground(new Color(0, 100, 0));
					   bipod[5] = 2;
					   bipodReminder.setText("Bipod: GG&G($100)");
					   bipodCost = 100;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[6] == false)
						{
							addM14Monopod();
							done[6] = true;
						}
					}
				});
				*/
				return bipodGGG;
			}
			else if (myImageType == 3)
			{
				bipodAtlas = new JMenuItem("Atlas");
				bipodAtlas.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setBipod(3);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setBipod(bipod[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				bipodAtlas.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Bipod image to "Atlas"
					   MyFrame.one.setBipod(3);
					   bipodMenu.setForeground(new Color(0, 100, 0));
					   bipod[5] = 3;
					   bipodReminder.setText("Bipod: Atlas($150)");
					   bipodCost = 150;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[6] == false)
						{
							addM14Monopod();
							done[6] = true;
						}
					}
				});
				*/
				return bipodAtlas;
			}
			else
			{
				bipodNone = new JMenuItem("None");
				bipodNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setBipod(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setBipod(bipod[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				bipodNone.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Bipod image to None
					   MyFrame.one.setBipod(0);
					   bipodMenu.setForeground(new Color(100, 0, 0));
					   bipod[5] = 0;
					   bipodReminder.setText("Bipod: None");
					   bipodCost = 0;
					   RecountMoney();
					   // repaints the Jframe
					   // Calls next menu
					   if (done[6] == false)
						{
							addM14Monopod();
							done[6] = true;
						}
					}
				});
				*/
				return bipodNone;
			}
		}
		else if (myImageArrayType == 8)
		{
			if (myImageType == 1)
			{
				monopodBT = new JMenuItem("BT");
				monopodBT.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setMonopod(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setMonopod(monopod[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				monopodBT.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Monopod image to "BT"
					   MyFrame.one.setMonopod(1);
					   monopodMenu.setForeground(new Color(0, 100, 0));
					   monopod[5] = 1;
					   monopodReminder.setText("Monopod: BT($50)");
					   monopodCost = 50;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[7] == false)
						{
							addM14ChassisColor();
							done[7] = true;
						}
					   
					}
				});
				*/
				return monopodBT;
			}
			else
			{
				monopodNone = new JMenuItem("None");
				monopodNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setMonopod(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setMonopod(monopod[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				monopodNone.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the Monopod image to "None"
					   MyFrame.one.setMonopod(0);
					   monopodMenu.setForeground(new Color(100, 0, 0));
					   monopod[5] = 0;
					   monopodReminder.setText("Monopod: None");
					   monopodCost = 0;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[7] == false)
						{
							addM14ChassisColor();
							done[7] = true;
						}
					}
				});
				*/
				return monopodNone;
			}
		}
		else if (myImageArrayType == 9)
		{
			if (myImageType == 1)
			{
				chassisColorBallisticWhite = new JMenuItem("Ballistic White");
				chassisColorBallisticWhite.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorBallisticWhite.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "Ballistic White"
					   MyFrame.one.setChassisColor(1);
					   chassisColorMenu.setForeground(new Color(0, 100, 0));
					   chassisColor[5] = 1;
					   chassisColorReminder.setText("ChassisColor: Ballistic White($5000)");
					   chassisColorCost = 5000;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					   
					}
				});
				*/
				return chassisColorBallisticWhite;
			}
			else if (myImageType == 2)
			{
				chassisColorGritTan = new JMenuItem("Grit Tan");
				chassisColorGritTan.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(2);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorGritTan.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "Grit Tan"
					   MyFrame.one.setChassisColor(2);
					   chassisColorMenu.setForeground(new Color(0, 100, 0));
					   chassisColor[5] = 2;
					   RecountMoney();
					   chassisColorReminder.setText("ChassisColor: Grit Tan($100)");
					   chassisColorCost = 100;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					}
				});
				*/
				return chassisColorGritTan;
			}
			else if (myImageType == 3)
			{
				chassisColorCoyoteBrown = new JMenuItem("Coyote Brown");
				chassisColorCoyoteBrown.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(3);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorCoyoteBrown.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "Coyote Brown"
					   MyFrame.one.setChassisColor(3);
					   chassisColorMenu.setForeground(new Color(0, 100, 0));
					   chassisColor[5] = 3;
					   RecountMoney();
					   chassisColorReminder.setText("ChassisColor: Coyote Brown($150)");
					   chassisColorCost = 150;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					}
				});
				*/
				return chassisColorCoyoteBrown;
			}
			else if (myImageType == 4)
			{
				chassisColorDarkEarth = new JMenuItem("Dark Earth");
				chassisColorDarkEarth.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(4);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorDarkEarth.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "Dark Earth"
					   MyFrame.one.setChassisColor(4);
					   chassisColorMenu.setForeground(new Color(0, 100, 0));
					   chassisColor[5] = 4;
					   RecountMoney();
					   chassisColorReminder.setText("ChassisColor: Dark Earth($200)");
					   chassisColorCost = 200;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					}
				});
				*/
				return chassisColorDarkEarth;
			}
			else if (myImageType == 5)
			{
				chassisColorOliveDrab = new JMenuItem("Olive Drab");
				chassisColorOliveDrab.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(5);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorOliveDrab.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "Olive Drab"
					   MyFrame.one.setChassisColor(5);
					   chassisColorMenu.setForeground(new Color(0, 100, 0));
					   chassisColor[5] = 5;
					   RecountMoney();
					   chassisColorReminder.setText("ChassisColor: Olive Drab($250)");
					   chassisColorCost = 250;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					}
				});
				*/
				return chassisColorOliveDrab;
			}
			else if (myImageType == 6)
			{
				chassisColorLowLightGreen = new JMenuItem("Lowlight Green");
				chassisColorLowLightGreen.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(6);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorLowLightGreen.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "Lowlight Green"
					   MyFrame.one.setChassisColor(6);
					   chassisColorMenu.setForeground(new Color(0, 100, 0));
					   chassisColor[5] = 6;
					   RecountMoney();
					   chassisColorReminder.setText("ChassisColor: Lowlight Green($275)");
					   chassisColorCost = 275;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					}
				});
				*/
				return chassisColorLowLightGreen;
			}
			else if (myImageType == 7)
			{
				chassisColorSwatBlack = new JMenuItem("Swat Black");
				chassisColorSwatBlack.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(7);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorSwatBlack.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "Swat Black"
					   MyFrame.one.setChassisColor(7);
					   chassisColorMenu.setForeground(new Color(0, 100, 0));
					   chassisColor[5] = 7;
					   RecountMoney();
					   chassisColorReminder.setText("ChassisColor: Swat Black($300)");
					   chassisColorCost = 300;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					}
				});
				*/
				return chassisColorSwatBlack;
			}
			else if (myImageType == 8)
			{
				chassisColorGIBrown = new JMenuItem("GI Brown");
				chassisColorGIBrown.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(8);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorGIBrown.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "GI Brown"
					   MyFrame.one.setChassisColor(8);
					   chassisColorMenu.setForeground(new Color(0, 100, 0));
					   chassisColor[5] = 8;
					   RecountMoney();
					   chassisColorReminder.setText("ChassisColor: GI Brown($350)");
					   chassisColorCost = 350;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					}
				});
				*/
				return chassisColorGIBrown;
			}
			else
			{
				chassisColorNone = new JMenuItem("None");
				chassisColorNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setChassisColor(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setChassisColor(chassisColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				chassisColorNone.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the ChassisColor image to "GI Brown"
					   MyFrame.one.setChassisColor(0);
					   chassisColorMenu.setForeground(new Color(100, 0, 0));
					   chassisColor[5] = 0;
					   RecountMoney();
					   chassisColorReminder.setText("ChassisColor: None");
					   chassisColorCost = 0;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   if (done[8] == false)
						{
							addM14GripColor();
							done[8] = true;
						}
					}
				});
				*/
				return chassisColorNone;
			}
		}
		else 
		{
			if (myImageType == 1)
			{
				gripColorBallisticWhite = new JMenuItem("Ballistic White");
				gripColorBallisticWhite.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(1);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorBallisticWhite.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "Ballistic White"
					   MyFrame.one.setGripColor(1);
					   gripColorMenu.setForeground(new Color(0, 100, 0));
					   gripColor[5] = 1;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: Ballistic White($50)");
					   gripColorCost = 50;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				});
				*/
				return gripColorBallisticWhite;
			}
			else if (myImageType == 2)
			{
				gripColorGritTan = new JMenuItem("Grit Tan");
				gripColorGritTan.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(2);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorGritTan.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "Grit Tan"
					   MyFrame.one.setGripColor(2);
					   gripColorMenu.setForeground(new Color(0, 100, 0));
					   gripColor[5] = 2;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: Grit Tan($100)");
					   gripColorCost = 100;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				});
				*/
				return gripColorGritTan;
			}
			else if (myImageType == 3)
			{
				gripColorCoyoteBrown = new JMenuItem("Coyote Brown");
				gripColorCoyoteBrown.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(3);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorCoyoteBrown.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "Coyote Brown"
					   MyFrame.one.setGripColor(3);
					   gripColorMenu.setForeground(new Color(0, 100, 0));
					   gripColor[5] = 3;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: Coyote Brown($150)");
					   gripColorCost = 150;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				});
				*/
				return gripColorCoyoteBrown;
			}
			else if (myImageType == 4)
			{
				gripColorDarkEarth = new JMenuItem("Dark Earth");
				gripColorDarkEarth.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(4);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorDarkEarth.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "Dark Earth"
					   MyFrame.one.setGripColor(4);
					   gripColorMenu.setForeground(new Color(0, 100, 0));
					   gripColor[5] = 4;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: Dark Earth($200)");
					   gripColorCost = 200;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				});
				*/
				return gripColorDarkEarth;
			}
			else if (myImageType == 5)
			{
				gripColorOliveDrab = new JMenuItem("Olive Drab");
				gripColorOliveDrab.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(5);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorOliveDrab.addActionListener(ALisener); 
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "Olive Drab"
					   MyFrame.one.setGripColor(5);
					   gripColorMenu.setForeground(new Color(0, 100, 0));
					   gripColor[5] = 5;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: Olive Drab($250)");
					   gripColorCost = 250;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				});
				*/
				return gripColorOliveDrab;
			}
			else if (myImageType == 6)
			{
				gripColorLowLightGreen = new JMenuItem("Lowlight Green");
				gripColorLowLightGreen.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(6);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorLowLightGreen.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "Lowlight Green"
					   MyFrame.one.setGripColor(6);
					   gripColorMenu.setForeground(new Color(0, 100, 0));
					   gripColor[5] = 6;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: Lowlight Green($300)");
					   gripColorCost = 300;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				});
				*/
				return gripColorLowLightGreen;
			}
			else if (myImageType == 7)
			{
				gripColorSwatBlack = new JMenuItem("Swat Black");
				gripColorSwatBlack.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(7);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorSwatBlack.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "Swat Black"
					   MyFrame.one.setGripColor(7);
					   gripColorMenu.setForeground(new Color(0, 100, 0));
					   gripColor[5] = 7;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: Swat Black($350)");
					   gripColorCost = 350;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				});
				*/
				return gripColorSwatBlack;
			}
			else if (myImageType == 8)
			{
				gripColorGIBrown = new JMenuItem("GI Brown");
				gripColorGIBrown.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(8);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorGIBrown.addActionListener(ALisener);
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "GI Brown"
					   MyFrame.one.setGripColor(8);
					   gripColorMenu.setForeground(new Color(0, 100, 0));
					   gripColor[5] = 8;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: GI Brown($400)");
					   gripColorCost = 400;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				});
				*/
				return gripColorGIBrown;
			}
			else
			{
				gripColorNone = new JMenuItem("None");
				gripColorNone.addMouseListener(MLisener);
				/*
				{
					public void mouseEntered(MouseEvent e)
					{
						MyFrame.one.setGripColor(0);
						MyFrame.RePaint();
					}
					public void mouseExited(MouseEvent e)
					{
						MyFrame.one.setGripColor(gripColor[5]);
						MyFrame.RePaint();
					}
					public void mouseReleased(MouseEvent e)
					{
					}
					public void mousePressed(MouseEvent e)
					{
					}
					public void mouseClicked(MouseEvent e)
					{
					}
				});
				*/
				gripColorNone.addActionListener(ALisener); 
				/*
				{
					public void actionPerformed(ActionEvent e)
					{
					   // sets the GripColor image to "GI Brown"
					   MyFrame.one.setGripColor(0);
					   gripColorMenu.setForeground(new Color(100, 0, 0));
					   gripColor[5] = 0;
					   RecountMoney();
					   gripColorReminder.setText("GripColor: None");
					   gripColorCost = 0;
					   RecountMoney();
					   // repaints the Jframe
					   MyFrame.RePaint();
					   // Calls next menu
					   
					}
				}
				*/
				return gripColorNone;
				
			}
		}
		return menuItem;
		
		
	}
	private static BufferedImage createImage(JPanel panel)
	{
		int width = panel.getWidth();
		int height = panel.getHeight();
		BufferedImage save = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = save.createGraphics();
		panel.paint(g);
		return save;
	}
	public static void RecountMoney()
	{
		int currentTotal = 0;
		currentTotal = rifleTypeCost + actionTypeCost + barrelLenghtCost + opticsCost + opticMountCost + magazineCost + bipodCost + monopodCost + chassisColorCost + gripColorCost;
		totalReminder.setText("Total: $" + currentTotal);
	}
	/*
	public void actionPerformed(ActionEvent e)
	{
		
		//if (e.getActionCommand)
		
		
		
		System.out.println(e.getActionCommand());
		
		
		
		
		MyFrame.RePaint();
    } 
	public void mouseEntered(MouseEvent e)
	{
		
		MyFrame.RePaint();
	}
	public void mouseExited(MouseEvent e)
	{
		
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
	*/
}

/**
RUN OUTPUT:

*/