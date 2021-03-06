<%-- 
    Document   : tkb
    Created on : Nov 5, 2018, 3:45:35 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>TKB</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<link rel="stylesheet" href="./css/tkb.css">
	<link rel="stylesheet" href="./css/index.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<header class="blog-header py-3">
			<div class="row flex-nowrap justify-content-between align-items-center">
				<div class="col-4 pt-1">
					<a class="text-muted" href="#">Subscribe</a>
				</div>
				<div class="col-4 text-center">
					<a class="blog-header-logo text-dark" href="index.html">PTIT</a>
				</div>
				<div class="col-4 d-flex justify-content-end align-items-center">
					<a class="text-muted" href="#">
						<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="mx-3"><circle cx="10.5" cy="10.5" r="7.5"></circle><line x1="21" y1="21" x2="15.8" y2="15.8"></line></svg>
					</a>
					<a class="btn btn-sm btn-outline-secondary" href="login.html">Đăng nhập</a>
				</div>
			</div>
		</header>

		<!-- navbar -->
		<div class="nav-scroller py-1 mb-2">
			<nav class="nav d-flex justify-content-between">
				<a class="p-2 text-muted" href="index.html">Trang chủ</a>
				<a class="p-2 text-muted" href="tkb.html">Xem TKB</a>
				<a class="p-2 text-muted" href="lichthi.html">Xem lịch thi</a>
				<a class="p-2 text-muted" href="Diem.html">Xem điểm</a>
				<a class="p-2 text-muted" href="hocphi.html">Học phí</a>
				<a class="p-2 text-muted" href="tailieu.html">Đề thi</a>
				<a class="p-2 text-muted" href="bikip.html">Bí kíp qua môn</a>
				<a class="p-2 text-muted" href="suaTT.html">Sửa TT cá nhân</a>
				<a class="p-2 text-muted" href="lienhe.html">Liên hệ</a>
			</nav>
		</div>
		<!-- end navbar -->
		
		<div class="jumbotron">
			<h2 class="dark">Thời khóa biểu</h2>
			<div class="dropdown">
				<button type="button" class="btn btn-outline-secondary dropdown-toggle" data-toggle="dropdown">Chọn tuần</button>
				<div class="dropdown-menu">
				    <a class="dropdown-item" href="#">Tuần 1</a>
				    <a class="dropdown-item" href="#">Tuần 2</a>
				    <a class="dropdown-item" href="#">Tuần 3</a>
				</div>
			</div>
			<div class="this-week float-right">
				<p>Tuần 1 [15/08/2018 -> 23/08/2018]</p>
			</div>

			<table class="table table-bordered mt-3">
				<thead class="thead-dark">
					<tr>
						<th>Kíp</th>
						<th>Thứ 2</th>
						<th>Thứ 3</th>
						<th>Thứ 4</th>
						<th>Thứ 5</th>
						<th>Thứ 6</th>
						<th>Thứ 7</th>
						<th>Giờ</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Kíp 1</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>7h -> 9h</td>
					</tr>
					<tr>
						<td>Kíp 2</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>9h -> 11h</td>
					</tr>
					<tr>
						<td>Kíp 3</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>12h -> 14h</td>
					</tr>
					<tr>
						<td>Kíp 4</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>14h -> 16h</td>
					</tr>
					<tr>
						<td>Kíp 5</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>16h -> 18h</td>
					</tr>
					<tr>
						<td>Kíp 6</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>18h -> 20h</td>
					</tr>
				</tbody>
			</table>
			<button type="button" class="btn btn-success">Cập nhật lịch thực hành</button>
		</div>
	</div>
	
	<footer class="blog-footer">
		<p>Trang web xây dựng cho <a href="tacgia.html">Sinh viên PTIT </a> bởi <a href="#"> Sinh viên PTIT</a>.</p>
		<p>
			<a href="#">Back to top</a>
		</p>
	</footer>
</body>
</html>