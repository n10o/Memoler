CREATE TABLE MEMBER
(
	MEMBER_ID INT NOT NULL AUTO_INCREMENT COMMENT '会員ID : 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。',
	MEMBER_NAME VARCHAR(200) NOT NULL COMMENT '会員名称 : 会員のフルネームの名称。
苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。',
	PRIMARY KEY (MEMBER_ID)
) COMMENT = '会員 : 会員のプロフィールやアカウントなどの基本情報を保持する。
基本的に物理削除はなく、退会したらステータスが退会会員になる。
ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。'; 
