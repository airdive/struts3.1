<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	</head>
	<body>
		<s:form action="register" method="post" enctype="multipart/form-data">
			username:<s:textfield name="username"></s:textfield>
			<br />
			<s:file name="uploadFile"></s:file>
			<br />
			<s:submit value="提交"></s:submit>
		</s:form>
	</body>
</html>
