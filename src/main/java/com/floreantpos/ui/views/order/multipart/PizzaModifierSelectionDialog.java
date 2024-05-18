///**
// * ************************************************************************
// * * The contents of this file are subject to the MRPL 1.2
// * * (the  "License"),  being   the  Mozilla   Public  License
// * * Version 1.1  with a permitted attribution clause; you may not  use this
// * * file except in compliance with the License. You  may  obtain  a copy of
// * * the License at http://www.floreantpos.org/license.html
// * * Software distributed under the License  is  distributed  on  an "AS IS"
// * * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
// * * License for the specific  language  governing  rights  and  limitations
// * * under the License.
// * * The Original Code is FLOREANT POS.
// * * The Initial Developer of the Original Code is OROCUBE LLC
// * * All portions are Copyright (C) 2015 OROCUBE LLC
// * * All Rights Reserved.
// * ************************************************************************
// */
///*
// * OrderView.java
// *
// * Created on August 4, 2006, 6:58 PM
// */
//
//package com.floreantpos.ui.views.order.multipart;
////
////import com.floreantpos.IconFactory;
////import com.floreantpos.POSConstants;
////import com.floreantpos.model.MenuItem;
//import com.floreantpos.model.*;
//import com.floreantpos.model.TicketItem.PIZZA_SECTION_MODE;
////import com.floreantpos.swing.*;
////import com.floreantpos.ui.PosTableRenderer;
////import com.floreantpos.ui.dialog.NumberSelectionDialog2;
////import com.floreantpos.ui.dialog.POSDialog;
////import com.floreantpos.ui.dialog.POSMessageDialog;
////import com.floreantpos.ui.views.order.OrderView;
////import com.floreantpos.ui.views.order.modifier.ModifierSelectionListener;
////import com.floreantpos.util.CurrencyUtil;
////import com.floreantpos.util.NumberUtil;
////import com.floreantpos.util.POSUtil;
////import net.miginfocom.swing.MigLayout;
////import org.jdesktop.swingx.JXCollapsiblePane;
//
//import javax.swing.*;
//import javax.swing.border.Border;
//import javax.swing.border.TitledBorder;
//import javax.swing.table.TableColumnModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.geom.Ellipse2D;
//import java.util.List;
//import java.util.*;
//
///**
// *
// * @author MShahriar
// */
//public class PizzaModifierSelectionDialog {
//	private static final String PROP_PIZZA_PRICE = "pizzaPrice";
////	private PizzaModifierView modifierView;
//
//	private boolean crustSelected = false;
//	private TicketItemModifier crustModifier;
//
//
//
//	private TicketItemModifier convertToTicketItemModifier(TicketItem ticketItem, MenuModifier menuModifier, OrderType type, Multiplier multiplier) {
//		TicketItemModifier ticketItemModifier = new TicketItemModifier();
//		ticketItemModifier.setModifierId(menuModifier.getId());
//		MenuItemModifierGroup menuItemModifierGroup = menuModifier.getMenuItemModifierGroup();
//		if (menuItemModifierGroup != null) {
//			ticketItemModifier.setMenuItemModifierGroupId(menuItemModifierGroup.getId());
//		}
//		ticketItemModifier.setItemCount(1);
//		ticketItemModifier.setName(menuModifier.getDisplayName().trim());
//		ticketItemModifier.setTicketItem(ticketItem);
////		double priceForSize = menuModifier.getPriceForSizeAndMultiplier(getSelectedSize(), false, multiplier);
//		if (multiplier != null) {
//			ticketItemModifier.setMultiplierName(multiplier.getName());
//			ticketItemModifier.setName(multiplier.getTicketPrefix() + " " + menuModifier.getDisplayName());
//		}
////		ticketItemModifier.setUnitPrice(priceForSize);
//		ticketItemModifier.setTaxRate(menuModifier.getTaxByOrderType(type));
//		ticketItemModifier.setModifierType(TicketItemModifier.NORMAL_MODIFIER);
//		ticketItemModifier.setShouldPrintToKitchen(menuModifier.isShouldPrintToKitchen());
//		ticketItemModifier.setShouldSectionWisePrice(menuModifier.isShouldSectionWisePrice());
//
//		return ticketItemModifier;
//	}
//
//
////	public MenuItemSize getSelectedSize() {
//////		List<POSToggleButton> sizeButtonList = sizeAndCrustPanel.sizeButtonList;
////		for (POSToggleButton posToggleButton : sizeButtonList) {
////			if (posToggleButton.isSelected()) {
////				PizzaPrice pizzaPrice = (PizzaPrice) posToggleButton.getClientProperty(PROP_PIZZA_PRICE);
////				return pizzaPrice.getSize();
////			}
////		}
////		return null;
////	}
////	class SizeAndCrustSelectionPane extends JPanel {
////		List<PizzaPrice> priceList;
////
////		List<POSToggleButton> sizeButtonList = new ArrayList<POSToggleButton>();
////		List<POSToggleButton> crustButtonList = new ArrayList<POSToggleButton>();
////
////		JPanel sizePanel = new JPanel();
////		JPanel crustPanel = new JPanel();
////
////		ButtonGroup sizeBtnGroup = new ButtonGroup();
////		ButtonGroup crustBtnGroup = new ButtonGroup();
////
////		MenuItemSize menuItemSize;
////		PizzaCrust pizzaCrust;
////
////		public SizeAndCrustSelectionPane() {
////			priceList = menuItem.getPizzaPriceList();
////
////			setLayout(new BorderLayout());
////
////			sizePanel.setBorder(BorderFactory.createTitledBorder(null, "SIZE", TitledBorder.CENTER, TitledBorder.TOP));
////
////			crustPanel.setBorder(BorderFactory.createTitledBorder(null, "CRUST", TitledBorder.CENTER, TitledBorder.TOP));
////			crustPanel.setLayout(new java.awt.FlowLayout());
////
////			Set<MenuItemSize> uniqueSizeList = new HashSet<MenuItemSize>();
////
////			for (PizzaPrice pizzaPrice : priceList) {
////				MenuItemSize size = pizzaPrice.getSize();
////				if (uniqueSizeList.contains(size)) {
////					continue;
////				}
////
////				uniqueSizeList.add(size);
////				addSizeButton(pizzaPrice, size);
////			}
////
////			selectExistingSizeAndCrust();
////
////			add(sizePanel, BorderLayout.WEST);
////			add(crustPanel);
////		}
////
////		private void selectExistingSizeAndCrust() {
////			TicketItemModifier sizeAndCrustModifer = getSizeAndCrustModifer();
////			if (sizeAndCrustModifer != null) {
////				String sizeAndCrustName = sizeAndCrustModifer.getName();
////				String[] split = sizeAndCrustName.split(" ");
////				String sizeName = split[0];
////				String crustName = split[1];//.replaceAll("\\s", "").trim();
////
////				for (POSToggleButton sizeButton : sizeButtonList) {
////					PizzaPrice pizzaPrice = (PizzaPrice) sizeButton.getClientProperty(PROP_PIZZA_PRICE);
////					if (pizzaPrice.getSize().getName().equalsIgnoreCase(sizeName)) {
////						sizeButton.setSelected(true);
////						renderCrusts(pizzaPrice.getSize());
////						continue;
////					}
////					else {
////						if (ticketItem.isPrintedToKitchen()) {
////							sizeButton.setEnabled(false);
////						}
////					}
////				}
////
////				for (POSToggleButton crustButton : crustButtonList) {
////					PizzaPrice pizzaPrice = (PizzaPrice) crustButton.getClientProperty(PROP_PIZZA_PRICE);
////					if (pizzaPrice.getCrust().getName().startsWith(crustName)) {
////						crustButton.setSelected(true);
////						crustSelected = true;
////					}
////					else {
////						if (ticketItem.isPrintedToKitchen()) {
////							crustButton.setEnabled(false);
////						}
////					}
////				}
////
////			}
////			else {
////				if (!sizeButtonList.isEmpty()) {
////					List<Boolean> isBtnSelected = new ArrayList<Boolean>();
////					for (Iterator iterator = sizeButtonList.iterator(); iterator.hasNext();) {
////						POSToggleButton button = (POSToggleButton) iterator.next();
////						if (button.isSelected()) {
////							PizzaPrice pizzaPrice = (PizzaPrice) button.getClientProperty(PROP_PIZZA_PRICE);
////							renderCrusts(pizzaPrice.getSize());
////							isBtnSelected.add(true);
////						}
////
////					}
////					if (isBtnSelected.isEmpty() || isBtnSelected.contains(false)) {
////						POSToggleButton button = sizeButtonList.get(0);
////						PizzaPrice pizzaPrice = (PizzaPrice) button.getClientProperty(PROP_PIZZA_PRICE);
////						renderCrusts(pizzaPrice.getSize());
////
////						button.setSelected(true);
////					}
////				}
////			}
////		}
////
////		private void addSizeButton(PizzaPrice pizzaPrice, MenuItemSize size) {
////			POSToggleButton sizeButton = new POSToggleButton(size.getName());
////			sizeButton.putClientProperty(PROP_PIZZA_PRICE, pizzaPrice);
////			if (size.isDefaultSize()) {
////				sizeButton.setSelected(true);
////			}
////			sizeButton.addActionListener(new ActionListener() {
////				@Override
////				public void actionPerformed(ActionEvent e) {
////					POSToggleButton button = (POSToggleButton) e.getSource();
////					PizzaPrice pizzaPrice = (PizzaPrice) button.getClientProperty(PROP_PIZZA_PRICE);
////					renderCrusts(pizzaPrice.getSize());
////
////					if (getSizeAndCrustModifer() != null) {
////						ticketItem.setSizeModifier(getSizeAndCrustModifer());
////						ticketItem.getSizeModifier().calculatePrice();
////						//ticketItemModifierView.getTicketItemViewerModel().getRows();
////						ticketItemViewerModel.updateView();
////						//ticketItemModifierView.repaint();
////					}
////					modifierView.updateView();
////				}
////			});
////			sizeBtnGroup.add(sizeButton);
////			sizeButtonList.add(sizeButton);
////			sizePanel.add(sizeButton);
////		}
////
////		protected void renderCrusts(MenuItemSize size) {
////			setMenuItemSize(size);
////			for (POSToggleButton component : crustButtonList) {
////				crustBtnGroup.remove(component);
////			}
////			crustPanel.removeAll();
////
////			Set<PizzaPrice> availablePrices = menuItem.getAvailablePrices(size);
////			TicketItemModifier sizeAndCrustModifer = getSizeAndCrustModifer();
////			for (final PizzaPrice pizzaPrice : availablePrices) {
////				POSToggleButton crustButton = new POSToggleButton();
////				crustButton.setText("<html><center>" + pizzaPrice.getCrust().getName() + "<br/>" + CurrencyUtil.getCurrencySymbol()
////						+ pizzaPrice.getPrice(menuItem.getDefaultSellPortion()) + "</center></html>");
////				crustButton.putClientProperty(PROP_PIZZA_PRICE, pizzaPrice);
////				if (availablePrices.size() == 1) {
////					crustSelected = true;
////					crustButton.setSelected(true);
////					pizzaCrustSelected(crustButton);
////					setPizzaCrust(pizzaPrice.getCrust());
////				}
////				if (pizzaPrice.getCrust().isDefaultCrust() && sizeAndCrustModifer == null) {
////					crustSelected = true;
////					crustButton.setSelected(true);
////					pizzaCrustSelected(crustButton);
////					setPizzaCrust(pizzaPrice.getCrust());
////				}
////				if (sizeAndCrustModifer != null) {
////					String sizeAndCrustName = sizeAndCrustModifer.getName();
////					String[] split = sizeAndCrustName.split(" ");
////					String crustName = split[1];
////					if (pizzaPrice.getCrust().getName().startsWith(crustName)) {
////						crustSelected = true;
////						crustButton.setSelected(true);
////						pizzaCrustSelected(crustButton);
////						setPizzaCrust(pizzaPrice.getCrust());
////					}
////				}
////				crustButton.addActionListener(new ActionListener() {
////					@Override
////					public void actionPerformed(ActionEvent e) {
////						POSToggleButton button = (POSToggleButton) e.getSource();
////						pizzaCrustSelected(button);
////						setPizzaCrust(pizzaPrice.getCrust());
////
////						if (getSizeAndCrustModifer() != null) {
////							ticketItem.setSizeModifier(getSizeAndCrustModifer());
////							ticketItem.getSizeModifier().calculatePrice();
////							//ticketItemModifierView.getTicketItemViewerModel().getRows();
////							ticketItemViewerModel.updateView();
////							//ticketItemModifierView.repaint();
////						}
////					}
////				});
////				crustBtnGroup.add(crustButton);
////				crustButtonList.add(crustButton);
////				crustPanel.add(crustButton);
////			}
////			crustPanel.revalidate();
////			crustPanel.repaint();
////		}
////
////		public MenuItemSize getMenuItemSize() {
////			return menuItemSize;
////		}
////
////		public void setMenuItemSize(MenuItemSize menuItemSize) {
////			this.menuItemSize = menuItemSize;
////		}
////
////		public PizzaCrust getPizzaCrust() {
////			return pizzaCrust;
////		}
////
////		public void setPizzaCrust(PizzaCrust pizzaCrust) {
////			this.pizzaCrust = pizzaCrust;
////		}
////	}
//
//
//}
