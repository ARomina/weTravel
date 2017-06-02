<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de viajeros</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Email</th>
				<th>Usuario</th>
				<th>Contraseña</th>
			</tr>
		</thead>
		<tbody>
			<%-- <c:forEach items=${viajeros} var="viajero">
					<td>${viajero.nombre}</td>
					<td>${viajero.apellido}</td>
					<td>${viajero.email}</td>
					<td>${viajero.usuario}</td>
					<td>${viajero.password}</td>
			</c:forEach> --%>
		</tbody>
	</table>
</body>
</html>