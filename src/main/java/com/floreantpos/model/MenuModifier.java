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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.floreantpos.config.TerminalConfig;
import com.floreantpos.model.OrderType;
import org.apache.commons.lang.StringUtils;

//import com.floreantpos.config.TerminalConfig;
import com.floreantpos.model.base.BaseMenuModifier;
//import com.floreantpos.util.POSUtil;

public class MenuModifier extends BaseMenuModifier {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public MenuModifier () {
		super();
	}

//	/**
//	 * Constructor for primary key
//	 */
//	public MenuModifier (java.lang.Integer id) {
//		super(id);
//	}
//
//	/* [CONSTRUCTOR MARKER END] */

	private transient MenuItemModifierGroup menuItemModifierGroup;

	public MenuItemModifierGroup getMenuItemModifierGroup() {
		return menuItemModifierGroup;
	}
//
//	public void setMenuItemModifierGroup(MenuItemModifierGroup menuItemModifierGroup) {
//		this.menuItemModifierGroup = menuItemModifierGroup;
//	}
//
//	@Override
//	public Integer getSortOrder() {
//		return sortOrder == null ? 9999 : sortOrder;
//	}
//
//	@Override
//	public Integer getButtonColor() {
//		return buttonColor;
//	}
//
//	@Override
//	public Integer getTextColor() {
//		return textColor;
//	}
//
//	public String getDisplayName() {
//		if (TerminalConfig.isUseTranslatedName() && StringUtils.isNotEmpty(getTranslatedName())) {
//			return getTranslatedName();
//		}
//
//		return super.getName();
//	}
//
//	@Override
//	public String toString() {
//		return getName();
//	}
//
//	public String getUniqueId() {
//		return ("menu_modifier_" + getName() + "_" + getId()).replaceAll("\\s+", "_"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
//	}
//
//	//

	public String getProperty(String key) {
		if (getProperties() == null) {
			return null;
		}

		return getProperties().get(key);
	}

	public double getTaxByOrderType(OrderType type) {
		if (this.getTax() == null) {
			return 0;
		}
		double defaultTax = this.getTax().getRate();
		if (type == null) {
			return defaultTax;
		}

		String taxProp = getProperty(type.name() + "_TAX"); //$NON-NLS-1$
		if (taxProp == null)
			return defaultTax;

		try {
			return Double.parseDouble(taxProp);
		} catch (Exception e) {
			return defaultTax;
		}
	}

	public double getPriceForMultiplier(Multiplier multiplier) {
		double defaultPrice = this.getPrice();
		if (multiplier == null || multiplier.isMain()) {
			return defaultPrice;
		}

		List<ModifierMultiplierPrice> priceList = getMultiplierPriceList();
		if (priceList == null || priceList.isEmpty()) {
			return defaultPrice * multiplier.getRate() / 100;
		}
		for (ModifierMultiplierPrice multiplierPrice : priceList) {
			if (multiplier.getName().equals(multiplierPrice.getMultiplier().getName())) {
				return multiplierPrice.getPrice();
			}
		}
		return defaultPrice * multiplier.getRate() / 100;
	}
	public String getDisplayName() {
		if (TerminalConfig.isUseTranslatedName() && StringUtils.isNotEmpty(getTranslatedName())) {
			return getTranslatedName();
		}

		return super.getName();
	}

	public double getPriceForSizeAndMultiplier(MenuItemSize size, boolean extra, Multiplier multiplier) {
		List<PizzaModifierPrice> priceList = getPizzaModifierPriceList();
		double regularPrice = 0;
		if (isPizzaModifier() && priceList != null) {
			for (PizzaModifierPrice pizzaModifierPrice : priceList) {
				if (size.getId().intValue() == pizzaModifierPrice.getSize().getId().intValue()) {
					List<ModifierMultiplierPrice> multiplierPriceList = pizzaModifierPrice.getMultiplierPriceList();
					if (multiplierPriceList != null) {
						Double multiplierPrice = null;
						for (ModifierMultiplierPrice price : multiplierPriceList) {
							String priceTableMultiplierName = price.getMultiplier().getName();
							if (priceTableMultiplierName.equals(Multiplier.REGULAR)) {
								regularPrice = price.getPrice();
								if (multiplier.getName().equals(Multiplier.REGULAR)) {
									return regularPrice;
								}
							}
							else if (priceTableMultiplierName.equals(multiplier.getName())) {
								multiplierPrice = price.getPrice();
							}
						}
						if (multiplierPrice != null) {
							return multiplierPrice;
						}
					}
				}
			}
		}
		return regularPrice * multiplier.getRate() / 100;
	}


}