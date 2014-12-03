/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flaggame;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Chris
 */
public class GameServlet extends HttpServlet {
    private Connection conn;
    private Statement st;
    private ResultSet rs=null;
    
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
        
        Game game = new Game();
        List<String> countries = new ArrayList<String>();
        List<String> urls = new ArrayList<String>();
        String name = request.getParameter("name");

        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String connectionURL = "jdbc:derby://localhost:1527/flags";
            conn = DriverManager.getConnection(connectionURL, "test", "test");
            st = conn.createStatement();
            String q1 = new String("SELECT * FROM TEST.FLAGS ORDER BY flag_id ASC");
            rs =  st.executeQuery(q1);
            while(rs.next()){
                countries.add(rs.getString("country_name"));
                urls.add(rs.getString("url_large"));                
            }

            game.setUrls(urls);
            game.setCountries(countries);
            game.setPlayerName(name);
            game.setCurrentNumber(1);
            game.setCurrentScore(0);
            game.setTotalQuestions(2);
            
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        HttpSession session = request.getSession();
        session.setAttribute("GameBean", game);

        // forward the request (not redirect)
        RequestDispatcher dispatcher = request.getRequestDispatcher("flagGame.jsp");;
        dispatcher.forward(request, response);

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
