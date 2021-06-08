<html>

<head><title>Student Confirmation Title</title></head>

<body>

	<%
		 String first_name = request.getParameter("firstname");	
		 String last_name = request.getParameter("lastname");
		 out.println(first_name + " " + last_name);
	%>
	

	<br/><br/>

	Favorite Programming Languages: <br/>
	
	<!-- display list of "favoriteLanguage" -->	
	<ul>
		<%
			String[] langs = request.getParameterValues("favoriteLanguage");
		
			for (String tempLang : langs) {
				out.println("<li>" + tempLang + "</li>");
			}
		%>
	</ul>
</body>
</html>










