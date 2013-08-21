
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
	public static JMenu menu, submenu, submenu2, submenu3, cheekRestTypeSpacer, cheekRestTypeThumbWheel, cheekRestTypeThumbWheelwQuickDetach, buttPadSpacer, buttSpacerQuanity, palmRestColor, handGuardStandard, handGuardVented
	, handGuardCutout, sidePicatinnyRail2inch, sidePicatinnyRail4inch, sidePicatinnyRail6inch, sidePicatinnyRail9inch;
	public static JMenu actionTypeMenu, barrelLenghtMenu, opticsMenu, opticMountMenu, magazineMenu, bipodMenu, monopodMenu, chassisColorMenu, gripColorMenu
	, cheekRestTypeMenu, buttPadMenu, buttSpacerMenu, palmRestMenu, offHandRestMenu, handGuardMenu, slingPlateMenu, flushRailMenu, sideRailAdaptersMenu, sidePicatinnyRailMenu, bottomPicatinnyRailMenu, bipodAdapterMenu, lugSlideMenu, barrelTensionerMenu, QDSlingSwivelsMenu;
	public static JMenuItem menuItem, actionTypeStandard, actionTypeRearLug, actionTypeM25, actionTypeNone, barrelLenght16Inch, barrelLenght18Inch, barrelLenght20Inch, barrelLenghtNone, opticsScope, opticsReflexSight, opticsNone, opticMountBrooksStyle, opticMountBarrelMountedPicatinny
	, opticMountM25, opticMountSocomShort, opticMountSocomExtended, opticMountNone, magazine5RD, magazine10RD, magazine20RD, magazineNone, bipodHarris, bipodGGG, bipodAtlas, bipodNone, monopodBT, monopodNone, chassisColorBallisticWhite
	, chassisColorGritTan, chassisColorCoyoteBrown, chassisColorDarkEarth, chassisColorOliveDrab, chassisColorLowLightGreen, chassisColorTitaniumGrey, chassisColorSwatBlack, chassisColorGIBrown, chassisColorNone
	, gripColorBallisticWhite, gripColorGritTan, gripColorCoyoteBrown, gripColorDarkEarth, gripColorOliveDrab, gripColorLowLightGreen, gripColorTitaniumGrey, gripColorSwatBlack, gripColorGIBrown, gripColorNone, rifleTypeM14, rifleTypeRem700
	, brandLRBM25, brandLRBM14, brandSpringfieldSupermatchM1A, brandSpringfieldNationalM1A, brandSpringfieldM25Whitefeather, brandSpringfieldM21Tactical, brandSpringfieldLoadedM1A, brandSpringfieldStandardM1A
	, brandSpringfieldScoutM1A, brandSpringfieldSocomII, brandSpringfieldSocom16, brandArmscorp, brandNorinco, brandPolytech, brandUSGISelectfire, quickBuild, cheekRestTypeSpacerColorBW
	, cheekRestTypeSpacerColorGT, cheekRestTypeSpacerColorCB, cheekRestTypeSpacerColorDE, cheekRestTypeSpacerColorOD, cheekRestTypeSpacerColorLG, cheekRestTypeSpacerColorSB, cheekRestTypeSpacerColorGIB
	, cheekRestTypeThumbWheelColorBW, cheekRestTypeThumbWheelColorGT, cheekRestTypeThumbWheelColorCB, cheekRestTypeThumbWheelColorDE, cheekRestTypeThumbWheelColorOD, cheekRestTypeThumbWheelColorSB, cheekRestTypeThumbWheelColorLG, cheekRestTypeThumbWheelColorGIB
	, cheekRestTypeThumbWheelwQuickDetachColorBW, cheekRestTypeThumbWheelwQuickDetachColorGT, cheekRestTypeThumbWheelwQuickDetachColorCB, cheekRestTypeThumbWheelwQuickDetachColorDE, cheekRestTypeThumbWheelwQuickDetachColorOD, cheekRestTypeThumbWheelwQuickDetachColorSB, cheekRestTypeThumbWheelwQuickDetachColorLG, cheekRestTypeThumbWheelwQuickDetachColorGIB
	, cheekRestTypeNone, buttPadSpacerColorBW, buttPadSpacerColorGT, buttPadSpacerColorCB, buttPadSpacerColorDE, buttPadSpacerColorOD, buttPadSpacerColorSB, buttPadSpacerColorLG, buttPadSpacerColorGIB
	, buttPadNone, buttSpacerQ1, buttSpacerQ2, buttSpacerQ3, buttSpacerQ4, buttSpacerQ5, buttSpacerQ6, buttSpacerQ7, buttSpacerQ8, buttSpacerQ9, buttSpacerQNone
	, palmRestColorBW, palmRestColorGT, palmRestColorCB, palmRestColorDE, palmRestColorOD, palmRestColorSB, palmRestColorLG, palmRestColorGIB, palmRestNone
	, offHandRestYes, offHandRestNone, handGuardStandardColorBW, handGuardStandardColorGT, handGuardStandardColorCB, handGuardStandardColorDE, handGuardStandardColorOD, handGuardStandardColorSB, handGuardStandardColorLG, handGuardStandardColorGIB
	, handGuardVentedColorBW, handGuardVentedColorGT, handGuardVentedColorCB, handGuardVentedColorDE, handGuardVentedColorOD, handGuardVentedColorSB, handGuardVentedColorLG, handGuardVentedColorGIB
	, handGuardCutoutColorBW, handGuardCutoutColorGT, handGuardCutoutColorCB, handGuardCutoutColorDE, handGuardCutoutColorOD, handGuardCutoutColorSB, handGuardCutoutColorLG, handGuardCutoutColorGIB, handGuardNone, slingPlateYes, slingPlateNone, flushRailYes, flushRailNone
	, sideRailAdaptersYes, sideRailAdaptersNone, sidePicatinnyRail2inch1, sidePicatinnyRail2inch2, sidePicatinnyRail4inch1, sidePicatinnyRail4inch2, sidePicatinnyRail6inch1, sidePicatinnyRail6inch2, sidePicatinnyRail9inch1, sidePicatinnyRail9inch2
	, bottomPicatinnyRail2inch, bottomPicatinnyRail4inch, bottomPicatinnyRail6inch, bottomPicatinnyRail9inch, bottomPicatinnyRailNone
	, bipodAdapter, bipodAdapterNone, lugSlideStandard, lugSlideTitanium, lugSlideNone, barrelTensioner, barrelTensionerNone, QDSlingSwivels, QDSlingSwivelsNone, reset, imageExporter;
	//ColorBW ColorGT ColorCB ColorDE ColorOD ColorSB ColorLG ColorGIB
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
	public static void addCheekRestType()
	{
		cheekRestTypeMenu = new JMenu("11. Cheek Rest");
		cheekRestTypeMenu.setMnemonic(KeyEvent.VK_M);
        cheekRestTypeMenu.addMenuListener(MeLisener);
		// change to sub menu (9colors)
		cheekRestTypeSpacer = new JMenu("Spacer");
		cheekRestTypeSpacer.add(addNewMenuItem(11,1,1));
		cheekRestTypeSpacer.add(addNewMenuItem(11,1,2));
		cheekRestTypeSpacer.add(addNewMenuItem(11,1,3));
		cheekRestTypeSpacer.add(addNewMenuItem(11,1,4));
		cheekRestTypeSpacer.add(addNewMenuItem(11,1,5));
		cheekRestTypeSpacer.add(addNewMenuItem(11,1,6));
		cheekRestTypeSpacer.add(addNewMenuItem(11,1,7));
		cheekRestTypeSpacer.add(addNewMenuItem(11,1,8));
		//cheekRestTypeSpacer.add(addNewMenuItem(11,1,9));
		cheekRestTypeMenu.add(cheekRestTypeSpacer);
		// change to sub menu (9colors)
		cheekRestTypeThumbWheel = new JMenu("ThumbWheel");
		cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,1));
		cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,2));
		cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,3));
		cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,4));
		cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,5));
		cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,6));
		cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,7));
		cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,8));
		//cheekRestTypeThumbWheel.add(addNewMenuItem(11,2,9));
		cheekRestTypeMenu.add(cheekRestTypeThumbWheel);
		// change to sub menu (9colors)
		cheekRestTypeThumbWheelwQuickDetach = new JMenu("ThumbWheel W/Quick Detach");
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,1));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,2));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,3));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,4));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,5));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,6));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,7));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,8));
		//cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(11,3,9));
		cheekRestTypeMenu.add(cheekRestTypeThumbWheelwQuickDetach);
		
		cheekRestTypeMenu.add(addNewMenuItem(11,4,0));
		cheekRestTypeMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(cheekRestTypeMenu);
		MyFrame.RePaint();
	}
	public static void addButtPad()
	{
		buttPadMenu = new JMenu("12. ButtPad");
		buttPadMenu.setMnemonic(KeyEvent.VK_M);
        buttPadMenu.addMenuListener(MeLisener);
		// submenu 9 colors
		buttPadSpacer = new JMenu("Spacer");
		buttPadSpacer.add(addNewMenuItem(12,1,1));
		buttPadSpacer.add(addNewMenuItem(12,1,2));
		buttPadSpacer.add(addNewMenuItem(12,1,3));
		buttPadSpacer.add(addNewMenuItem(12,1,4));
		buttPadSpacer.add(addNewMenuItem(12,1,5));
		buttPadSpacer.add(addNewMenuItem(12,1,6));
		buttPadSpacer.add(addNewMenuItem(12,1,7));
		buttPadSpacer.add(addNewMenuItem(12,1,8));
		//buttPadSpacer.add(addNewMenuItem(12,1,9));
		buttPadMenu.add(buttPadSpacer);
		buttPadMenu.add(addNewMenuItem(12,2,0));
		buttPadMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(buttPadMenu);
		MyFrame.RePaint();
	}
	public static void addButtSpacer()
	{
		buttSpacerMenu = new JMenu("13. Butt Spacer");
		buttSpacerMenu.setMnemonic(KeyEvent.VK_M);
        buttSpacerMenu.addMenuListener(MeLisener);
		//submenu 1-9
		buttSpacerQuanity = new JMenu("Quanity");
		buttSpacerQuanity.add(addNewMenuItem(13,1,1));
		buttSpacerQuanity.add(addNewMenuItem(13,1,2));
		buttSpacerQuanity.add(addNewMenuItem(13,1,3));
		buttSpacerQuanity.add(addNewMenuItem(13,1,4));
		buttSpacerQuanity.add(addNewMenuItem(13,1,5));
		buttSpacerQuanity.add(addNewMenuItem(13,1,6));
		buttSpacerQuanity.add(addNewMenuItem(13,1,7));
		buttSpacerQuanity.add(addNewMenuItem(13,1,8));
		buttSpacerQuanity.add(addNewMenuItem(13,1,9));
		buttSpacerMenu.add(buttSpacerQuanity);
		buttSpacerMenu.add(addNewMenuItem(13,2,0));
		buttSpacerMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(buttSpacerMenu);
		MyFrame.RePaint();
	}
	public static void addPalmRest()
	{
		palmRestMenu = new JMenu("14. Palm Rest");
		palmRestMenu.setMnemonic(KeyEvent.VK_M);
        palmRestMenu.addMenuListener(MeLisener);
		// submenu (9color)
		palmRestColor = new JMenu("Color");
		palmRestColor.add(addNewMenuItem(14,1,1));
		palmRestColor.add(addNewMenuItem(14,1,2));
		palmRestColor.add(addNewMenuItem(14,1,3));
		palmRestColor.add(addNewMenuItem(14,1,4));
		palmRestColor.add(addNewMenuItem(14,1,5));
		palmRestColor.add(addNewMenuItem(14,1,6));
		palmRestColor.add(addNewMenuItem(14,1,7));
		palmRestColor.add(addNewMenuItem(14,1,8));
		//palmRestColor.add(addNewMenuItem(14,1,9));
		palmRestMenu.add(palmRestColor);
		palmRestMenu.add(addNewMenuItem(14,2,0));
		palmRestMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(palmRestMenu);
		MyFrame.RePaint();
	}
	public static void addOffHandRest()
	{
		offHandRestMenu = new JMenu("15. offHandRest");
		offHandRestMenu.setMnemonic(KeyEvent.VK_M);
        offHandRestMenu.addMenuListener(MeLisener);
		offHandRestMenu.add(addNewMenuItem(15,1,0));
		offHandRestMenu.add(addNewMenuItem(15,2,0));
		offHandRestMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(offHandRestMenu);
		MyFrame.RePaint();
	}
	public static void addHandGuard()
	{
		handGuardMenu = new JMenu("16. Hand Guard");
		handGuardMenu.setMnemonic(KeyEvent.VK_M);
        handGuardMenu.addMenuListener(MeLisener);
		// change to sub menu (9colors)
		cheekRestTypeSpacer = new JMenu("Spacer");
		cheekRestTypeSpacer.add(addNewMenuItem(16,1,1));
		cheekRestTypeSpacer.add(addNewMenuItem(16,1,2));
		cheekRestTypeSpacer.add(addNewMenuItem(16,1,3));
		cheekRestTypeSpacer.add(addNewMenuItem(16,1,4));
		cheekRestTypeSpacer.add(addNewMenuItem(16,1,5));
		cheekRestTypeSpacer.add(addNewMenuItem(16,1,6));
		cheekRestTypeSpacer.add(addNewMenuItem(16,1,7));
		cheekRestTypeSpacer.add(addNewMenuItem(16,1,8));
		//cheekRestTypeSpacer.add(addNewMenuItem(16,1,9));
		cheekRestTypeMenu.add(cheekRestTypeSpacer);
		// change to sub menu (9colors)
		cheekRestTypeThumbWheel = new JMenu("ThumbWheel");
		cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,1));
		cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,2));
		cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,3));
		cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,4));
		cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,5));
		cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,6));
		cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,7));
		cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,8));
		//cheekRestTypeThumbWheel.add(addNewMenuItem(16,2,9));
		cheekRestTypeMenu.add(cheekRestTypeThumbWheel);
		// change to sub menu (9colors)
		cheekRestTypeThumbWheelwQuickDetach = new JMenu("ThumbWheel W/Quick Detach");
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,1));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,2));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,3));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,4));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,5));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,6));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,7));
		cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,8));
		//cheekRestTypeThumbWheelwQuickDetach.add(addNewMenuItem(16,3,9));
		cheekRestTypeMenu.add(cheekRestTypeThumbWheelwQuickDetach);
		cheekRestTypeMenu.add(addNewMenuItem(16,4,0));
		handGuardMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(handGuardMenu);
		MyFrame.RePaint();
	}
	public static void addSlingPlate()
	{
		slingPlateMenu = new JMenu("17. Sling Plate");
		slingPlateMenu.setMnemonic(KeyEvent.VK_M);
        slingPlateMenu.addMenuListener(MeLisener);
		slingPlateMenu.add(addNewMenuItem(17,1,0));
		slingPlateMenu.add(addNewMenuItem(17,2,0));
		slingPlateMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(slingPlateMenu);
		MyFrame.RePaint();
	}
	public static void addFlushRail()
	{
		flushRailMenu = new JMenu("18. Flush Rail");
		flushRailMenu.setMnemonic(KeyEvent.VK_M);
        flushRailMenu.addMenuListener(MeLisener);
		flushRailMenu.add(addNewMenuItem(18,1,0));
		flushRailMenu.add(addNewMenuItem(18,2,0));
		flushRailMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(flushRailMenu);
		MyFrame.RePaint();
	}
	public static void addSideRailAdapter()
	{
		sideRailAdaptersMenu = new JMenu("19. Side Rail Adapter");
		sideRailAdaptersMenu.setMnemonic(KeyEvent.VK_M);
        sideRailAdaptersMenu.addMenuListener(MeLisener);
		sideRailAdaptersMenu.add(addNewMenuItem(19,1,0));
		sideRailAdaptersMenu.add(addNewMenuItem(19,2,0));
		sideRailAdaptersMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(sideRailAdaptersMenu);
		MyFrame.RePaint();
	}
	public static void addSidePicatinnyRail()
	{
		sidePicatinnyRailMenu = new JMenu("20. Side Picatinny Rail");
		sidePicatinnyRailMenu.setMnemonic(KeyEvent.VK_M);
        sidePicatinnyRailMenu.addMenuListener(MeLisener);
		// submenu 1-2
		sidePicatinnyRail2inch = new JMenu("2inch");
		sidePicatinnyRailMenu.add(addNewMenuItem(20,1,1));
		sidePicatinnyRailMenu.add(addNewMenuItem(20,1,2));
		sidePicatinnyRailMenu.add(sidePicatinnyRail2inch);
		// submenu 1-2
		sidePicatinnyRail4inch = new JMenu("4inch");
		sidePicatinnyRailMenu.add(addNewMenuItem(20,2,1));
		sidePicatinnyRailMenu.add(addNewMenuItem(20,2,2));
		sidePicatinnyRailMenu.add(sidePicatinnyRail4inch);
		// submenu 1-2
		sidePicatinnyRail6inch = new JMenu("6inch");
		sidePicatinnyRailMenu.add(addNewMenuItem(20,3,1));
		sidePicatinnyRailMenu.add(addNewMenuItem(20,3,2));
		sidePicatinnyRailMenu.add(sidePicatinnyRail6inch);
		// submenu 1-2
		sidePicatinnyRail9inch = new JMenu("9inch");
		sidePicatinnyRailMenu.add(addNewMenuItem(20,4,1));
		sidePicatinnyRailMenu.add(addNewMenuItem(20,4,2));
		sidePicatinnyRailMenu.add(sidePicatinnyRail9inch);
		sidePicatinnyRailMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(sidePicatinnyRailMenu);
		MyFrame.RePaint();
	}
	public static void addBottomPicatinnyRail()
	{
		bottomPicatinnyRailMenu = new JMenu("21. Bottom Picatinny Rail");
		bottomPicatinnyRailMenu.setMnemonic(KeyEvent.VK_M);
        bottomPicatinnyRailMenu.addMenuListener(MeLisener);
		bottomPicatinnyRailMenu.add(addNewMenuItem(21,1,0));
		bottomPicatinnyRailMenu.add(addNewMenuItem(21,2,0));
		bottomPicatinnyRailMenu.add(addNewMenuItem(21,3,0));
		bottomPicatinnyRailMenu.add(addNewMenuItem(21,4,0));
		bottomPicatinnyRailMenu.add(addNewMenuItem(21,5,0));
		bottomPicatinnyRailMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(bottomPicatinnyRailMenu);
		MyFrame.RePaint();
	}
	public static void addBipodAdapter()
	{
		bipodAdapterMenu = new JMenu("22. BipodAdapter");
		bipodAdapterMenu.setMnemonic(KeyEvent.VK_M);
        bipodAdapterMenu.addMenuListener(MeLisener);
		bipodAdapterMenu.add(addNewMenuItem(22,1,0));
		bipodAdapterMenu.add(addNewMenuItem(22,2,0));
		bipodAdapterMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(bipodAdapterMenu);
		MyFrame.RePaint();
	}
	public static void addLugSlide()
	{
		lugSlideMenu = new JMenu("23. Lug Slide");
		lugSlideMenu.setMnemonic(KeyEvent.VK_M);
        lugSlideMenu.addMenuListener(MeLisener);
		lugSlideMenu.add(addNewMenuItem(23,1,0));
		lugSlideMenu.add(addNewMenuItem(23,2,0));
		lugSlideMenu.add(addNewMenuItem(23,3,0));
		lugSlideMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(lugSlideMenu);
		MyFrame.RePaint();
	}
	public static void addBarrelTensioner()
	{
		barrelTensionerMenu = new JMenu("24. Barrel Tensioner");
		barrelTensionerMenu.setMnemonic(KeyEvent.VK_M);
        barrelTensionerMenu.addMenuListener(MeLisener);
		barrelTensionerMenu.add(addNewMenuItem(24,1,0));
		barrelTensionerMenu.add(addNewMenuItem(24,2,0));
		barrelTensionerMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(barrelTensionerMenu);
		MyFrame.RePaint();
	}
	public static void addQDSlingSwivels()
	{
		QDSlingSwivelsMenu = new JMenu("25. QD Sling Swivels");
		QDSlingSwivelsMenu.setMnemonic(KeyEvent.VK_M);
        QDSlingSwivelsMenu.addMenuListener(MeLisener);
		QDSlingSwivelsMenu.add(addNewMenuItem(25,1,0));
		QDSlingSwivelsMenu.add(addNewMenuItem(25,2,0));
		QDSlingSwivelsMenu.setForeground(new Color(100, 0, 0));
		menuBar.add(QDSlingSwivelsMenu);
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
		else if (myImageArrayType == 10)
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
		else if (myImageArrayType == 11)
		{
			if (myImageType == 1)
			{
				if (myExtendedMenus == 1)
				{
					cheekRestTypeSpacerColorBW = new JMenuItem("Ballistic White");
					cheekRestTypeSpacerColorBW.addMouseListener(MLisener);
					cheekRestTypeSpacerColorBW.addActionListener(ALisener);
					return cheekRestTypeSpacerColorBW;
				}
				else if (myExtendedMenus == 2)
				{
					cheekRestTypeSpacerColorGT = new JMenuItem("Grit Tan");
					cheekRestTypeSpacerColorGT.addMouseListener(MLisener);
					cheekRestTypeSpacerColorGT.addActionListener(ALisener);
					return cheekRestTypeSpacerColorGT;
				}
				else if (myExtendedMenus == 3)
				{
					cheekRestTypeSpacerColorCB = new JMenuItem("Coyote Brown");
					cheekRestTypeSpacerColorCB.addMouseListener(MLisener);
					cheekRestTypeSpacerColorCB.addActionListener(ALisener);
					return cheekRestTypeSpacerColorCB;
				}
				else if (myExtendedMenus == 4)
				{
					cheekRestTypeSpacerColorDE = new JMenuItem("Dark Earth");
					cheekRestTypeSpacerColorDE.addMouseListener(MLisener);
					cheekRestTypeSpacerColorDE.addActionListener(ALisener);
					return cheekRestTypeSpacerColorDE;
				}
				else if (myExtendedMenus == 5)
				{
					cheekRestTypeSpacerColorOD = new JMenuItem("Olive Drab");
					cheekRestTypeSpacerColorOD.addMouseListener(MLisener);
					cheekRestTypeSpacerColorOD.addActionListener(ALisener);
					return cheekRestTypeSpacerColorOD;
				}
				else if (myExtendedMenus == 6)
				{
					cheekRestTypeSpacerColorLG = new JMenuItem("Lowlight Green");
					cheekRestTypeSpacerColorLG.addMouseListener(MLisener);
					cheekRestTypeSpacerColorLG.addActionListener(ALisener);
					return cheekRestTypeSpacerColorLG;
				}
				else if (myExtendedMenus == 7)
				{
					cheekRestTypeSpacerColorSB = new JMenuItem("Swat Black");
					cheekRestTypeSpacerColorSB.addMouseListener(MLisener);
					cheekRestTypeSpacerColorSB.addActionListener(ALisener);
					return cheekRestTypeSpacerColorSB;
				}
				else 
				{
					cheekRestTypeSpacerColorGIB = new JMenuItem("GI Brown");
					cheekRestTypeSpacerColorGIB.addMouseListener(MLisener);
					cheekRestTypeSpacerColorGIB.addActionListener(ALisener);
					return cheekRestTypeSpacerColorGIB;
				}
			}
			else if (myImageType == 2)
			{
				if (myExtendedMenus == 1)
				{
					cheekRestTypeThumbWheelColorBW = new JMenuItem("Ballistic White");
					cheekRestTypeThumbWheelColorBW.addMouseListener(MLisener);
					cheekRestTypeThumbWheelColorBW.addActionListener(ALisener);
					return cheekRestTypeThumbWheelColorBW;
				}
				else if (myExtendedMenus == 2)
				{
					cheekRestTypeThumbWheelColorGT = new JMenuItem("Grit Tan");
					cheekRestTypeThumbWheelColorGT.addMouseListener(MLisener);
					cheekRestTypeThumbWheelColorGT.addActionListener(ALisener);
					return cheekRestTypeThumbWheelColorGT;
				}
				else if (myExtendedMenus == 3)
				{
					cheekRestTypeThumbWheelColorCB = new JMenuItem("Coyote Brown");
					cheekRestTypeThumbWheelColorCB.addMouseListener(MLisener);
					cheekRestTypeThumbWheelColorCB.addActionListener(ALisener);
					return cheekRestTypeThumbWheelColorCB;
				}
				else if (myExtendedMenus == 4)
				{
					cheekRestTypeThumbWheelColorDE = new JMenuItem("Dark Earth");
					cheekRestTypeThumbWheelColorDE.addMouseListener(MLisener);
					cheekRestTypeThumbWheelColorDE.addActionListener(ALisener);
					return cheekRestTypeThumbWheelColorDE;
				}
				else if (myExtendedMenus == 5)
				{
					cheekRestTypeThumbWheelColorOD = new JMenuItem("Olive Drab");
					cheekRestTypeThumbWheelColorOD.addMouseListener(MLisener);
					cheekRestTypeThumbWheelColorOD.addActionListener(ALisener);
					return cheekRestTypeThumbWheelColorOD;
				}
				else if (myExtendedMenus == 6)
				{
					cheekRestTypeThumbWheelColorLG = new JMenuItem("Lowlight Green");
					cheekRestTypeThumbWheelColorLG.addMouseListener(MLisener);
					cheekRestTypeThumbWheelColorLG.addActionListener(ALisener);
					return cheekRestTypeThumbWheelColorLG;
				}
				else if (myExtendedMenus == 7)
				{
					cheekRestTypeThumbWheelColorSB = new JMenuItem("Swat Black");
					cheekRestTypeThumbWheelColorSB.addMouseListener(MLisener);
					cheekRestTypeThumbWheelColorSB.addActionListener(ALisener);
					return cheekRestTypeThumbWheelColorSB;
				}
				else 
				{
					cheekRestTypeThumbWheelColorGIB = new JMenuItem("GI Brown");
					cheekRestTypeThumbWheelColorGIB.addMouseListener(MLisener);
					cheekRestTypeThumbWheelColorGIB.addActionListener(ALisener);
					return cheekRestTypeThumbWheelColorGIB;
				}
			}
			else if (myImageType == 3)
			{
				if (myExtendedMenus == 1)
				{
					cheekRestTypeThumbWheelwQuickDetachColorBW = new JMenuItem("Ballistic White");
					cheekRestTypeThumbWheelwQuickDetachColorBW.addMouseListener(MLisener);
					cheekRestTypeThumbWheelwQuickDetachColorBW.addActionListener(ALisener);
					return cheekRestTypeThumbWheelwQuickDetachColorBW;
				}
				else if (myExtendedMenus == 2)
				{
					cheekRestTypeThumbWheelwQuickDetachColorGT = new JMenuItem("Grit Tan");
					cheekRestTypeThumbWheelwQuickDetachColorGT.addMouseListener(MLisener);
					cheekRestTypeThumbWheelwQuickDetachColorGT.addActionListener(ALisener);
					return cheekRestTypeThumbWheelwQuickDetachColorGT;
				}
				else if (myExtendedMenus == 3)
				{
					cheekRestTypeThumbWheelwQuickDetachColorCB = new JMenuItem("Coyote Brown");
					cheekRestTypeThumbWheelwQuickDetachColorCB.addMouseListener(MLisener);
					cheekRestTypeThumbWheelwQuickDetachColorCB.addActionListener(ALisener);
					return cheekRestTypeThumbWheelwQuickDetachColorCB;
				}
				if (myExtendedMenus == 4)
				{
					cheekRestTypeThumbWheelwQuickDetachColorDE = new JMenuItem("Dark Earth");
					cheekRestTypeThumbWheelwQuickDetachColorDE.addMouseListener(MLisener);
					cheekRestTypeThumbWheelwQuickDetachColorDE.addActionListener(ALisener);
					return cheekRestTypeThumbWheelwQuickDetachColorDE;
				}
				if (myExtendedMenus == 5)
				{
					cheekRestTypeThumbWheelwQuickDetachColorOD = new JMenuItem("Olive Drab");
					cheekRestTypeThumbWheelwQuickDetachColorOD.addMouseListener(MLisener);
					cheekRestTypeThumbWheelwQuickDetachColorOD.addActionListener(ALisener);
					return cheekRestTypeThumbWheelwQuickDetachColorOD;
				}
				if (myExtendedMenus == 6)
				{
					cheekRestTypeThumbWheelwQuickDetachColorLG = new JMenuItem("Lowlight Green");
					cheekRestTypeThumbWheelwQuickDetachColorLG.addMouseListener(MLisener);
					cheekRestTypeThumbWheelwQuickDetachColorLG.addActionListener(ALisener);
					return cheekRestTypeThumbWheelwQuickDetachColorLG;
				}
				if (myExtendedMenus == 7)
				{
					cheekRestTypeThumbWheelwQuickDetachColorSB = new JMenuItem("Swat Black");
					cheekRestTypeThumbWheelwQuickDetachColorSB.addMouseListener(MLisener);
					cheekRestTypeThumbWheelwQuickDetachColorSB.addActionListener(ALisener);
					return cheekRestTypeThumbWheelwQuickDetachColorSB;
				}
				else 
				{
					cheekRestTypeThumbWheelwQuickDetachColorGIB = new JMenuItem("GI Brown");
					cheekRestTypeThumbWheelwQuickDetachColorGIB.addMouseListener(MLisener);
					cheekRestTypeThumbWheelwQuickDetachColorGIB.addActionListener(ALisener);
					return cheekRestTypeThumbWheelwQuickDetachColorGIB;
				}
			}
			else 
			{
				cheekRestTypeNone = new JMenuItem("None");
				cheekRestTypeNone.addMouseListener(MLisener);
				cheekRestTypeNone.addActionListener(ALisener);
				return cheekRestTypeNone;
			}
		}
		else if (myImageArrayType == 12)
		{
			if (myImageType == 1)
			{
				if (myExtendedMenus == 1)
				{
					buttPadSpacerColorBW = new JMenuItem("Ballistic White");
					buttPadSpacerColorBW.addMouseListener(MLisener);
					buttPadSpacerColorBW.addActionListener(ALisener);
					return buttPadSpacerColorBW;
				}
				else if (myExtendedMenus == 2)
				{
					buttPadSpacerColorGT = new JMenuItem("Grit Tan");
					buttPadSpacerColorGT.addMouseListener(MLisener);
					buttPadSpacerColorGT.addActionListener(ALisener);
					return buttPadSpacerColorGT;
				}
				else if (myExtendedMenus == 3)
				{
					buttPadSpacerColorCB = new JMenuItem("Coyote Brown");
					buttPadSpacerColorCB.addMouseListener(MLisener);
					buttPadSpacerColorCB.addActionListener(ALisener);
					return buttPadSpacerColorCB;
				}
				else if (myExtendedMenus == 4)
				{
					buttPadSpacerColorDE = new JMenuItem("Dark Earth");
					buttPadSpacerColorDE.addMouseListener(MLisener);
					buttPadSpacerColorDE.addActionListener(ALisener);
					return buttPadSpacerColorDE;
				}
				else if (myExtendedMenus == 5)
				{
					buttPadSpacerColorOD = new JMenuItem("Olive Drab");
					buttPadSpacerColorOD.addMouseListener(MLisener);
					buttPadSpacerColorOD.addActionListener(ALisener);
					return buttPadSpacerColorOD;
				}
				else if (myExtendedMenus == 6)
				{
					buttPadSpacerColorLG = new JMenuItem("Lowlight Green");
					buttPadSpacerColorLG.addMouseListener(MLisener);
					buttPadSpacerColorLG.addActionListener(ALisener);
					return buttPadSpacerColorLG;
				}
				else if (myExtendedMenus == 7)
				{
					buttPadSpacerColorSB = new JMenuItem("Swat Black");
					buttPadSpacerColorSB.addMouseListener(MLisener);
					buttPadSpacerColorSB.addActionListener(ALisener);
					return buttPadSpacerColorSB;
				}
				else 
				{
					buttPadSpacerColorGIB = new JMenuItem("GI Brown");
					buttPadSpacerColorGIB.addMouseListener(MLisener);
					buttPadSpacerColorGIB.addActionListener(ALisener);
					return buttPadSpacerColorGIB;
				}
			}
			else 
			{
				buttPadNone = new JMenuItem("None");
				buttPadNone.addMouseListener(MLisener);
				buttPadNone.addActionListener(ALisener);
				return buttPadNone;
			}	
		}
		else if (myImageArrayType == 13)
		{
			if (myImageType == 1)
			{
				if (myExtendedMenus == 1)
				{
					buttSpacerQ1 = new JMenuItem("1");
					buttSpacerQ1.addMouseListener(MLisener);
					buttSpacerQ1.addActionListener(ALisener);
					return buttSpacerQ1;
				}
				else if (myExtendedMenus == 2)
				{
					buttSpacerQ2 = new JMenuItem("2");
					buttSpacerQ2.addMouseListener(MLisener);
					buttSpacerQ2.addActionListener(ALisener);
					return buttSpacerQ2;
				}
				else if (myExtendedMenus == 3)
				{
					buttSpacerQ3 = new JMenuItem("3");
					buttSpacerQ3.addMouseListener(MLisener);
					buttSpacerQ3.addActionListener(ALisener);
					return buttSpacerQ3;
				}
				else if (myExtendedMenus == 4)
				{
					buttSpacerQ4 = new JMenuItem("4");
					buttSpacerQ4.addMouseListener(MLisener);
					buttSpacerQ4.addActionListener(ALisener);
					return buttSpacerQ4;
				}
				else if (myExtendedMenus == 5)
				{
					buttSpacerQ5 = new JMenuItem("5");
					buttSpacerQ5.addMouseListener(MLisener);
					buttSpacerQ5.addActionListener(ALisener);
					return buttSpacerQ5;
				}
				else if (myExtendedMenus == 6)
				{
					buttSpacerQ6 = new JMenuItem("6");
					buttSpacerQ6.addMouseListener(MLisener);
					buttSpacerQ6.addActionListener(ALisener);
					return buttSpacerQ6;
				}
				else if (myExtendedMenus == 7)
				{
					buttSpacerQ7 = new JMenuItem("7");
					buttSpacerQ7.addMouseListener(MLisener);
					buttSpacerQ7.addActionListener(ALisener);
					return buttSpacerQ7;
				}
				else if (myExtendedMenus == 8)
				{
					buttSpacerQ8 = new JMenuItem("8");
					buttSpacerQ8.addMouseListener(MLisener);
					buttSpacerQ8.addActionListener(ALisener);
					return buttSpacerQ8;
				}
				else 
				{
					buttSpacerQ9 = new JMenuItem("9");
					buttSpacerQ9.addMouseListener(MLisener);
					buttSpacerQ9.addActionListener(ALisener);
					return buttSpacerQ9;
				}
			}
			else 
			{
				buttSpacerQNone = new JMenuItem("None");
				buttSpacerQNone.addMouseListener(MLisener);
				buttSpacerQNone.addActionListener(ALisener);
				return buttSpacerQNone;
			}	
		}
		else if (myImageArrayType == 14)
		{
			if (myImageType == 1)
			{
				if (myExtendedMenus == 1)
				{
					palmRestColorBW = new JMenuItem("Ballistic White");
					palmRestColorBW.addMouseListener(MLisener);
					palmRestColorBW.addActionListener(ALisener);
					return palmRestColorBW;
				}
				else if (myExtendedMenus == 2)
				{
					palmRestColorGT = new JMenuItem("Grit Tan");
					palmRestColorGT.addMouseListener(MLisener);
					palmRestColorGT.addActionListener(ALisener);
					return palmRestColorGT;
				}
				else if (myExtendedMenus == 3)
				{
					palmRestColorCB = new JMenuItem("Coyote Brown");
					palmRestColorCB.addMouseListener(MLisener);
					palmRestColorCB.addActionListener(ALisener);
					return palmRestColorCB;
				}
				else if (myExtendedMenus == 4)
				{
					palmRestColorDE = new JMenuItem("Dark Earth");
					palmRestColorDE.addMouseListener(MLisener);
					palmRestColorDE.addActionListener(ALisener);
					return palmRestColorDE;
				}
				else if (myExtendedMenus == 5)
				{
					palmRestColorOD = new JMenuItem("Olive Drab");
					palmRestColorOD.addMouseListener(MLisener);
					palmRestColorOD.addActionListener(ALisener);
					return palmRestColorOD;
				}
				else if (myExtendedMenus == 6)
				{
					palmRestColorLG = new JMenuItem("Lowlight Green");
					palmRestColorLG.addMouseListener(MLisener);
					palmRestColorLG.addActionListener(ALisener);
					return palmRestColorLG;
				}
				else if (myExtendedMenus == 7)
				{
					palmRestColorSB = new JMenuItem("Swat Black");
					palmRestColorSB.addMouseListener(MLisener);
					palmRestColorSB.addActionListener(ALisener);
					return palmRestColorSB;
				}
				else 
				{
					palmRestColorGIB = new JMenuItem("GI Brown");
					palmRestColorGIB.addMouseListener(MLisener);
					palmRestColorGIB.addActionListener(ALisener);
					return palmRestColorGIB;
				}
			}
			else 
			{
				palmRestNone = new JMenuItem("None");
				palmRestNone.addMouseListener(MLisener);
				palmRestNone.addActionListener(ALisener);
				return palmRestNone;
			}	
		}
		else if (myImageArrayType == 15)
		{
			if (myImageType == 1)
			{
				offHandRestYes = new JMenuItem("Off Hand Rest");
				offHandRestYes.addMouseListener(MLisener);
				offHandRestYes.addActionListener(ALisener);
				return offHandRestYes;
			}	
			else 
			{
				offHandRestNone = new JMenuItem("None");
				offHandRestNone.addMouseListener(MLisener);
				offHandRestNone.addActionListener(ALisener);
				return offHandRestNone;
			}	
		}
		else if (myImageArrayType == 16)
		{
			if (myImageType == 1)
			{
				if (myExtendedMenus == 1)
				{
					handGuardStandardColorBW = new JMenuItem("Ballistic White");
					handGuardStandardColorBW.addMouseListener(MLisener);
					handGuardStandardColorBW.addActionListener(ALisener);
					return handGuardStandardColorBW;
				}
				else if (myExtendedMenus == 2)
				{
					handGuardStandardColorGT = new JMenuItem("Grit Tan");
					handGuardStandardColorGT.addMouseListener(MLisener);
					handGuardStandardColorGT.addActionListener(ALisener);
					return handGuardStandardColorGT;
				}
				else if (myExtendedMenus == 3)
				{
					handGuardStandardColorCB = new JMenuItem("Coyote Brown");
					handGuardStandardColorCB.addMouseListener(MLisener);
					handGuardStandardColorCB.addActionListener(ALisener);
					return handGuardStandardColorCB;
				}
				else if (myExtendedMenus == 4)
				{
					handGuardStandardColorDE = new JMenuItem("Dark Earth");
					handGuardStandardColorDE.addMouseListener(MLisener);
					handGuardStandardColorDE.addActionListener(ALisener);
					return handGuardStandardColorDE;
				}
				else if (myExtendedMenus == 5)
				{
					handGuardStandardColorOD = new JMenuItem("Olive Drab");
					handGuardStandardColorOD.addMouseListener(MLisener);
					handGuardStandardColorOD.addActionListener(ALisener);
					return handGuardStandardColorOD;
				}
				else if (myExtendedMenus == 6)
				{
					handGuardStandardColorLG = new JMenuItem("Lowlight Green");
					handGuardStandardColorLG.addMouseListener(MLisener);
					handGuardStandardColorLG.addActionListener(ALisener);
					return handGuardStandardColorLG;
				}
				else if (myExtendedMenus == 7)
				{
					handGuardStandardColorSB = new JMenuItem("Swat Black");
					handGuardStandardColorSB.addMouseListener(MLisener);
					handGuardStandardColorSB.addActionListener(ALisener);
					return handGuardStandardColorSB;
				}
				else 
				{
					handGuardStandardColorGIB = new JMenuItem("GI Brown");
					handGuardStandardColorGIB.addMouseListener(MLisener);
					handGuardStandardColorGIB.addActionListener(ALisener);
					return handGuardStandardColorGIB;
				}
			}
			else if (myImageType == 2)
			{
				if (myExtendedMenus == 1)
				{
					handGuardVentedColorBW = new JMenuItem("Ballistic White");
					handGuardVentedColorBW.addMouseListener(MLisener);
					handGuardVentedColorBW.addActionListener(ALisener);
					return handGuardVentedColorBW;
				}
				else if (myExtendedMenus == 2)
				{
					handGuardVentedColorGT = new JMenuItem("Grit Tan");
					handGuardVentedColorGT.addMouseListener(MLisener);
					handGuardVentedColorGT.addActionListener(ALisener);
					return handGuardVentedColorGT;
				}
				else if (myExtendedMenus == 3)
				{
					handGuardVentedColorCB = new JMenuItem("Coyote Brown");
					handGuardVentedColorCB.addMouseListener(MLisener);
					handGuardVentedColorCB.addActionListener(ALisener);
					return handGuardVentedColorCB;
				}
				else if (myExtendedMenus == 4)
				{
					handGuardVentedColorDE = new JMenuItem("Dark Earth");
					handGuardVentedColorDE.addMouseListener(MLisener);
					handGuardVentedColorDE.addActionListener(ALisener);
					return handGuardVentedColorDE;
				}
				else if (myExtendedMenus == 5)
				{
					handGuardVentedColorOD = new JMenuItem("Olive Drab");
					handGuardVentedColorOD.addMouseListener(MLisener);
					handGuardVentedColorOD.addActionListener(ALisener);
					return handGuardVentedColorOD;
				}
				else if (myExtendedMenus == 6)
				{
					handGuardVentedColorLG = new JMenuItem("Lowlight Green");
					handGuardVentedColorLG.addMouseListener(MLisener);
					handGuardVentedColorLG.addActionListener(ALisener);
					return handGuardVentedColorLG;
				}
				else if (myExtendedMenus == 7)
				{
					handGuardVentedColorSB = new JMenuItem("Swat Black");
					handGuardVentedColorSB.addMouseListener(MLisener);
					handGuardVentedColorSB.addActionListener(ALisener);
					return handGuardVentedColorSB;
				}
				else 
				{
					handGuardVentedColorGIB = new JMenuItem("GI Brown");
					handGuardVentedColorGIB.addMouseListener(MLisener);
					handGuardVentedColorGIB.addActionListener(ALisener);
					return handGuardVentedColorGIB;
				}
			}
			else if (myImageType == 3)
			{
				if (myExtendedMenus == 1)
				{
					handGuardCutoutColorBW = new JMenuItem("Ballistic White");
					handGuardCutoutColorBW.addMouseListener(MLisener);
					handGuardCutoutColorBW.addActionListener(ALisener);
					return handGuardCutoutColorBW;
				}
				else if (myExtendedMenus == 2)
				{
					handGuardCutoutColorGT = new JMenuItem("Grit Tan");
					handGuardCutoutColorGT.addMouseListener(MLisener);
					handGuardCutoutColorGT.addActionListener(ALisener);
					return handGuardCutoutColorGT;
				}
				else if (myExtendedMenus == 3)
				{
					handGuardCutoutColorCB = new JMenuItem("Coyote Brown");
					handGuardCutoutColorCB.addMouseListener(MLisener);
					handGuardCutoutColorCB.addActionListener(ALisener);
					return handGuardCutoutColorCB;
				}
				else if (myExtendedMenus == 4)
				{
					handGuardCutoutColorDE = new JMenuItem("Dark Earth");
					handGuardCutoutColorDE.addMouseListener(MLisener);
					handGuardCutoutColorDE.addActionListener(ALisener);
					return handGuardCutoutColorDE;
				}
				else if (myExtendedMenus == 5)
				{
					handGuardCutoutColorOD = new JMenuItem("Olive Drab");
					handGuardCutoutColorOD.addMouseListener(MLisener);
					handGuardCutoutColorOD.addActionListener(ALisener);
					return handGuardCutoutColorOD;
				}
				else if (myExtendedMenus == 6)
				{
					handGuardCutoutColorLG = new JMenuItem("Lowlight Green");
					handGuardCutoutColorLG.addMouseListener(MLisener);
					handGuardCutoutColorLG.addActionListener(ALisener);
					return handGuardCutoutColorLG;
				}
				else if (myExtendedMenus == 7)
				{
					handGuardCutoutColorSB = new JMenuItem("Swat Black");
					handGuardCutoutColorSB.addMouseListener(MLisener);
					handGuardCutoutColorSB.addActionListener(ALisener);
					return handGuardCutoutColorSB;
				}
				else 
				{
					handGuardCutoutColorGIB = new JMenuItem("GI Brown");
					handGuardCutoutColorGIB.addMouseListener(MLisener);
					handGuardCutoutColorGIB.addActionListener(ALisener);
					return handGuardCutoutColorGIB;
				}
			}
			else 
			{
				handGuardNone = new JMenuItem("None");
				handGuardNone.addMouseListener(MLisener);
				handGuardNone.addActionListener(ALisener);
				return handGuardNone;
			}
		}
		else if (myImageArrayType == 17)
		{
			if (myImageType == 1)
			{
				slingPlateYes = new JMenuItem("SlingPlate");
				slingPlateYes.addMouseListener(MLisener);
				slingPlateYes.addActionListener(ALisener);
				return slingPlateYes;
			}	
			else 
			{
				slingPlateNone = new JMenuItem("None");
				slingPlateNone.addMouseListener(MLisener);
				slingPlateNone.addActionListener(ALisener);
				return slingPlateNone;
			}	
		}
		else if (myImageArrayType == 18)
		{
			if (myImageType == 1)
			{
				flushRailYes = new JMenuItem("FlushRail");
				flushRailYes.addMouseListener(MLisener);
				flushRailYes.addActionListener(ALisener);
				return flushRailYes;
			}	
			else 
			{
				flushRailNone = new JMenuItem("None");
				flushRailNone.addMouseListener(MLisener);
				flushRailNone.addActionListener(ALisener);
				return flushRailNone;
			}	
		}
		else if (myImageArrayType == 19)
		{
			if (myImageType == 1)
			{
				sideRailAdaptersYes = new JMenuItem("Side Rail Adapters");
				sideRailAdaptersYes.addMouseListener(MLisener);
				sideRailAdaptersYes.addActionListener(ALisener);
				return sideRailAdaptersYes;
			}	
			else 
			{
				sideRailAdaptersNone = new JMenuItem("None");
				sideRailAdaptersNone.addMouseListener(MLisener);
				sideRailAdaptersNone.addActionListener(ALisener);
				return sideRailAdaptersNone;
			}	
		}
		else if (myImageArrayType == 20)
		{
			if (myImageType == 1)
			{
				if (myExtendedMenus == 1)
				{
					sidePicatinnyRail2inch1 = new JMenuItem("None");
					sidePicatinnyRail2inch1.addMouseListener(MLisener);
					sidePicatinnyRail2inch1.addActionListener(ALisener);
					return sidePicatinnyRail2inch1;
				}
				else 
				{
					sidePicatinnyRail2inch2 = new JMenuItem("None");
					sidePicatinnyRail2inch2.addMouseListener(MLisener);
					sidePicatinnyRail2inch2.addActionListener(ALisener);
					return sidePicatinnyRail2inch2;
				}
			}
			else if (myImageType == 2)
			{
				if (myExtendedMenus == 1)
				{
					sidePicatinnyRail4inch1 = new JMenuItem("None");
					sidePicatinnyRail4inch1.addMouseListener(MLisener);
					sidePicatinnyRail4inch1.addActionListener(ALisener);
					return sidePicatinnyRail4inch1;
				}
				else 
				{
					sidePicatinnyRail4inch2 = new JMenuItem("None");
					sidePicatinnyRail4inch2.addMouseListener(MLisener);
					sidePicatinnyRail4inch2.addActionListener(ALisener);
					return sidePicatinnyRail4inch2;
				}
			}
			else if (myImageType == 3)
			{
				if (myExtendedMenus == 1)
				{
					sidePicatinnyRail6inch1 = new JMenuItem("None");
					sidePicatinnyRail6inch1.addMouseListener(MLisener);
					sidePicatinnyRail6inch1.addActionListener(ALisener);
					return sidePicatinnyRail6inch1;
				}
				else 
				{
					sidePicatinnyRail6inch2 = new JMenuItem("None");
					sidePicatinnyRail6inch2.addMouseListener(MLisener);
					sidePicatinnyRail6inch2.addActionListener(ALisener);
					return sidePicatinnyRail6inch2;
				}
			}
			else
			{
				if (myExtendedMenus == 1)
				{
					sidePicatinnyRail9inch1 = new JMenuItem("None");
					sidePicatinnyRail9inch1.addMouseListener(MLisener);
					sidePicatinnyRail9inch1.addActionListener(ALisener);
					return sidePicatinnyRail9inch1;
				}
				else 
				{
					sidePicatinnyRail9inch2 = new JMenuItem("None");
					sidePicatinnyRail9inch2.addMouseListener(MLisener);
					sidePicatinnyRail9inch2.addActionListener(ALisener);
					return sidePicatinnyRail9inch2;
				}
			}
		}
		else if (myImageArrayType == 21)
		{
			if (myImageType == 1)
			{
				bottomPicatinnyRail2inch = new JMenuItem("2inch");
				bottomPicatinnyRail2inch.addMouseListener(MLisener);
				bottomPicatinnyRail2inch.addActionListener(ALisener);
				return bottomPicatinnyRail2inch;
			}	
			else if (myImageType == 2)
			{
				bottomPicatinnyRail4inch = new JMenuItem("4inch");
				bottomPicatinnyRail4inch.addMouseListener(MLisener);
				bottomPicatinnyRail4inch.addActionListener(ALisener);
				return bottomPicatinnyRail4inch;
			}	
			else if (myImageType == 3)
			{
				bottomPicatinnyRail6inch = new JMenuItem("6inch");
				bottomPicatinnyRail6inch.addMouseListener(MLisener);
				bottomPicatinnyRail6inch.addActionListener(ALisener);
				return bottomPicatinnyRail6inch;
			}	
			else if (myImageType == 4)
			{
				bottomPicatinnyRail9inch = new JMenuItem("9inch");
				bottomPicatinnyRail9inch.addMouseListener(MLisener);
				bottomPicatinnyRail9inch.addActionListener(ALisener);
				return bottomPicatinnyRail9inch;
			}	
			else 
			{
				bottomPicatinnyRailNone = new JMenuItem("None");
				bottomPicatinnyRailNone.addMouseListener(MLisener);
				bottomPicatinnyRailNone.addActionListener(ALisener);
				return bottomPicatinnyRailNone;
			}
		}
		else if (myImageArrayType == 22)
		{
			if (myImageType == 1)
			{
				bipodAdapter = new JMenuItem("Bipod Adapter");
				bipodAdapter.addMouseListener(MLisener);
				bipodAdapter.addActionListener(ALisener);
				return bipodAdapter;
			}	
			else
			{
				bipodAdapterNone = new JMenuItem("None");
				bipodAdapterNone.addMouseListener(MLisener);
				bipodAdapterNone.addActionListener(ALisener);
				return bipodAdapterNone;
			}	
		}
		else if (myImageArrayType == 23)
		{
			if (myImageType == 1)
			{
				lugSlideStandard = new JMenuItem("Standard");
				lugSlideStandard.addMouseListener(MLisener);
				lugSlideStandard.addActionListener(ALisener);
				return lugSlideStandard;
			}	
			else if (myImageType == 2)
			{
				lugSlideTitanium = new JMenuItem("Titanium");
				lugSlideTitanium.addMouseListener(MLisener);
				lugSlideTitanium.addActionListener(ALisener);
				return lugSlideTitanium;
			}	
			else
			{
				lugSlideNone = new JMenuItem("None");
				lugSlideNone.addMouseListener(MLisener);
				lugSlideNone.addActionListener(ALisener);
				return lugSlideNone;
			}	
		}
		else if (myImageArrayType == 24)
		{
			if (myImageType == 1)
			{
				barrelTensioner = new JMenuItem("Barrel Tensioner");
				barrelTensioner.addMouseListener(MLisener);
				barrelTensioner.addActionListener(ALisener);
				return barrelTensioner;
			}	
			else
			{
				barrelTensionerNone = new JMenuItem("None");
				barrelTensionerNone.addMouseListener(MLisener);
				barrelTensionerNone.addActionListener(ALisener);
				return barrelTensionerNone;
			}	
		}
		else
		{
			if (myImageType == 1)
			{
				QDSlingSwivels = new JMenuItem("QDSlingSwivels");
				QDSlingSwivels.addMouseListener(MLisener);
				QDSlingSwivels.addActionListener(ALisener);
				return QDSlingSwivels;
			}	
			else
			{
				QDSlingSwivelsNone = new JMenuItem("None");
				QDSlingSwivelsNone.addMouseListener(MLisener);
				QDSlingSwivelsNone.addActionListener(ALisener);
				return QDSlingSwivelsNone;
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