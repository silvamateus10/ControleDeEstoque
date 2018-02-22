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
public class ListarTudoServlet extends HttpServlet {

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
//            out.println("<title>Servlet ListarTudoServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ListarTudoServlet at " + request.getContextPath() + "</h1>");
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

            ResultSet rs = statement.executeQuery("SELECT * FROM aparelho");

            String id = null, qtde = null;
            String marca = null, descricao = null, precoCompra = null, precoVenda = null, lucro = null, nome = null;

            out.print("<table border='1'>");
            out.print("<tr>");
            out.print("<th>Código</th><th>Nome</th><th>Marca</th>"
                    + "<th>Descrição</th><th>Quantidade</th>"
                    + "<th>Preço de Compra</th><th>Preço de Venda</th><th>Lucro</th>");
            out.print("</tr>");
            while (rs.next()) {

                id = Integer.toString((rs.getInt("id")));
                nome = rs.getString("nome");
                marca = rs.getString("marca");
                descricao = rs.getString("descricao");
                qtde = Integer.toString(rs.getInt("qtde"));
                precoCompra = Double.toString(rs.getDouble("precoCompra"));
                precoVenda = Double.toString(rs.getDouble("precoVenda"));
                lucro = Double.toString(rs.getDouble("lucro"));

                out.print("<tr>");
                out.print("<td>" + id + "</td><td>" + nome + "</td><td>" + marca + "</td><td>" + descricao + "</td>"
                        + "<td>" + qtde + "</td><td>" + precoCompra + "</td><td>"
                        + precoVenda + "</td><td>" + lucro + "</td>");
                out.print("</tr>");

            }
            out.print("</table>");
        } catch (SQLException ex) {
            Logger.getLogger(ListarTudoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
