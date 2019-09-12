<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Xero Integration</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" />
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.7.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">

		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<div class="row">

			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Xero Integration</h3>
					</div>
					<div class="panel-body">
						<form action="api/controller/createNewInvoice" method="post" name="form" role="form">
							<fieldset>
								
								<!-- Change this to a button or input when using this as a form -->
								<!-- Change this to a button or input when using this as a form -->
								<a href="/xero_integration/api/controller/getToken"> Connect to Xero</a>
								<br>								
								<a href="/xero_integration/api/controller/createNewInvoice"> New Invoice to Xero</a>
								<br>
								<a href="/xero_integration/api/controller/getPayments"> Get all Payments</a>
								<br>
								<a href="/xero_integration/api/controller/getPaymentDateRange"> Get Payments Date Range</a>						
								<br>
								<a href="/xero_integration/api/controller/deleteInvoice"> Delete Invoice</a>
								

								<br>
								<div class="row">
									<div class="col-md-12">
										<div id="messages">
											<c:if test="${not empty error}">
												<div class="alert alert-danger">
													<a href="#" class="close" data-dismiss="alert"
														aria-label="close"><i
														class="glyphicon glyphicon-remove"></i></a><strong>Alerta:&nbsp;</strong>${error}
												</div>
											</c:if>
										</div>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>