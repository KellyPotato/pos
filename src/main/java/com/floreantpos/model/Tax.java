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

import com.floreantpos.model.base.BaseTax;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tax extends BaseTax {
	private static final long serialVersionUID = 1L;
	private Boolean enable;

	/*[CONSTRUCTOR MARKER BEGIN]*/
	public Tax() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Tax(Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Tax(
		Integer id,
		String name) {

		super (
			id,
			name);
	}

	/*[CONSTRUCTOR MARKER END]*/

	public String getUniqueId() {
		return ("tax_" + getName() + "_" + getId()).replaceAll("\\s+", "_"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	}

	@Override
	public String toString() {
		return getName() + " (" + getRate() + "%)"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	public Boolean isEnable() {
		return enable == null ? false : enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
}