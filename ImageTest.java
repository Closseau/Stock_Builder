
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
	public static final int MyBarrelLenghtLocationX = 810;
	public static final int MyBarrelLenghtLocationY = 280;
	public static final int MyOpticsLocationX = 0;
	public static final int MyOpticsLocationY = 268;
	public static final int MyOpticMountLocationX = 0;
	public static final int MyOpticMountLocationY = 402;
	public static final int MyMagazineLocationX = 495;
	public static final int MyMagazineLocationY = 370;
	public static final int MyBipodLocationX = 0;
	public static final int MyBipodLocationY = 669;
	public static final int MyMonopodLocationX = 0;
	public static final int MyMonopodLocationY = 800;
	public static final int MyChassisColorLocationX = 500;
	public static final int MyChassisColorLocationY = 0;
	public static final int MyGripColorLocationX = 500;
	public static final int MyGripColorLocationY = 200;
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
	public ImageTest() 
	{        
		int i;
		int x;
		int y;
		try
		{  
		    
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
				
			}
		} 
		catch (IOException e)
		{        
		}      
	}       
	public void paint(Graphics g)
	{         
		
		g.drawImage(RifleType[rifleType], MyRifleTypeLocationX, MyRifleTypeLocationY, null);
		if (rifleType == 1)
		{
			g.drawImage(Magazine[magazine], MyMagazineLocationX, MyMagazineLocationY, null);
			g.drawImage(BarrelLenght[barrelLenght], MyBarrelLenghtLocationX, MyBarrelLenghtLocationY, null);
		}
		else if (rifleType == 2)
		{
			g.drawImage(Magazine[magazine], MyMagazineLocationX, MyMagazineLocationY, null);
			g.drawImage(BarrelLenght[barrelLenght], MyBarrelLenghtLocationX, MyBarrelLenghtLocationY, null);
		}
		else
		{
			g.drawImage(Magazine[magazine], MyMagazineLocationX, MyMagazineLocationY, null);
			g.drawImage(BarrelLenght[barrelLenght], MyBarrelLenghtLocationX, MyBarrelLenghtLocationY, null);
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