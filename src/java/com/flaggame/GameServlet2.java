/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flaggame;

import java.io.IOException;
import java.io.PrintWriter;
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
public class GameServlet2 extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        Game g = (Game)session.getAttribute("GameBean");
        
        String answer = request.getParameter("country");
        
        String trimAnswer = answer.trim().toLowerCase();
        String currentCountry = g.getCountries().get(g.getCurrentNumber()-1).toLowerCase();

        if(trimAnswer.equals(currentCountry)){  //Answer is correct
            g.setCurrentScore(g.getCurrentScore()+1);
            g.setCorrect(true);
        }
        else{
            g.setCorrect(false);
        }
        g.setCurrentNumber(g.getCurrentNumber()+1);

        RequestDispatcher dispatcher;
        
        if(g.getCurrentNumber() > g.getTotalQuestions()){
            dispatcher = request.getRequestDispatcher("gameOver.jsp");
            dispatcher.forward(request, response);
        }
        dispatcher = request.getRequestDispatcher("flagGame.jsp");
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
