
package com.practice.components;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class LoginPage extends Panel{
	
	public LoginPage() {
//		removeAllComponents();
		rebuild();
	}

	private void rebuild() {
		Panel panel = new Panel("Login");
		VerticalLayout vLayout = new VerticalLayout();
		
		HorizontalLayout userhLayout = new HorizontalLayout();
		Label userNameLabel = new Label("Username");
		TextField userTextBox = new TextField();
		userhLayout.addComponent(userNameLabel);
		userhLayout.addComponent(userTextBox);
		
		HorizontalLayout passhLayout = new HorizontalLayout();
		Label passwordLabel = new Label("Password");
		TextField passwordTextBox = new TextField();
		passhLayout.addComponent(passwordLabel);
		passhLayout.addComponent(passwordTextBox);
		
		vLayout.addComponent(userhLayout);
		vLayout.addComponent(passhLayout);
		addComponent(vLayout);
		
		
	}
}
