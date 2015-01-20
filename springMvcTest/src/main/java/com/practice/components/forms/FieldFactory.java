package com.practice.components.forms;

import com.vaadin.data.Item;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

public class FieldFactory extends DefaultFieldFactory {
	

	

	@Override
     public Field createField(Item item, Object propertyId,
             Component uiContext) {

         Field field = super.createField(item, propertyId, uiContext);

         if ("userId".equals(propertyId)) {
             ((TextField) field).setColumns(1);
             //field.addValidator(new PostalCodeValidator());
         }
         if ("password".equals(propertyId)) {
             ((TextField) field).setColumns(2);
             //field.addValidator(new PostalCodeValidator());
         }

         return field;
     }


}
