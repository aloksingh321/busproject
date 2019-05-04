/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Detail;
import Model.DetailDao;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author ALOK SINGH
 */
public class Display extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
  List<Detail> list=DetailDao.get();  
out.print("<center>");  
out.print("<h1 Style=color:white><center>All Details of Buses Route</center></h1>");

out.print("<table border='1' cellpadding='6' width='60%' style=background-color:black >");  
out.print("<tr><<th style=color:blue>BusNo</th><th style=color:orange>DriverName</th><th style=color:green>LicenseNo</th><th style=color:yellow>Detail</th><th style=color:red>MobileNo</th>");  
list.forEach((e) -> {  
    out.print("<tr>"
            + "<td style=color:white>"+e.getBusno()+"</td> "
                    + " <td style=color:white>"+e.getDriverName()+"</td>"
                            + "<td style=color:white>"+e.getLicenseNo()+"</td>"
                                    + "<td style=color:white>"+e.getRouteDetail()+"</td>"
                                            + "<td style=color:white>"+e.getMobileNo()+"</td></tr>");
            });  
out.print("</table>");
out.print("</center>"); 
        }        

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
