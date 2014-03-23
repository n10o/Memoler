<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/memoler/css/common.css">
<script src="/memoler/js/jquery-1.10.2.min.js"></script>
<title>Info Depot 登録ページ</title>
</head>
<body>
	<div id="wrapper">
	
		<header>
			Info Depot. This is header.
		</header>
		
		<section id="title">
			<h2>登録</h2>
		</section>
		
		<section id="menu">
			<ul>
				<li><a href="../">マイページ</a></li>
				<li><a href="../register">登録</a></li>
			</ul>
		</section>

		<section id="contents">
			<table>
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

		<section id="register">
			<s:form method="POST">
				<html:text property="name" value="" />
				<s:submit property="registerInfo" value="Register" />
			</s:form>
		</section>

		<s:form method="POST">
			<s:submit property="logout" value="Logout" />
		</s:form>

		<footer>
			<p>
				This is footer.
			</p>
		</footer>
	</div>
	<div id="str">Change word Test</div>
	
<script type="text/javascript">
$(function () {
	console.log("Start");
	$("#str").text("Changed");
});
</script>
</body>
</html>