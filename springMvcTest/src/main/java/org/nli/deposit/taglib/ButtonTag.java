package org.nli.deposit.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ButtonTag extends SimpleTagSupport {

	private String id;
	private String cssClass;
	private String value;
	private String type;
	private String name;

	public ButtonTag() {
		this.id="";
		this.cssClass="";
		this.value="";
		this.type="";
		this.name="";
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void doTag() throws JspException, IOException {
		/*
		 * System.out.println("Number is:" + number);
		 * System.out.println("Format is:" + format);
		 */
		String button = "<span id ='" + id + "'  name='"+name+"' class='generalbtn-wrapper "+cssClass+"'>" + " <span class='generalbtn-right'>&nbsp;</span>"
				+ " <input id ='" + id + "Button' type='" + type + "'  value='" + value + "' class='generalbtn-mid'>"
				+ " <span class='generalbtn-left'>&nbsp;</span></span>";
		try {
			getJspContext().getOut().write(button);
		} catch (Exception e) {
			e.printStackTrace();
			// stop page from loading further by throwing SkipPageException
			throw new SkipPageException();
		}
	}

}