<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/questions.css">

<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<h1>Question 1</h1>
	<h2>What happens next in this scenario?</h2>
	<div class="img-with-text">
	<img alt="jojo_laugh" src="https://i.kym-cdn.com/photos/images/original/001/177/975/e0e.gif">
	
	
	</div>
	<a href="/question2"><button type="button" class="btn btn-warning" >Next Question</button></a> 
	
	
	 <button type="button" class="btn btn-primary" onclick="myFunction()">Click me for answer</button>
	 
	<div class="video">
	<iframe width="560" style="display:none" height="315" src="https://www.youtube.com/embed/iEg2mdR_7Pw"  id="video"></iframe>
	</div>
	
	
</body>
</html>