package com.floreantpos.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the TICKET_ITEM_MODIFIER table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="TICKET_ITEM_MODIFIER"
 */

public abstract class BaseTicketItemModifier implements Comparable, Serializable {

	public static String REF = "TicketItemModifier"; //$NON-NLS-1$
	public static String PROP_MULTIPLIER_NAME = "multiplierName"; //$NON-NLS-1$
	public static String PROP_STATUS = "status"; //$NON-NLS-1$
	public static String PROP_SHOULD_PRINT_TO_KITCHEN = "shouldPrintToKitchen"; //$NON-NLS-1$
	public static String PROP_TICKET_ITEM = "ticketItem"; //$NON-NLS-1$
	public static String PROP_INFO_ONLY = "infoOnly"; //$NON-NLS-1$
	public static String PROP_TOTAL_AMOUNT = "totalAmount"; //$NON-NLS-1$
	public static String PROP_MENU_ITEM_MODIFIER_GROUP_ID = "menuItemModifierGroupId"; //$NON-NLS-1$
	public static String PROP_NAME = "name"; //$NON-NLS-1$
	public static String PROP_UNIT_PRICE = "unitPrice"; //$NON-NLS-1$
	public static String PROP_TAX_AMOUNT = "taxAmount"; //$NON-NLS-1$
	public static String PROP_SHOULD_SECTION_WISE_PRICE = "shouldSectionWisePrice"; //$NON-NLS-1$
	public static String PROP_TAX_RATE = "taxRate"; //$NON-NLS-1$
	public static String PROP_ITEM_COUNT = "itemCount"; //$NON-NLS-1$
	public static String PROP_MODIFIER_TYPE = "modifierType"; //$NON-NLS-1$
	public static String PROP_SECTION_NAME = "sectionName"; //$NON-NLS-1$
	public static String PROP_ID = "id"; //$NON-NLS-1$
	public static String PROP_PRINTED_TO_KITCHEN = "printedToKitchen"; //$NON-NLS-1$
	public static String PROP_MODIFIER_ID = "modifierId"; //$NON-NLS-1$
	public static String PROP_SUB_TOTAL_AMOUNT = "subTotalAmount"; //$NON-NLS-1$


