<%@ page language="java" %>
<%
  String name = request.getParameter("username");
%>
<html>
<head><title>Result</title></head>
<body>
  <h3>Hello, <%= name %>!</h3>
</body>
</html>
