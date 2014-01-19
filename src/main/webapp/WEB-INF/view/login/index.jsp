<!DOCTYPE html>
<html lang="ja">
<body>

<h2>Mypage</h2>
Welcome ${userDto.userName}.
user id is ${userDto.id}.

<s:form method="POST">
	<html:text property="name" value="" />
	<s:submit property="registerInfo" value="Register" />
</s:form>

<c:forEach var="infoBean" items="${infoBeanList}">
	${f:h(infoBean.infoName)}
		${f:h(infoBean.infoId)}
</c:forEach>


<s:form method="POST">
<s:submit property="logout" value="Logout" />
</s:form>


</body>
</html>