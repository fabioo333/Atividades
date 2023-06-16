<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Página de Sucesso</title>
</head>
<body>
    <h1>Informações Salvas com Sucesso!</h1>

    <h2>Informações de Login:</h2>
    <p>Login: <%= session.getAttribute("login") %></p>

    <h2>Informações Pessoais:</h2>
    <p>Nome: <%= session.getAttribute("nome") %></p>

    <h2>Informações Acadêmicas:</h2>
    <p>Instituição: <%= session.getAttribute("instituicao") %></p>

    <h2>Informações Profissionais:</h2>
    <p>Cargo: <%= session.getAttribute("cargo") %></p>

    <h2>Informações da Sessão:</h2>
    <p>ID da Sessão: <%= session.getId() %></p>
    <p>Tempo de Inatividade (em segundos): <%= session.getMaxInactiveInterval() %></p>
</body>
</html>
