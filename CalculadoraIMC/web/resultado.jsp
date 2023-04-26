<%@page import="uninove.calculadora.Imc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    float peso = Float.parseFloat(request.getParameter("peso"));
    float altura = Float.parseFloat(request.getParameter("altura"));

    Imc imc = new Imc();
    float resultadoIMC = imc.calculaIMC(peso, altura);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora IMC</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>

        <!--área dos resultados-->
        <div class="area-principal">

            <h1>Calculadora IMC</h1>
            <hr>

            <div class="form-control">
                <p><b>Peso informado: </b> <%= String.format("%.2f", peso)%></p>
                <p><b>Altura informada: </b> <%= String.format("%.2f", altura)%></p>
                <p><b>IMC: </b><%= String.format("%.2f", resultadoIMC)%></p>
            </div>

        </div>

    </body>
</html>
