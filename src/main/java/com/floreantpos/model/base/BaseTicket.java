package com.floreantpos.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the TICKET table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="TICKET"
 */

public abstract class BaseTicket implements Comparable, Serializable {

	public static String REF = "Ticket"; //$NON-NLS-1$
	public static String PROP_ADVANCE_AMOUNT = "advanceAmount"; //$NON-NLS-1$
	public static String PROP_NUMBER_OF_GUESTS = "numberOfGuests"; //$NON-NLS-1$
	public static String PROP_RE_OPENED = "reOpened"; //$NON-NLS-1$
	public static String PROP_CALCULATE_SERVICE_CHARGE = "calculateServiceCharge"; //$NON-NLS-1$
	public static String PROP_OWNER = "owner"; //$NON-NLS-1$
	public static String PROP_SUBTOTAL_AMOUNT = "subtotalAmount"; //$NON-NLS-1$
	public static String PROP_DUE_AMOUNT = "dueAmount"; //$NON-NLS-1$
	public static String PROP_DELIVERY_ADDRESS = "deliveryAddress"; //$NON-NLS-1$
	public static String PROP_PAID = "paid"; //$NON-NLS-1$
	public static String PROP_BAR_TAB = "barTab"; //$NON-NLS-1$
	public static String PROP_CUSTOMER_WILL_PICKUP = "customerWillPickup"; //$NON-NLS-1$
	public static String PROP_DELIVERY_DATE = "deliveryDate"; //$NON-NLS-1$
	public static String PROP_CREATE_DATE = "createDate"; //$NON-NLS-1$
	public static String PROP_CREATION_HOUR = "creationHour"; //$NON-NLS-1$
	public static String PROP_GRATUITY = "gratuity"; //$NON-NLS-1$
	public static String PROP_TAX_AMOUNT = "taxAmount"; //$NON-NLS-1$
	public static String PROP_SERVICE_CHARGE = "serviceCharge"; //$NON-NLS-1$
	public static String PROP_VOID_REASON = "voidReason"; //$NON-NLS-1$
	public static String PROP_DRAWER_RESETTED = "drawerResetted"; //$NON-NLS-1$
	public static String PROP_TICKET_TYPE = "ticketType"; //$NON-NLS-1$
	public static String PROP_VOIDED_BY = "voidedBy"; //$NON-NLS-1$
	public static String PROP_VOIDED = "voided"; //$NON-NLS-1$
	public static String PROP_REFUNDED = "refunded"; //$NON-NLS-1$
	public static String PROP_STATUS = "status"; //$NON-NLS-1$
	public static String PROP_DELIVERY_CHARGE = "deliveryCharge"; //$NON-NLS-1$
	public static String PROP_SHIFT = "shift"; //$NON-NLS-1$
	public static String PROP_WASTED = "wasted"; //$NON-NLS-1$
	public static String PROP_ACTIVE_DATE = "activeDate"; //$NON-NLS-1$
	public static String PROP_SEQUENCE = "sequence"; //$NON-NLS-1$
	public static String PROP_TOTAL_AMOUNT = "totalAmount"; //$NON-NLS-1$
	public static String PROP_CUSTOMER_ID = "customerId"; //$NON-NLS-1$
	public static String PROP_TERMINAL = "terminal"; //$NON-NLS-1$
	public static String PROP_DISCOUNT_AMOUNT = "discountAmount"; //$NON-NLS-1$
	public static String PROP_GLOBAL_ID = "globalId"; //$NON-NLS-1$
	public static String PROP_PAID_AMOUNT = "paidAmount"; //$NON-NLS-1$
	public static String PROP_TAX_EXEMPT = "taxExempt"; //$NON-NLS-1$
	public static String PROP_ASSIGNED_DRIVER = "assignedDriver"; //$NON-NLS-1$
	public static String PROP_CLOSED = "closed"; //$NON-NLS-1$
	public static String PROP_EXTRA_DELIVERY_INFO = "extraDeliveryInfo"; //$NON-NLS-1$
	public static String PROP_CLOSING_DATE = "closingDate"; //$NON-NLS-1$
	public static String PROP_ID = "id"; //$NON-NLS-1$


