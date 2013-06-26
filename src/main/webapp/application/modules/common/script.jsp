<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String themesPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/application/template/themes/base/";
%>
	<!-- jQuery -->
	<script src="<%=themesPath%>js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="<%=themesPath%>js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="<%=themesPath%>js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="<%=themesPath%>js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="<%=themesPath%>js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="<%=themesPath%>js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="<%=themesPath%>js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="<%=themesPath%>js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="<%=themesPath%>js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="<%=themesPath%>js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="<%=themesPath%>js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="<%=themesPath%>js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="<%=themesPath%>js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="<%=themesPath%>js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="<%=themesPath%>js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="<%=themesPath%>js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src="<%=themesPath%>js/fullcalendar.min.js"></script>
	<!-- data table plugin -->
	<script src="<%=themesPath%>js/jquery.dataTables.min.js"></script>

	<!-- chart libraries start -->
	<script src="<%=themesPath%>js/excanvas.js"></script>
	<script src="<%=themesPath%>js/jquery.flot.min.js"></script>
	<script src="<%=themesPath%>js/jquery.flot.pie.min.js"></script>
	<script src="<%=themesPath%>js/jquery.flot.stack.js"></script>
	<script src="<%=themesPath%>js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="<%=themesPath%>js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="<%=themesPath%>js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="<%=themesPath%>js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="<%=themesPath%>js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="<%=themesPath%>js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="<%=themesPath%>js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="<%=themesPath%>js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="<%=themesPath%>js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="<%=themesPath%>js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="<%=themesPath%>js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="<%=themesPath%>js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="<%=themesPath%>js/charisma.js"></script>