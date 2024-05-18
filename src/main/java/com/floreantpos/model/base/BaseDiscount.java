package com.floreantpos.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the COUPON_AND_DISCOUNT table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="COUPON_AND_DISCOUNT"
 */

public abstract class BaseDiscount implements Comparable, Serializable {

	public static String REF = "Discount";
	public static String PROP_EXPIRY_DATE = "expiryDate";
	public static String PROP_ENABLED = "enabled";
	public static String PROP_MINIMUN_BUY = "minimunBuy";
	public static String PROP_MODIFIABLE = "modifiable";
	public static String PROP_NAME = "name";
	public static String PROP_APPLY_TO_ALL = "applyToAll";
	public static String PROP_MIXIMUM_OFF = "miximumOff";
	public static String PROP_AUTO_APPLY = "autoApply";
	public static String PROP_TYPE = "type";
	public static String PROP_QUALIFICATION_TYPE = "qualificationType";
	public static String PROP_NEVER_EXPIRE = "neverExpire";
	public static String PROP_BARCODE = "barcode";
	public static String PROP_VALUE = "value";
	public static String PROP_ID = "id";
	public static String PROP_UUID = "UUID";


	// constructors
	public BaseDiscount() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDiscount(Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
		protected String name;
		protected Integer type;
		protected String barcode;
		protected Integer qualificationType;
		protected Boolean applyToAll;
		protected Integer minimunBuy;
		protected Integer miximumOff;
		protected Double value;
		protected java.util.Date expiryDate;
		protected Boolean enabled;
		protected Boolean autoApply;
		protected Boolean modifiable;
		protected Boolean neverExpire;
		protected String uUID;

	// collections
	private java.util.List<com.floreantpos.model.MenuItem> menuItems;
	private java.util.List<com.floreantpos.model.MenuGroup> menuGroups;
	private java.util.List<com.floreantpos.model.MenuCategory> menuCategories;



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
	 * Return the value associated with the column: TYPE
	 */
	public Integer getType () {
									return type == null ? Integer.valueOf(0) : type;
					}

	/**
	 * Set the value related to the column: TYPE
	 * @param type the TYPE value
	 */
	public void setType (Integer type) {
		this.type = type;
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
	 * Return the value associated with the column: QUALIFICATION_TYPE
	 */
	public Integer getQualificationType () {
									return qualificationType == null ? Integer.valueOf(0) : qualificationType;
					}

	/**
	 * Set the value related to the column: QUALIFICATION_TYPE
	 * @param qualificationType the QUALIFICATION_TYPE value
	 */
	public void setQualificationType (Integer qualificationType) {
		this.qualificationType = qualificationType;
	}



	/**
	 * Return the value associated with the column: APPLY_TO_ALL
	 */
	public Boolean isApplyToAll () {
								return applyToAll == null ? Boolean.FALSE : applyToAll;
					}

	/**
	 * Set the value related to the column: APPLY_TO_ALL
	 * @param applyToAll the APPLY_TO_ALL value
	 */
	public void setApplyToAll (Boolean applyToAll) {
		this.applyToAll = applyToAll;
	}



	/**
	 * Return the value associated with the column: MINIMUM_BUY
	 */
	public Integer getMinimunBuy () {
									return minimunBuy == null ? Integer.valueOf(0) : minimunBuy;
					}

	/**
	 * Set the value related to the column: MINIMUM_BUY
	 * @param minimunBuy the MINIMUM_BUY value
	 */
	public void setMinimunBuy (Integer minimunBuy) {
		this.minimunBuy = minimunBuy;
	}



	/**
	 * Return the value associated with the column: MAXIMUM_OFF
	 */
	public Integer getMiximumOff () {
									return miximumOff == null ? Integer.valueOf(0) : miximumOff;
					}

	/**
	 * Set the value related to the column: MAXIMUM_OFF
	 * @param miximumOff the MAXIMUM_OFF value
	 */
	public void setMiximumOff (Integer miximumOff) {
		this.miximumOff = miximumOff;
	}



	/**
	 * Return the value associated with the column: VALUE
	 */
	public Double getValue () {
									return value == null ? Double.valueOf(0) : value;
					}

	/**
	 * Set the value related to the column: VALUE
	 * @param value the VALUE value
	 */
	public void setValue (Double value) {
		this.value = value;
	}



	/**
	 * Return the value associated with the column: EXPIRY_DATE
	 */
	public java.util.Date getExpiryDate () {
					return expiryDate;
			}

	/**
	 * Set the value related to the column: EXPIRY_DATE
	 * @param expiryDate the EXPIRY_DATE value
	 */
	public void setExpiryDate (java.util.Date expiryDate) {
		this.expiryDate = expiryDate;
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
	 * Return the value associated with the column: AUTO_APPLY
	 */
	public Boolean isAutoApply () {
								return autoApply == null ? Boolean.FALSE : autoApply;
					}

	/**
	 * Set the value related to the column: AUTO_APPLY
	 * @param autoApply the AUTO_APPLY value
	 */
	public void setAutoApply (Boolean autoApply) {
		this.autoApply = autoApply;
	}



	/**
	 * Return the value associated with the column: MODIFIABLE
	 */
	public Boolean isModifiable () {
								return modifiable == null ? Boolean.FALSE : modifiable;
					}

	/**
	 * Set the value related to the column: MODIFIABLE
	 * @param modifiable the MODIFIABLE value
	 */
	public void setModifiable (Boolean modifiable) {
		this.modifiable = modifiable;
	}



	/**
	 * Return the value associated with the column: NEVER_EXPIRE
	 */
	public Boolean isNeverExpire () {
								return neverExpire == null ? Boolean.FALSE : neverExpire;
					}

	/**
	 * Set the value related to the column: NEVER_EXPIRE
	 * @param neverExpire the NEVER_EXPIRE value
	 */
	public void setNeverExpire (Boolean neverExpire) {
		this.neverExpire = neverExpire;
	}



	/**
	 * Return the value associated with the column: UUID
	 */
	public String getUUID () {
					return uUID;
			}

	/**
	 * Set the value related to the column: UUID
	 * @param uUID the UUID value
	 */
	public void setUUID (String uUID) {
		this.uUID = uUID;
	}



	/**
	 * Return the value associated with the column: menuItems
	 */
	public java.util.List<com.floreantpos.model.MenuItem> getMenuItems () {
					return menuItems;
			}

	/**
	 * Set the value related to the column: menuItems
	 * @param menuItems the menuItems value
	 */
	public void setMenuItems (java.util.List<com.floreantpos.model.MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public void addTomenuItems (com.floreantpos.model.MenuItem menuItem) {
		if (null == getMenuItems()) setMenuItems(new java.util.ArrayList<com.floreantpos.model.MenuItem>());
		getMenuItems().add(menuItem);
	}



	/**
	 * Return the value associated with the column: menuGroups
	 */
	public java.util.List<com.floreantpos.model.MenuGroup> getMenuGroups () {
					return menuGroups;
			}

	/**
	 * Set the value related to the column: menuGroups
	 * @param menuGroups the menuGroups value
	 */
	public void setMenuGroups (java.util.List<com.floreantpos.model.MenuGroup> menuGroups) {
		this.menuGroups = menuGroups;
	}

	public void addTomenuGroups (com.floreantpos.model.MenuGroup menuGroup) {
		if (null == getMenuGroups()) setMenuGroups(new java.util.ArrayList<com.floreantpos.model.MenuGroup>());
		getMenuGroups().add(menuGroup);
	}



	/**
	 * Return the value associated with the column: menuCategories
	 */
	public java.util.List<com.floreantpos.model.MenuCategory> getMenuCategories () {
					return menuCategories;
			}

	/**
	 * Set the value related to the column: menuCategories
	 * @param menuCategories the menuCategories value
	 */
	public void setMenuCategories (java.util.List<com.floreantpos.model.MenuCategory> menuCategories) {
		this.menuCategories = menuCategories;
	}

	public void addTomenuCategories (com.floreantpos.model.MenuCategory menuCategory) {
		if (null == getMenuCategories()) setMenuCategories(new java.util.ArrayList<com.floreantpos.model.MenuCategory>());
		getMenuCategories().add(menuCategory);
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.floreantpos.model.Discount)) return false;
		else {
			com.floreantpos.model.Discount discount = (com.floreantpos.model.Discount) obj;
			if (null == this.getId() || null == discount.getId()) return false;
			else return (this.getId().equals(discount.getId()));
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