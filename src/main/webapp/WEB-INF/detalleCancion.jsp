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
 <h2>${cancionCompleta.album} - ${cancionCompleta.artista} - ${cancionCompleta.genero} - ${cancionCompleta.idioma} - ${cancionCompleta.titulo}  <a href="/canciones"> Volver a Lista de Canciones </a></h2>
 
</body>
</html>