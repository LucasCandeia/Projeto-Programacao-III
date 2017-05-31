/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

import Repositorio.RepositorioM;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import negocio.Mulher;

/**
 *
 * @author EAD
 */
@WebServlet(name = "ServM", urlPatterns = {"/ServM"})
public class ServM extends HttpServlet {

    private Repositorio.IRepositorio repositorioMulher = new RepositorioM();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        Integer idade = Integer.parseInt(request.getParameter("idade"));
        String tipo = request.getParameter("tipo");
        String dataUltimaMes = request.getParameter("data");

        Mulher nova = new Mulher(nome, idade, tipo, dataUltimaMes);
        this.repositorioMulher.cadastrar(nova);

        HttpSession session = request.getSession();
        session.setAttribute("lista", this.repositorioMulher.listar());

        request.getRequestDispatcher("dataProxima.jsp").forward(request, response);

    }

}
