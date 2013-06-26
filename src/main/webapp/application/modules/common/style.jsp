<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String themesPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/application/template/themes/base/";
%>
	<!-- The styles -->
	<link id="bs-css" href="<%=themesPath%>css/bootstrap-cerulean.css" rel="stylesheet">
	
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="<%=themesPath%>css/bootstrap-responsive.css" rel="stylesheet">
	<link href="<%=themesPath%>css/charisma-app.css" rel="stylesheet">
	<link href="<%=themesPath%>css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='<%=themesPath%>css/fullcalendar.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='<%=themesPath%>css/chosen.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/uniform.default.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/colorbox.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/jquery.cleditor.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/jquery.noty.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/noty_theme_default.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/elfinder.min.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/elfinder.theme.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/opa-icons.css' rel='stylesheet'>
	<link href='<%=themesPath%>css/uploadify.css' rel='stylesheet'>

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	
	<!-- The fav icon -->
	<link rel="shortcut icon" href="<%=themesPath%>img/favicon.ico">