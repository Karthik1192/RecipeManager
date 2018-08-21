<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Recipe Manager</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <h2>Recipe Manager</h2>
  <table class="table table-striped">
   <thead>
    <th scope="row">#ID</th>
    <th scope="row">Recipe Name</th>
    <th scope="row">Ingredient 1</th>
    <th scope="row">Ingredient 2</th>
    <th scope="row">Ingredient 3</th>
    <th scope="row">Ingredient 4</th>
    <th scope="row">Update</th>
   </thead>
   <tbody>
    <c:forEach items="${recipeManagerList }" var="recipeManager" >
     <tr>
      <td>${recipeManager.id }</td>
      <td>${recipeManager.name }</td>
      <td>${recipeManager.ing1 }</td>
      <td>${recipeManager.ing2 }</td>
      <td>${recipeManager.ing3 }</td>
      <td>${recipeManager.ing4 }</td>
      <td>
       <spring:url value="/recipeManager/updateRecipeManager/${recipeManager.id }" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/recipeManager/addRecipeManager/" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New Recipe</a>
 </div>
</body>
</html>