package com.floreantpos.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the ORDER_TYPE table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="ORDER_TYPE"
 */

public abstract class BaseOrderType implements Comparable, Serializable {

	public static String REF = "OrderType"; //$NON-NLS-1$
	public static String PROP_CLOSE_ON_PAID = "closeOnPaid"; //$NON-NLS-1$
	public static String PROP_SHOW_TABLE_SELECTION = "showTableSelection"; //$NON-NLS-1$
	public static String PROP_SHOW_GUEST_SELECTION = "showGuestSelection"; //$NON-NLS-1$
	public static String PROP_SHOULD_PRINT_TO_KITCHEN = "shouldPrintToKitchen"; //$NON-NLS-1$
	public static String PROP_ALLOW_SEAT_BASED_ORDER = "allowSeatBasedOrder"; //$NON-NLS-1$
	public static String PROP_SHOW_ITEM_BARCODE = "showItemBarcode"; //$NON-NLS-1$
	public static String PROP_HAS_FOR_HERE_AND_TO_GO = "hasForHereAndToGo"; //$NON-NLS-1$
	public static String PROP_PRE_AUTH_CREDIT_CARD = "preAuthCreditCard"; //$NON-NLS-1$
	public static String PROP_ENABLED = "enabled"; //$NON-NLS-1$
	public static String PROP_BAR_TAB = "barTab"; //$NON-NLS-1$
	public static String PROP_SHOW_STOCK_COUNT_ON_BUTTON = "showStockCountOnButton"; //$NON-NLS-1$
	public static String PROP_NAME = "name"; //$NON-NLS-1$
	public static String PROP_SHOW_IN_LOGIN_SCREEN = "showInLoginScreen"; //$NON-NLS-1$
	public static String PROP_PREPAID = "prepaid"; //$NON-NLS-1$
	public static String PROP_SHOW_UNIT_PRICE_IN_TICKET_GRID = "showUnitPriceInTicketGrid"; //$NON-NLS-1$
	public static String PROP_REQUIRED_CUSTOMER_DATA = "requiredCustomerData"; //$NON-NLS-1$
	public static String PROP_DELIVERY = "delivery"; //$NON-NLS-1$
	public static String PROP_HIDE_ITEM_WITH_EMPTY_INVENTORY = "hideItemWithEmptyInventory"; //$NON-NLS-1$
	public static String PROP_ID = "id"; //$NON-NLS-1$
	public static String PROP_RETAIL_ORDER = "retailOrder"; //$NON-NLS-1$
	public static String PROP_SHOW_PRICE_ON_BUTTON = "showPriceOnButton"; //$NON-NLS-1$
	public static String PROP_CONSOLIDATE_ITEMS_IN_RECEIPT = "consolidateItemsInReceipt"; //$NON-NLS-1$


