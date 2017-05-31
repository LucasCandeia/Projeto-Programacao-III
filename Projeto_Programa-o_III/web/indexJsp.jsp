<%-- 
    Document   : indexJsp
    Created on : 19/05/2017, 21:26:17
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css" />
        <title>Cadastro</title>
    </head>
    <body>
        <div id="conteiner">
            <a href="indexJsp.jsp"><img src="imagens/cab.jpg" height="100" width="755"></a>
            <h1 align="center">Cadastro</h1>
            <form  action="ServM" method="POST" align="center">
               
                    
                        Nome:
                        <input class="float" type="text" name="nome"/><br><br>
                   
                     Idade:
                     <input class="float2" type="number" name="idade" max="120" min="1"/><br><br>
                   
                    Tipo de ciclo:
                        
                            <select class="float3" name="tipo">
                                <option value="Normal">Normal</option>
                                <option value="Irregular">Irregular</option>
                            </select>
                    <br><br>
                      Data da ultima mestruação:
                      <input class="float4" type="date" name="data"/><br>
                  

               
                      <br><input class="gravar" type="submit" value="Gravar"/>
            </form>
            <form action="result.jsp" align="center">
                <input class="botao" type="submit" value="Resultados" />
            </form>
            <footer><br><br>Desenvolveldores: José Hilton, Lucas Candeia, Julio Cesar, Luis Antônio e Dioclecio Amoroso.</footer>

        </div>

    </body>
</html>
