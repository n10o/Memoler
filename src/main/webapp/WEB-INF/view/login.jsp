<!DOCTYPE html>
<html lang="ja">
<body>

<h2>LoginPage</h2>
<html:errors/>
<s:form method="POST">
	<html:text property="name" value="" />
	<%-- placeholderはデフォルトだと使えない。safluteはうまく使えるように設定してくれていたのか->taglibをカスタマイズすればよい --%>
	<html:text property="password" value="" />
	<s:submit property="signin" value="SignIn" />
</s:form>

<s:form method="POST">
	<html:text property="name" value="" />
	<html:text property="password" value="" />	
	<s:submit property="signup" value="SignUp" />
</s:form>

</body>
</html>