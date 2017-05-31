<%-- 
    Document   : result
    Created on : 18/05/2017, 16:50:31
    Author     : EAD
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="negocio.Mulher"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css" />
        <title>Resultados</title>
    </head>
    <body>
        <div id="conteiner">
            <a href="indexJsp.jsp"><img src="imagens/cab.jpg" height="100" width="755"></a>
            <h1 align="center">Resultados</h1>
            <form>
                <table align="center" border="1px" width="95%">
                    <tr>
                        <th>Nome</th>
                        <th>Idade</th>
                        <th>Tipo de ciclo</th>
                        <th>Data da ultima menstruação</th>
                        <th>Data da proxima menstruação</th>
                    </tr>
                    <%
                        ArrayList<Mulher> mulheres = (ArrayList<Mulher>) request.getSession().getAttribute("lista");
                        for (int i = 0; i < mulheres.size(); i++) {
                    %>
                    <tr>
                        <th><%=mulheres.get(i).getNome()%></th>
                        <th><%=mulheres.get(i).getIdade()%></th>
                        <th><%=mulheres.get(i).getTipo()%></th>
                        <th><%=mulheres.get(i).getData()%></th>
                        <th><%=mulheres.get(i).getProxima()%></th>


                    </tr>
                    <%
                        }
                    %>
                </table>
                <br> 
            </form>
                <center><input type="button" value="Voltar" onClick="history.go(-1)"></center>
            <footer><br><br>Desenvolveldores: José Hilton, Lucas Candeia, Julio Cesar, Luis Antônio e Dioclecio Amoroso.</footer>

        </div>
    </body>
</html>
