<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle Cancion</title>
</head>
<body>

<h1>Datos de la Cancion: </h1>

 <h2> Album: ${cancionCompleta.album} </h2>
 
  <h2> Artista: ${cancionCompleta.artista} </h2> 
  
  <h2> Genero: ${cancionCompleta.genero} </h2>
  
   <h2> Idioma: ${cancionCompleta.idioma} </h2> 
   
    <h2>Titulo: ${cancionCompleta.titulo} </h2>
    
    
    <a href="/canciones">
    <button>
     Volver a Lista de Canciones 
     </button>
    
    </a> 
    
     <a href="/canciones/formulario/editar/${cancionCompleta.id}">
     
      <button>
     Editar Cancion
     </button>
      
      </a> 
      
      <form action="/canciones/eliminar/${cancionCompleta.id}" method="post">
      <input type="hidden" name="_method" value="DELETE" />
      <button>
      
      Eliminar Cancion
      
      </button>
      
      </form>
 
</body>
</html>