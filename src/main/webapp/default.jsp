<%--
  Created by IntelliJ IDEA.
  User: Askar
  Date: 01.07.2014
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<fmt:bundle basename="i18n.message" prefix="default.">
<head>
    <title><fmt:message key="page"/> </title>

    <link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap.min.css") %>'>
    <link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap-theme.min.css") %>'>
</head>
<body>



    <div class = "container">



<p><fmt:message key="inputText"></fmt:message></p>



<form action="${pageContext.request.contextPath}/parser" method="post">
    <textarea rows="30" cols="100" name="text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus fringilla lectus eu lectus adipiscing pretium. In hac habitasse platea dictumst. Donec turpis tellus, tincidunt sed orci et, venenatis tempor orci. Quisque bibendum pharetra felis et rutrum. Nam luctus leo non tristique auctor. Ut molestie imperdiet lectus, sit amet faucibus felis lobortis feugiat. Curabitur laoreet ultrices arcu ac aliquam. Nunc tristique vestibulum lorem iaculis aliquet. Pellentesque imperdiet metus quis ante hendrerit pretium. Nullam eget dapibus libero, in sollicitudin arcu. Pellentesque malesuada scelerisque risus sit amet lobortis. Pellentesque sagittis eros at felis sollicitudin, at euismod justo hendrerit.
        Nam elit nibh, commodo eu lorem a, dapibus tristique orci. Vestibulum aliquet, elit in commodo tristique, justo ipsum sagittis metus, ut malesuada diam massa vel nisi. Pellentesque condimentum scelerisque augue. Curabitur felis massa, rutrum in fermentum in, adipiscing in arcu. Cras hendrerit consequat auctor. Morbi at volutpat massa. Duis eleifend purus eu ullamcorper viverra. Praesent at volutpat felis. Curabitur lacus enim, scelerisque scelerisque urna quis, posuere faucibus massa. Donec hendrerit ligula nisi, id interdum justo bibendum quis. Maecenas eget commodo libero. Aliquam erat volutpat.
        Fusce sodales elit a egestas tristique. Nam dapibus eu velit id euismod. Curabitur accumsan sem vel posuere feugiat. Morbi molestie arcu adipiscing metus porttitor bibendum. Donec tempor condimentum mattis. Donec sed varius purus, sit amet placerat lacus. Maecenas at eleifend nisl, eget aliquam tortor.
        Nunc metus est, congue tristique malesuada non, mattis et ligula. Mauris convallis leo arcu, at mollis tortor ornare sit amet. Duis euismod neque in eros dignissim accumsan. Ut id dolor non dolor gravida commodo. Nunc sit amet leo vel metus pharetra convallis. Sed sed erat nisl. Pellentesque vitae vehicula urna. Fusce eleifend pulvinar turpis quis tristique. Fusce id lobortis ligula. Fusce egestas commodo metus. Nam et magna sed quam hendrerit vehicula.
        Nullam tincidunt, elit sit amet ultrices malesuada, nisl enim faucibus massa, nec euismod sem sapien vel nunc. Pellentesque sapien eros, tristique eleifend eros in, dignissim mattis felis. Cras egestas nec justo in pretium. Pellentesque laoreet ultricies lorem, non mollis velit ultrices quis. Duis egestas nulla eget enim vulputate, ac scelerisque enim rhoncus. Maecenas est velit, venenatis eget sollicitudin vitae, vulputate ut diam. Suspendisse imperdiet aliquam quam vitae tincidunt. Aliquam dapibus nec mauris quis blandit. Fusce id ipsum condimentum, malesuada elit vel, sagittis erat. Suspendisse elementum diam vel nulla congue ultrices. Aliquam ut tincidunt ligula. Etiam congue dui a velit fermentum malesuada. Vivamus quis ullamcorper tellus.

    </textarea>

    <div id="right">
        <input type="radio" name="action" value="parse" checked> parse on paragraphs and sentences and sentences parts <br>
        <input type="radio" name="action" value="parseP"> parse on paragraphs <br>
        <input type="radio" name="action" value="parseS"> parse on sentences <br>
    </div>



    <button type="submit" class="btn btn-primary"><fmt:message key="parsing"></fmt:message></button>
</form>
<script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("jquery.min.js") %>'></script>
<script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("js/bootstrap.min.js") %>'></script>

</div>
</body>
</fmt:bundle>
</html>
