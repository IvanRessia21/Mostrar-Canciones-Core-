<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Editar Cancion </title>
</head>
<body>
   <form:form  action="/canciones/procesa/editar/${cancion.id }" method="POST" modelAttribute="cancion">
          <input type="hidden" name="_method" value="PUT"/>
             <div>
                 
                  <form:label path="titulo" for="titulo">
                   Titulo:
                  </form:label >
                  
                  <form:input path="titulo" type="text" id="titulo" name="titulo" value="${cancion.titulo}"/>
                  <form:errors path="titulo"/>
         
            </div>
            
            
             <div>
                  <form:label path="artista" for="artista">
                   Artista:
                  </form:label >
                  
                  <form:input path="artista" type="text" id="artista" name="artista" value="${cancion.artista}"/>
                  <form:errors path="artista"/>
         
            </div>
            
            
             <div>
                  <form:label path="album" for="album">
                   Album:
                  </form:label >
                  
                  <form:input path="album" type="text" id="album" name="album" value="${cancion.album}"/>
                  <form:errors path="album"/>
         
            </div>
            
            
             <div>
                  <form:label path="genero" for="genero">
                   Genero:
                  </form:label >
                  
                  <form:input path="genero" type="text" id="genero" name="genero" value="${cancion.genero}"/>
                  <form:errors path="genero"/>
         
            </div>
            
            
             <div>
                  <form:label path="idioma" for="idioma">
                   Idioma:
                  </form:label >
                  
                  <form:input path="idioma" type="text" id="idioma" name="idioma" value="${cancion.idioma}"/>
                  <form:errors path="idioma"/>
         
            </div>
            
            <button>
             Editar
            </button>
            
            <a href="/canciones" >
       <button >
          Volver a la lista de canciones
       </button>
       </a>
    
         
 </form:form>

</body>
</html>