package com.practice.components;

import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Table;

public class StudentDetailTable extends Table{
	
	public StudentDetailTable() {
		removeAllItems();
		rebuild();
	}

	private void rebuild() {
		Table table = new Table();
		
		IndexedContainer cont = new IndexedContainer();
		cont.addContainerProperty("property1", String.class, "");
		cont.addContainerProperty("property2", String.class, "");
		cont.addContainerProperty("property3", String.class, "");
		
		for(int i = 0; i < 1000; i++) {
			cont.addItem(i);
			cont.getContainerProperty(i, "property1").setValue("Item "+i);
			cont.getContainerProperty(i, "property2").setValue("Item "+i);
			cont.getContainerProperty(i, "property3").setValue("Item "+i);
		}
		setContainerDataSource(cont);
		
	}
	
}