	// constructors
	public BaseTicketItemModifier() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTicketItemModifier(Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
		protected Integer modifierId;
		protected Integer menuItemModifierGroupId;
		protected Integer itemCount;
		protected String name;
		protected Double unitPrice;
		protected Double taxRate;
		protected Integer modifierType;
		protected Double subTotalAmount;
		protected Double totalAmount;
		protected Double taxAmount;
		protected Boolean infoOnly;
		protected String sectionName;
		protected String multiplierName;
		protected Boolean shouldPrintToKitchen;
		protected Boolean shouldSectionWisePrice;
		protected String status;
		protected Boolean printedToKitchen;

	// many to one
	private com.floreantpos.model.TicketItem ticketItem;



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
	 * Return the value associated with the column: ITEM_ID
	 */
	public Integer getModifierId () {
									return modifierId == null ? Integer.valueOf(0) : modifierId;
					}

	/**
	 * Set the value related to the column: ITEM_ID
	 * @param modifierId the ITEM_ID value
	 */
	public void setModifierId (Integer modifierId) {
		this.modifierId = modifierId;
	}



	/**
	 * Return the value associated with the column: GROUP_ID
	 */
	public Integer getMenuItemModifierGroupId () {
									return menuItemModifierGroupId == null ? Integer.valueOf(0) : menuItemModifierGroupId;
					}

	/**
	 * Set the value related to the column: GROUP_ID
	 * @param menuItemModifierGroupId the GROUP_ID value
	 */
	public void setMenuItemModifierGroupId (Integer menuItemModifierGroupId) {
		this.menuItemModifierGroupId = menuItemModifierGroupId;
	}



	/**
	 * Return the value associated with the column: ITEM_COUNT
	 */
	public Integer getItemCount () {
									return itemCount == null ? Integer.valueOf(0) : itemCount;
					}

	/**
	 * Set the value related to the column: ITEM_COUNT
	 * @param itemCount the ITEM_COUNT value
	 */
	public void setItemCount (Integer itemCount) {
		this.itemCount = itemCount;
	}



	/**
	 * Return the value associated with the column: MODIFIER_NAME
	 */
	public String getName () {
					return name;
			}

	/**
	 * Set the value related to the column: MODIFIER_NAME
	 * @param name the MODIFIER_NAME value
	 */
	public void setName (String name) {
		this.name = name;
	}



	/**
	 * Return the value associated with the column: MODIFIER_PRICE
	 */
	public Double getUnitPrice () {
									return unitPrice == null ? Double.valueOf(0) : unitPrice;
					}

	/**
	 * Set the value related to the column: MODIFIER_PRICE
	 * @param unitPrice the MODIFIER_PRICE value
	 */
	public void setUnitPrice (Double unitPrice) {
		this.unitPrice = unitPrice;
	}



	/**
	 * Return the value associated with the column: MODIFIER_TAX_RATE
	 */
	public Double getTaxRate () {
									return taxRate == null ? Double.valueOf(0) : taxRate;
					}

	/**
	 * Set the value related to the column: MODIFIER_TAX_RATE
	 * @param taxRate the MODIFIER_TAX_RATE value
	 */
	public void setTaxRate (Double taxRate) {
		this.taxRate = taxRate;
	}



	/**
	 * Return the value associated with the column: MODIFIER_TYPE
	 */
	public Integer getModifierType () {
									return modifierType == null ? Integer.valueOf(0) : modifierType;
					}

	/**
	 * Set the value related to the column: MODIFIER_TYPE
	 * @param modifierType the MODIFIER_TYPE value
	 */
	public void setModifierType (Integer modifierType) {
		this.modifierType = modifierType;
	}



	/**
	 * Return the value associated with the column: SUBTOTAL_PRICE
	 */
	public Double getSubTotalAmount () {
									return subTotalAmount == null ? Double.valueOf(0) : subTotalAmount;
					}

	/**
	 * Set the value related to the column: SUBTOTAL_PRICE
	 * @param subTotalAmount the SUBTOTAL_PRICE value
	 */
	public void setSubTotalAmount (Double subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}



	/**
	 * Return the value associated with the column: TOTAL_PRICE
	 */
	public Double getTotalAmount () {
									return totalAmount == null ? Double.valueOf(0) : totalAmount;
					}

	/**
	 * Set the value related to the column: TOTAL_PRICE
	 * @param totalAmount the TOTAL_PRICE value
	 */
	public void setTotalAmount (Double totalAmount) {
		this.totalAmount = totalAmount;
	}



	/**
	 * Return the value associated with the column: TAX_AMOUNT
	 */
	public Double getTaxAmount () {
									return taxAmount == null ? Double.valueOf(0) : taxAmount;
					}

	/**
	 * Set the value related to the column: TAX_AMOUNT
	 * @param taxAmount the TAX_AMOUNT value
	 */
	public void setTaxAmount (Double taxAmount) {
		this.taxAmount = taxAmount;
	}



	/**
	 * Return the value associated with the column: INFO_ONLY
	 */
	public Boolean isInfoOnly () {
								return infoOnly == null ? Boolean.FALSE : infoOnly;
					}

	/**
	 * Set the value related to the column: INFO_ONLY
	 * @param infoOnly the INFO_ONLY value
	 */
	public void setInfoOnly (Boolean infoOnly) {
		this.infoOnly = infoOnly;
	}



	/**
	 * Return the value associated with the column: SECTION_NAME
	 */
	public String getSectionName () {
					return sectionName;
			}

	/**
	 * Set the value related to the column: SECTION_NAME
	 * @param sectionName the SECTION_NAME value
	 */
	public void setSectionName (String sectionName) {
		this.sectionName = sectionName;
	}



	/**
	 * Return the value associated with the column: MULTIPLIER_NAME
	 */
	public String getMultiplierName () {
					return multiplierName;
			}

	/**
	 * Set the value related to the column: MULTIPLIER_NAME
	 * @param multiplierName the MULTIPLIER_NAME value
	 */
	public void setMultiplierName (String multiplierName) {
		this.multiplierName = multiplierName;
	}



	/**
	 * Return the value associated with the column: PRINT_TO_KITCHEN
	 */
	public Boolean isShouldPrintToKitchen () {
									return shouldPrintToKitchen == null ? Boolean.valueOf(true) : shouldPrintToKitchen;
						}

	/**
	 * Set the value related to the column: PRINT_TO_KITCHEN
	 * @param shouldPrintToKitchen the PRINT_TO_KITCHEN value
	 */
	public void setShouldPrintToKitchen (Boolean shouldPrintToKitchen) {
		this.shouldPrintToKitchen = shouldPrintToKitchen;
	}


	/**
	 * Custom property
	 */
	public static String getShouldPrintToKitchenDefaultValue () {
		return "true";
	}


	/**
	 * Return the value associated with the column: SECTION_WISE_PRICING
	 */
	public Boolean isShouldSectionWisePrice () {
								return shouldSectionWisePrice == null ? Boolean.FALSE : shouldSectionWisePrice;
					}

	/**
	 * Set the value related to the column: SECTION_WISE_PRICING
	 * @param shouldSectionWisePrice the SECTION_WISE_PRICING value
	 */
	public void setShouldSectionWisePrice (Boolean shouldSectionWisePrice) {
		this.shouldSectionWisePrice = shouldSectionWisePrice;
	}



	/**
	 * Return the value associated with the column: STATUS
	 */
	public String getStatus () {
					return status;
			}

	/**
	 * Set the value related to the column: STATUS
	 * @param status the STATUS value
	 */
	public void setStatus (String status) {
		this.status = status;
	}



	/**
	 * Return the value associated with the column: PRINTED_TO_KITCHEN
	 */
	public Boolean isPrintedToKitchen () {
								return printedToKitchen == null ? Boolean.FALSE : printedToKitchen;
					}

	/**
	 * Set the value related to the column: PRINTED_TO_KITCHEN
	 * @param printedToKitchen the PRINTED_TO_KITCHEN value
	 */
	public void setPrintedToKitchen (Boolean printedToKitchen) {
		this.printedToKitchen = printedToKitchen;
	}



	/**
	 * Return the value associated with the column: TICKET_ITEM_ID
	 */
	public com.floreantpos.model.TicketItem getTicketItem () {
					return ticketItem;
			}

	/**
	 * Set the value related to the column: TICKET_ITEM_ID
	 * @param ticketItem the TICKET_ITEM_ID value
	 */
	public void setTicketItem (com.floreantpos.model.TicketItem ticketItem) {
		this.ticketItem = ticketItem;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.floreantpos.model.TicketItemModifier)) return false;
		else {
			com.floreantpos.model.TicketItemModifier ticketItemModifier = (com.floreantpos.model.TicketItemModifier) obj;
			if (null == this.getId() || null == ticketItemModifier.getId()) return false;
			else return (this.getId().equals(ticketItemModifier.getId()));
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