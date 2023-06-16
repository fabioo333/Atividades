<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulário de Cadastro</title>
</head>
<body>
    <h1>Formulário de Cadastro</h1>
    <form action="SalvarInformacoesServlet" method="POST">
        <h2>Informações de Login:</h2>
        <label>Login:</label>
        <input type="text" name="login"><br><br>

        <h2>Informações Pessoais:</h2>
        <label>Nome:</label>
        <input type="text" name="nome"><br><br>

        <h2>Informações Acadêmicas:</h2>
        <label>Instituição:</label>
        <input type="text" name="instituicao"><br><br>

        <h2>Informações Profissionais:</h2>
        <label>Cargo:</label>
        <input type="text" name="cargo"><br><br>

        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>
