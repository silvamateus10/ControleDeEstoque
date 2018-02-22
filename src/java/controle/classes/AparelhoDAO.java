/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class AparelhoDAO {

    private static AparelhoDAO instance;
 
    static{
        instance = new AparelhoDAO();
    }
    
    public AparelhoDAO(){
    }
    
    public static AparelhoDAO getInstance(){
    return instance;
    }
    
    
    public void create(Aparelho a) throws SQLException{
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
       try{ 
        pstmt = conn.prepareStatement("INSERT INTO aparelho(id, nome, marca, descricao, qtde, precoCompra, precoVenda, lucro) VALUES(?,?,?,?,?,?,?,?)");
        
        pstmt.setInt(1, a.getId());
        pstmt.setString(2, a.getNome());
        pstmt.setString(3, a.getMarca());
        pstmt.setString(4, a.getDescricao());
        pstmt.setInt(5, a.getQtde());
        pstmt.setDouble(6, (a.getPrecoCompra()));
        pstmt.setDouble(7, (a.getPrecoVenda()));
        pstmt.setDouble(8, (a.getLucro()));
        
        pstmt.executeUpdate();
        conn.close();
       }catch(SQLException erro){
       erro.printStackTrace();
       }
    }
    
    
    public void update(Aparelho a) throws SQLException{
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
       try{ 
        pstmt = conn.prepareStatement("UPDATE aparelho SET "
                    + "id = ?, nome = ?, marca = ?, descricao = ?, qtde = ?, precoCompra = ?, precoVenda = ?, lucro = ?"
                     + "WHERE id = " + a.getId());
        
        pstmt.setInt(1, a.getId());
        pstmt.setString(2, a.getNome());
        pstmt.setString(3, a.getMarca());
        pstmt.setString(4, a.getDescricao());
        pstmt.setInt(5, a.getQtde());
        pstmt.setDouble(6, (a.getPrecoCompra()));
        pstmt.setDouble(7, (a.getPrecoVenda()));
        pstmt.setDouble(8, (a.getLucro()));
        
        pstmt.executeUpdate();
        conn.close();
       }catch(SQLException erro){
       erro.printStackTrace();
       } 
    }
    
    public void delete(Aparelho a) throws SQLException{
        Connection conn = Conexao.getConnection();
        try{
           Statement stmt = conn.createStatement();
           stmt.executeUpdate("DELETE FROM aparelho WHERE id = " + a.getId());
           conn.close();
        }catch(SQLException err){
        err.printStackTrace();
        }
    }
//    public Aparelho read(Aparelho a) throws SQLException{
//        Aparelho apAux = new Aparelho();
//        Connection conn = Conexao.getConnection();
//        
//        try {
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(
//                    "SELECT * FROM aparelho WHERE id = '" + a.getId() + "'");
//            if (rs.next()) {
//                apAux = carregaAparelho(a, rs);
//            } else {
//                apAux = null;
//            }
//            conn.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return apAux;
//    }
    
//       private Aparelho carregaAparelho(Aparelho a, ResultSet rs) throws SQLException {
//
//        Aparelho apAux = new Aparelho();
//        apAux.setId((rs.getInt("id")));
//        apAux.setNome(rs.getString("nome"));
//        apAux.setMarca(rs.getString("marca"));
//        apAux.setDescricao(rs.getString("descricao"));
//        apAux.setPrecoCompra((rs.getDouble("precoCompra")));
//        apAux.setPrecoVenda((rs.getDouble("precoVenda")));
//        apAux.setLucro((rs.getDouble("lucro")));
//        return apAux;
//
//    }
       
//        public void encontrar(Aparelho dado){
//        
//        PreparedStatement pstmt = null;
//
//        int updateQuery = 0;
//        
//        Connection conn = Conexao.getConnection();
//        boolean retorno = true;
//        
//        try{
//             Statement statement = conn.createStatement();
//            
//            ResultSet rs = statement.executeQuery("SELECT * FROM aparelho WHERE nome ='" + dado.getNome() + "'" );
//            
//            if(rs.next()){
//                dado.setId(rs.getInt("id"));
//                dado.setNome(rs.getString("login"));
//                dado.setMarca(rs.getString("marca"));
//                dado.setDescricao(rs.getString("descricao"));            
//                dado.setPrecoCompra(rs.getDouble("precoCompra"));
//                dado.setPrecoVenda(rs.getDouble("precoVenda"));
//                dado.setLucro(rs.getDouble("lucro"));
//            }           
//            
//            
//
//          
//            conn.close();
//            
//            
//        } catch(SQLException emf){
//            retorno = false;
//            emf.printStackTrace();
//        }       
//    }

}//fim da classe
