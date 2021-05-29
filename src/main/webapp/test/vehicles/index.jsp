<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<script src="https://kit.fontawesome.com/f2b6f86704.js" crossorigin="anonymous"></script>
		<link rel="stylesheet" href="index.css">

		<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

		<title>Aluguel de carros</title>
	</head>

	<body style="background-color: #000;">
		<nav class="navbar navbar-expand-lg navbar-dark" style="background-color:  #961227; padding-left: 10px;">
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
						<a class="nav-link" href="/VehicleRental/">Home</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">Veiculos</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">Usuarios</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">Responsaveis</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">Alugueis</a>
					</li>
				</ul>
			</div>
		</nav>

		<div class="container-content container">
			<div class="row" style="width: 100%; padding-left: 100px; padding-right: 100px;">
				<div class="card text-white" style="background-color: #24262D; width: 100%;">
					<div class="card-body">
						<div class="row">
							<h5 class="card-title mb-3 col-11">Veiculos</h5>
							<button class="btn btn-success buttons col-1" onclick="deleteMac({{$mac->id}}, '{{$mac->mac}}')" type="button">
								<i class="fas fa-plus"></i>
							</button>
						</div>
						<div style="background-color: #555A6A; width: 100%;">
							<table class="table table-dark">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">Placa</th>
										<th scope="col">Fabricante</th>
										<th scope="col">Modelo</th>
										<th scope="col">Ano</th>
										<th scope="col">Combust.</th>
										<th scope="col">Status</th>
										<th scope="col">Acoes</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<th scope="row">1</th>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
										<td>@mdo</td>
										<td>@mdo</td>
										<td>@mdo</td>
										<td>
											<button class="btn btn-success buttons" onclick="deleteMac({{$mac->id}}, '{{$mac->mac}}')" type="button">
												<i class="fas fa-edit"></i>
											</button>
											<button class="btn btn-danger buttons" onclick="deleteMac({{$mac->id}}, '{{$mac->mac}}')" type="button">
												<i class="fas fa-trash"></i>
											</button>
										</td>
									</tr>
									<tr>
										<th scope="row">2</th>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
										<td>@mdo</td>
										<td>@mdo</td>
										<td></td>
										<td>
											<button class="btn btn-success buttons" onclick="deleteMac({{$mac->id}}, '{{$mac->mac}}')" type="button">
												<i class="fas fa-edit"></i>
											</button>
											<button class="btn btn-danger buttons" onclick="deleteMac({{$mac->id}}, '{{$mac->mac}}')" type="button">
												<i class="fas fa-trash"></i>
											</button>
										</td>
									</tr>
									<tr>
										<th scope="row">3</th>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
										<td>@mdo</td>
										<td>@mdo</td>
										<td>@mdo</td>
										<td>
											<button class="btn btn-success buttons" onclick="deleteMac({{$mac->id}}, '{{$mac->mac}}')" type="button">
												<i class="fas fa-edit"></i>
											</button>
											<button class="btn btn-danger buttons" onclick="deleteMac({{$mac->id}}, '{{$mac->mac}}')" type="button">
												<i class="fas fa-trash"></i>
											</button>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
	<script>
	</script>

	</html>