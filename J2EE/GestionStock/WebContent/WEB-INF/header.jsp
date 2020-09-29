<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <header>
      
    <nav>
	<div class="top-left">
      <a href="index.html">Home</a>
         <c:if home="${ !empty sessionScope.id }">
        <p> ${ sessionScope.id }</p>
    </c:if>
  </div>
	<div class="top-right">
      <a href="#">Connection</a>
      <a href="#">Deconnection</a>
	</div>
     </nav>

     <h1><em>Gestion de Stock</em></h1>

   </header>    