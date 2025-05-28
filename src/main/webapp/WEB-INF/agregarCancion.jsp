<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FormularioAgregarCancion </title>
</head>
<body>
   <form:form  action="/canciones/procesa/agregar" method="POST" modelAttribute="cancion">
   
             <div>
                  <form:label path="titulo" for="titulo">
                   Titulo:
                  </form:label >
                  
                  <form:input path="titulo" type="text" id="titulo" name="titulo"/>
                  <form:errors path="titulo"/>
         
            </div>
            
            
             <div>
                  <form:label path="artista" for="artista">
                   Artista:
                  </form:label >
                  
                  <form:input path="artista" type="text" id="artista" name="artista"/>
                  <form:errors path="artista"/>
         
            </div>
            
            
             <div>
                  <form:label path="album" for="album">
                   Album:
                  </form:label >
                  
                  <form:input path="album" type="text" id="album" name="album"/>
                  <form:errors path="album"/>
         
            </div>
            
            
             <div>
                  <form:label path="genero" for="genero">
                   Genero:
                  </form:label >
                  
                  <form:input path="genero" type="text" id="genero" name="genero"/>
                  <form:errors path="genero"/>
         
            </div>
            
            
             <div>
                  <form:label path="idioma" for="idioma">
                   Idioma:
                  </form:label >
                  
                  <form:input path="idioma" type="text" id="idioma" name="idioma"/>
                  <form:errors path="idioma"/>
         
            </div>
            
            <button>
             Agregar
            </button>
         
 </form:form>

</body>
</html>