<!-- declare a method in the jsp file -->
<!-- call the method in the same jsp page -->
<html>

<body>
<%!
	String makeItLower(String data) {
		return data.toLowerCase();
	}
%>

Lower case "HELL WORLD": <%= makeItLower("HELL WORLD") %>

</body>
</html>