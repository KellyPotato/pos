package com.floreantpos.model.base;

import java.io.Serializable;

/**
 * This is an object that contains data related to the MENU_MODIFIER table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="MENU_MODIFIER"
 */

public abstract class BaseMenuModifier implements Comparable, Serializable {

	public static String REF = "MenuModifier"; //$NON-NLS-1$
	public static String PROP_SHOULD_PRINT_TO_KITCHEN = "shouldPrintToKitchen"; //$NON-NLS-1$
	public static String PROP_EXTRA_PRICE = "extraPrice"; //$NON-NLS-1$
	public static String PROP_MODIFIER_GROUP = "modifierGroup"; //$NON-NLS-1$
	public static String PROP_SORT_ORDER = "sortOrder"; //$NON-NLS-1$
	public static String PROP_TAX = "tax"; //$NON-NLS-1$
	public static String PROP_NAME = "name"; //$NON-NLS-1$
	public static String PROP_BUTTON_COLOR = "buttonColor"; //$NON-NLS-1$
	public static String PROP_TRANSLATED_NAME = "translatedName"; //$NON-NLS-1$
	public static String PROP_PRICE = "price"; //$NON-NLS-1$
	public static String PROP_SHOULD_SECTION_WISE_PRICE = "shouldSectionWisePrice"; //$NON-NLS-1$
	public static String PROP_ENABLE = "enable"; //$NON-NLS-1$
	public static String PROP_TEXT_COLOR = "textColor"; //$NON-NLS-1$
	public static String PROP_PIZZA_MODIFIER = "pizzaModifier"; //$NON-NLS-1$
	public static String PROP_ID = "id"; //$NON-NLS-1$
	public static String PROP_FIXED_PRICE = "fixedPrice"; //$NON-NLS-1$

