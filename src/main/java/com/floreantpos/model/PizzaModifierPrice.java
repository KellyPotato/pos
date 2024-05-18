package com.floreantpos.model;

import com.floreantpos.model.base.BasePizzaModifierPrice;

import java.util.*;

public class PizzaModifierPrice extends BasePizzaModifierPrice {
	private static final long serialVersionUID = 1L;

	private Map<String, ModifierMultiplierPrice> priceMap = new HashMap<>();

	public PizzaModifierPrice() {
		super();
	}

	public PizzaModifierPrice(Integer id) {
		super(id);
	}

	public double getPrice() {
		return 0;
	}

	public double getExtraPrice() {
		return 0;
	}

	public void setPrice(double price) {

	}

	public void setExtraPrice(double price) {

	}

	public void initializeSizeAndPriceList(List<Multiplier> multipliers) {
		List<ModifierMultiplierPrice> priceList = getMultiplierPriceList();
		if (priceList == null) {
			priceList = new ArrayList<>();
		}
		for (ModifierMultiplierPrice price : priceList) {
			priceMap.put(price.getMultiplier().getName(), price);
		}
		for (Multiplier multiplier : multipliers) {
			ModifierMultiplierPrice priceItem = priceMap.get(multiplier.getName());
			if (priceItem == null) {
				priceItem = new ModifierMultiplierPrice();
				priceItem.setMultiplier(multiplier);
				priceList.add(priceItem);
				priceMap.put(multiplier.getName(), priceItem);
			}
		}
		setMultiplierPriceList(priceList);
	}

	public ModifierMultiplierPrice getMultiplier(String columnName) {
		return priceMap.get(columnName);
	}

	public void populateMultiplierPriceListRowValue(com.floreantpos.model.MenuModifier modifier) {
		for (Iterator iterator = getMultiplierPriceList().iterator(); iterator.hasNext();) {
			ModifierMultiplierPrice price = (ModifierMultiplierPrice) iterator.next();
			if (price.getPrice() == null) {
				iterator.remove();
				continue;
			}
			price.setModifier(modifier);
			price.setPizzaModifierPrice(this);

		}
	}
}