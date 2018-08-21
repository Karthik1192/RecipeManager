<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>RecipeManager Form</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/recipeManager/saveRecipeManager" var="saveURL" />
  <h2>Add Recipe</h2>
  <form:form modelAttribute="recipeManagerForm" method="post" action="${saveURL }" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Recipe Name</label>
    <form:input path="name" cssClass="form-control" id="name" />
   </div>
   <div class="form-group">
    <label>Ingredient 1</label>
    <form:input path="ing1" cssClass="form-control" id="ing1" />
   </div>
   <div class="form-group">
    <label>Ingredient 2</label>
    <form:input path="ing2" cssClass="form-control" id="ing2" />
   </div>
   <div class="form-group">
    <label>Ingredient 3</label>
    <form:input path="ing3" cssClass="form-control" id="ing3" />
   </div>
   <div class="form-group">
    <label>Ingredient 4</label>
    <form:input path="ing4" cssClass="form-control" id="ing4" />
   </div>
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
  
 </div>
</body>
</html>