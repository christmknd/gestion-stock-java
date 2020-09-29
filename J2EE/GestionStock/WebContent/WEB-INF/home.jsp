<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="WebContent/css/style.css" type="text/css"/>  		
</head>

<body>

<header>
        <%@ include file="header.jsp" %>
</header>
	
		<h2>Connectez vous</h2>
	
<section>

<p>Connectez vous </p>
<form method="post" action="">
	
		<label for ="id">Id : </label>
		<input type= "text" name="id" id="id"/>
		<label for ="password">Mot de passe: </label>
		<input type= "password" name="password" id="password"/>
		
		<input type="submit"/>
		
	</form>
</section>

	

</body>


</html>