<%--
  Created by IntelliJ IDEA.
  User: Askar
  Date: 01.07.2014
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<h5>Text</h5>
<p><%= request.getParameter("text")%></p>
<h4>Paragraph</h4>
<p>${paragraph}</p>
<h3>Sentence:</h3>
<p>${sentence}</p>



</body>
</html>
