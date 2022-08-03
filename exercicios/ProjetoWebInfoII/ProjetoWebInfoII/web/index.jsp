<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto Web - Informática II</title>
        <style>
            form {
                display: flex;
                flex-direction: column;
                align-items: center;
                justify-content: center;
            }
        </style>
    </head>
    <body bgcolor="#baf7e4">
        <h1 align="center">Utilizando JSP e Servlet</h1>
        <form action="#" name="jpsServlet">
            <p>
                <label for="n1">Número 1</label>
                <input type="text" name="n1" id="n1">
            </p>
            <p>
                <label for="n2">Número 2</label>
                <input type="text" name="n2" id="n2">
            </p>
            
            <p>
                <input type="submit" name="somar" value="Somar">
            </p>
            
            ${mensagem}
        </form>
    </body>
</html>
