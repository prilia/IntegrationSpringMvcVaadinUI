package com.practice.components.forms;

import com.practice.components.bean.LoginBean;
import com.vaadin.data.Validator.InvalidValueException;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.VerticalLayout;

public class LoginForm extends Form {
	private LoginBean datasource;
	public LoginForm() {
		super();
		rebuild();
	}

	private void rebuild() {
		
		setCaption("Login");
		setFormFieldFactory(new FieldFactory());

        addButtons();
		bindDataSource();
		

	}

	private void addButtons() {
		VerticalLayout footer = new VerticalLayout();
        Button submitbutton = new Button("Submit", this, "commit");
        footer.addComponent(submitbutton);
        footer.setComponentAlignment(submitbutton, Alignment.TOP_RIGHT);
        footer.addComponent(new Button("Reset",this, "discard"));
        footer.addComponent(new Button("Cancel"));
        this.getFooter().addComponent(footer);
	}

	private void bindDataSource() {
		datasource = new LoginBean();
		BeanItem<LoginBean> item = new BeanItem<LoginBean>(datasource);
		setItemDataSource(item);
	}

	@Override
	public void commit() throws SourceException, InvalidValueException {
		// TODO Auto-generated method stub
		super.commit();
	}

	@Override
	public void discard() throws SourceException {
		
		super.discard();
		datasource.setPassword("");
		datasource.setUserID("");
	}

	

	

}
