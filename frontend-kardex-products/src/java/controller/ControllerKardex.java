package controller;

import dao.DaoKardex;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.WSProducto_Service;

/**
 *
 * @author josueemilian
 */
public class ControllerKardex extends HttpServlet {

    String listar = "index.jsp";


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String acceso = "";
        String action = request.getParameter("accion");

        //Instancia del WS KARDEX
        service.WSKardex_Service serviceKardex = new service.WSKardex_Service();
        service.WSKardex portKardex = serviceKardex.getWSKardexPort();

        //Instancia del WS PRODUCTO
        service.WSProducto_Service serviceProducto = new WSProducto_Service();
        service.WSProducto portProducto = serviceProducto.getWSProductoPort();

        switch (action) {
            case "read":
                acceso = listar;
                break;
                
            case "registerProduct":
                String descripcion = request.getParameter("descripcion");
                double precio = Double.parseDouble(request.getParameter("precio"));
                int existencia = Integer.parseInt(request.getParameter("existencia"));
                int categoria = Integer.parseInt(request.getParameter("categoria"));

                portProducto.registrarProducto(descripcion, precio, existencia, categoria);
                acceso = listar;
                break;

            case "create":
                int idProducto = Integer.parseInt(request.getParameter("idProducto"));
                int idTipoMovimiento = Integer.parseInt(request.getParameter("idTipoMovimiento"));
                int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
                int cantidad = Integer.parseInt(request.getParameter("cantidad"));
                String comentarios = request.getParameter("comentarios");

                //Llamamos al metodo
                portKardex.registrarTransaccion(idUsuario, idProducto, idTipoMovimiento, cantidad, comentarios);

                acceso = listar;
                break;

            case "update":
                int id = Integer.parseInt(request.getParameter("id"));
                idProducto = Integer.parseInt(request.getParameter("idProducto"));
                idTipoMovimiento = Integer.parseInt(request.getParameter("idTipoMovimiento"));
                idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
                cantidad = Integer.parseInt(request.getParameter("cantidad"));

                portKardex.actualizarKardex(id, idUsuario, idProducto, idTipoMovimiento, cantidad);

                acceso = listar;
                break;

            case "delete":
                id = Integer.parseInt(request.getParameter("id"));
                portKardex.eliminarUltimoRegistro(id);
                acceso = listar;
                break;

        }

        response.sendRedirect(acceso);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
