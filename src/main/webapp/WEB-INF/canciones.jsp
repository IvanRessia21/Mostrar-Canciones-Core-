<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Canciones</title>
</head>
<body>
      <table>
       <thead>
             <tr>
             
             <th>Titulo </th>
             <th>Artista</th>
             <th>Detalle</th>
             
             
             </tr>
        </thead>
      
        <tbody>
        
         <c:forEach  var="cancion"  items="${listaCanciones}">
           
           <tr>
         
           <td> ${cancion.titulo} </td>
           
           <td> ${cancion.artista} </td>
    
           <td> <a href="/canciones/detalle/${cancion.id}" > Detalle</a> </td> 
          
          
             </tr>
      </c:forEach>
       
        
        </tbody>
      </table>
   
              <a href="/canciones/formulario" >
       <button >
          Agregar Cancion
       </button>
       </a>
     
      
   
    
   

</body>
</html>