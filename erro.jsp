<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Erro</title>
</head>
<body>
    <h1>Erro, o número de acesso foi excedido</h1>

    <p><%= request.getAttribute("mensagem") %></p>
</body>
</html>
