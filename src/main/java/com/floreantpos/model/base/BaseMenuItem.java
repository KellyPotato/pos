package com.floreantpos.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the MENU_ITEM table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="MENU_ITEM"
 */

public abstract class BaseMenuItem implements Comparable, Serializable {

	public static String REF = "MenuItem"; //$NON-NLS-1$
	public static String PROP_SHOW_IMAGE_ONLY = "showImageOnly"; //$NON-NLS-1$
	public static String PROP_DESCRIPTION = "description"; //$NON-NLS-1$
	public static String PROP_PRINTER_GROUP = "printerGroup"; //$NON-NLS-1$
	public static String PROP_PARENT = "parent"; //$NON-NLS-1$
	public static String PROP_PIZZA_TYPE = "pizzaType"; //$NON-NLS-1$
	public static String PROP_STOCK_AMOUNT = "stockAmount"; //$NON-NLS-1$
	public static String PROP_SORT_ORDER = "sortOrder"; //$NON-NLS-1$
	public static String PROP_UNIT_NAME = "unitName"; //$NON-NLS-1$
	public static String PROP_DEFAULT_SELL_PORTION = "defaultSellPortion"; //$NON-NLS-1$
	public static String PROP_RECEPIE = "recepie"; //$NON-NLS-1$
	public static String PROP_DISCOUNT_RATE = "discountRate"; //$NON-NLS-1$
	public static String PROP_DISABLE_WHEN_STOCK_AMOUNT_IS_ZERO = "disableWhenStockAmountIsZero"; //$NON-NLS-1$
	public static String PROP_NAME = "name"; //$NON-NLS-1$
	public static String PROP_TEXT_COLOR_CODE = "textColorCode"; //$NON-NLS-1$
	public static String PROP_TRANSLATED_NAME = "translatedName"; //$NON-NLS-1$
	public static String PROP_PRICE = "price"; //$NON-NLS-1$
	public static String PROP_BARCODE = "barcode"; //$NON-NLS-1$
	public static String PROP_IMAGE_DATA = "imageData"; //$NON-NLS-1$
	public static String PROP_FRACTIONAL_UNIT = "fractionalUnit"; //$NON-NLS-1$
	public static String PROP_TAX_GROUP = "taxGroup"; //$NON-NLS-1$
	public static String PROP_VISIBLE = "visible"; //$NON-NLS-1$
	public static String PROP_ID = "id"; //$NON-NLS-1$
	public static String PROP_BUY_PRICE = "buyPrice"; //$NON-NLS-1$
	public static String PROP_BUTTON_COLOR_CODE = "buttonColorCode"; //$NON-NLS-1$


