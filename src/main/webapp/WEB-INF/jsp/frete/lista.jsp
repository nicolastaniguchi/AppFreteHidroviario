<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Lista - Fretes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/frete" method="get">
			<h3>Lista - Fretes</h3>

			<c:if test="${not empty mensagem}">
				<div class="alert alert-success">
					<strong>Aten��o!</strong> ${mensagem}
				</div>
			</c:if>

		</form>

		<c:if test="${empty frete}">
			<h4>N�o existem fretes cadastrados!</h4>
		</c:if>

		<c:if test="${not empty frete}">
			<h4>Quantidade de fretes cadastrados: ${frete.size()}</h4>


			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Descricao</th>
						<th>Data</th>
						<th>Cliente</th>
						<th>Embarcacoes</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="f" items="${frete}">
						<tr>
							<td>${f.id}</td>
							<td>${f.descricao}</td>
							<td>${f.data}</td>
							<td>${f.cliente.nome}</td>
							<td>${f.embarcacoes.size()}</td>
							<td><a href="/frete/${f.id}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<form action="/frete" method="get">
			<button type="submit">Novo Cadastro</button>
		</form>

	</div>

</body>
</html>