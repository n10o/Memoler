<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/memoler/css/common.css">
<script src="/memoler/js/jquery-1.10.2.min.js"></script>
<title>Info Depot MyPage</title>
<meta name="description" content="マイページ">
<meta name="keywords" content="インフォ">
</head>
<body>
	<div id="wrapper">
		<header>
			Info Depot.
		</header>
		<section id="title">
			<h2>MyPage</h2>
			Welcome ${userDto.userName}. UserId:${userDto.id}.
		</section>
		
		<section id="menu">
			<ul>
				<li><a href="">マイページ</a></li>
				<li><a href="register">登録</a></li>
			</ul>
		</section>

		<section id="contents">
		<h3>情報</h3>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="infoBean" items="${infoBeanList}">
						<tr>
							<td>${f:h(infoBean.infoId)}</td>
							<td>${f:h(infoBean.infoName)}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</section>

		<s:form method="POST">
			<s:submit property="logout" value="Logout" />
		</s:form>

		<footer>
			<p>
				<div id="str">Change word Test</div>
			</p>
		</footer>
	</div>
		
<script type="text/javascript">
$(function () {
	console.log("Start");
	$("#str").text("--- Footer ---");
});
</script>
</body>
</html>