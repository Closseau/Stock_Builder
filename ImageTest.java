
import java.awt.*; 
import java.awt.event.*;
import java.awt.image.*; 
import java.io.*; 
import javax.imageio.*;
import javax.swing.*;
import javax.swing.Timer.*;


public class ImageTest extends Component 
{                 
	// Constants for changes
	public static final int MyDisplayWidth = 1100;
	public static final int MyDisplayHeight = 900;
	public static final int MyRifleTypeLocationX = 0;
	public static final int MyRifleTypeLocationY = 0;
	public static final int MyActionTypeLocationX = 0;
	public static final int MyActionTypeLocationY = 0;
	public static final int MyBarrelLenghtLocationX = 750;
	public static final int MyBarrelLenghtLocationY = 200;
	public static final int MyOpticsLocationX = 400;
	public static final int MyOpticsLocationY = 110;
	public static final int MyOpticMountLocationX = 470;
	public static final int MyOpticMountLocationY = 180;
	public static final int MyMagazineLocationX = 520;
	public static final int MyMagazineLocationY = 250;
	public static final int MyBipodLocationX = 200;
	public static final int MyBipodLocationY = 400;
	public static final int MyMonopodLocationX = 0;
	public static final int MyMonopodLocationY = 600;
	public static final int MyChassisColorLocationX = 100;
	public static final int MyChassisColorLocationY = 200;
	public static final int MyGripColorLocationX = 0;
	public static final int MyGripColorLocationY = 200;
	public static final int MyCheekRestTypeLocationx = 600;
	public static final int MyCheekRestTypeLocationY = 500;
	public static final int MyButtPadLocationx = 800;
	public static final int MyButtPadLocationY = 500;
	public static final int MyButtSpacerLocationx = 400;
	public static final int MyButtSpacerLocationY = 500;
	public static final int MyPalmRestLocationx = 200;
	public static final int MyPalmRestLocationY = 500;
	public static final int MyOffHandRestLocationx = 300;
	public static final int MyOffHandRestLocationY = 300;
	public static final int MyHandGuardLocationx = 500;
	public static final int MyHandGuardLocationY = 300;
	public static final int MySlingPlateLocationx = 0;
	public static final int MySlingPlateLocationY = 0;
	public static final int MyFlushRailLocationx = 0;
	public static final int MyFlushRailLocationY = 0;
	public static final int MySideRailAdaptersLocationx = 0;
	public static final int MySideRailAdaptersLocationY = 0;
	public static final int MySidePicatinnyRailLocationx = 0;
	public static final int MySidePicatinnyRailLocationY = 0;
	public static final int MyBottomPicatinnyRailLocationx = 0;
	public static final int MyBottomPicatinnyRailLocationY = 0;
	public static final int MyBipodAdapterLocationx = 0;
	public static final int MyBipodAdapterLocationY = 0;
	public static final int MyLugSlideLocationx = 0;
	public static final int MyLugSlideLocationY = 0;
	public static final int MyBarrelTensionerLocationx = 0;
	public static final int MyBarrelTensionerLocationY = 0;
	public static final int MyQDSlingSwivelsLocationx = 0;
	public static final int MyQDSlingSwivelsLocationY = 0;
	
