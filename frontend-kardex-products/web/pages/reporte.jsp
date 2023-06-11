<%@page import="dao.DaoReporte"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/bootstrap.css" />
        <title>Reporte</title>
    </head>
    <body>
        <form action="../ControllerKardex" method="get">


            <div class="container mt-5">
                <h1>REPORTE GENERAL DE EXISTENCIA DE PRODUCTOS</h1>

                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">DESCRIPCION</th>
                            <th scope="col">PRECIO</th>
                            <th scope="col">EXISTENCIA</th> 
                            <th scope="col">TIPO PRODUCTO</th>
                        </tr>
                    </thead>
                    <%
                        DaoReporte daoReporte = new DaoReporte();
                        List<service.ModelProducto> lstProducto = daoReporte.getReporteProductos();
                        Iterator<service.ModelProducto> iteratorProducto = lstProducto.iterator();
                        service.ModelProducto producto = null;
                        while (iteratorProducto.hasNext()) {
                            producto = iteratorProducto.next();

                    %>
                    <tbody>
                        <tr>
                            <td><%= producto.getId()%></td>
                            <td><%= producto.getDescripcion()%></td>
                            <td>Q <%= producto.getPrecio()%></td>
                            <td><%= producto.getExistencia()%></td>
                            <td><%= producto.getStrTipoProducto()%></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>

            <div class="container mt-5">
                <h1>REPORTE DE USUARIOS</h1>
                <table class="table table-striped">
                    <thead class="thead-dark">
                    <thead class="thead-dark">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">NOMBRE</th>
                            <th scope="col">USUARIO</th>
                        </tr>
                    </thead>
                    <%
                        DaoReporte daoReporte2 = new DaoReporte();
                        List<service.ModelUsuario> lstUsuario = daoReporte2.getReporteUsuarios();
                        Iterator<service.ModelUsuario> iteratorUsuario = lstUsuario.iterator();
                        service.ModelUsuario usuario = null;
                        while (iteratorUsuario.hasNext()) {
                            usuario = iteratorUsuario.next();

                    %>
                    <tbody>
                        <tr>
                            <td><%= usuario.getId()%></td>
                            <td><%= usuario.getNombre()%></td>
                            <td><%= usuario.getUsuario()%></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
                <button type="submit" name="accion" value="read" class="btn btn-primary">REGRESAR</button>
            </div>


        </form>

    </body>
</html>
