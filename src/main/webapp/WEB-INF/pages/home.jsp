<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>home page of jquery data sources app</h3>
	<!-- dynamic way CSV -->
	<h4>get source files in dynamic way (ajax/XHR) - from data base and draw chart based at this data</h4>
	<a href='${ pageContext.request.contextPath }/dynamicCsv'>dynamic CSV chart</a><br>
	
	<h4>get raw CSV source files in dynamic way (data from data base)</h4>
	<a href='${ pageContext.request.contextPath }/dynamicCsvDBFile'>dynamic CSV file</a><br>
	
	<h4>get raw CSV source files in dynamic way (data by creating inner object)</h4>
	<a href='${ pageContext.request.contextPath }/dynamicCsvFile'>dynamic CSV file</a><br>
	
	<!-- static way -->
	<h4>get source files in static way (ajax/XHR) - from files existed on server and draw chart based at this data</h4>
	<a href='${ pageContext.request.contextPath }/staticCsv'>static CSV chart</a><br>
	
	<h4>get raw source files in static way</h4>
	<a href='${ pageContext.request.contextPath }/res/chartjqx/chartTxt/gdp_dept_2010.txt'>static CSV file</a><br>
	
	<!-- dynamic way plain Text -->
	<h4>get raw text source file in dynamic way (data by creating inner object)</h4>
	<a href='${ pageContext.request.contextPath }/dynamicPlainText'>dynamic plain text file</a><br>
	
	<!-- dynamic way octet -->
	<h4>get raw Octet Stream File in dynamic way</h4>
	<a href='${ pageContext.request.contextPath }/dynamicOctetStreamFile'>dynamic Octet Stream File - use notepad++ or similar editor to open it</a><br>
	
	<!-- static way octet -->
	<h4>get raw Octet Stream File in static way - binary file ready at server side</h4>
	<a href='${ pageContext.request.contextPath }/res/chartjqx/chartTxt/dynamicOctetStreamFile.bin'>static Octet Stream File - use notepad++ or similar editor to open it</a><br>
</body>
</html>