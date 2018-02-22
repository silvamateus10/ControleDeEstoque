/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.servlet;

import controle.classes.Conexao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mateus
 */
public class ListarMsgServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ListarMsgServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ListarMsgServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        Connection conn = Conexao.getConnection();

        PreparedStatement pstmt = null;
        boolean retorno = true;
        try {

            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM formulario");

            
            String id = null, assunto = null, email = null, nome = null, telefone = null, mensagem = null;

            out.print("<table border='1'>");
            out.print("<tr>");
            out.print("<th>Código</th><th>Assunto</th><th>E-mail</th>"
                    + "<th>Nome</th><th>telefone</th>"
                    + "<th>Mensagem</th>");
            out.print("</tr>");
            while (rs.next()) {

                id = Integer.toString((rs.getInt("id")));
                assunto = rs.getString("assunto");
                email = rs.getString("email");
                nome = rs.getString("nome");
                telefone = rs.getString("telefone");
                mensagem = rs.getString("mensagem");
                
                out.print("<tr>");
                out.print("<td>" + id + "</td><td>" + assunto + "</td><td>" + email + "</td><td>" + nome + "</td>"
                        + "<td>" + telefone + "</td><td>" + mensagem + "</td>");
                out.print("</tr>");

            }
            out.print("</table>");
        } catch (SQLException ex) {
            Logger.getLogger(ListarMsgServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
