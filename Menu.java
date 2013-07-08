
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
	, gripColorBallisticWhite, gripColorGritTan, gripColorCoyoteBrown, gripColorDarkEarth, gripColorOliveDrab, gripColorLowLightGreen, gripColorTitaniumGrey, gripColorSwatBlack, gripColorGIBrown, gripColorNone, rifleTypeM14, rifleTypeRem700
	, brandLRBM25, brandLRBM14, brandSpringfieldSupermatchM1A, brandSpringfieldNationalM1A, brandSpringfieldM25Whitefeather, brandSpringfieldM21Tactical, brandSpringfieldLoadedM1A, brandSpringfieldStandardM1A
	, brandSpringfieldScoutM1A, brandSpringfieldSocomII, brandSpringfieldSocom16, brandArmscorp, brandNorinco, brandPolytech, brandUSGISelectfire, quickBuild, reset, imageExporter;
	public static JMenuItem[] save = new JMenuItem[NumberSaveFiles + 1];
	public static JMenuItem[] load = new JMenuItem[NumberSaveFiles + 1];
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
	public static MenuPreformer MeLisener = new MenuPreformer();
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
		reset = new JMenuItem("Reset");
		reset.addActionListener(ALisener);

		//menu.setForeground(new Color(0, 100, 0));
		//menu.setBackground(new Color(0, 125, 125));
		menu.add(reset);

		//addMenuItems();
	}
	public static void addM14ActionType()
	{
		actionTypeMenu = new JMenu("2. Action Type");
		actionTypeMenu.setToolTipText("Choose Your actions type for your stock here");
		actionTypeMenu.setMnemonic(KeyEvent.VK_M);
        actionTypeMenu.addMenuListener(MeLisener);
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
        barrelLenghtMenu.addMenuListener(MeLisener);
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
        opticsMenu.addMenuListener(MeLisener);
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
        opticMountMenu.addMenuListener(MeLisener);
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
        magazineMenu.addMenuListener(MeLisener);
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
        bipodMenu.addMenuListener(MeLisener);
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
        monopodMenu.addMenuListener(MeLisener);
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
        chassisColorMenu.addMenuListener(MeLisener);
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
        gripColorMenu.addMenuListener(MeLisener);
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
				return rifleTypeM14;
			}
			else if (myImageType == 2)
			{
				rifleTypeRem700 = new JMenuItem("REM 700");
				rifleTypeRem700.setToolTipText("<html>better quality than the M-14 series for some reson;<br>" + " Cost: $100");
				rifleTypeRem700.addActionListener(ALisener);
				return rifleTypeRem700;
			}
			else if (myImageType == 3)
			{
				
				if (myExtendedMenus == 1)
				{	
					brandLRBM25 = new JMenuItem("LRB M25");
					brandLRBM25.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandLRBM25.addActionListener(ALisener);
					return brandLRBM25;
				}
				else if (myExtendedMenus == 2)
				{	
					brandLRBM14 = new JMenuItem("LRB M14");
					brandLRBM14.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandLRBM14.addActionListener(ALisener);
					return brandLRBM14;
				}
				else if (myExtendedMenus == 3)
				{	
					brandSpringfieldSupermatchM1A = new JMenuItem("Springfield Supermatch M1A");
					brandSpringfieldSupermatchM1A.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldSupermatchM1A.addActionListener(ALisener);
					return brandSpringfieldSupermatchM1A;
				}
				else if (myExtendedMenus == 4)
				{	
					brandSpringfieldNationalM1A = new JMenuItem("Springfield National M1A");
					brandSpringfieldNationalM1A.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldNationalM1A.addActionListener(ALisener);
					return brandSpringfieldNationalM1A;
				}
				else if (myExtendedMenus == 5)
				{	
					brandSpringfieldM25Whitefeather = new JMenuItem("Springfield M25 Whitefeather");
					brandSpringfieldM25Whitefeather.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldM25Whitefeather.addActionListener(ALisener);
					return brandSpringfieldM25Whitefeather;
				}
				else if (myExtendedMenus == 6)
				{	
					brandSpringfieldM21Tactical = new JMenuItem("Springfield M21 Tactical");
					brandSpringfieldM21Tactical.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldM21Tactical.addActionListener(ALisener);
					return brandSpringfieldM21Tactical;
				}
				else if (myExtendedMenus == 7)
				{	
					brandSpringfieldLoadedM1A = new JMenuItem("Springfield Loaded M1A");
					brandSpringfieldLoadedM1A.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldLoadedM1A.addActionListener(ALisener);
					return brandSpringfieldLoadedM1A;
				}
				else if (myExtendedMenus == 8)
				{	
					brandSpringfieldStandardM1A = new JMenuItem("Springfield Standard M1A");
					brandSpringfieldStandardM1A.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldStandardM1A.addActionListener(ALisener);
					return brandSpringfieldStandardM1A;
				}
				else if (myExtendedMenus == 9)
				{	
					brandSpringfieldScoutM1A = new JMenuItem("Springfield Scout M1A");
					brandSpringfieldScoutM1A.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldScoutM1A.addActionListener(ALisener);
					return brandSpringfieldScoutM1A;
				}
				else if (myExtendedMenus == 10)
				{	
					brandSpringfieldSocomII = new JMenuItem("Springfield Socom II (Top Rail Only)");
					brandSpringfieldSocomII.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldSocomII.addActionListener(ALisener);
					return brandSpringfieldSocomII;
				}
				else if (myExtendedMenus == 11)
				{	
					brandSpringfieldSocom16 = new JMenuItem("Springfield Socom 16");
					brandSpringfieldSocom16.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandSpringfieldSocom16.addActionListener(ALisener);
					return brandSpringfieldSocom16;
				}
				else if (myExtendedMenus == 12)
				{	
					brandArmscorp = new JMenuItem("Armscorp");
					brandArmscorp.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandArmscorp.addActionListener(ALisener);
					return brandArmscorp;
				}
				else if (myExtendedMenus == 13)
				{	
					brandNorinco = new JMenuItem("Norinco");
					brandNorinco.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandNorinco.addActionListener(ALisener);
					return brandNorinco;
				}
				else if (myExtendedMenus == 14)
				{	
					brandPolytech = new JMenuItem("Polytech");
					brandPolytech.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandPolytech.addActionListener(ALisener);
					return brandPolytech;
				}
				else if (myExtendedMenus == 15)
				{	
					brandUSGISelectfire = new JMenuItem("USGI Selectfire");
					brandUSGISelectfire.setToolTipText("<html>Brand info goes here;<br>" + " Cost: $150");
					brandUSGISelectfire.addActionListener(ALisener);
					return brandUSGISelectfire;
				}
				else
				{	
					quickBuild = new JMenuItem("Quick Build");
					quickBuild.addActionListener(ALisener);
					return quickBuild;
				}
			}
			else if (myImageType == 4)
			{
				if (myExtendedMenus == 1)
				{
					save[0] = new JMenuItem("SaveFile" + 1);
					save[0].addActionListener(ALisener);
					return save[0];
				}	
				else if (myExtendedMenus == 2)
				{	
					save[1] = new JMenuItem("SaveFile " + 2);
					save[1].addActionListener(ALisener);
					return save[1];
				}	
				else if (myExtendedMenus == 3)
				{		
					save[2] = new JMenuItem("SaveFile " + 3);
					save[2].addActionListener(ALisener);
					return save[2];
				}	
				else if (myExtendedMenus == 4)
				{		
					save[3] = new JMenuItem("SaveFile " + 4);
					save[3].addActionListener(ALisener);
					return save[3];
				}	
				else
				{		
					save[4] = new JMenuItem("SaveFile " + 5);
					save[4].addActionListener(ALisener);
					return save[4];
				}
			}
			else if (myImageType == 5)
			{
				
				if (myExtendedMenus == 1)
				{	
					load[0] = new JMenuItem("LoadFile " + 1);
					load[0].addActionListener(ALisener);
					return load[0];
				}	
				else if (myExtendedMenus == 2)
				{		
					load[1] = new JMenuItem("LoadFile " + 2);
					load[1].addActionListener(ALisener);
					return load[1];
				}	
				else if (myExtendedMenus == 3)
				{	
					load[2] = new JMenuItem("LoadFile " + 3);
					load[2].addActionListener(ALisener);
					return load[2];
				}	
				else if (myExtendedMenus == 4)
				{		
					load[3] = new JMenuItem("LoadFile " + 4);
					load[3].addActionListener(ALisener);
					return load[3];
				}	
				else
				{		
					load[4] = new JMenuItem("LoadFile " + 5);
					load[4].addActionListener(ALisener);
					return load[4];
				}
			}
			else
			{
				imageExporter = new JMenuItem("Export Current Image");
				imageExporter.addActionListener(ALisener);
				return imageExporter;
			}
		}
		else if (myImageArrayType == 2)
		{
			if (myImageType == 1)
			{
				actionTypeStandard = new JMenuItem("Standard");
				actionTypeStandard.addMouseListener(MLisener);
				actionTypeStandard.addActionListener(ALisener);
				return actionTypeStandard;
			}
			else if (myImageType == 2)
			{
				actionTypeRearLug = new JMenuItem("Rear Lug");
				actionTypeRearLug.addMouseListener(MLisener);
				actionTypeRearLug.addActionListener(ALisener);
				return actionTypeRearLug;
			}
			else if (myImageType == 3)
			{
				actionTypeM25 = new JMenuItem("M-25");
				actionTypeM25.addMouseListener(MLisener);
				actionTypeM25.addActionListener(ALisener);
				return actionTypeM25;
			}
			else 
			{
				actionTypeNone = new JMenuItem("None");
				actionTypeNone.addMouseListener(MLisener);
				actionTypeNone.addActionListener(ALisener);
				return actionTypeNone;
			}
		}
		else if (myImageArrayType == 3)
		{
			if (myImageType == 1)
			{
				barrelLenght16Inch = new JMenuItem("16 Inch");
				barrelLenght16Inch.addMouseListener(MLisener);
				barrelLenght16Inch.addActionListener(ALisener);
				return barrelLenght16Inch;
			}
			else if (myImageType == 2)
			{
				barrelLenght18Inch = new JMenuItem("18 Inch");
				barrelLenght18Inch.addMouseListener(MLisener);
				barrelLenght18Inch.addActionListener(ALisener);
				return barrelLenght18Inch;
			}
			else if (myImageType == 3)
			{
				barrelLenght20Inch = new JMenuItem("20 Inch");
				barrelLenght20Inch.addMouseListener(MLisener);
				barrelLenght20Inch.addActionListener(ALisener);
				return barrelLenght20Inch;
			}
			else
			{
				barrelLenghtNone = new JMenuItem("None");
				barrelLenghtNone.addMouseListener(MLisener);
				barrelLenghtNone.addActionListener(ALisener);
				return barrelLenghtNone;
			}
		}
		else if (myImageArrayType == 4)
		{
			if (myImageType == 1)
			{
				opticsScope = new JMenuItem("Scope");
				opticsScope.addMouseListener(MLisener);
				opticsScope.addActionListener(ALisener);
				return opticsScope;
			}
			else if (myImageType == 2)
			{
				opticsReflexSight = new JMenuItem("Reflex Sight");
				opticsReflexSight.addMouseListener(MLisener);
				opticsReflexSight.addActionListener(ALisener);
				return opticsReflexSight;
			}
			else 
			{
				opticsNone = new JMenuItem("None");
				opticsNone.addMouseListener(MLisener);
				opticsNone.addActionListener(ALisener);
				return opticsNone;
			}
		}
		else if (myImageArrayType == 5)
		{
			if (myImageType == 1)
			{
				opticMountBrooksStyle = new JMenuItem("Brooks Style");
				opticMountBrooksStyle.addMouseListener(MLisener);
				opticMountBrooksStyle.addActionListener(ALisener);
				return opticMountBrooksStyle;
			}
			else if (myImageType == 2)
			{
				opticMountBarrelMountedPicatinny = new JMenuItem("Barrel Mounted Picatinny");
				opticMountBarrelMountedPicatinny.addMouseListener(MLisener);
				opticMountBarrelMountedPicatinny.addActionListener(ALisener); 
				return opticMountBarrelMountedPicatinny;
			}
			else if (myImageType == 3)
			{
				opticMountM25 = new JMenuItem("M-25");
				opticMountM25.addMouseListener(MLisener);
				opticMountM25.addActionListener(ALisener);
				return opticMountM25;
			}
			else if (myImageType == 4)
			{
				opticMountSocomShort = new JMenuItem("Socom - Short");
				opticMountSocomShort.addMouseListener(MLisener);
				opticMountSocomShort.addActionListener(ALisener);
				return opticMountSocomShort;
			}
			else if (myImageType == 5)
			{
				opticMountSocomExtended = new JMenuItem("Socom - Extended");
				opticMountSocomExtended.addMouseListener(MLisener);
				opticMountSocomExtended.addActionListener(ALisener);
				return opticMountSocomExtended;
			}
			else 
			{
				opticMountNone = new JMenuItem("None");
				opticMountNone.addMouseListener(MLisener);
				opticMountNone.addActionListener(ALisener);
				return opticMountNone;
			}
		}
		else if (myImageArrayType == 6)
		{
			if (myImageType == 1)
			{
				magazine5RD = new JMenuItem("5 RD");
				magazine5RD.addMouseListener(MLisener);
				magazine5RD.addActionListener(ALisener);
				return magazine5RD;
			}
			else if (myImageType == 2)
			{
				magazine10RD = new JMenuItem("10 RD");
				magazine10RD.addMouseListener(MLisener);
				magazine10RD.addActionListener(ALisener);
				return magazine10RD;
			}
			else if (myImageType == 3)
			{
				magazine20RD = new JMenuItem("20 RD");
				magazine20RD.addMouseListener(MLisener);
				magazine20RD.addActionListener(ALisener);
				return magazine20RD;
			}
			else
			{
				magazineNone = new JMenuItem("None");
				magazineNone.addMouseListener(MLisener);
				magazineNone.addActionListener(ALisener);
				return magazineNone;
			}
		}
		else if (myImageArrayType == 7)
		{
			if (myImageType == 1)
			{
				bipodHarris = new JMenuItem("Harris");
				bipodHarris.addMouseListener(MLisener);
				bipodHarris.addActionListener(ALisener);
				return bipodHarris;
			}
			else if (myImageType == 2)
			{
				bipodGGG = new JMenuItem("GG&G");
				bipodGGG.addMouseListener(MLisener);
				bipodGGG.addActionListener(ALisener);
				return bipodGGG;
			}
			else if (myImageType == 3)
			{
				bipodAtlas = new JMenuItem("Atlas");
				bipodAtlas.addMouseListener(MLisener);
				bipodAtlas.addActionListener(ALisener);
				return bipodAtlas;
			}
			else
			{
				bipodNone = new JMenuItem("None");
				bipodNone.addMouseListener(MLisener);
				bipodNone.addActionListener(ALisener);
				return bipodNone;
			}
		}
		else if (myImageArrayType == 8)
		{
			if (myImageType == 1)
			{
				monopodBT = new JMenuItem("BT");
				monopodBT.addMouseListener(MLisener);
				monopodBT.addActionListener(ALisener);
				return monopodBT;
			}
			else
			{
				monopodNone = new JMenuItem("None");
				monopodNone.addMouseListener(MLisener);
				monopodNone.addActionListener(ALisener);
				return monopodNone;
			}
		}
		else if (myImageArrayType == 9)
		{
			if (myImageType == 1)
			{
				chassisColorBallisticWhite = new JMenuItem("Ballistic White");
				chassisColorBallisticWhite.addMouseListener(MLisener);
				chassisColorBallisticWhite.addActionListener(ALisener);
				return chassisColorBallisticWhite;
			}
			else if (myImageType == 2)
			{
				chassisColorGritTan = new JMenuItem("Grit Tan");
				chassisColorGritTan.addMouseListener(MLisener);
				chassisColorGritTan.addActionListener(ALisener);
				return chassisColorGritTan;
			}
			else if (myImageType == 3)
			{
				chassisColorCoyoteBrown = new JMenuItem("Coyote Brown");
				chassisColorCoyoteBrown.addMouseListener(MLisener);
				chassisColorCoyoteBrown.addActionListener(ALisener);
				return chassisColorCoyoteBrown;
			}
			else if (myImageType == 4)
			{
				chassisColorDarkEarth = new JMenuItem("Dark Earth");
				chassisColorDarkEarth.addMouseListener(MLisener);
				chassisColorDarkEarth.addActionListener(ALisener);
				return chassisColorDarkEarth;
			}
			else if (myImageType == 5)
			{
				chassisColorOliveDrab = new JMenuItem("Olive Drab");
				chassisColorOliveDrab.addMouseListener(MLisener);
				chassisColorOliveDrab.addActionListener(ALisener);
				return chassisColorOliveDrab;
			}
			else if (myImageType == 6)
			{
				chassisColorLowLightGreen = new JMenuItem("Lowlight Green");
				chassisColorLowLightGreen.addMouseListener(MLisener);
				chassisColorLowLightGreen.addActionListener(ALisener);
				return chassisColorLowLightGreen;
			}
			else if (myImageType == 7)
			{
				chassisColorSwatBlack = new JMenuItem("Swat Black");
				chassisColorSwatBlack.addMouseListener(MLisener);
				chassisColorSwatBlack.addActionListener(ALisener);
				return chassisColorSwatBlack;
			}
			else if (myImageType == 8)
			{
				chassisColorGIBrown = new JMenuItem("GI Brown");
				chassisColorGIBrown.addMouseListener(MLisener);
				chassisColorGIBrown.addActionListener(ALisener);
				return chassisColorGIBrown;
			}
			else
			{
				chassisColorNone = new JMenuItem("None");
				chassisColorNone.addMouseListener(MLisener);
				chassisColorNone.addActionListener(ALisener);
				return chassisColorNone;
			}
		}
		else 
		{
			if (myImageType == 1)
			{
				gripColorBallisticWhite = new JMenuItem("Ballistic White");
				gripColorBallisticWhite.addMouseListener(MLisener);
				gripColorBallisticWhite.addActionListener(ALisener);
				return gripColorBallisticWhite;
			}
			else if (myImageType == 2)
			{
				gripColorGritTan = new JMenuItem("Grit Tan");
				gripColorGritTan.addMouseListener(MLisener);
				gripColorGritTan.addActionListener(ALisener);
				return gripColorGritTan;
			}
			else if (myImageType == 3)
			{
				gripColorCoyoteBrown = new JMenuItem("Coyote Brown");
				gripColorCoyoteBrown.addMouseListener(MLisener);
				gripColorCoyoteBrown.addActionListener(ALisener);
				return gripColorCoyoteBrown;
			}
			else if (myImageType == 4)
			{
				gripColorDarkEarth = new JMenuItem("Dark Earth");
				gripColorDarkEarth.addMouseListener(MLisener);
				gripColorDarkEarth.addActionListener(ALisener);
				return gripColorDarkEarth;
			}
			else if (myImageType == 5)
			{
				gripColorOliveDrab = new JMenuItem("Olive Drab");
				gripColorOliveDrab.addMouseListener(MLisener);
				gripColorOliveDrab.addActionListener(ALisener);
				return gripColorOliveDrab;
			}
			else if (myImageType == 6)
			{
				gripColorLowLightGreen = new JMenuItem("Lowlight Green");
				gripColorLowLightGreen.addMouseListener(MLisener);
				gripColorLowLightGreen.addActionListener(ALisener);
				return gripColorLowLightGreen;
			}
			else if (myImageType == 7)
			{
				gripColorSwatBlack = new JMenuItem("Swat Black");
				gripColorSwatBlack.addMouseListener(MLisener);
				gripColorSwatBlack.addActionListener(ALisener);
				return gripColorSwatBlack;
			}
			else if (myImageType == 8)
			{
				gripColorGIBrown = new JMenuItem("GI Brown");
				gripColorGIBrown.addMouseListener(MLisener);
				gripColorGIBrown.addActionListener(ALisener);
				return gripColorGIBrown;
			}
			else
			{
				gripColorNone = new JMenuItem("None");
				gripColorNone.addMouseListener(MLisener);
				gripColorNone.addActionListener(ALisener); 
				return gripColorNone;
				
			}
		}
	}
	public static BufferedImage createImage(JPanel panel)
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
	
}

/**
RUN OUTPUT:

*/