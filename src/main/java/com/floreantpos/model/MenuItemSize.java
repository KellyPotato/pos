package com.floreantpos.model;

import com.floreantpos.model.base.BaseMenuItemSize;
import org.apache.commons.lang.StringUtils;


public class MenuItemSize extends BaseMenuItemSize {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public MenuItemSize() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public MenuItemSize(Integer id) {
		super(id);
	}

/*[CONSTRUCTOR MARKER END]*/
	
	@Override
	public String getTranslatedName() {
		String translatedName = super.getTranslatedName();
		if(StringUtils.isEmpty(translatedName)) {
			return getName();
		}
		
		return translatedName;
	}

	@Override
	public String toString() {
		return getName();
	}
}