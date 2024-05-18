/**
 * ************************************************************************
 * * The contents of this file are subject to the MRPL 1.2
 * * (the  "License"),  being   the  Mozilla   Public  License
 * * Version 1.1  with a permitted attribution clause; you may not  use this
 * * file except in compliance with the License. You  may  obtain  a copy of
 * * the License at http://www.floreantpos.org/license.html
 * * Software distributed under the License  is  distributed  on  an "AS IS"
 * * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * * License for the specific  language  governing  rights  and  limitations
 * * under the License.
 * * The Original Code is FLOREANT POS.
 * * The Initial Developer of the Original Code is OROCUBE LLC
 * * All portions are Copyright (C) 2015 OROCUBE LLC
 * * All Rights Reserved.
 * ************************************************************************
 */
package com.floreantpos.model;

import com.floreantpos.main.Application;
import com.floreantpos.model.base.BaseTicketItem;
//import com.floreantpos.model.dao.MenuItemDAO;
//import com.floreantpos.model.dao.PrinterGroupDAO;
//import com.floreantpos.util.DiscountUtil;
import com.floreantpos.util.NumberUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class TicketItem extends BaseTicketItem implements ITicketItem {
	private static final long serialVersionUID = 1L;

	public enum PIZZA_SECTION_MODE {
		FULL(1), HALF(2), QUARTER(3);

		private final int value;

		private PIZZA_SECTION_MODE(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public static PIZZA_SECTION_MODE from(int value) {
			if (value == 2) {
				return HALF;
			}
			if (value == 3) {
				return QUARTER;
			}
			return FULL;
		}

		@Override
		public String toString() {
			return name();
		}
	}

	public PIZZA_SECTION_MODE getPizzaSectionMode() {
		return PIZZA_SECTION_MODE.from(getPizzaSectionModeType());
	}

	public void setPizzaSectionMode(PIZZA_SECTION_MODE pizzaSectionMode) {
		setPizzaSectionModeType(pizzaSectionMode.getValue());
	}

	/*[CONSTRUCTOR MARKER BEGIN]*/
	public TicketItem() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public TicketItem(Integer id) {
		super(id);
	}

//	/**
//	 * Constructor for required fields
//	 */
//	public TicketItem(Integer id, com.floreantpos.model.Ticket ticket) {
//
//		super(id, ticket);
//	}

	/*[CONSTRUCTOR MARKER END]*/

//	private MenuItem menuItem;

	public TicketItem clone(TicketItem source) {
		try {
			// Write the object out to a byte array
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(source);
			out.flush();
			out.close();

			// Make an input stream from the byte array and read
			// a copy of the object back in.
			ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
			return (TicketItem) in.readObject();
		} catch (Exception cnfe) {
			//log here
			return null;
		}
	}

	private boolean priceIncludesTax;

	private int tableRowNum;

	public int getTableRowNum() {
		return tableRowNum;
	}

	public void setTableRowNum(int tableRowNum) {
		this.tableRowNum = tableRowNum;
	}

	public boolean canAddCookingInstruction() {
		if (isPrintedToKitchen())
			return false;

		return true;
	}
	public TicketItem(java.lang.Integer id, com.floreantpos.model.Ticket ticket) {

		super(id, ticket);
	}

//	public Double getTaxAmount() {
//		if (getTicket().isTaxExempt()) {
//			return 0.0;
//		}
//
//		return super.getTaxAmount();
//	}

	@Override
	public String toString() {
		return getName();
	}

	public String getNameDisplay() {
		return "   * " + getName(); //$NON-NLS-1$
	}
//	@Override
	public Double getUnitPriceDisplay() {
		if (isTreatAsSeat())
			return null;

		return getUnitPrice();
	}

//	public TicketItemModifier addTicketItemModifier(com.floreantpos.model.MenuModifier menuModifier, int modifierType, OrderType type, Multiplier multiplier) {
//		TicketItemModifier ticketItemModifier = new TicketItemModifier();
//		ticketItemModifier.setModifierId(menuModifier.getId());
//		MenuItemModifierGroup menuItemModifierGroup = menuModifier.getMenuItemModifierGroup();
//		if (menuItemModifierGroup != null) {
//			ticketItemModifier.setMenuItemModifierGroupId(menuItemModifierGroup.getId());
//		}
//		ticketItemModifier.setItemCount(1);
////		ticketItemModifier.setName(menuModifier.getDisplayName());
//		double price = menuModifier.getPriceForMultiplier(multiplier);
//		if (multiplier != null) {
//			ticketItemModifier.setMultiplierName(multiplier.getName());
//			ticketItemModifier.setName(multiplier.getTicketPrefix() + " " + menuModifier.getDisplayName());
//		}
//		ticketItemModifier.setUnitPrice(price);
//		ticketItemModifier.setTaxRate(menuModifier.getTaxByOrderType(type));
//
//		ticketItemModifier.setModifierType(modifierType);
//		ticketItemModifier.setShouldPrintToKitchen(menuModifier.isShouldPrintToKitchen());
//		ticketItemModifier.setTicketItem(this);
//
//		addToticketItemModifiers(ticketItemModifier);
//
//		return ticketItemModifier;
//	}

}