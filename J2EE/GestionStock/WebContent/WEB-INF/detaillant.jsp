<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="WebContent/css/style.css" type="text/css"/>  		

<title>Magasin</title>
</head>

<body>

<header>
<nav>
	<div class="top-left">
       <c:if home="${ !empty sessionScope.id }">
        <p> ${ sessionScope.id }</p>
    </c:if>
  </div>
	<div class="top-right">
      <a href="#article">Article</a>
      <a href="#fournisseur">Fournisseur</a>
      <a href="#commande">Commande</a>
	</div>
     </nav>
</header>

<section class="article">
	<h3>Article</h3>
	
	<form>
  <div>
    <input type="radio" id="articleChoice1"
     name="contact" value="ajouter" checked>
    <label for="articleChoice1">Ajouter</label>

    <input type="radio" id="articleChoice2"
     name="contact" value="modifier">
    <label for="articleChoice2">Modifier</label>

    <input type="radio" id="articleChoice3"
     name="contact" value="supprimer">
    <label for="articleChoice3">Supprimer</label>
  </div>
  <div>
    <button type="submit">Envoyer</button>
  </div>
</form>
</section>

<br><br>

<h3>Fournisseur</h3>
<section class="fournisseur">
<form>
  <div>
    <input type="radio" id="fournisseurChoice1"
     name="contact" value="ajouter" checked>
    <label for="fournisseurChoice1">Ajouter</label>

    <input type="radio" id="fournisseurChoice2"
     name="contact" value="modifier">
    <label for="fournisseurChoice2">Modifier</label>

    <input type="radio" id="fournisseurChoice3"
     name="contact" value="supprimer">
    <label for="fournisseurChoice3">Supprimer</label>
  </div>
  <div>
    <button type="submit">Envoyer</button>
  </div>
</form>
</section>


</body>


</html>