	public int rifleType = 0;
	public int actionType = 0;
	public int barrelLenght = 0;
	public int optics = 0;
	public int opticMount = 0;
	public int magazine = 0;
	public int bipod = 0;
	public int monopod = 0;
	public int chassisColor = 0;
	public int gripColor = 0;
	public int cheekRestType = 0;
	public int buttPad = 0;
	public int buttSpacer = 0;
	public int palmRest = 0;
	public int offHandRest = 0;
	public int handGuard = 0;
	public int slingPlate = 0;
	public int flushRail = 0;
	public int sideRailAdapters = 0;
	public int sidePicatinnyRail = 0;
	public int bottomPicatinnyRail = 0;
	public int bipodAdapter = 0;
	public int lugSlide = 0;
	public int barrelTensioner = 0;
	public int qDSlingSwivels = 0;		
	
	
	BufferedImage[] RifleType = new BufferedImage[4];
	BufferedImage[] ActionType = new BufferedImage[4];
	BufferedImage[] BarrelLenght = new BufferedImage[4];
	BufferedImage[] Optics = new BufferedImage[3];
	BufferedImage[] OpticMount = new BufferedImage[6];
	BufferedImage[] Magazine = new BufferedImage[4];
	BufferedImage[] Bipod = new BufferedImage[4];
	BufferedImage[] Monopod = new BufferedImage[2];
	BufferedImage[] ChassisColor = new BufferedImage[10];
	BufferedImage[] GripColor = new BufferedImage[10];
	BufferedImage[] CheekRestType = new BufferedImage[25];
	BufferedImage[] ButtPad = new BufferedImage[9];
	BufferedImage[] ButtSpacer = new BufferedImage[10];
	BufferedImage[] PalmRest = new BufferedImage[9];
	BufferedImage[] OffHandRest = new BufferedImage[2];
	BufferedImage[] HandGuard = new BufferedImage[25];
	BufferedImage[] SlingPlate = new BufferedImage[4];
	BufferedImage[] FlushRail = new BufferedImage[2];
	BufferedImage[] SideRailAdapters = new BufferedImage[10];
	BufferedImage[] SidePicatinnyRail = new BufferedImage[10];
	BufferedImage[] BottomPicatinnyRail = new BufferedImage[2];
	BufferedImage[] BipodAdapter = new BufferedImage[10];
	BufferedImage[] LugSlide = new BufferedImage[10];
	BufferedImage[] BarrelTensioner = new BufferedImage[4];
	BufferedImage[] QDSlingSwivels = new BufferedImage[4];
	public ImageTest() 
	{        
		int i;
		int x;
		int y;
		try
		{  
			
			BarrelLenght[0] = null;
			BarrelLenght[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BarrelType1.png"));  
			BarrelLenght[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BarrelType2.png"));
			BarrelLenght[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BarrelType3.png"));
			
			for (y = 0; y < 76; y++)
			{
				for (x = 0; x < 357; x++)
				{
					if (BarrelLenght[1].getRGB(x, y) >= -500000)
					{
						BarrelLenght[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 74; y++)
			{
				for (x = 0; x < 417; x++)
				{
					if (BarrelLenght[2].getRGB(x, y) >= -500000)
					{
						BarrelLenght[2].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 73; y++)
			{
				for (x = 0; x < 467; x++)
				{
					if (BarrelLenght[3].getRGB(x, y) >= -500000)
					{
						BarrelLenght[3].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			Magazine[0] = null;
			Magazine[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "MagazineType1.png"));  
			Magazine[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "MagazineType2.png"));
			Magazine[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "MagazineType3.png"));
			
			for (y = 0; y < 71; y++)
			{
				for (x = 0; x < 90; x++)
				{
					if (Magazine[1].getRGB(x, y) >= -500000)
					{
						Magazine[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 94; y++)
			{
				for (x = 0; x < 91; x++)
				{
					if (Magazine[2].getRGB(x, y) >= -500000)
					{
						Magazine[2].setRGB(x, y, 0x00000000);
					}
				}
			}
			System.out.println(Magazine[2].getRGB(1, 1));
			System.out.println(Magazine[3].getRGB(1, 1));
			for (y = 0; y < 129; y++)
			{
				for (x = 0; x < 94; x++)
				{
					if (Magazine[3].getRGB(x, y) >= -500000)
					{
						Magazine[3].setRGB(x, y, 0x00000000);
					}
				}
			}
			System.out.println(Magazine[3].getRGB(1, 1));
			
			
			Optics[0] = null;
			Optics[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticsType1.png"));  
			Optics[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticsType2.png"));
			
			
			for (y = 0; y < 92; y++)
			{
				for (x = 0; x < 300; x++)
				{
					if (Optics[1].getRGB(x, y) >= -500000)
					{
						Optics[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 67; y++)
			{
				for (x = 0; x < 124; x++)
				{
					if (Optics[2].getRGB(x, y) >= -500000)
					{
						Optics[2].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			OpticMount[0] = null;
			OpticMount[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount1.png"));  
			OpticMount[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount2.png"));
			OpticMount[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount3.png"));
			OpticMount[4] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount4.png"));
			OpticMount[5] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount5.png"));
			
			for (y = 0; y < 45; y++)
			{
				for (x = 0; x < 141; x++)
				{
					if (OpticMount[1].getRGB(x, y) >= -500000)
					{
						OpticMount[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 64; y++)
			{
				for (x = 0; x < 118; x++)
				{
					if (OpticMount[2].getRGB(x, y) >= -500000)
					{
						OpticMount[2].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			Bipod[0] = null;
			Bipod[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BipodType1.png")); 
			Bipod[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BipodType2.png"));
			Bipod[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BipodType3.png"));
			
			
			for (y = 0; y < 191; y++)
			{
				for (x = 0; x < 163; x++)
				{
					if (Bipod[1].getRGB(x, y) >= -500000)
					{
						Bipod[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 191; y++)
			{
				for (x = 0; x < 161; x++)
				{
					if (Bipod[2].getRGB(x, y) >= -500000)
					{
						Bipod[2].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 208; y++)
			{
				for (x = 0; x < 152; x++)
				{
					if (Bipod[3].getRGB(x, y) >= -500000)
					{
						Bipod[3].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			Monopod[0] = null;
			Monopod[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "MonopodType1.png")); 
			
			for (y = 0; y < 163; y++)
			{
				for (x = 0; x < 69; x++)
				{
					if (Monopod[1].getRGB(x, y) >= -500000)
					{
						Monopod[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			ChassisColor[0] = null;
			ChassisColor[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor1.png"));  
			ChassisColor[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor2.png"));
			ChassisColor[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor3.png"));
			ChassisColor[4] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor4.png"));
			ChassisColor[5] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor5.png"));
			ChassisColor[6] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor6.png"));
			ChassisColor[7] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor7.png"));
			ChassisColor[8] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor8.png"));
			ChassisColor[9] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor9.png"));
			
			for (y = 0; y < 154; y++)
			{
				for (x = 0; x < 740; x++)
				{
					if (ChassisColor[1].getRGB(x, y) >= -500000)
					{
						ChassisColor[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			GripColor[0] = null;
			GripColor[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "GripColor1.png"));  
			GripColor[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor2.png"));
			GripColor[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor3.png"));
			GripColor[4] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor4.png"));
			GripColor[5] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor5.png"));
			GripColor[6] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor6.png"));
			GripColor[7] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor7.png"));
			GripColor[8] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor8.png"));
			GripColor[9] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor9.png"));
			
			
			for (y = 0; y < 113; y++)
			{
				for (x = 0; x < 140; x++)
				{
					if (GripColor[1].getRGB(x, y) >= -500000)
					{
						GripColor[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			CheekRestType[0] = null;
			CheekRestType[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "CheekRest1.png"));  
//			= ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor2.png"));
			CheekRestType[2] = null;
			CheekRestType[3] = null;
			CheekRestType[4] = null;
			CheekRestType[5] = null;
			CheekRestType[6] = null;
			CheekRestType[7] = null;
			CheekRestType[8] = null;
			CheekRestType[9] = null;
			CheekRestType[10] = null;
			CheekRestType[11] = null;
			CheekRestType[12] = null;
			CheekRestType[13] = null;
			CheekRestType[14] = null;
			CheekRestType[15] = null;
			CheekRestType[16] = null;
			CheekRestType[17] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "CheekRest3.png"));
			CheekRestType[18] = null;
			CheekRestType[19] = null;
			CheekRestType[20] = null;
			CheekRestType[21] = null;
			CheekRestType[22] = null;
			CheekRestType[23] = null;
			CheekRestType[24] = null;
			
			for (y = 0; y < 96; y++)
			{
				for (x = 0; x < 187; x++)
				{
					if (CheekRestType[1].getRGB(x, y) >= -500000)
					{
						CheekRestType[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			
			for (y = 0; y < 98; y++)
			{
				for (x = 0; x < 192; x++)
				{
					if (CheekRestType[17].getRGB(x, y) >= -500000)
					{
						CheekRestType[17].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			ButtPad[0] = null;
			ButtPad[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ButtPad1.png"));  
			ButtPad[2] = null;
			ButtPad[3] = null;
			ButtPad[4] = null;
			ButtPad[5] = null;
			ButtPad[6] = null;
			ButtPad[7] = null;
			ButtPad[8] = null;
			
			
			for (y = 0; y < 178; y++)
			{
				for (x = 0; x < 88; x++)
				{
					if (ButtPad[1].getRGB(x, y) >= -500000)
					{
						ButtPad[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			
			
			ButtSpacer[0] = null;
			ButtSpacer[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ButtSpacer1.png"));  
			ButtSpacer[2] = null;
			ButtSpacer[3] = null;
			ButtSpacer[4] = null;
			ButtSpacer[5] = null;
			ButtSpacer[6] = null;
			ButtSpacer[7] = null;
			ButtSpacer[8] = null;
			ButtSpacer[9] = null;
			
			
			
			for (y = 0; y < 159; y++)
			{
				for (x = 0; x < 60; x++)
				{
					if (ButtSpacer[1].getRGB(x, y) >= -500000)
					{
						ButtSpacer[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			
			PalmRest[0] = null;
			PalmRest[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "PalmRest1.png"));  
			PalmRest[2] = null;
			PalmRest[3] = null;
			PalmRest[4] = null;
			PalmRest[5] = null;
			PalmRest[6] = null;
			PalmRest[7] = null;
			PalmRest[8] = null;
			
			
			
			
			for (y = 0; y < 39; y++)
			{
				for (x = 0; x < 145; x++)
				{
					if (PalmRest[1].getRGB(x, y) >= -500000)
					{
						PalmRest[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			
			OffHandRest[0] = null;
			OffHandRest[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OffHandRest1.png"));  
			
			
			
			for (y = 0; y < 50; y++)
			{
				for (x = 0; x < 137; x++)
				{
					if (OffHandRest[1].getRGB(x, y) >= -500000)
					{
						OffHandRest[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			
			HandGuard[0] = null;
			HandGuard[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "HandGuard1.png"));  
			HandGuard[2] = null;
			HandGuard[3] = null;
			HandGuard[4] = null;
			HandGuard[5] = null;
			HandGuard[6] = null;
			HandGuard[7] = null;
			HandGuard[8] = null;
			HandGuard[9] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "HandGuard2.png"));  
			HandGuard[10] = null;
			HandGuard[11] = null;
			HandGuard[12] = null;
			HandGuard[13] = null;
			HandGuard[14] = null;
			HandGuard[15] = null;
			HandGuard[16] = null;
			HandGuard[17] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "HandGuard3.png"));  
			HandGuard[18] = null;
			HandGuard[19] = null;
			HandGuard[20] = null;
			HandGuard[21] = null;
			HandGuard[22] = null;
			HandGuard[23] = null;
			HandGuard[24] = null;
			
			for (y = 0; y < 39; y++)
			{
				for (x = 0; x < 244; x++)
				{
					if (HandGuard[1].getRGB(x, y) >= -500000)
					{
						HandGuard[1].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 39; y++)
			{
				for (x = 0; x < 244; x++)
				{
					if (HandGuard[9].getRGB(x, y) >= -500000)
					{
						HandGuard[9].setRGB(x, y, 0x00000000);
					}
				}
			}
			
			for (y = 0; y < 42; y++)
			{
				for (x = 0; x < 250; x++)
				{
					if (HandGuard[17].getRGB(x, y) >= -500000)
					{
						HandGuard[17].setRGB(x, y, 0x00000000);
					}
				}
			}
		    /*
			RifleType[0] = null;
			RifleType[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BUILD TEST - 1.png"));  
			RifleType[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BUILD TEST - 2.png"));
			RifleType[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BUILD TEST - 3.png"));
			for (i = 1; i < 4; i++)
			{
				for (y = 0; y < 864; y++)
				{
					for (x = 0; x < 1080; x++)
					{
					if (RifleType[i].getRGB(x, y) >= -6000000)
						{
							RifleType[i].setRGB(x, y, 0x00000000 );
						}
					}
				}
				
			}
			
			Monopod[0] = null;
			Monopod[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "MonopodType1.png"));  
			
			for (i = 1; i < 2; i++)
			{
				for (y = 0; y < 131; y++)
				{
					for (x = 0; x < 407; x++)
					{
					if (Monopod[i].getRGB(x, y) == -1)
						{
							Monopod[i].setRGB(x, y, 0x00000000);
						}
					}
				}
				
			}
			
			ActionType[0] = null;
			ActionType[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ActionType1.png"));  
			ActionType[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ActionType2.png"));
			ActionType[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ActionType3.png"));
			
			for (i = 1; i < 4; i++)
			{
				for (y = 0; y < 131; y++)
				{
					for (x = 0; x < 407; x++)
					{
					if (ActionType[i].getRGB(x, y) == -1)
						{
							ActionType[i].setRGB(x, y, 0x00000000);
						}
					}
				}
				
			}
			
			BarrelLenght[0] = null;
			BarrelLenght[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BarrelType1.png"));  
			BarrelLenght[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BarrelType2.png"));
			BarrelLenght[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BarrelType3.png"));
			for (i = 1; i < 4; i++)
			{
				for (y = 0; y < 131; y++)
				{
					for (x = 0; x < 407; x++)
					{
					if (BarrelLenght[i].getRGB(x, y) >= -6000000)
						{
							BarrelLenght[i].setRGB(x, y, 0x00000000);
						}
					}
				}
			}
			
			Optics[0] = null;
			Optics[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticsType1.png"));  
			Optics[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticsType2.png"));
			
			for (i = 1; i < 3; i++)
			{
				for (y = 0; y < 134; y++)
				{
					for (x = 0; x < 485; x++)
					{
					if (Optics[i].getRGB(x, y) == -1)
						{
							Optics[i].setRGB(x, y, 0x00000000);
						}
					}
				}
				
			}
			
			Magazine[0] = null;
			Magazine[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "MagazineType1.png"));  
			Magazine[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "MagazineType2.png"));
			Magazine[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "MagazineType3.png"));
			for (i = 1; i < 4; i++)
			{
				for (y = 0; y < 299; y++)
				{
					for (x = 0; x < 401; x++)
					{
					if (Magazine[i].getRGB(x, y) >= -6000000)
						{
							Magazine[i].setRGB(x, y, 0x00000000);
						}
					}
				}
				
			}
			
			
			Bipod[0] = null;
			Bipod[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BipodType1.png")); 
			Bipod[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BipodType2.png"));
			Bipod[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "BipodType3.png"));
			for (i = 1; i < 4; i++)
			{
				
				for (y = 0; y < 131; y++)
				{
					for (x = 0; x < 407; x++)
					{
					if (Bipod[i].getRGB(x, y) == -1)
						{
							Bipod[i].setRGB(x, y, 0x00000000);
						}
					}
				}
				
			}
			
			OpticMount[0] = null;
			OpticMount[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount1.png"));  
			OpticMount[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount2.png"));
			OpticMount[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount3.png"));
			OpticMount[4] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount4.png"));
			OpticMount[5] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "OpticMount5.png"));
			
			for (i = 1; i < 6; i++)
			{
				for (y = 0; y < 136; y++)
				{
					for (x = 0; x < 801; x++)
					{
					if (OpticMount[i].getRGB(x, y) == -1)
						{
							OpticMount[i].setRGB(x, y, 0x00000000);
						}
					}
				}
				
			}
			
			ChassisColor[0] = null;
			ChassisColor[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor1.png"));  
			ChassisColor[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor2.png"));
			ChassisColor[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor3.png"));
			ChassisColor[4] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor4.png"));
			ChassisColor[5] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor5.png"));
			ChassisColor[6] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor6.png"));
			ChassisColor[7] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor7.png"));
			ChassisColor[8] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor8.png"));
			ChassisColor[9] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor9.png"));
			for (i = 1; i < 10; i++)
			{
				for (y = 0; y < 136; y++)
				{
					for (x = 0; x < 699; x++)
					{
					if (ChassisColor[i].getRGB(x, y) == -1)
						{
							ChassisColor[i].setRGB(x, y, 0x00000000);
						}
					}
				}
				
			}
			
			GripColor[0] = null;
			GripColor[1] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor1.png"));  
			GripColor[2] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor2.png"));
			GripColor[3] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor3.png"));
			GripColor[4] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor4.png"));
			GripColor[5] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor5.png"));
			GripColor[6] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor6.png"));
			GripColor[7] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor7.png"));
			GripColor[8] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor8.png"));
			GripColor[9] = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + "ChassisColor9.png"));
			
			for (i = 1; i < 10; i++)
			{
				for (y = 0; y < 136; y++)
				{
					for (x = 0; x < 699; x++)
					{
					if (GripColor[i].getRGB(x, y) == -1)
						{
							GripColor[i].setRGB(x, y, 0x00000000);
						}
					}
				}
				
			}*/
		} 
		catch (IOException e)
		{        
		}      
	}       
	public void paint(Graphics g)
	{         
		
		//g.drawImage(RifleType[rifleType], MyRifleTypeLocationX, MyRifleTypeLocationY, null);
		if (rifleType == 1)
		{
			
			g.drawImage(BarrelLenght[barrelLenght], MyBarrelLenghtLocationX, MyBarrelLenghtLocationY, null);
			g.drawImage(Magazine[magazine], MyMagazineLocationX, MyMagazineLocationY, null);
			g.drawImage(Optics[optics], MyOpticsLocationX, MyOpticsLocationY, null);
			g.drawImage(OpticMount[opticMount], MyOpticMountLocationX, MyOpticMountLocationY, null);
			g.drawImage(Bipod[bipod], MyBipodLocationX, MyBipodLocationY, null);
			g.drawImage(Monopod[monopod], MyMonopodLocationX, MyMonopodLocationY, null);
			g.drawImage(ChassisColor[chassisColor], MyChassisColorLocationX, MyChassisColorLocationY, null);
			g.drawImage(GripColor[gripColor], MyGripColorLocationX, MyGripColorLocationY, null);
			g.drawImage(CheekRestType[cheekRestType], MyCheekRestTypeLocationx, MyCheekRestTypeLocationY, null);
			g.drawImage(ButtPad[buttPad], MyButtPadLocationx, MyButtPadLocationY, null);
			g.drawImage(ButtSpacer[buttSpacer], MyButtSpacerLocationx, MyButtSpacerLocationY, null);
			g.drawImage(PalmRest[palmRest], MyPalmRestLocationx, MyPalmRestLocationY, null);
			g.drawImage(OffHandRest[offHandRest], MyOffHandRestLocationx, MyOffHandRestLocationY, null);
			g.drawImage(HandGuard[handGuard], MyHandGuardLocationx, MyHandGuardLocationY, null);
		}
		else if (rifleType == 2)
		{
			//g.drawImage(Magazine[magazine], MyMagazineLocationX, MyMagazineLocationY, null);
			//g.drawImage(BarrelLenght[barrelLenght], MyBarrelLenghtLocationX, MyBarrelLenghtLocationY, null);
		}
		else
		{
			//g.drawImage(Magazine[magazine], MyMagazineLocationX, MyMagazineLocationY, null);
			//g.drawImage(BarrelLenght[barrelLenght], MyBarrelLenghtLocationX, MyBarrelLenghtLocationY, null);
		}
		/*
		
		g.drawImage(ActionType[actionType], MyActionTypeLocationX, MyActionTypeLocationY, null);
		g.drawImage(BarrelLenght[barrelLenght], MyBarrelLenghtLocationX, MyBarrelLenghtLocationY, null);
		g.drawImage(Optics[optics], MyOpticsLocationX, MyOpticsLocationY, null);
		g.drawImage(OpticMount[opticMount], MyOpticMountLocationX, MyOpticMountLocationY, null);
		g.drawImage(Magazine[magazine], MyMagazineLocationX, MyMagazineLocationY, null);
		g.drawImage(Bipod[bipod], MyBipodLocationX, MyBipodLocationY, null);
		g.drawImage(Monopod[monopod], MyMonopodLocationX, MyMonopodLocationY, null);
		g.drawImage(ChassisColor[chassisColor], MyChassisColorLocationX, MyChassisColorLocationY, null);
		g.drawImage(GripColor[gripColor], MyGripColorLocationX, MyGripColorLocationY, null);
		*/
		/*
		g.drawImage(ActionType[1], MyActionTypeLocationX, MyActionTypeLocationY, null);
		g.drawImage(BarrelLenght[1], MyBarrelLenghtLocationX, MyBarrelLenghtLocationY, null);
		g.drawImage(Optics[1], MyOpticsLocationX, MyOpticsLocationY, null);
		g.drawImage(OpticMount[1], MyOpticMountLocationX, MyOpticMountLocationY, null);
		g.drawImage(Magazine[1], MyMagazineLocationX, MyMagazineLocationY, null);
		g.drawImage(Bipod[1], MyBipodLocationX, MyBipodLocationY, null);
		g.drawImage(Monopod[1], MyMonopodLocationX, MyMonopodLocationY, null);
		g.drawImage(ChassisColor[1], MyChassisColorLocationX, MyChassisColorLocationY, null);
		g.drawImage(GripColor[1], MyGripColorLocationX, MyGripColorLocationY, null);
		*/
	}      
	public Dimension getPreferredSize()
	{         
		return new Dimension(MyDisplayWidth,MyDisplayHeight);       
	}  
	
	
	public int getRifleType()
	{
		return rifleType;
	}
	public void setRifleType(int color)
	{
		rifleType = color;
	}
	public int getActionType()
	{
		return actionType;
	}
	public void setActionType(int color)
	{
		actionType = color;
	}
	public int getBarrelLenght()
	{
		return barrelLenght;
	}
	public void setBarrelLenght(int color)
	{
		barrelLenght = color;
	}
	public int getOptics()
	{
		return optics;
	}
	public void setOptics(int color)
	{
		optics = color;
	}
	public int getOpticMount()
	{
		return opticMount;
	}
	public void setOpticMount(int color)
	{
		opticMount = color;
	}
	public int getMagazine()
	{
		return magazine;
	}
	public void setMagazine(int color)
	{
		magazine = color;
	}
	public int getBipod()
	{
		return bipod;
	}
	public void setBipod(int color)
	{
		bipod = color;
	}
	public int getMonopod()
	{
		return monopod;
	}
	public void setMonopod(int color)
	{
		monopod = color;
	}
	public int getChassisColor()
	{
		return chassisColor;
	}
	public void setChassisColor(int color)
	{
		chassisColor = color;
	}
	public int getGripColor()
	{
		return gripColor;
	}
	public void setGripColor(int color)
	{
		gripColor = color;
	}
	public int getCheekRestType()
	{
		return cheekRestType;
	}
	public void setCheekRestType(int color)
	{
		cheekRestType = color;
	}
	public int getButtPad()
	{
		return buttPad;
	}
	public void setButtPad(int color)
	{
		buttPad = color;
	}
	public int getButtSpacer()
	{
		return buttSpacer;
	}
	public void setButtSpacer(int color)
	{
		buttSpacer = color;
	}
	public int getPalmRest()
	{
		return palmRest;
	}
	public void setPalmRest(int color)
	{
		palmRest = color;
	}
	public int getOffHandRest()
	{
		return offHandRest;
	}
	public void setOffHandRest(int color)
	{
		offHandRest = color;
	}
	public int getHandGuard()
	{
		return handGuard;
	}
	public void setHandGuard(int color)
	{
		handGuard = color;
	}
	public int getSlingPlate()
	{
		return slingPlate;
	}
	public void setSlingPlate(int color)
	{
		slingPlate = color;
	}
	public int getFlushRail()
	{
		return flushRail;
	}
	public void setFlushRail(int color)
	{
		flushRail = color;
	}
	public int getSideRailAdapters()
	{
		return sideRailAdapters;
	}
	public void setSideRailAdapters(int color)
	{
		sideRailAdapters = color;
	}
	public int getSidePicatinnyRail()
	{
		return sidePicatinnyRail;
	}
	public void setSidePicatinnyRail(int color)
	{
		sidePicatinnyRail = color;
	}
	public int getBottomPicatinnyRail()
	{
		return bottomPicatinnyRail;
	}
	public void setBottomPicatinnyRail(int color)
	{
		bottomPicatinnyRail = color;
	}
	public int getBipodAdapter()
	{
		return bipodAdapter;
	}
	public void setBipodAdapter(int color)
	{
		bipodAdapter = color;
	}
	public int getLugSlide()
	{
		return lugSlide;
	}
	public void setLugSlide(int color)
	{
		lugSlide = color;
	}
	public int getBarrelTensioner()
	{
		return barrelTensioner;
	}
	public void setBarrelTensioner(int color)
	{
		barrelTensioner = color;
	}
	public int getQDSlingSwivels()
	{
		return qDSlingSwivels;
	}
	public void setQDSlingSwivels(int color)
	{
		qDSlingSwivels = color;
	}
	public int getDisplayWidth()
	{
		return MyDisplayWidth;
	}
	public int getDisplayHeight()
	{
		return MyDisplayHeight;
	}
	
}
	

/**
RUN OUTPUT:

*/