	// constructors
	public BaseMenuItem() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenuItem(Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMenuItem(
		Integer id,
		String name,
		Double buyPrice,
		Double price) {

		this.setId(id);
		this.setName(name);
		this.setBuyPrice(buyPrice);
		this.setPrice(price);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
		protected String name;
		protected String description;
		protected String unitName;
		protected String translatedName;
		protected String barcode;
		protected Double buyPrice;
		protected Double stockAmount;
		protected Double price;
		protected Double discountRate;
		protected Boolean visible;
		protected Boolean disableWhenStockAmountIsZero;
		protected Integer sortOrder;
		protected Integer buttonColorCode;
		protected Integer textColorCode;
		protected byte[] imageData;
		protected Boolean showImageOnly;
		protected Boolean fractionalUnit;
		protected Boolean pizzaType;
		protected Integer defaultSellPortion;

	// many to one
	private com.floreantpos.model.MenuGroup parent;
	private com.floreantpos.model.TaxGroup taxGroup;
	private com.floreantpos.model.Recepie recepie;
	private com.floreantpos.model.PrinterGroup printerGroup;

	// collections
	private java.util.List<com.floreantpos.model.PizzaPrice> pizzaPriceList;
	private java.util.List<com.floreantpos.model.MenuItemShift> shifts;
	private java.util.List<com.floreantpos.model.Discount> discounts;
	private java.util.List<com.floreantpos.model.MenuItemModifierGroup> menuItemModiferGroups;
	private java.util.List<com.floreantpos.model.Terminal> terminals;
	private java.util.Map<String,String> properties;
	private java.util.List<com.floreantpos.model.OrderType> orderTypeList;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="ID"
     */
	public Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: NAME
	 */
	public String getName () {
					return name;
			}

	/**
	 * Set the value related to the column: NAME
	 * @param name the NAME value
	 */
	public void setName (String name) {
		this.name = name;
	}



	/**
	 * Return the value associated with the column: DESCRIPTION
	 */
	public String getDescription () {
					return description;
			}

	/**
	 * Set the value related to the column: DESCRIPTION
	 * @param description the DESCRIPTION value
	 */
	public void setDescription (String description) {
		this.description = description;
	}



	/**
	 * Return the value associated with the column: UNIT_NAME
	 */
	public String getUnitName () {
					return unitName;
			}

	/**
	 * Set the value related to the column: UNIT_NAME
	 * @param unitName the UNIT_NAME value
	 */
	public void setUnitName (String unitName) {
		this.unitName = unitName;
	}



	/**
	 * Return the value associated with the column: TRANSLATED_NAME
	 */
	public String getTranslatedName () {
					return translatedName;
			}

	/**
	 * Set the value related to the column: TRANSLATED_NAME
	 * @param translatedName the TRANSLATED_NAME value
	 */
	public void setTranslatedName (String translatedName) {
		this.translatedName = translatedName;
	}



	/**
	 * Return the value associated with the column: BARCODE
	 */
	public String getBarcode () {
					return barcode;
			}

	/**
	 * Set the value related to the column: BARCODE
	 * @param barcode the BARCODE value
	 */
	public void setBarcode (String barcode) {
		this.barcode = barcode;
	}



	/**
	 * Return the value associated with the column: BUY_PRICE
	 */
	public Double getBuyPrice () {
									return buyPrice == null ? Double.valueOf(0) : buyPrice;
					}

	/**
	 * Set the value related to the column: BUY_PRICE
	 * @param buyPrice the BUY_PRICE value
	 */
	public void setBuyPrice (Double buyPrice) {
		this.buyPrice = buyPrice;
	}



	/**
	 * Return the value associated with the column: STOCK_AMOUNT
	 */
	public Double getStockAmount () {
									return stockAmount == null ? Double.valueOf(0) : stockAmount;
					}

	/**
	 * Set the value related to the column: STOCK_AMOUNT
	 * @param stockAmount the STOCK_AMOUNT value
	 */
	public void setStockAmount (Double stockAmount) {
		this.stockAmount = stockAmount;
	}



	/**
	 * Return the value associated with the column: PRICE
	 */
	public Double getPrice () {
									return price == null ? Double.valueOf(0) : price;
					}

	/**
	 * Set the value related to the column: PRICE
	 * @param price the PRICE value
	 */
	public void setPrice (Double price) {
		this.price = price;
	}



	/**
	 * Return the value associated with the column: DISCOUNT_RATE
	 */
	public Double getDiscountRate () {
									return discountRate == null ? Double.valueOf(0) : discountRate;
					}

	/**
	 * Set the value related to the column: DISCOUNT_RATE
	 * @param discountRate the DISCOUNT_RATE value
	 */
	public void setDiscountRate (Double discountRate) {
		this.discountRate = discountRate;
	}



	/**
	 * Return the value associated with the column: VISIBLE
	 */
	public Boolean isVisible () {
									return visible == null ? Boolean.valueOf(true) : visible;
						}

	/**
	 * Set the value related to the column: VISIBLE
	 * @param visible the VISIBLE value
	 */
	public void setVisible (Boolean visible) {
		this.visible = visible;
	}


	/**
	 * Custom property
	 */
	public static String getVisibleDefaultValue () {
		return "true";
	}


	/**
	 * Return the value associated with the column: DISABLE_WHEN_STOCK_AMOUNT_IS_ZERO
	 */
	public Boolean isDisableWhenStockAmountIsZero () {
									return disableWhenStockAmountIsZero == null ? Boolean.valueOf(false) : disableWhenStockAmountIsZero;
						}

	/**
	 * Set the value related to the column: DISABLE_WHEN_STOCK_AMOUNT_IS_ZERO
	 * @param disableWhenStockAmountIsZero the DISABLE_WHEN_STOCK_AMOUNT_IS_ZERO value
	 */
	public void setDisableWhenStockAmountIsZero (Boolean disableWhenStockAmountIsZero) {
		this.disableWhenStockAmountIsZero = disableWhenStockAmountIsZero;
	}


	/**
	 * Custom property
	 */
	public static String getDisableWhenStockAmountIsZeroDefaultValue () {
		return "false";
	}


	/**
	 * Return the value associated with the column: SORT_ORDER
	 */
	public Integer getSortOrder () {
									return sortOrder == null ? Integer.valueOf(0) : sortOrder;
					}

	/**
	 * Set the value related to the column: SORT_ORDER
	 * @param sortOrder the SORT_ORDER value
	 */
	public void setSortOrder (Integer sortOrder) {
		this.sortOrder = sortOrder;
	}



	/**
	 * Return the value associated with the column: BTN_COLOR
	 */
	public Integer getButtonColorCode () {
									return buttonColorCode == null ? null : buttonColorCode;
						}

	/**
	 * Set the value related to the column: BTN_COLOR
	 * @param buttonColorCode the BTN_COLOR value
	 */
	public void setButtonColorCode (Integer buttonColorCode) {
		this.buttonColorCode = buttonColorCode;
	}


	/**
	 * Custom property
	 */
	public static String getButtonColorCodeDefaultValue () {
		return "null";
	}


	/**
	 * Return the value associated with the column: TEXT_COLOR
	 */
	public Integer getTextColorCode () {
									return textColorCode == null ? null : textColorCode;
						}

	/**
	 * Set the value related to the column: TEXT_COLOR
	 * @param textColorCode the TEXT_COLOR value
	 */
	public void setTextColorCode (Integer textColorCode) {
		this.textColorCode = textColorCode;
	}


	/**
	 * Custom property
	 */
	public static String getTextColorCodeDefaultValue () {
		return "null";
	}


	/**
	 * Return the value associated with the column: IMAGE
	 */
	public byte[] getImageData () {
					return imageData;
			}

	/**
	 * Set the value related to the column: IMAGE
	 * @param imageData the IMAGE value
	 */
	public void setImageData (byte[] imageData) {
		this.imageData = imageData;
	}



	/**
	 * Return the value associated with the column: SHOW_IMAGE_ONLY
	 */
	public Boolean isShowImageOnly () {
								return showImageOnly == null ? Boolean.FALSE : showImageOnly;
					}

	/**
	 * Set the value related to the column: SHOW_IMAGE_ONLY
	 * @param showImageOnly the SHOW_IMAGE_ONLY value
	 */
	public void setShowImageOnly (Boolean showImageOnly) {
		this.showImageOnly = showImageOnly;
	}



	/**
	 * Return the value associated with the column: FRACTIONAL_UNIT
	 */
	public Boolean isFractionalUnit () {
								return fractionalUnit == null ? Boolean.FALSE : fractionalUnit;
					}

	/**
	 * Set the value related to the column: FRACTIONAL_UNIT
	 * @param fractionalUnit the FRACTIONAL_UNIT value
	 */
	public void setFractionalUnit (Boolean fractionalUnit) {
		this.fractionalUnit = fractionalUnit;
	}



	/**
	 * Return the value associated with the column: PIZZA_TYPE
	 */
	public Boolean isPizzaType () {
								return pizzaType == null ? Boolean.FALSE : pizzaType;
					}

	/**
	 * Set the value related to the column: PIZZA_TYPE
	 * @param pizzaType the PIZZA_TYPE value
	 */
	public void setPizzaType (Boolean pizzaType) {
		this.pizzaType = pizzaType;
	}



	/**
	 * Return the value associated with the column: DEFAULT_SELL_PORTION
	 */
	public Integer getDefaultSellPortion () {
									return defaultSellPortion == null ? Integer.valueOf(0) : defaultSellPortion;
					}

	/**
	 * Set the value related to the column: DEFAULT_SELL_PORTION
	 * @param defaultSellPortion the DEFAULT_SELL_PORTION value
	 */
	public void setDefaultSellPortion (Integer defaultSellPortion) {
		this.defaultSellPortion = defaultSellPortion;
	}



	/**
	 * Return the value associated with the column: GROUP_ID
	 */
	public com.floreantpos.model.MenuGroup getParent () {
					return parent;
			}

	/**
	 * Set the value related to the column: GROUP_ID
	 * @param parent the GROUP_ID value
	 */
	public void setParent (com.floreantpos.model.MenuGroup parent) {
		this.parent = parent;
	}



	/**
	 * Return the value associated with the column: TAX_GROUP_ID
	 */
	public com.floreantpos.model.TaxGroup getTaxGroup () {
					return taxGroup;
			}

	/**
	 * Set the value related to the column: TAX_GROUP_ID
	 * @param taxGroup the TAX_GROUP_ID value
	 */
	public void setTaxGroup (com.floreantpos.model.TaxGroup taxGroup) {
		this.taxGroup = taxGroup;
	}



	/**
	 * Return the value associated with the column: RECEPIE
	 */
	public com.floreantpos.model.Recepie getRecepie () {
					return recepie;
			}

	/**
	 * Set the value related to the column: RECEPIE
	 * @param recepie the RECEPIE value
	 */
	public void setRecepie (com.floreantpos.model.Recepie recepie) {
		this.recepie = recepie;
	}



	/**
	 * Return the value associated with the column: PG_ID
	 */
	public com.floreantpos.model.PrinterGroup getPrinterGroup () {
					return printerGroup;
			}

	/**
	 * Set the value related to the column: PG_ID
	 * @param printerGroup the PG_ID value
	 */
	public void setPrinterGroup (com.floreantpos.model.PrinterGroup printerGroup) {
		this.printerGroup = printerGroup;
	}



	/**
	 * Return the value associated with the column: pizzaPriceList
	 */
	public java.util.List<com.floreantpos.model.PizzaPrice> getPizzaPriceList () {
					return pizzaPriceList;
			}

	/**
	 * Set the value related to the column: pizzaPriceList
	 * @param pizzaPriceList the pizzaPriceList value
	 */
	public void setPizzaPriceList (java.util.List<com.floreantpos.model.PizzaPrice> pizzaPriceList) {
		this.pizzaPriceList = pizzaPriceList;
	}

	public void addTopizzaPriceList (com.floreantpos.model.PizzaPrice pizzaPrice) {
		if (null == getPizzaPriceList()) setPizzaPriceList(new java.util.ArrayList<com.floreantpos.model.PizzaPrice>());
		getPizzaPriceList().add(pizzaPrice);
	}



	/**
	 * Return the value associated with the column: shifts
	 */
	public java.util.List<com.floreantpos.model.MenuItemShift> getShifts () {
					return shifts;
			}

	/**
	 * Set the value related to the column: shifts
	 * @param shifts the shifts value
	 */
	public void setShifts (java.util.List<com.floreantpos.model.MenuItemShift> shifts) {
		this.shifts = shifts;
	}

	public void addToshifts (com.floreantpos.model.MenuItemShift menuItemShift) {
		if (null == getShifts()) setShifts(new java.util.ArrayList<com.floreantpos.model.MenuItemShift>());
		getShifts().add(menuItemShift);
	}



	/**
	 * Return the value associated with the column: discounts
	 */
	public java.util.List<com.floreantpos.model.Discount> getDiscounts () {
					return discounts;
			}

	/**
	 * Set the value related to the column: discounts
	 * @param discounts the discounts value
	 */
	public void setDiscounts (java.util.List<com.floreantpos.model.Discount> discounts) {
		this.discounts = discounts;
	}

	public void addTodiscounts (com.floreantpos.model.Discount discount) {
		if (null == getDiscounts()) setDiscounts(new java.util.ArrayList<com.floreantpos.model.Discount>());
		getDiscounts().add(discount);
	}



	/**
	 * Return the value associated with the column: menuItemModiferGroups
	 */
	public java.util.List<com.floreantpos.model.MenuItemModifierGroup> getMenuItemModiferGroups () {
					return menuItemModiferGroups;
			}

	/**
	 * Set the value related to the column: menuItemModiferGroups
	 * @param menuItemModiferGroups the menuItemModiferGroups value
	 */
	public void setMenuItemModiferGroups (java.util.List<com.floreantpos.model.MenuItemModifierGroup> menuItemModiferGroups) {
		this.menuItemModiferGroups = menuItemModiferGroups;
	}

	public void addTomenuItemModiferGroups (com.floreantpos.model.MenuItemModifierGroup menuItemModifierGroup) {
		if (null == getMenuItemModiferGroups()) setMenuItemModiferGroups(new java.util.ArrayList<com.floreantpos.model.MenuItemModifierGroup>());
		getMenuItemModiferGroups().add(menuItemModifierGroup);
	}



	/**
	 * Return the value associated with the column: terminals
	 */
	public java.util.List<com.floreantpos.model.Terminal> getTerminals () {
					return terminals;
			}

	/**
	 * Set the value related to the column: terminals
	 * @param terminals the terminals value
	 */
	public void setTerminals (java.util.List<com.floreantpos.model.Terminal> terminals) {
		this.terminals = terminals;
	}

	public void addToterminals (com.floreantpos.model.Terminal terminal) {
		if (null == getTerminals()) setTerminals(new java.util.ArrayList<com.floreantpos.model.Terminal>());
		getTerminals().add(terminal);
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



	/**
	 * Return the value associated with the column: orderTypeList
	 */
	public java.util.List<com.floreantpos.model.OrderType> getOrderTypeList () {
					return orderTypeList;
			}

	/**
	 * Set the value related to the column: orderTypeList
	 * @param orderTypeList the orderTypeList value
	 */
	public void setOrderTypeList (java.util.List<com.floreantpos.model.OrderType> orderTypeList) {
		this.orderTypeList = orderTypeList;
	}

	public void addToorderTypeList (com.floreantpos.model.OrderType orderType) {
		if (null == getOrderTypeList()) setOrderTypeList(new java.util.ArrayList<com.floreantpos.model.OrderType>());
		getOrderTypeList().add(orderType);
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.floreantpos.model.MenuItem)) return false;
		else {
			com.floreantpos.model.MenuItem menuItem = (com.floreantpos.model.MenuItem) obj;
			if (null == this.getId() || null == menuItem.getId()) return false;
			else return (this.getId().equals(menuItem.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public int compareTo (Object obj) {
		if (obj.hashCode() > hashCode()) return 1;
		else if (obj.hashCode() < hashCode()) return -1;
		else return 0;
	}

	public String toString () {
		return super.toString();
	}


}