<%@page import="dao.DaoKardex"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Kardex</title>

        <link rel="stylesheet" href="css/bootstrap.css" />
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js"></script>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#modalEditar').on('shown.bs.modal', function () {
                    $('#myInput').trigger('focus');
                });
            });

        </script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#modalProducto').on('shown.bs.modal', function () {
                    $('#myInput').trigger('focus');
                });
            });

        </script>


    </head>
    <body>
        <div class="container">
            <h1 class="text-center">MANEJO KARDEX</h1>

            <form action="ControllerKardex" method="get">
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="producto">Producto:</label>
                            <select name="idProducto" class="form-control" id="producto">
                                <option value="">Producto</option>
                                <%
                                    service.WSProducto_Service serviceProducto = new service.WSProducto_Service();
                                    service.WSProducto portProducto = serviceProducto.getWSProductoPort();
                                    List<service.ModelProducto> lstProducto = portProducto.listarProductos();
                                    Iterator<service.ModelProducto> iteratorPr = lstProducto.iterator();
                                    while (iteratorPr.hasNext()) {
                                        service.ModelProducto pr = iteratorPr.next();
                                %>
                                <option value="<%=pr.getId()%>"><%=pr.getDescripcion()%></option>
                                <%
                                    }
                                %>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="cantidad">Cantidad:</label>
                            <input name="cantidad" required="" type="text" class="form-control" id="cantidad" />
                        </div>
                    </div>

                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="tipoMovimiento">Tipo Movimiento:</label>
                            <select name="idTipoMovimiento" class="form-control" id="tipoMovimiento">
                                <option value="">Entrada Inventario</option>

                                <%
                                    service.WSTipoMovimiento_Service serviceTipoMovimiento = new service.WSTipoMovimiento_Service();
                                    service.WSTipoMovimiento portTipoMovimiento = serviceTipoMovimiento.getWSTipoMovimientoPort();
                                    List<service.ModelTipoMovimiento> lstTipoMovimiento = portTipoMovimiento.listarTipoMovimiento();
                                    Iterator<service.ModelTipoMovimiento> iteratorTipoMovimiento = lstTipoMovimiento.iterator();
                                    while (iteratorTipoMovimiento.hasNext()) {
                                        service.ModelTipoMovimiento tipoMovimeinto = iteratorTipoMovimiento.next();
                                %>
                                <option value="<%=tipoMovimeinto.getId()%>"><%=tipoMovimeinto.getDescripcion()%></option>
                                <%
                                    }
                                %>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="usuario">Usuario:</label>
                            <select name="idUsuario" class="form-control" id="usuario">
                                <option value="">Usuario</option>

                                <%
                                    service.WSUsuario_Service serviceUsuario = new service.WSUsuario_Service();
                                    service.WSUsuario portUsuario = serviceUsuario.getWSUsuarioPort();
                                    List<service.ModelUsuario> lstUsuario = portUsuario.listarUsuarios();
                                    Iterator<service.ModelUsuario> iteratorUsuario = lstUsuario.iterator();
                                    while (iteratorUsuario.hasNext()) {
                                        service.ModelUsuario usuario = iteratorUsuario.next();
                                %>
                                <option value="<%=usuario.getId()%>"><%=usuario.getUsuario()%></option>
                                <%
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="comentarios">Comentarios:</label>
                            <textarea name="comentarios" required="" class="form-control" id="comentarios"></textarea>
                        </div>
                    </div>

                    <div class="col-md-6 d-flex align-items-center">
                        <div class="form-group">
                            <div class="d-inline-block"> 
                                <button type="submit" name="accion" value="create" class="btn btn-danger">Ingresar</button>
                                <a class="btn btn-warning" data-toggle="modal" data-target="#modalProducto">Registrar Producto</a> 
                                <a class="btn btn-dark" href="./pages/reporte.jsp">Reporte</a>
                            </div>
                        </div>
                    </div>
                </div>
            </form>

            <form action="ControllerKardex" method="get">
                <table class="table mt-4">
                    <thead>
                        <tr>
                            <th scope="col">No</th>
                            <th scope="col">Usuario</th>
                            <th scope="col">Producto</th>
                            <th scope="col">Tipo Movimiento</th>
                            <th scope="col">Cantidad</th>
                            <th scope="col">Existencia</th>
                            <th scope="col">Saldo</th>
                            <th scope="col">Descripcion</th>
                            <th scope="col">Fecha</th>
                            <th scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% DaoKardex daoKardex = new DaoKardex();
                            List<service.ModelKardex> lstKardex = daoKardex.getKardex();
                            int lastIndex = lstKardex.size() - 1;
                            service.ModelKardex lastKardex = lstKardex.get(lastIndex); // Obtener el último producto

                            for (int i = 0; i < lstKardex.size(); i++) {
                                service.ModelKardex kardex = lstKardex.get(i);
                        %>

                        <tr>
                            <td><%= kardex.getId()%></td>
                            <td><%= kardex.getStrUsuario()%></td>
                            <td><%= kardex.getStrProducto()%></td>
                            <td><%= kardex.getStrTipoMovimiento()%></td>
                            <td><%= kardex.getCantidad()%></td>
                            <td><%= kardex.getExistencia()%></td>
                            <td><%= kardex.getSaldo()%></td>
                            <td><%= kardex.getDescripcion()%></td>
                            <td><%= kardex.getStrFecha()%></td>

                            <td>
                                <% if (kardex.equals(lastKardex)) { %>
                                <a class="btn btn-warning" data-toggle="modal" data-target="#modalEditar">EDITAR</a> 
                                <button type="submit" name="accion" value="delete" class="btn btn-danger">ELIMINAR</button>
                                <% } %>
                            </td>
                        </tr>

                        <% }%>
                    <input hidden type="text" class="form-control" id="id" name="id" value="<%= lastIndex + 1%>">
                    </tbody>


                </table>
            </form>
            <!-- MODAL EDITAR -->
            <div class="modal fade" id="modalEditar" tabindex="-1" role="dialog" aria-labelledby="modalEditar" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="modalTitle">Actualizacion Registro <%= lastIndex + 1%></h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <form action="ControllerKardex" method="get">
                                <div class="form-group">
                                    <%
                                        int idCliente = lastIndex + 1;
                                        service.WSKardex_Service serviceKardex = new service.WSKardex_Service();
                                        service.WSKardex portKardex = serviceKardex.getWSKardexPort();
                                        service.ModelKardex kardex = portKardex.obtenerKardexID(idCliente);
                                    %>

                                    <label for="usuario">Usuario:</label>
                                    <select name="idUsuario" class="form-control" id="usuario">
                                        <%
                                            service.WSUsuario_Service serviceUsuario2 = new service.WSUsuario_Service();
                                            service.WSUsuario portUsuario2 = serviceUsuario2.getWSUsuarioPort();
                                            List<service.ModelUsuario> lstUsuario2 = portUsuario2.listarUsuarios();
                                            Iterator<service.ModelUsuario> iteratorUsuario2 = lstUsuario2.iterator();
                                            while (iteratorUsuario2.hasNext()) {
                                                service.ModelUsuario usrModel = iteratorUsuario2.next();
                                        %>
                                        <option value="<%=usrModel.getId()%>"><%=usrModel.getUsuario()%></option>
                                        <% } %>
                                    </select>
                                </div>


                                <div class="form-group">
                                    <label for="producto">Producto:</label>
                                    <select class="form-control" id="producto" name="idProducto">
                                        <%
                                            service.WSProducto_Service serviceProducto2 = new service.WSProducto_Service();
                                            service.WSProducto portProducto2 = serviceProducto2.getWSProductoPort();
                                            List<service.ModelProducto> lstProducto2 = portProducto2.listarProductos();
                                            Iterator<service.ModelProducto> iteratorProducto2 = lstProducto2.iterator();
                                            while (iteratorProducto2.hasNext()) {
                                                service.ModelProducto productoModel = iteratorProducto2.next();
                                        %>
                                        <option value="<%=productoModel.getId()%>"><%=productoModel.getDescripcion()%></option>
                                        <%  } %>
                                    </select>
                                </div>



                                <div class="form-group">
                                    <label for="tipoMovimiento">Tipo de Movimiento:</label>
                                    <select class="form-control" id="tipoMovimiento" name="idTipoMovimiento">
                                        <%
                                            service.WSTipoMovimiento_Service serviceTipoMov = new service.WSTipoMovimiento_Service();
                                            service.WSTipoMovimiento portTipoMov = serviceTipoMov.getWSTipoMovimientoPort();
                                            List<service.ModelTipoMovimiento> lstTipoMov = portTipoMov.listarTipoMovimiento();
                                            Iterator<service.ModelTipoMovimiento> iteratorTipoMov = lstTipoMov.iterator();
                                            while (iteratorTipoMov.hasNext()) {
                                                service.ModelTipoMovimiento tipoMovModel = iteratorTipoMov.next();
                                        %>
                                        <option value="<%=tipoMovModel.getId()%>"><%=tipoMovModel.getDescripcion()%></option>
                                        <%  }%>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="cantidad">Cantidad</label>
                                    <input type="text" class="form-control" id="cantidad" name="cantidad" value="<%= kardex.getCantidad()%>">
                                </div>

                                <input hidden="" type="text" class="form-control" id="id" name="id" value="<%= kardex.getId()%>">


                                <button type="submit" name="accion" value="update" class="btn btn-primary">Actualizar</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>

                            </form>
                        </div>


                    </div>
                </div>
            </div>

            <!-- MODAL PRODUCTO -->
            <div class="modal fade" id="modalProducto" tabindex="-1" role="dialog" aria-labelledby="modalProducto" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="modalTitle">Registrar Producto</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <form action="ControllerKardex" method="get">

                                <div class="form-group">
                                    <label for="descripcion">Descripcion</label>
                                    <input type="text" class="form-control" id="descripcion" name="descripcion">
                                </div>

                                <div class="form-group">
                                    <label for="precio">Precio</label>
                                    <input type="text" class="form-control" id="precio" name="precio">
                                </div>

                                <div class="form-group">
                                    <label for="existencia">Existencia</label>
                                    <input type="text" class="form-control" id="existencia" name="existencia">
                                </div>

                                <div class="form-group">
                                    <label for="categoria">Categoria</label>
                                    <select name="categoria" class="form-control" id="categoria">
                                        <%
                                            service.WSTipoProducto_Service serviceTipoProduct = new service.WSTipoProducto_Service();
                                            service.WSTipoProducto portTipoProduct = serviceTipoProduct.getWSTipoProductoPort();
                                            List<service.ModelTipoProducto> lstTipoProduct = portTipoProduct.listarTipoProducto();
                                            Iterator<service.ModelTipoProducto> iteratorTipoProduc = lstTipoProduct.iterator();
                                            while (iteratorTipoProduc.hasNext()) {
                                                service.ModelTipoProducto tipoProductModel = iteratorTipoProduc.next();
                                        %>
                                        <option value="<%=tipoProductModel.getId()%>"><%=tipoProductModel.getDescripcion()%></option>
                                        <%  }%>
                                    </select>
                                </div>


                                <input hidden="" type="text" class="form-control" id="id" name="id" value="<%= kardex.getId()%>">


                                <button type="submit" name="accion" value="registerProduct" class="btn btn-primary">Registrar</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
