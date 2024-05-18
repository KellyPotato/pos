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
package com.floreantpos.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the MENU_MODIFIER_GROUP table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="MENU_MODIFIER_GROUP"
 */

public abstract class BaseMenuModifierGroup implements Comparable, Serializable {

	public static String REF = "MenuModifierGroup"; //$NON-NLS-1$
	public static String PROP_NAME = "name"; //$NON-NLS-1$
	public static String PROP_EXCLUSIVE = "exclusive"; //$NON-NLS-1$
	public static String PROP_REQUIRED = "required"; //$NON-NLS-1$
	public static String PROP_ENABLE = "enable"; //$NON-NLS-1$
	public static String PROP_ID = "id"; //$NON-NLS-1$
	public static String PROP_TRANSLATED_NAME = "translatedName"; //$NON-NLS-1$


	// constructors
	public BaseMenuModifierGroup() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenuModifierGroup(Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
		protected String name;
		protected String translatedName;
		protected Boolean enable;
		protected Boolean exclusive;
		protected Boolean required;

	// collections
	private java.util.Set<com.floreantpos.model.MenuModifier> modifiers;



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
	 * Return the value associated with the column: ENABLED
	 */
	public Boolean isEnable () {
								return enable == null ? Boolean.FALSE : enable;
					}

	/**
	 * Set the value related to the column: ENABLED
	 * @param enable the ENABLED value
	 */
	public void setEnable (Boolean enable) {
		this.enable = enable;
	}



	/**
	 * Return the value associated with the column: EXCLUSIVED
	 */
	public Boolean isExclusive () {
								return exclusive == null ? Boolean.FALSE : exclusive;
					}

	/**
	 * Set the value related to the column: EXCLUSIVED
	 * @param exclusive the EXCLUSIVED value
	 */
	public void setExclusive (Boolean exclusive) {
		this.exclusive = exclusive;
	}



	/**
	 * Return the value associated with the column: REQUIRED
	 */
	public Boolean isRequired () {
								return required == null ? Boolean.FALSE : required;
					}

	/**
	 * Set the value related to the column: REQUIRED
	 * @param required the REQUIRED value
	 */
	public void setRequired (Boolean required) {
		this.required = required;
	}



	/**
	 * Return the value associated with the column: modifiers
	 */
	public java.util.Set<com.floreantpos.model.MenuModifier> getModifiers () {
					return modifiers;
			}

	/**
	 * Set the value related to the column: modifiers
	 * @param modifiers the modifiers value
	 */
	public void setModifiers (java.util.Set<com.floreantpos.model.MenuModifier> modifiers) {
		this.modifiers = modifiers;
	}

	public void addTomodifiers (com.floreantpos.model.MenuModifier menuModifier) {
		if (null == getModifiers()) setModifiers(new java.util.TreeSet<com.floreantpos.model.MenuModifier>());
		getModifiers().add(menuModifier);
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.floreantpos.model.MenuModifierGroup)) return false;
		else {
			com.floreantpos.model.MenuModifierGroup menuModifierGroup = (com.floreantpos.model.MenuModifierGroup) obj;
			if (null == this.getId() || null == menuModifierGroup.getId()) return false;
			else return (this.getId().equals(menuModifierGroup.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode(); //$NON-NLS-1$
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