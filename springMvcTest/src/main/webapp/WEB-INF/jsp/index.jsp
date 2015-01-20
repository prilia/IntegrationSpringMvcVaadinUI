<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<c:url value="/" var="rootUrl" />
<c:url value="/resources" var="resourcesUrl" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<div id="depositBody" class="body center">
	
	<div id="login">
				<div class="mainContent">
					
					<br />
				</div>
				<div class="content_data">
					<div class="width100 line"></div>
					<div class="login-bottuns" align="center">
						<btnTag:button id="submit" type="submit" value="Go"
							cssClass="width160" />
						<div class="width100"></div>
					</div>
				</div>
			</div>
	</div>
	
</body>
</html>