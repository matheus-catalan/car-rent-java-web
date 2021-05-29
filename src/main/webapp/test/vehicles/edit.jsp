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
							<h5 class="card-title mb-3 col-11">Editar Veiculo</h5>
						</div>
						<div style="margin-top: 50px;">
							<form>
								  <div class="row">
								  	<div class="col">
								  		<input type="text" class="form-control col" id="placa" name="placa" placeholder="Insira a placa">
								  	</div>
								  	<div class="col">
								    	<input type="text" class="form-control col" id="ano" name="ano" placeholder="Insira o ano">
								   	</div>
								   	<div class="col">
								    	<select id="inputState" class="form-control">
        									<option selected value="G">Alugado</option>
        									<option value="F">Manutencao</option>
        									<option value="F">Disponivel</option>
      									</select>
								   	</div>
								  </div>
								  
								  <div class="row mt-4">
									<div class="col-4">
										<input type="text" class="form-control" id="model" placeholder="Insira o modelo">
									</div>
									<div class="col-4">
										<input type="text" class="form-control col" id="fabricante" name="fabricante" placeholder="Insira o fabricante">
									</div>
									<div class="col-4">
										<select id="inputState" class="form-control">
        									<option selected value="G">Gasolina</option>
        									<option value="F">Alcool</option>
        									<option value="F">Flex</option>
      									</select>
									</div>
								</div>
								<div class="row" style="margin-top: 50px;">
									<button type="button" class="btn btn-success" style="width: 150px; margin-left: 12px; margin-right: 15px;">Salvar</button>
									<button type="button" class="btn btn-secondary" style="width: 150px;">Cancelar</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
	<script>
	</script>

	</html>