	// constructors
	public BaseMenuModifier() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenuModifier(Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	protected String name;
	protected String translatedName;
	protected Double price;
	protected Double extraPrice;
	protected Integer sortOrder;
	protected Integer buttonColor;
	protected Integer textColor;
	protected Boolean enable;
	protected Boolean fixedPrice;
	protected Boolean shouldPrintToKitchen;
	protected Boolean shouldSectionWisePrice;
	protected Boolean pizzaModifier;

	// many to one
	private com.floreantpos.model.MenuModifierGroup modifierGroup;
	private com.floreantpos.model.Tax tax;

	// collections
	private java.util.List<com.floreantpos.model.PizzaModifierPrice> pizzaModifierPriceList;
	private java.util.List<com.floreantpos.model.ModifierMultiplierPrice> multiplierPriceList;
	private java.util.Map<String, String> properties;

	/**
	 * Return the unique identifier of this class
	 * @hibernate.id
	 *  generator-class="identity"
	 *  column="ID"
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId(Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
	 * Return the value associated with the column: NAME
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the value related to the column: NAME
	 * @param name the NAME value
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return the value associated with the column: TRANSLATED_NAME
	 */
	public String getTranslatedName() {
		return translatedName;
	}

	/**
	 * Set the value related to the column: TRANSLATED_NAME
	 * @param translatedName the TRANSLATED_NAME value
	 */
	public void setTranslatedName(String translatedName) {
		this.translatedName = translatedName;
	}

	/**
	 * Return the value associated with the column: PRICE
	 */
	public Double getPrice() {
		return price == null ? Double.valueOf(0) : price;
	}

	/**
	 * Set the value related to the column: PRICE
	 * @param price the PRICE value
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * Return the value associated with the column: EXTRA_PRICE
	 */
	public Double getExtraPrice() {
		return extraPrice == null ? Double.valueOf(0) : extraPrice;
	}

	/**
	 * Set the value related to the column: EXTRA_PRICE
	 * @param extraPrice the EXTRA_PRICE value
	 */
	public void setExtraPrice(Double extraPrice) {
		this.extraPrice = extraPrice;
	}

	/**
	 * Return the value associated with the column: SORT_ORDER
	 */
	public Integer getSortOrder() {
		return sortOrder == null ? Integer.valueOf(0) : sortOrder;
	}

	/**
	 * Set the value related to the column: SORT_ORDER
	 * @param sortOrder the SORT_ORDER value
	 */
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	/**
	 * Return the value associated with the column: BTN_COLOR
	 */
	public Integer getButtonColor() {
		return buttonColor == null ? Integer.valueOf(0) : buttonColor;
	}

	/**
	 * Set the value related to the column: BTN_COLOR
	 * @param buttonColor the BTN_COLOR value
	 */
	public void setButtonColor(Integer buttonColor) {
		this.buttonColor = buttonColor;
	}

	/**
	 * Return the value associated with the column: TEXT_COLOR
	 */
	public Integer getTextColor() {
		return textColor == null ? Integer.valueOf(0) : textColor;
	}

	/**
	 * Set the value related to the column: TEXT_COLOR
	 * @param textColor the TEXT_COLOR value
	 */
	public void setTextColor(Integer textColor) {
		this.textColor = textColor;
	}

	/**
	 * Return the value associated with the column: ENABLE
	 */
	public Boolean isEnable() {
		return enable == null ? Boolean.FALSE : enable;
	}

	/**
	 * Set the value related to the column: ENABLE
	 * @param enable the ENABLE value
	 */
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Return the value associated with the column: FIXED_PRICE
	 */
	public Boolean isFixedPrice() {
		return fixedPrice == null ? Boolean.FALSE : fixedPrice;
	}

	/**
	 * Set the value related to the column: FIXED_PRICE
	 * @param fixedPrice the FIXED_PRICE value
	 */
	public void setFixedPrice(Boolean fixedPrice) {
		this.fixedPrice = fixedPrice;
	}

	/**
	 * Return the value associated with the column: PRINT_TO_KITCHEN
	 */
	public Boolean isShouldPrintToKitchen() {
		return shouldPrintToKitchen == null ? Boolean.valueOf(true) : shouldPrintToKitchen;
	}

	/**
	 * Set the value related to the column: PRINT_TO_KITCHEN
	 * @param shouldPrintToKitchen the PRINT_TO_KITCHEN value
	 */
	public void setShouldPrintToKitchen(Boolean shouldPrintToKitchen) {
		this.shouldPrintToKitchen = shouldPrintToKitchen;
	}

	/**
	 * Custom property
	 */
	public static String getShouldPrintToKitchenDefaultValue() {
		return "true";
	}

	/**
	 * Return the value associated with the column: SECTION_WISE_PRICING
	 */
	public Boolean isShouldSectionWisePrice() {
		return shouldSectionWisePrice == null ? Boolean.FALSE : shouldSectionWisePrice;
	}

	/**
	 * Set the value related to the column: SECTION_WISE_PRICING
	 * @param shouldSectionWisePrice the SECTION_WISE_PRICING value
	 */
	public void setShouldSectionWisePrice(Boolean shouldSectionWisePrice) {
		this.shouldSectionWisePrice = shouldSectionWisePrice;
	}

	/**
	 * Return the value associated with the column: PIZZA_MODIFIER
	 */
	public Boolean isPizzaModifier() {
		return pizzaModifier == null ? Boolean.FALSE : pizzaModifier;
	}

	/**
	 * Set the value related to the column: PIZZA_MODIFIER
	 * @param pizzaModifier the PIZZA_MODIFIER value
	 */
	public void setPizzaModifier(Boolean pizzaModifier) {
		this.pizzaModifier = pizzaModifier;
	}

	/**
	 * Return the value associated with the column: GROUP_ID
	 */
	public com.floreantpos.model.MenuModifierGroup getModifierGroup() {
		return modifierGroup;
	}

	/**
	 * Set the value related to the column: GROUP_ID
	 * @param modifierGroup the GROUP_ID value
	 */
	public void setModifierGroup(com.floreantpos.model.MenuModifierGroup modifierGroup) {
		this.modifierGroup = modifierGroup;
	}

	/**
	 * Return the value associated with the column: TAX_ID
	 */
	public com.floreantpos.model.Tax getTax() {
		return tax;
	}

	/**
	 * Set the value related to the column: TAX_ID
	 * @param tax the TAX_ID value
	 */
	public void setTax(com.floreantpos.model.Tax tax) {
		this.tax = tax;
	}

	/**
	 * Return the value associated with the column: pizzaModifierPriceList
	 */
	public java.util.List<com.floreantpos.model.PizzaModifierPrice> getPizzaModifierPriceList() {
		return pizzaModifierPriceList;
	}

	/**
	 * Set the value related to the column: pizzaModifierPriceList
	 * @param pizzaModifierPriceList the pizzaModifierPriceList value
	 */
	public void setPizzaModifierPriceList(java.util.List<com.floreantpos.model.PizzaModifierPrice> pizzaModifierPriceList) {
		this.pizzaModifierPriceList = pizzaModifierPriceList;
	}

	public void addTopizzaModifierPriceList(com.floreantpos.model.PizzaModifierPrice pizzaModifierPrice) {
		if (null == getPizzaModifierPriceList())
			setPizzaModifierPriceList(new java.util.ArrayList<com.floreantpos.model.PizzaModifierPrice>());
		getPizzaModifierPriceList().add(pizzaModifierPrice);
	}

	/**
	 * Return the value associated with the column: multiplierPriceList
	 */
	public java.util.List<com.floreantpos.model.ModifierMultiplierPrice> getMultiplierPriceList() {
		return multiplierPriceList;
	}

	/**
	 * Set the value related to the column: multiplierPriceList
	 * @param multiplierPriceList the multiplierPriceList value
	 */
	public void setMultiplierPriceList(java.util.List<com.floreantpos.model.ModifierMultiplierPrice> multiplierPriceList) {
		this.multiplierPriceList = multiplierPriceList;
	}

	public void addTomultiplierPriceList(com.floreantpos.model.ModifierMultiplierPrice modifierMultiplierPrice) {
		if (null == getMultiplierPriceList())
			setMultiplierPriceList(new java.util.ArrayList<com.floreantpos.model.ModifierMultiplierPrice>());
		getMultiplierPriceList().add(modifierMultiplierPrice);
	}

	/**
	 * Return the value associated with the column: properties
	 */
	public java.util.Map<String, String> getProperties() {
		return properties;
	}

	/**
	 * Set the value related to the column: properties
	 * @param properties the properties value
	 */
	public void setProperties(java.util.Map<String, String> properties) {
		this.properties = properties;
	}
//
//	public boolean equals(Object obj) {
//		if (null == obj)
//			return false;
//		if (!(obj instanceof com.floreantpos.model.MenuModifier))
//			return false;
//		else {
//			com.floreantpos.model.MenuModifier menuModifier = (com.floreantpos.model.MenuModifier) obj;
//			if (null == this.getId() || null == menuModifier.getId())
//				return false;
//			else
//				return (this.getId().equals(menuModifier.getId()));
//		}
//	}

	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId())
				return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public int compareTo(Object obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}

	public String toString() {
		return super.toString();
	}

}