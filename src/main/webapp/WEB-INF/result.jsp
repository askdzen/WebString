<%--
  Created by IntelliJ IDEA.
  User: Askar
  Date: 01.07.2014
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<fmt:bundle basename="i18n.message" prefix="result.">
<head>
    <title> </title>
    <link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap.min.css") %>'>
    <link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap-theme.min.css") %>'>
</head>
<body>

<h1><fmt:message key="text"/></h1>
<p><%= request.getParameter("text")%></p>

<div class="tabbable"> <!-- Only required for left/right tabs -->
    <ul class="nav nav-tabs">
        <li class="active"><a href="#tab1" data-toggle="tab"><fmt:message key="paragraph"/></a></li>
        <li><a href="#tab2" data-toggle="tab"><fmt:message key="sentence"/></a></li>
    </ul>
    <div class="tab-content">
        <div class="tab-pane active" id="tab1">
            <p>${paragraph}</p>
        </div>
        <div class="tab-pane" id="tab2">
            <p>${sentence}</p>
        </div>
    </div>
</div>

<script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("jquery.min.js") %>'></script>
<script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("js/bootstrap.min.js") %>'></script>

</body>
</fmt:bundle>
</html>
