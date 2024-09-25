<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>BeingTech - Home</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="style.css" rel="stylesheet" type="text/css" />
<!-- Font Awesome 4 CDN -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
<script src="JavaScript/big.js" type="text/javascript"></script>



</head>
<body>
	<!-- Navbar -->
	<%@include file="navbar.jsp"%>
	<!-- Navbar End -->

	<!-- Banner -->
	<!-- Banner -->
	<div class="container-fluid p-0 m-0 mb-8">
		<div class="jumbotron text-white" style="background-color: #009bff;">
			<div class="container text-center">
				<h3 class="display-3">Welcome to BeingTech</h3>
				<p>Welcome to our technical blog, the world of technology. A
					programming language is a formal language that comprises a set of
					instructions producing various kinds of output.</p>
				<p>Most programming languages consist of instructions for
					computers. There are programmable machines that use a specific set
					of instructions instead of general programming languages.</p>
				<button class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-plus"></span> Start! It's Free
				</button>
				<a href="login_page.jsp" class="btn btn-outline-light btn-lg"> <span
					class="fa fa-user-circle fa-spin"></span> Login
				</a>
			</div>
		</div>
		<!-- Wavy Effect -->
		<div class="wave"></div>
	</div>
	<!-- Banner End -->

	<style>
.jumbotron {
	position: relative;
	overflow: hidden;
	padding-bottom: 60px; /* Add padding for the wavy effect */
}

.wave {
	position: relative;
	height: 60px; /* Height of the wave */
	background: #d9940c; /* Wave color */
	clip-path: polygon(0 100%, 50% 0%, 100% 100%);
	/* Create a wave shape */
}

/* Optional styling for the button hover effects */
.btn-outline-light {
	transition: background-color 0.3s, color 0.3s;
}

.btn-outline-light:hover {
	background-color: #fff;
	color: #009bff;
}
</style>


	<!-- Banner End -->


	<!-- card -->

	<div class="container my-5 ">
		<div class="row">

			<div class="col-md-4">
				<div class="card card-custom">
					<div class="card-header text-center">
						<h4>Card Title</h4>
					</div>
					<div class="card-body">
						<h5 class="card-title">Card Subtitle</h5>
						<p class="card-text">This is a beautiful card design using the
							specified color combinations. You can add more details here to
							make it informative and appealing.</p>
						<a href="#" class="btn btn-custom">Learn More</a>
					</div>
					<div class="card-footer text-center">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>
			</div>


			<div class="col-md-4">
				<div class="card card-custom">
					<div class="card-header text-center">
						<h4>Card Title</h4>
					</div>
					<div class="card-body">
						<h5 class="card-title">Card Subtitle</h5>
						<p class="card-text">This is a beautiful card design using the
							specified color combinations. You can add more details here to
							make it informative and appealing.</p>
						<a href="#" class="btn btn-custom">Learn More</a>
					</div>
					<div class="card-footer text-center">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>
			</div>


			<div class="col-md-4">
				<div class="card card-custom">
					<div class="card-header text-center">
						<h4>Card Title</h4>
					</div>
					<div class="card-body">
						<h5 class="card-title">Card Subtitle</h5>
						<p class="card-text">This is a beautiful card design using the
							specified color combinations. You can add more details here to
							make it informative and appealing.</p>
						<a href="#" class="btn btn-custom">Learn More</a>
					</div>
					<div class="card-footer text-center">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>
			</div>

		</div>
	</div>


	<!-- card end -->
	<!-- Bootstrap JS and Popper.js (required for Bootstrap's JS plugins) -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"></script>
	<!-- jQuery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

	<!-- Custom jQuery Script -->
	<script>
		// Your custom jQuery code can go here
	</script>
</body>
</html>