	// constructors
	public BaseOrderType() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseOrderType(Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseOrderType(
		Integer id,
		String name) {

		this.setId(id);
		this.setName(name);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
		protected String name;
		protected Boolean enabled;
		protected Boolean showTableSelection;
		protected Boolean showGuestSelection;
		protected Boolean shouldPrintToKitchen;
		protected Boolean prepaid;
		protected Boolean closeOnPaid;
		protected Boolean requiredCustomerData;
		protected Boolean delivery;
		protected Boolean showItemBarcode;
		protected Boolean showInLoginScreen;
		protected Boolean consolidateItemsInReceipt;
		protected Boolean allowSeatBasedOrder;
		protected Boolean hideItemWithEmptyInventory;
		protected Boolean hasForHereAndToGo;
		protected Boolean preAuthCreditCard;
		protected Boolean barTab;
		protected Boolean retailOrder;
		protected Boolean showPriceOnButton;
		protected Boolean showStockCountOnButton;
		protected Boolean showUnitPriceInTicketGrid;



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
	 * Return the value associated with the column: ENABLED
	 */
	public Boolean isEnabled () {
								return enabled == null ? Boolean.FALSE : enabled;
					}

	/**
	 * Set the value related to the column: ENABLED
	 * @param enabled the ENABLED value
	 */
	public void setEnabled (Boolean enabled) {
		this.enabled = enabled;
	}



	/**
	 * Return the value associated with the column: SHOW_TABLE_SELECTION
	 */
	public Boolean isShowTableSelection () {
								return showTableSelection == null ? Boolean.FALSE : showTableSelection;
					}

	/**
	 * Set the value related to the column: SHOW_TABLE_SELECTION
	 * @param showTableSelection the SHOW_TABLE_SELECTION value
	 */
	public void setShowTableSelection (Boolean showTableSelection) {
		this.showTableSelection = showTableSelection;
	}



	/**
	 * Return the value associated with the column: SHOW_GUEST_SELECTION
	 */
	public Boolean isShowGuestSelection () {
								return showGuestSelection == null ? Boolean.FALSE : showGuestSelection;
					}

	/**
	 * Set the value related to the column: SHOW_GUEST_SELECTION
	 * @param showGuestSelection the SHOW_GUEST_SELECTION value
	 */
	public void setShowGuestSelection (Boolean showGuestSelection) {
		this.showGuestSelection = showGuestSelection;
	}



	/**
	 * Return the value associated with the column: SHOULD_PRINT_TO_KITCHEN
	 */
	public Boolean isShouldPrintToKitchen () {
								return shouldPrintToKitchen == null ? Boolean.FALSE : shouldPrintToKitchen;
					}

	/**
	 * Set the value related to the column: SHOULD_PRINT_TO_KITCHEN
	 * @param shouldPrintToKitchen the SHOULD_PRINT_TO_KITCHEN value
	 */
	public void setShouldPrintToKitchen (Boolean shouldPrintToKitchen) {
		this.shouldPrintToKitchen = shouldPrintToKitchen;
	}



	/**
	 * Return the value associated with the column: PREPAID
	 */
	public Boolean isPrepaid () {
								return prepaid == null ? Boolean.FALSE : prepaid;
					}

	/**
	 * Set the value related to the column: PREPAID
	 * @param prepaid the PREPAID value
	 */
	public void setPrepaid (Boolean prepaid) {
		this.prepaid = prepaid;
	}



	/**
	 * Return the value associated with the column: CLOSE_ON_PAID
	 */
	public Boolean isCloseOnPaid () {
								return closeOnPaid == null ? Boolean.FALSE : closeOnPaid;
					}

	/**
	 * Set the value related to the column: CLOSE_ON_PAID
	 * @param closeOnPaid the CLOSE_ON_PAID value
	 */
	public void setCloseOnPaid (Boolean closeOnPaid) {
		this.closeOnPaid = closeOnPaid;
	}



	/**
	 * Return the value associated with the column: REQUIRED_CUSTOMER_DATA
	 */
	public Boolean isRequiredCustomerData () {
								return requiredCustomerData == null ? Boolean.FALSE : requiredCustomerData;
					}

	/**
	 * Set the value related to the column: REQUIRED_CUSTOMER_DATA
	 * @param requiredCustomerData the REQUIRED_CUSTOMER_DATA value
	 */
	public void setRequiredCustomerData (Boolean requiredCustomerData) {
		this.requiredCustomerData = requiredCustomerData;
	}



	/**
	 * Return the value associated with the column: DELIVERY
	 */
	public Boolean isDelivery () {
								return delivery == null ? Boolean.FALSE : delivery;
					}

	/**
	 * Set the value related to the column: DELIVERY
	 * @param delivery the DELIVERY value
	 */
	public void setDelivery (Boolean delivery) {
		this.delivery = delivery;
	}



	/**
	 * Return the value associated with the column: SHOW_ITEM_BARCODE
	 */
	public Boolean isShowItemBarcode () {
								return showItemBarcode == null ? Boolean.FALSE : showItemBarcode;
					}

	/**
	 * Set the value related to the column: SHOW_ITEM_BARCODE
	 * @param showItemBarcode the SHOW_ITEM_BARCODE value
	 */
	public void setShowItemBarcode (Boolean showItemBarcode) {
		this.showItemBarcode = showItemBarcode;
	}



	/**
	 * Return the value associated with the column: SHOW_IN_LOGIN_SCREEN
	 */
	public Boolean isShowInLoginScreen () {
								return showInLoginScreen == null ? Boolean.FALSE : showInLoginScreen;
					}

	/**
	 * Set the value related to the column: SHOW_IN_LOGIN_SCREEN
	 * @param showInLoginScreen the SHOW_IN_LOGIN_SCREEN value
	 */
	public void setShowInLoginScreen (Boolean showInLoginScreen) {
		this.showInLoginScreen = showInLoginScreen;
	}



	/**
	 * Return the value associated with the column: CONSOLIDATE_TIEMS_IN_RECEIPT
	 */
	public Boolean isConsolidateItemsInReceipt () {
								return consolidateItemsInReceipt == null ? Boolean.FALSE : consolidateItemsInReceipt;
					}

	/**
	 * Set the value related to the column: CONSOLIDATE_TIEMS_IN_RECEIPT
	 * @param consolidateItemsInReceipt the CONSOLIDATE_TIEMS_IN_RECEIPT value
	 */
	public void setConsolidateItemsInReceipt (Boolean consolidateItemsInReceipt) {
		this.consolidateItemsInReceipt = consolidateItemsInReceipt;
	}



	/**
	 * Return the value associated with the column: ALLOW_SEAT_BASED_ORDER
	 */
	public Boolean isAllowSeatBasedOrder () {
								return allowSeatBasedOrder == null ? Boolean.FALSE : allowSeatBasedOrder;
					}

	/**
	 * Set the value related to the column: ALLOW_SEAT_BASED_ORDER
	 * @param allowSeatBasedOrder the ALLOW_SEAT_BASED_ORDER value
	 */
	public void setAllowSeatBasedOrder (Boolean allowSeatBasedOrder) {
		this.allowSeatBasedOrder = allowSeatBasedOrder;
	}



	/**
	 * Return the value associated with the column: HIDE_ITEM_WITH_EMPTY_INVENTORY
	 */
	public Boolean isHideItemWithEmptyInventory () {
								return hideItemWithEmptyInventory == null ? Boolean.FALSE : hideItemWithEmptyInventory;
					}

	/**
	 * Set the value related to the column: HIDE_ITEM_WITH_EMPTY_INVENTORY
	 * @param hideItemWithEmptyInventory the HIDE_ITEM_WITH_EMPTY_INVENTORY value
	 */
	public void setHideItemWithEmptyInventory (Boolean hideItemWithEmptyInventory) {
		this.hideItemWithEmptyInventory = hideItemWithEmptyInventory;
	}



	/**
	 * Return the value associated with the column: HAS_FORHERE_AND_TOGO
	 */
	public Boolean isHasForHereAndToGo () {
								return hasForHereAndToGo == null ? Boolean.FALSE : hasForHereAndToGo;
					}

	/**
	 * Set the value related to the column: HAS_FORHERE_AND_TOGO
	 * @param hasForHereAndToGo the HAS_FORHERE_AND_TOGO value
	 */
	public void setHasForHereAndToGo (Boolean hasForHereAndToGo) {
		this.hasForHereAndToGo = hasForHereAndToGo;
	}



	/**
	 * Return the value associated with the column: PRE_AUTH_CREDIT_CARD
	 */
	public Boolean isPreAuthCreditCard () {
								return preAuthCreditCard == null ? Boolean.FALSE : preAuthCreditCard;
					}

	/**
	 * Set the value related to the column: PRE_AUTH_CREDIT_CARD
	 * @param preAuthCreditCard the PRE_AUTH_CREDIT_CARD value
	 */
	public void setPreAuthCreditCard (Boolean preAuthCreditCard) {
		this.preAuthCreditCard = preAuthCreditCard;
	}



	/**
	 * Return the value associated with the column: BAR_TAB
	 */
	public Boolean isBarTab () {
								return barTab == null ? Boolean.FALSE : barTab;
					}

	/**
	 * Set the value related to the column: BAR_TAB
	 * @param barTab the BAR_TAB value
	 */
	public void setBarTab (Boolean barTab) {
		this.barTab = barTab;
	}



	/**
	 * Return the value associated with the column: RETAIL_ORDER
	 */
	public Boolean isRetailOrder () {
								return retailOrder == null ? Boolean.FALSE : retailOrder;
					}

	/**
	 * Set the value related to the column: RETAIL_ORDER
	 * @param retailOrder the RETAIL_ORDER value
	 */
	public void setRetailOrder (Boolean retailOrder) {
		this.retailOrder = retailOrder;
	}



	/**
	 * Return the value associated with the column: SHOW_PRICE_ON_BUTTON
	 */
	public Boolean isShowPriceOnButton () {
								return showPriceOnButton == null ? Boolean.FALSE : showPriceOnButton;
					}

	/**
	 * Set the value related to the column: SHOW_PRICE_ON_BUTTON
	 * @param showPriceOnButton the SHOW_PRICE_ON_BUTTON value
	 */
	public void setShowPriceOnButton (Boolean showPriceOnButton) {
		this.showPriceOnButton = showPriceOnButton;
	}



	/**
	 * Return the value associated with the column: SHOW_STOCK_COUNT_ON_BUTTON
	 */
	public Boolean isShowStockCountOnButton () {
								return showStockCountOnButton == null ? Boolean.FALSE : showStockCountOnButton;
					}

	/**
	 * Set the value related to the column: SHOW_STOCK_COUNT_ON_BUTTON
	 * @param showStockCountOnButton the SHOW_STOCK_COUNT_ON_BUTTON value
	 */
	public void setShowStockCountOnButton (Boolean showStockCountOnButton) {
		this.showStockCountOnButton = showStockCountOnButton;
	}



	/**
	 * Return the value associated with the column: SHOW_UNIT_PRICE_IN_TICKET_GRID
	 */
	public Boolean isShowUnitPriceInTicketGrid () {
								return showUnitPriceInTicketGrid == null ? Boolean.FALSE : showUnitPriceInTicketGrid;
					}

	/**
	 * Set the value related to the column: SHOW_UNIT_PRICE_IN_TICKET_GRID
	 * @param showUnitPriceInTicketGrid the SHOW_UNIT_PRICE_IN_TICKET_GRID value
	 */
	public void setShowUnitPriceInTicketGrid (Boolean showUnitPriceInTicketGrid) {
		this.showUnitPriceInTicketGrid = showUnitPriceInTicketGrid;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.floreantpos.model.OrderType)) return false;
		else {
			com.floreantpos.model.OrderType orderType = (com.floreantpos.model.OrderType) obj;
			if (null == this.getId() || null == orderType.getId()) return false;
			else return (this.getId().equals(orderType.getId()));
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