
package com.practice.vaadin_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.practice.pages.LoginPage;
import com.vaadin.Application;
import com.vaadin.ui.Window;

@Configurable
public class VaadinSpringDemoApplication extends Application {

    private Window window;
    
    @Override
    public void init() {
    	window = new Window("Login Page", new LoginPage());
    	window.center();
    	setMainWindow(window);
    }

}