	// constructors
	public BaseTicket() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTicket(Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	 long version;

	// fields
		protected String globalId;
		protected long sequence;
		protected java.util.Date createDate;
		protected java.util.Date closingDate;
		protected java.util.Date activeDate;
		protected java.util.Date deliveryDate;
		protected Integer creationHour;
		protected Boolean paid;
		protected Boolean voided;
		protected String voidReason;
		protected Boolean wasted;
		protected Boolean refunded;
		protected Boolean closed;
		protected Boolean drawerResetted;
		protected Double subtotalAmount;
		protected Double discountAmount;
		protected Double taxAmount;
		protected Double totalAmount;
		protected Double paidAmount;
		protected Double dueAmount;
		protected Double advanceAmount;
		protected Integer numberOfGuests;
		protected String status;
		protected Boolean barTab;
		protected Boolean taxExempt;
		protected Boolean reOpened;
		protected Double serviceCharge;
		protected Double deliveryCharge;
		protected Integer customerId;
		protected String deliveryAddress;
		protected Boolean customerWillPickup;
		protected String extraDeliveryInfo;
		protected Boolean calculateServiceCharge;
		protected String ticketType;

	// many to one
	private com.floreantpos.model.Shift shift;
	private com.floreantpos.model.User owner;
	private com.floreantpos.model.User assignedDriver;
	private com.floreantpos.model.Gratuity gratuity;
	private com.floreantpos.model.User voidedBy;
	private com.floreantpos.model.Terminal terminal;

	// collections
	private java.util.Map<String, String> properties;
	private java.util.List<com.floreantpos.model.TicketItem> ticketItems;
	private java.util.List<com.floreantpos.model.TicketDiscount> discounts;
	private java.util.Set<com.floreantpos.model.PosTransaction> transactions;
	private java.util.List<Integer> tableNumbers;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="hilo"
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
	 * Return the value associated with the column: VERSION_NO
	 */
	public long getVersion () {
					return version;
			}

	/**
	 * Set the value related to the column: VERSION_NO
	 * @param version the VERSION_NO value
	 */
	public void setVersion (long version) {
		this.version = version;
	}




	/**
	 * Return the value associated with the column: GLOBAL_ID
	 */
	public String getGlobalId () {
					return globalId;
			}

	/**
	 * Set the value related to the column: GLOBAL_ID
	 * @param globalId the GLOBAL_ID value
	 */
	public void setGlobalId (String globalId) {
		this.globalId = globalId;
	}



	/**
	 * Return the value associated with the column: SEQUENCE
	 */
	public long getSequence () {
					return sequence;
			}

	/**
	 * Set the value related to the column: SEQUENCE
	 * @param sequence the SEQUENCE value
	 */
	public void setSequence (long sequence) {
		this.sequence = sequence;
	}



	/**
	 * Return the value associated with the column: CREATE_DATE
	 */
	public java.util.Date getCreateDate () {
					return createDate;
			}

	/**
	 * Set the value related to the column: CREATE_DATE
	 * @param createDate the CREATE_DATE value
	 */
	public void setCreateDate (java.util.Date createDate) {
		this.createDate = createDate;
	}



	/**
	 * Return the value associated with the column: CLOSING_DATE
	 */
	public java.util.Date getClosingDate () {
					return closingDate;
			}

	/**
	 * Set the value related to the column: CLOSING_DATE
	 * @param closingDate the CLOSING_DATE value
	 */
	public void setClosingDate (java.util.Date closingDate) {
		this.closingDate = closingDate;
	}



	/**
	 * Return the value associated with the column: ACTIVE_DATE
	 */
	public java.util.Date getActiveDate () {
					return activeDate;
			}

	/**
	 * Set the value related to the column: ACTIVE_DATE
	 * @param activeDate the ACTIVE_DATE value
	 */
	public void setActiveDate (java.util.Date activeDate) {
		this.activeDate = activeDate;
	}



	/**
	 * Return the value associated with the column: DELIVEERY_DATE
	 */
	public java.util.Date getDeliveryDate () {
					return deliveryDate;
			}

	/**
	 * Set the value related to the column: DELIVEERY_DATE
	 * @param deliveryDate the DELIVEERY_DATE value
	 */
	public void setDeliveryDate (java.util.Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}



	/**
	 * Return the value associated with the column: CREATION_HOUR
	 */
	public Integer getCreationHour () {
									return creationHour == null ? Integer.valueOf(0) : creationHour;
					}

	/**
	 * Set the value related to the column: CREATION_HOUR
	 * @param creationHour the CREATION_HOUR value
	 */
	public void setCreationHour (Integer creationHour) {
		this.creationHour = creationHour;
	}



	/**
	 * Return the value associated with the column: PAID
	 */
	public Boolean isPaid () {
								return paid == null ? Boolean.FALSE : paid;
					}

	/**
	 * Set the value related to the column: PAID
	 * @param paid the PAID value
	 */
	public void setPaid (Boolean paid) {
		this.paid = paid;
	}



	/**
	 * Return the value associated with the column: VOIDED
	 */
	public Boolean isVoided () {
								return voided == null ? Boolean.FALSE : voided;
					}

	/**
	 * Set the value related to the column: VOIDED
	 * @param voided the VOIDED value
	 */
	public void setVoided (Boolean voided) {
		this.voided = voided;
	}



	/**
	 * Return the value associated with the column: VOID_REASON
	 */
	public String getVoidReason () {
					return voidReason;
			}

	/**
	 * Set the value related to the column: VOID_REASON
	 * @param voidReason the VOID_REASON value
	 */
	public void setVoidReason (String voidReason) {
		this.voidReason = voidReason;
	}



	/**
	 * Return the value associated with the column: WASTED
	 */
	public Boolean isWasted () {
								return wasted == null ? Boolean.FALSE : wasted;
					}

	/**
	 * Set the value related to the column: WASTED
	 * @param wasted the WASTED value
	 */
	public void setWasted (Boolean wasted) {
		this.wasted = wasted;
	}



	/**
	 * Return the value associated with the column: REFUNDED
	 */
	public Boolean isRefunded () {
								return refunded == null ? Boolean.FALSE : refunded;
					}

	/**
	 * Set the value related to the column: REFUNDED
	 * @param refunded the REFUNDED value
	 */
	public void setRefunded (Boolean refunded) {
		this.refunded = refunded;
	}



	/**
	 * Return the value associated with the column: SETTLED
	 */
	public Boolean isClosed () {
								return closed == null ? Boolean.FALSE : closed;
					}

	/**
	 * Set the value related to the column: SETTLED
	 * @param closed the SETTLED value
	 */
	public void setClosed (Boolean closed) {
		this.closed = closed;
	}



	/**
	 * Return the value associated with the column: DRAWER_RESETTED
	 */
	public Boolean isDrawerResetted () {
								return drawerResetted == null ? Boolean.FALSE : drawerResetted;
					}

	/**
	 * Set the value related to the column: DRAWER_RESETTED
	 * @param drawerResetted the DRAWER_RESETTED value
	 */
	public void setDrawerResetted (Boolean drawerResetted) {
		this.drawerResetted = drawerResetted;
	}



	/**
	 * Return the value associated with the column: SUB_TOTAL
	 */
	public Double getSubtotalAmount () {
									return subtotalAmount == null ? Double.valueOf(0) : subtotalAmount;
					}

	/**
	 * Set the value related to the column: SUB_TOTAL
	 * @param subtotalAmount the SUB_TOTAL value
	 */
	public void setSubtotalAmount (Double subtotalAmount) {
		this.subtotalAmount = subtotalAmount;
	}



	/**
	 * Return the value associated with the column: TOTAL_DISCOUNT
	 */
	public Double getDiscountAmount () {
									return discountAmount == null ? Double.valueOf(0) : discountAmount;
					}

	/**
	 * Set the value related to the column: TOTAL_DISCOUNT
	 * @param discountAmount the TOTAL_DISCOUNT value
	 */
	public void setDiscountAmount (Double discountAmount) {
		this.discountAmount = discountAmount;
	}



	/**
	 * Return the value associated with the column: TOTAL_TAX
	 */
	public Double getTaxAmount () {
									return taxAmount == null ? Double.valueOf(0) : taxAmount;
					}

	/**
	 * Set the value related to the column: TOTAL_TAX
	 * @param taxAmount the TOTAL_TAX value
	 */
	public void setTaxAmount (Double taxAmount) {
		this.taxAmount = taxAmount;
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
	 * Return the value associated with the column: PAID_AMOUNT
	 */
	public Double getPaidAmount () {
									return paidAmount == null ? Double.valueOf(0) : paidAmount;
					}

	/**
	 * Set the value related to the column: PAID_AMOUNT
	 * @param paidAmount the PAID_AMOUNT value
	 */
	public void setPaidAmount (Double paidAmount) {
		this.paidAmount = paidAmount;
	}



	/**
	 * Return the value associated with the column: DUE_AMOUNT
	 */
	public Double getDueAmount () {
									return dueAmount == null ? Double.valueOf(0) : dueAmount;
					}

	/**
	 * Set the value related to the column: DUE_AMOUNT
	 * @param dueAmount the DUE_AMOUNT value
	 */
	public void setDueAmount (Double dueAmount) {
		this.dueAmount = dueAmount;
	}



	/**
	 * Return the value associated with the column: ADVANCE_AMOUNT
	 */
	public Double getAdvanceAmount () {
									return advanceAmount == null ? Double.valueOf(0) : advanceAmount;
					}

	/**
	 * Set the value related to the column: ADVANCE_AMOUNT
	 * @param advanceAmount the ADVANCE_AMOUNT value
	 */
	public void setAdvanceAmount (Double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}



	/**
	 * Return the value associated with the column: NUMBER_OF_GUESTS
	 */
	public Integer getNumberOfGuests () {
									return numberOfGuests == null ? Integer.valueOf(0) : numberOfGuests;
					}

	/**
	 * Set the value related to the column: NUMBER_OF_GUESTS
	 * @param numberOfGuests the NUMBER_OF_GUESTS value
	 */
	public void setNumberOfGuests (Integer numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
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
	 * Return the value associated with the column: IS_TAX_EXEMPT
	 */
	public Boolean isTaxExempt () {
								return taxExempt == null ? Boolean.FALSE : taxExempt;
					}

	/**
	 * Set the value related to the column: IS_TAX_EXEMPT
	 * @param taxExempt the IS_TAX_EXEMPT value
	 */
	public void setTaxExempt (Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}



	/**
	 * Return the value associated with the column: IS_RE_OPENED
	 */
	public Boolean isReOpened () {
								return reOpened == null ? Boolean.FALSE : reOpened;
					}

	/**
	 * Set the value related to the column: IS_RE_OPENED
	 * @param reOpened the IS_RE_OPENED value
	 */
	public void setReOpened (Boolean reOpened) {
		this.reOpened = reOpened;
	}



	/**
	 * Return the value associated with the column: SERVICE_CHARGE
	 */
	public Double getServiceCharge () {
									return serviceCharge == null ? Double.valueOf(0) : serviceCharge;
					}

	/**
	 * Set the value related to the column: SERVICE_CHARGE
	 * @param serviceCharge the SERVICE_CHARGE value
	 */
	public void setServiceCharge (Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}



	/**
	 * Return the value associated with the column: DELIVERY_CHARGE
	 */
	public Double getDeliveryCharge () {
									return deliveryCharge == null ? Double.valueOf(0) : deliveryCharge;
					}

	/**
	 * Set the value related to the column: DELIVERY_CHARGE
	 * @param deliveryCharge the DELIVERY_CHARGE value
	 */
	public void setDeliveryCharge (Double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}



	/**
	 * Return the value associated with the column: CUSTOMER_ID
	 */
	public Integer getCustomerId () {
									return customerId == null ? Integer.valueOf(0) : customerId;
					}

	/**
	 * Set the value related to the column: CUSTOMER_ID
	 * @param customerId the CUSTOMER_ID value
	 */
	public void setCustomerId (Integer customerId) {
		this.customerId = customerId;
	}



	/**
	 * Return the value associated with the column: DELIVERY_ADDRESS
	 */
	public String getDeliveryAddress () {
					return deliveryAddress;
			}

	/**
	 * Set the value related to the column: DELIVERY_ADDRESS
	 * @param deliveryAddress the DELIVERY_ADDRESS value
	 */
	public void setDeliveryAddress (String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}



	/**
	 * Return the value associated with the column: CUSTOMER_PICKEUP
	 */
	public Boolean isCustomerWillPickup () {
								return customerWillPickup == null ? Boolean.FALSE : customerWillPickup;
					}

	/**
	 * Set the value related to the column: CUSTOMER_PICKEUP
	 * @param customerWillPickup the CUSTOMER_PICKEUP value
	 */
	public void setCustomerWillPickup (Boolean customerWillPickup) {
		this.customerWillPickup = customerWillPickup;
	}



	/**
	 * Return the value associated with the column: DELIVERY_EXTRA_INFO
	 */
	public String getExtraDeliveryInfo () {
					return extraDeliveryInfo;
			}

	/**
	 * Set the value related to the column: DELIVERY_EXTRA_INFO
	 * @param extraDeliveryInfo the DELIVERY_EXTRA_INFO value
	 */
	public void setExtraDeliveryInfo (String extraDeliveryInfo) {
		this.extraDeliveryInfo = extraDeliveryInfo;
	}



	/**
	 * Return the value associated with the column: CALCULATE_SERVICE_CHARGE
	 */
	public Boolean isCalculateServiceCharge () {
									return calculateServiceCharge == null ? Boolean.valueOf(true) : calculateServiceCharge;
						}

	/**
	 * Set the value related to the column: CALCULATE_SERVICE_CHARGE
	 * @param calculateServiceCharge the CALCULATE_SERVICE_CHARGE value
	 */
	public void setCalculateServiceCharge (Boolean calculateServiceCharge) {
		this.calculateServiceCharge = calculateServiceCharge;
	}


	/**
	 * Custom property
	 */
	public static String getCalculateServiceChargeDefaultValue () {
		return "true";
	}


	/**
	 * Return the value associated with the column: TICKET_TYPE
	 */
	public String getTicketType () {
					return ticketType;
			}

	/**
	 * Set the value related to the column: TICKET_TYPE
	 * @param ticketType the TICKET_TYPE value
	 */
	public void setTicketType (String ticketType) {
		this.ticketType = ticketType;
	}



	/**
	 * Return the value associated with the column: SHIFT_ID
	 */
	public com.floreantpos.model.Shift getShift () {
					return shift;
			}

	/**
	 * Set the value related to the column: SHIFT_ID
	 * @param shift the SHIFT_ID value
	 */
	public void setShift (com.floreantpos.model.Shift shift) {
		this.shift = shift;
	}



	/**
	 * Return the value associated with the column: OWNER_ID
	 */
	public com.floreantpos.model.User getOwner () {
					return owner;
			}

	/**
	 * Set the value related to the column: OWNER_ID
	 * @param owner the OWNER_ID value
	 */
	public void setOwner (com.floreantpos.model.User owner) {
		this.owner = owner;
	}



	/**
	 * Return the value associated with the column: DRIVER_ID
	 */
	public com.floreantpos.model.User getAssignedDriver () {
					return assignedDriver;
			}

	/**
	 * Set the value related to the column: DRIVER_ID
	 * @param assignedDriver the DRIVER_ID value
	 */
	public void setAssignedDriver (com.floreantpos.model.User assignedDriver) {
		this.assignedDriver = assignedDriver;
	}



	/**
	 * Return the value associated with the column: GRATUITY_ID
	 */
	public com.floreantpos.model.Gratuity getGratuity () {
					return gratuity;
			}

	/**
	 * Set the value related to the column: GRATUITY_ID
	 * @param gratuity the GRATUITY_ID value
	 */
	public void setGratuity (com.floreantpos.model.Gratuity gratuity) {
		this.gratuity = gratuity;
	}



	/**
	 * Return the value associated with the column: VOID_BY_USER
	 */
	public com.floreantpos.model.User getVoidedBy () {
					return voidedBy;
			}

	/**
	 * Set the value related to the column: VOID_BY_USER
	 * @param voidedBy the VOID_BY_USER value
	 */
	public void setVoidedBy (com.floreantpos.model.User voidedBy) {
		this.voidedBy = voidedBy;
	}



	/**
	 * Return the value associated with the column: TERMINAL_ID
	 */
	public com.floreantpos.model.Terminal getTerminal () {
					return terminal;
			}

	/**
	 * Set the value related to the column: TERMINAL_ID
	 * @param terminal the TERMINAL_ID value
	 */
	public void setTerminal (com.floreantpos.model.Terminal terminal) {
		this.terminal = terminal;
	}



	/**
	 * Return the value associated with the column: properties
	 */
	public java.util.Map<String, String> getProperties () {
					return properties;
			}

	/**
	 * Set the value related to the column: properties
	 * @param properties the properties value
	 */
	public void setProperties (java.util.Map<String, String> properties) {
		this.properties = properties;
	}



	/**
	 * Return the value associated with the column: ticketItems
	 */
	public java.util.List<com.floreantpos.model.TicketItem> getTicketItems () {
					return ticketItems;
			}

	/**
	 * Set the value related to the column: ticketItems
	 * @param ticketItems the ticketItems value
	 */
	public void setTicketItems (java.util.List<com.floreantpos.model.TicketItem> ticketItems) {
		this.ticketItems = ticketItems;
	}

	public void addToticketItems (com.floreantpos.model.TicketItem ticketItem) {
		if (null == getTicketItems()) setTicketItems(new java.util.ArrayList<com.floreantpos.model.TicketItem>());
		getTicketItems().add(ticketItem);
	}



	/**
	 * Return the value associated with the column: discounts
	 */
	public java.util.List<com.floreantpos.model.TicketDiscount> getDiscounts () {
					return discounts;
			}

	/**
	 * Set the value related to the column: discounts
	 * @param discounts the discounts value
	 */
	public void setDiscounts (java.util.List<com.floreantpos.model.TicketDiscount> discounts) {
		this.discounts = discounts;
	}

	public void addTodiscounts (com.floreantpos.model.TicketDiscount ticketDiscount) {
		if (null == getDiscounts()) setDiscounts(new java.util.ArrayList<com.floreantpos.model.TicketDiscount>());
		getDiscounts().add(ticketDiscount);
	}



	/**
	 * Return the value associated with the column: transactions
	 */
	public java.util.Set<com.floreantpos.model.PosTransaction> getTransactions () {
					return transactions;
			}

	/**
	 * Set the value related to the column: transactions
	 * @param transactions the transactions value
	 */
	public void setTransactions (java.util.Set<com.floreantpos.model.PosTransaction> transactions) {
		this.transactions = transactions;
	}

	public void addTotransactions (com.floreantpos.model.PosTransaction posTransaction) {
		if (null == getTransactions()) setTransactions(new java.util.TreeSet<com.floreantpos.model.PosTransaction>());
		getTransactions().add(posTransaction);
	}



	/**
	 * Return the value associated with the column: tableNumbers
	 */
	public java.util.List<Integer> getTableNumbers () {
					return tableNumbers;
			}

	/**
	 * Set the value related to the column: tableNumbers
	 * @param tableNumbers the tableNumbers value
	 */
	public void setTableNumbers (java.util.List<Integer> tableNumbers) {
		this.tableNumbers = tableNumbers;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.floreantpos.model.Ticket)) return false;
		else {
			com.floreantpos.model.Ticket ticket = (com.floreantpos.model.Ticket) obj;
			if (null == this.getId() || null == ticket.getId()) return false;
			else return (this.getId().equals(ticket.getId()));
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