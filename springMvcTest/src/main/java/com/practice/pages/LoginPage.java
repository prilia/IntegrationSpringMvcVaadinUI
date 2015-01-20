package com.practice.pages;


import com.practice.components.forms.LoginForm;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class LoginPage extends VerticalLayout{
	
	public LoginPage() {
		removeAllComponents();
		rebuild();
	}

	private void rebuild() {
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
		
		HorizontalLayout buttonLayout = new HorizontalLayout();
		final Button loginButton = new Button("Login");

		loginButton.addListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				loginButton.setCaption("login button got clicked");
			}
			
		});
		
		Button forgotButton = new Button("Forgot Password");
		buttonLayout.addComponent(loginButton);
		buttonLayout.addComponent(forgotButton);
		
		addComponent(userhLayout);
		addComponent(passhLayout);
		addComponent(buttonLayout);

		

		LoginForm loginForm = new LoginForm();
		addComponent(loginForm);
		addComponent(vLayout);

		
		

	}
	
}
