package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import negocio.Mulher;

public final class dataProxima_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\" />\n");
      out.write("        <title>Cadastro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"conteiner\">\n");
      out.write("            <a href=\"indexJsp.jsp\"><img src=\"imagens/cab.jpg\" height=\"100\" width=\"755\"></a>\n");
      out.write("            <h1 align=\"center\">Data da proxima mestruação</h1>\n");
      out.write("            ");

                ArrayList<Mulher> lista = (ArrayList<Mulher>) request.getSession().getAttribute("lista");
                int ultimo = lista.size();
                Mulher m = lista.get(ultimo - 1);

            
      out.write("\n");
      out.write("\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nome: </td>\n");
      out.write("                    <td>");
      out.print(m.getNome());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Idade </td>\n");
      out.write("                    <td>");
      out.print(m.getIdade());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tipo de ciclo </td>\n");
      out.write("                    <td>");
      out.print(m.getTipo());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Data da proxima mestruação: </td>\n");
      out.write("                    <td>");
      out.print(m.getProxima());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br><br><br><br>\n");
      out.write("            <input type=\"button\" value=\"Ok\" onClick=\"history.go(-1)\">\n");
      out.write("\n");
      out.write("            <SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("                function impriCalen(variavel) {\n");
      out.write("                    var day_of_week = new Array('Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab');\n");
      out.write("                    var month_of_year = new Array('Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro');\n");
      out.write("\n");
      out.write("                    var Calendar = new Date(variavel);\n");
      out.write("\n");
      out.write("                    var year = Calendar.getYear();       // Retorna o ano\n");
      out.write("                    var month = Calendar.getMonth();    // Retorna mes (0-11)\n");
      out.write("                    var today = Calendar.getDate();     // Retorna dias (1-31)\n");
      out.write("                    var weekday = Calendar.getDay();   // Retorna dias (1-31)\n");
      out.write("\n");
      out.write("                    var DAYS_OF_WEEK = 7;    // \"constant\" para o numero de dias na semana\n");
      out.write("                    var DAYS_OF_MONTH = 31;    // \"constant\" para o numero de dias no mes\n");
      out.write("                    var cal;    // Usado para imprimir na tela\n");
      out.write("\n");
      out.write("                    Calendar.setDate(1);    // Comecar o calendario no dia '1'\n");
      out.write("                    Calendar.setMonth(month);    // Comecar o calendario com o mes atual\n");
      out.write("\n");
      out.write("\n");
      out.write("                    var TR_start = '<TR>';\n");
      out.write("                    var TR_end = '</TR>';\n");
      out.write("                    var highlight_start = '<TD WIDTH=\"30\"><TABLE CELLSPACING=0 BORDER=1 BGCOLOR=DEDEFF BORDERCOLOR=CCCCCC><TR><TD WIDTH=20><B><CENTER>';\n");
      out.write("                    var highlight_end = '</CENTER></TD></TR></TABLE></B>';\n");
      out.write("                    var TD_start = '<TD WIDTH=\"30\"><CENTER>';\n");
      out.write("                    var TD_end = '</CENTER></TD>';\n");
      out.write("\n");
      out.write("                    cal = '<TABLE BORDER=1 CELLSPACING=0 CELLPADDING=0 BORDERCOLOR=BBBBBB><TR><TD>';\n");
      out.write("                    cal += '<TABLE BORDER=0 CELLSPACING=0 CELLPADDING=2>' + TR_start;\n");
      out.write("                    cal += '<TD COLSPAN=\"' + DAYS_OF_WEEK + '\" BGCOLOR=\"#EFEFEF\"><CENTER><B>';\n");
      out.write("                    cal += month_of_year[month] + '   ' + year + '</B>' + TD_end + TR_end;\n");
      out.write("                    cal += TR_start;\n");
      out.write("\n");
      out.write("                    for (index = 0; index < DAYS_OF_WEEK; index++)\n");
      out.write("                    {\n");
      out.write("\n");
      out.write("                        if (weekday == index)\n");
      out.write("                            cal += TD_start + '<B>' + day_of_week[index] + '</B>' + TD_end;\n");
      out.write("                        else\n");
      out.write("                            cal += TD_start + day_of_week[index] + TD_end;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    cal += TD_end + TR_end;\n");
      out.write("                    cal += TR_start;\n");
      out.write("\n");
      out.write("                    for (index = 0; index < Calendar.getDay(); index++)\n");
      out.write("                        cal += TD_start + '  ' + TD_end;\n");
      out.write("\n");
      out.write("                    for (index = 0; index < DAYS_OF_MONTH; index++)\n");
      out.write("                    {\n");
      out.write("                        if (Calendar.getDate() > index)\n");
      out.write("                        {\n");
      out.write("                            week_day = Calendar.getDay();\n");
      out.write("                            if (week_day == 0)\n");
      out.write("                                cal += TR_start;\n");
      out.write("                            if (week_day != DAYS_OF_WEEK)\n");
      out.write("                            {\n");
      out.write("                                var day = Calendar.getDate();\n");
      out.write("                                if (today == Calendar.getDate())\n");
      out.write("                                    cal += highlight_start + day + highlight_end + TD_end;\n");
      out.write("                                else\n");
      out.write("                                    cal += TD_start + day + TD_end;\n");
      out.write("                            }\n");
      out.write("                            if (week_day == DAYS_OF_WEEK)\n");
      out.write("                                cal += TR_end;\n");
      out.write("                        }\n");
      out.write("                        Calendar.setDate(Calendar.getDate() + 1);\n");
      out.write("                    }\n");
      out.write("                    cal += '</TD></TR></TABLE></TABLE>';\n");
      out.write("\n");
      out.write("//  MOSTRAR CALENDARIO\n");
      out.write("                    document.write(cal);\n");
      out.write("//  End -->\n");
      out.write("                }\n");
      out.write("            </SCRIPT>\n");
      out.write("            <footer><br><br>Desenvolveldores: José Hilton, Lucas Candeia, Julio Cesar, Luis Antônio e Dioclecio Amoroso.</footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
