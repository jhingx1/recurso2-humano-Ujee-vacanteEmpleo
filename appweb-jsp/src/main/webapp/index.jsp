
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html>
<body>
<h2>Hello World!</h2>


<%

	List<String> lista = new ArrayList<String>();
	lista.add("TV");
	lista.add("Stereo");
	lista.add("Iphone");

%>

<select>
	<%
		for(String s:lista){
			out.println("<option>"+ s +"</option>");
		}
	%>	
	
</select>

</body>
</html>
