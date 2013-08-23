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
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorBW)
		{
			MyFrame.one.setCheekRestType(1);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorGT)
		{
			MyFrame.one.setCheekRestType(2);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorCB)
		{
			MyFrame.one.setCheekRestType(3);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorDE)
		{
			MyFrame.one.setCheekRestType(4);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorOD)
		{
			MyFrame.one.setCheekRestType(5);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorLG)
		{
			MyFrame.one.setCheekRestType(6);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorSB)
		{
			MyFrame.one.setCheekRestType(7);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorGIB)
		{
			MyFrame.one.setCheekRestType(8);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorBW)
		{
			MyFrame.one.setCheekRestType(9);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorGT)
		{
			MyFrame.one.setCheekRestType(10);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorCB)
		{
			MyFrame.one.setCheekRestType(11);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorDE)
		{
			MyFrame.one.setCheekRestType(12);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorOD)
		{
			MyFrame.one.setCheekRestType(13);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorLG)
		{
			MyFrame.one.setCheekRestType(14);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorSB)
		{
			MyFrame.one.setCheekRestType(15);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorGIB)
		{
			MyFrame.one.setCheekRestType(16);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorBW)
		{
			MyFrame.one.setCheekRestType(17);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorGT)
		{
			MyFrame.one.setCheekRestType(18);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorCB)
		{
			MyFrame.one.setCheekRestType(19);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorDE)
		{
			MyFrame.one.setCheekRestType(20);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorOD)
		{
			MyFrame.one.setCheekRestType(21);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorLG)
		{
			MyFrame.one.setCheekRestType(22);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorSB)
		{
			MyFrame.one.setCheekRestType(23);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorGIB)
		{
			MyFrame.one.setCheekRestType(24);
		}
		else if (e.getSource() == Menu.cheekRestTypeNone)
		{
			MyFrame.one.setCheekRestType(0);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorBW)
		{
			MyFrame.one.setButtPad(1);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorGT)
		{
			MyFrame.one.setButtPad(2);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorCB)
		{
			MyFrame.one.setButtPad(3);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorDE)
		{
			MyFrame.one.setButtPad(4);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorOD)
		{
			MyFrame.one.setButtPad(5);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorLG)
		{
			MyFrame.one.setButtPad(6);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorSB)
		{
			MyFrame.one.setButtPad(7);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorGIB)
		{
			MyFrame.one.setButtPad(8);
		}
		else if (e.getSource() == Menu.buttPadNone)
		{
			MyFrame.one.setButtPad(0);
		}
		else if (e.getSource() == Menu.buttSpacerQ1)
		{
			MyFrame.one.setButtSpacer(1);
		}
		else if (e.getSource() == Menu.buttSpacerQ2)
		{
			MyFrame.one.setButtSpacer(2);
		}
		else if (e.getSource() == Menu.buttSpacerQ3)
		{
			MyFrame.one.setButtSpacer(3);
		}
		else if (e.getSource() == Menu.buttSpacerQ4)
		{
			MyFrame.one.setButtSpacer(4);
		}
		else if (e.getSource() == Menu.buttSpacerQ5)
		{
			MyFrame.one.setButtSpacer(5);
		}
		else if (e.getSource() == Menu.buttSpacerQ6)
		{
			MyFrame.one.setButtSpacer(6);
		}
		else if (e.getSource() == Menu.buttSpacerQ7)
		{
			MyFrame.one.setButtSpacer(7);
		}
		else if (e.getSource() == Menu.buttSpacerQ8)
		{
			MyFrame.one.setButtSpacer(8);
		}
		else if (e.getSource() == Menu.buttSpacerQ9)
		{
			MyFrame.one.setButtSpacer(9);
		}
		else if (e.getSource() == Menu.buttSpacerQNone)
		{
			MyFrame.one.setButtSpacer(0);
		}
		else if (e.getSource() == Menu.palmRestColorBW)
		{
			MyFrame.one.setPalmRest(1);
		}
		else if (e.getSource() == Menu.palmRestColorGT)
		{
			MyFrame.one.setPalmRest(2);
		}
		else if (e.getSource() == Menu.palmRestColorCB)
		{
			MyFrame.one.setPalmRest(3);
		}
		else if (e.getSource() == Menu.palmRestColorDE)
		{
			MyFrame.one.setPalmRest(4);
		}
		else if (e.getSource() == Menu.palmRestColorOD)
		{
			MyFrame.one.setPalmRest(5);
		}
		else if (e.getSource() == Menu.palmRestColorLG)
		{
			MyFrame.one.setPalmRest(6);
		}
		else if (e.getSource() == Menu.palmRestColorSB)
		{
			MyFrame.one.setPalmRest(7);
		}
		else if (e.getSource() == Menu.palmRestColorGIB)
		{
			MyFrame.one.setPalmRest(8);
		}
		else if (e.getSource() == Menu.palmRestNone)
		{
			MyFrame.one.setPalmRest(0);
		}
		else if (e.getSource() == Menu.offHandRestYes)
		{
			MyFrame.one.setOffHandRest(1);
		}
		else if (e.getSource() == Menu.offHandRestNone)
		{
			MyFrame.one.setOffHandRest(0);
		}
		else if (e.getSource() == Menu.handGuardStandardColorBW)
		{
			MyFrame.one.setHandGuard(1);
		}
		else if (e.getSource() == Menu.handGuardStandardColorGT)
		{
			MyFrame.one.setHandGuard(2);
		}
		else if (e.getSource() == Menu.handGuardStandardColorCB)
		{
			MyFrame.one.setHandGuard(3);
		}
		else if (e.getSource() == Menu.handGuardStandardColorDE)
		{
			MyFrame.one.setHandGuard(4);
		}
		else if (e.getSource() == Menu.handGuardStandardColorOD)
		{
			MyFrame.one.setHandGuard(5);
		}
		else if (e.getSource() == Menu.handGuardStandardColorLG)
		{
			MyFrame.one.setHandGuard(6);
		}
		else if (e.getSource() == Menu.handGuardStandardColorSB)
		{
			MyFrame.one.setHandGuard(7);
		}
		else if (e.getSource() == Menu.handGuardStandardColorGIB)
		{
			MyFrame.one.setHandGuard(8);
		}
		else if (e.getSource() == Menu.handGuardVentedColorBW)
		{
			MyFrame.one.setHandGuard(9);
		}
		else if (e.getSource() == Menu.handGuardVentedColorGT)
		{
			MyFrame.one.setHandGuard(10);
		}
		else if (e.getSource() == Menu.handGuardVentedColorCB)
		{
			MyFrame.one.setHandGuard(11);
		}
		else if (e.getSource() == Menu.handGuardVentedColorDE)
		{
			MyFrame.one.setHandGuard(12);
		}
		else if (e.getSource() == Menu.handGuardVentedColorOD)
		{
			MyFrame.one.setHandGuard(13);
		}
		else if (e.getSource() == Menu.handGuardVentedColorLG)
		{
			MyFrame.one.setHandGuard(14);
		}
		else if (e.getSource() == Menu.handGuardVentedColorSB)
		{
			MyFrame.one.setHandGuard(15);
		}
		else if (e.getSource() == Menu.handGuardVentedColorGIB)
		{
			MyFrame.one.setHandGuard(16);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorBW)
		{
			MyFrame.one.setHandGuard(17);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorGT)
		{
			MyFrame.one.setHandGuard(18);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorCB)
		{
			MyFrame.one.setHandGuard(19);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorDE)
		{
			MyFrame.one.setHandGuard(20);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorOD)
		{
			MyFrame.one.setHandGuard(21);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorLG)
		{
			MyFrame.one.setHandGuard(22);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorSB)
		{
			MyFrame.one.setHandGuard(23);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorGIB)
		{
			MyFrame.one.setHandGuard(24);
		}
		else if (e.getSource() == Menu.handGuardNone)
		{
			MyFrame.one.setHandGuard(0);
		}
		else if (e.getSource() == Menu.slingPlateYes)
		{
			MyFrame.one.setSlingPlate(1);
		}
		else if (e.getSource() == Menu.slingPlateNone)
		{
			MyFrame.one.setSlingPlate(0);
		}
		else if (e.getSource() == Menu.flushRailYes)
		{
			MyFrame.one.setFlushRail(1);
		}
		else if (e.getSource() == Menu.flushRailNone)
		{
			MyFrame.one.setFlushRail(0);
		}
		else if (e.getSource() == Menu.sideRailAdaptersYes)
		{
			MyFrame.one.setSideRailAdapters(1);
		}
		else if (e.getSource() == Menu.sideRailAdaptersNone)
		{
			MyFrame.one.setSideRailAdapters(0);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail2inch1)
		{
			MyFrame.one.setSidePicatinnyRail(1);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail2inch2)
		{
			MyFrame.one.setSidePicatinnyRail(2);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail4inch1)
		{
			MyFrame.one.setSidePicatinnyRail(3);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail4inch2)
		{
			MyFrame.one.setSidePicatinnyRail(4);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail6inch1)
		{
			MyFrame.one.setSidePicatinnyRail(5);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail6inch2)
		{
			MyFrame.one.setSidePicatinnyRail(6);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail9inch1)
		{
			MyFrame.one.setSidePicatinnyRail(7);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail9inch2)
		{
			MyFrame.one.setSidePicatinnyRail(8);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail2inch)
		{
			MyFrame.one.setBottomPicatinnyRail(1);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail4inch)
		{
			MyFrame.one.setBottomPicatinnyRail(2);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail6inch)
		{
			MyFrame.one.setBottomPicatinnyRail(3);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail9inch)
		{
			MyFrame.one.setBottomPicatinnyRail(4);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRailNone)
		{
			MyFrame.one.setBottomPicatinnyRail(0);
		}
		else if (e.getSource() == Menu.bipodAdapterYes)
		{
			MyFrame.one.setBipodAdapter(1);
		}
		else if (e.getSource() == Menu.bipodAdapterNone)
		{
			MyFrame.one.setBipodAdapter(0);
		}
		else if (e.getSource() == Menu.lugSlideStandard)
		{
			MyFrame.one.setLugSlide(1);
		}
		else if (e.getSource() == Menu.lugSlideStandard)
		{
			MyFrame.one.setLugSlide(2);
		}
		else if (e.getSource() == Menu.lugSlideNone)
		{
			MyFrame.one.setLugSlide(0);
		}
		else if (e.getSource() == Menu.barrelTensionerYes)
		{
			MyFrame.one.setBarrelTensioner(1);
		}
		else if (e.getSource() == Menu.barrelTensionerNone)
		{
			MyFrame.one.setBarrelTensioner(0);
		}
		else if (e.getSource() == Menu.QDSlingSwivelsYes)
		{
			MyFrame.one.setQDSlingSwivels(1);
		}
		else if (e.getSource() == Menu.QDSlingSwivelsNone)
		{
			MyFrame.one.setQDSlingSwivels(0);
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
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorBW)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorGT)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorCB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorDE)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorOD)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorLG)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorSB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeSpacerColorGIB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorBW)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorGT)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorCB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorDE)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorOD)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorLG)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorSB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelColorGIB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorBW)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorGT)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorCB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorDE)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorOD)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorLG)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorSB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeThumbWheelwQuickDetachColorGIB)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.cheekRestTypeNone)
		{
			MyFrame.one.setCheekRestType(Menu.cheekRestType[5]);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorBW)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorGT)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorCB)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorDE)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorOD)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorLG)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorSB)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttPadSpacerColorGIB)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttPadNone)
		{
			MyFrame.one.setButtPad(Menu.buttPad[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ1)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ2)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ3)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ4)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ5)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ6)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ7)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ8)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQ9)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.buttSpacerQNone)
		{
			MyFrame.one.setButtSpacer(Menu.buttSpacer[5]);
		}
		else if (e.getSource() == Menu.palmRestColorBW)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.palmRestColorGT)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.palmRestColorCB)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.palmRestColorDE)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.palmRestColorOD)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.palmRestColorLG)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.palmRestColorSB)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.palmRestColorGIB)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.palmRestNone)
		{
			MyFrame.one.setPalmRest(Menu.palmRest[5]);
		}
		else if (e.getSource() == Menu.offHandRestYes)
		{
			MyFrame.one.setOffHandRest(Menu.offHandRest[5]);
		}
		else if (e.getSource() == Menu.offHandRestNone)
		{
			MyFrame.one.setOffHandRest(Menu.offHandRest[5]);
		}
		else if (e.getSource() == Menu.handGuardStandardColorBW)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardStandardColorGT)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardStandardColorCB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardStandardColorDE)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardStandardColorOD)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardStandardColorLG)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardStandardColorSB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardStandardColorGIB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardVentedColorBW)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardVentedColorGT)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardVentedColorCB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardVentedColorDE)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardVentedColorOD)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardVentedColorLG)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardVentedColorSB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardVentedColorGIB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorBW)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorGT)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorCB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorDE)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorOD)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorLG)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorSB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardCutoutColorGIB)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.handGuardNone)
		{
			MyFrame.one.setHandGuard(Menu.handGuard[5]);
		}
		else if (e.getSource() == Menu.slingPlateYes)
		{
			MyFrame.one.setSlingPlate(Menu.slingPlate[5]);
		}
		else if (e.getSource() == Menu.slingPlateNone)
		{
			MyFrame.one.setSlingPlate(Menu.slingPlate[5]);
		}
		else if (e.getSource() == Menu.flushRailYes)
		{
			MyFrame.one.setFlushRail(Menu.flushRail[5]);
		}
		else if (e.getSource() == Menu.flushRailNone)
		{
			MyFrame.one.setFlushRail(Menu.flushRail[5]);
		}
		else if (e.getSource() == Menu.sideRailAdaptersYes)
		{
			MyFrame.one.setSideRailAdapters(Menu.sideRailAdapters[5]);
		}
		else if (e.getSource() == Menu.sideRailAdaptersNone)
		{
			MyFrame.one.setSideRailAdapters(Menu.sideRailAdapters[5]);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail2inch1)
		{
			MyFrame.one.setSidePicatinnyRail(Menu.sidePicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail2inch2)
		{
			MyFrame.one.setSidePicatinnyRail(Menu.sidePicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail4inch1)
		{
			MyFrame.one.setSidePicatinnyRail(Menu.sidePicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail4inch2)
		{
			MyFrame.one.setSidePicatinnyRail(Menu.sidePicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail6inch1)
		{
			MyFrame.one.setSidePicatinnyRail(Menu.sidePicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail6inch2)
		{
			MyFrame.one.setSidePicatinnyRail(Menu.sidePicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail9inch1)
		{
			MyFrame.one.setSidePicatinnyRail(Menu.sidePicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.sidePicatinnyRail9inch2)
		{
			MyFrame.one.setSidePicatinnyRail(Menu.sidePicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail2inch)
		{
			MyFrame.one.setBottomPicatinnyRail(Menu.bottomPicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail4inch)
		{
			MyFrame.one.setBottomPicatinnyRail(Menu.bottomPicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail6inch)
		{
			MyFrame.one.setBottomPicatinnyRail(Menu.bottomPicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRail9inch)
		{
			MyFrame.one.setBottomPicatinnyRail(Menu.bottomPicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.bottomPicatinnyRailNone)
		{
			MyFrame.one.setBottomPicatinnyRail(Menu.bottomPicatinnyRail[5]);
		}
		else if (e.getSource() == Menu.bipodAdapterYes)
		{
			MyFrame.one.setBipodAdapter(Menu.bipodAdapter[5]);
		}
		else if (e.getSource() == Menu.bipodAdapterNone)
		{
			MyFrame.one.setBipodAdapter(Menu.bipodAdapter[5]);
		}
		else if (e.getSource() == Menu.lugSlideStandard)
		{
			MyFrame.one.setLugSlide(Menu.lugSlide[5]);
		}
		else if (e.getSource() == Menu.lugSlideStandard)
		{
			MyFrame.one.setLugSlide(Menu.lugSlide[5]);
		}
		else if (e.getSource() == Menu.lugSlideNone)
		{
			MyFrame.one.setLugSlide(Menu.lugSlide[5]);
		}
		else if (e.getSource() == Menu.barrelTensionerYes)
		{
			MyFrame.one.setBarrelTensioner(Menu.barrelTensioner[5]);
		}
		else if (e.getSource() == Menu.barrelTensionerNone)
		{
			MyFrame.one.setBarrelTensioner(Menu.barrelTensioner[5]);
		}
		else if (e.getSource() == Menu.QDSlingSwivelsYes)
		{
			MyFrame.one.setQDSlingSwivels(Menu.QDSlingSwivels[5]);
		}
		else if (e.getSource() == Menu.QDSlingSwivelsNone)
		{
			MyFrame.one.setQDSlingSwivels(Menu.QDSlingSwivels[5]);
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