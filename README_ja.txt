
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
SAStruts の非公式の改良 Blank プロジェクトです。

このExampleには以下の特徴があります：
  o 綺麗な設定ファイルをあらかじめ (.properties, .dicon, web.xml など)
  o 実践に近い形の設定をあらかじめ (.properties, .dicon, web.xml, .settings など)
  o すぐにMaven管理にできる設定をあらかじめ (.project, .classpath など)
  o 最低限の便利クラスをあらかじめ (RequestLoggingFilter, common.jsp など)
  o Jettyの設定をあらかじめ (jetty-web.xml)

※Eclipse, Maven, Jetty を前提としたプロジェクトになっています。


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
# ----------------------------------------------------------
#                                               Import Blank
#                                               ------------
まずは、この Blank プロジェクトを Eclipse で import します。
Eclipseプロジェクトとしての設定ファイル(.project)が既に用意されているので、
"Existing Projects into Workspace" を選択して import すると良いでしょう。

# ----------------------------------------------------------
#                                           First Adjustment
#                                           ----------------
yourproject という名前の付いた部分を、ことごとく自分のプロジェクト名に直していきます。
例えば、パッケージが com.example.yourproject となっていますが、
これから作ろうとしているアプリに適したパッケージに修正します。

  o Eclipseプロジェクト名を自分のプロジェクト名に修正 (F2ボタンで名前変更できる)
  o src/main/java, src/test/java の com.example.yourproject を自分のパッケージの修正
   -> リファクタリングは alt + shift + R (alt + command + R in Mac)
   -> org.dbflute.safluteのパッケージはそのまま (便利なクラスなのでそのまま利用でOK)
  o convention.dicon のルートパッケージを自分のパッケージに修正
  o log4j.properties の domain.name, basedir, application logger などを修正
  o jetty-web.xml: コンテキスト名の修正 (自分のプロジェクト名 or アプリ名に)
  o jdbc.dicon: 利用するDMBSに該当する設定のコメントを外して、ユーザー名など修正
  o pom.xml の artifactId, groupId, name, description などを修正
  o pom.xml の dependencies をアプリに適した形に修正 (利用するDBMSのJDBCドライバなど)
  o app.dicon: もし、DBFluteを利用するなら、自動生成後に dbflute.dicon を include

<ファイルの位置がわからない場合>
Eclipse 上で ctrl + shift + R (リソースの検索) を押して、ファイル名で探すと良いでしょう。

<直していない箇所がないか不安な場合>
Eclipse 上で ctrl + shift + H を押して、"File Search" で、
yourproject とか example とかの文字列で一括検索すると良いでしょう。

# ----------------------------------------------------------
#                                             Source Compile
#                                             --------------
コンパイルは、Eclipseプラグインの M2E を利用します。
M2Eプラグインが入っている Eclipse であれば、
このプロジェクトを import すれば自動的にコンパイル環境ができあがります。
(.classpath にて既に設定されているため)

# ----------------------------------------------------------
#                                                   Database
#                                                   --------
特に Blank プロジェクトとしては何も用意していないので、
アプリで利用するDBMSをインストールし、jdbc.dicon や pom.xml に適切な設定を入れましょう。

# ----------------------------------------------------------
#                                                   Web Boot
#                                                   --------
Run Jetty Run プグラインを利用します。(Eclipse Marketplace からインストール可能)
Eclipseプロジェクトを選択して右クリックして "Run as" - "Run Jetty" を選択、
これで、以下のURLでアクセスすると画面を動かすことができます。

 http://localhost:8080/yourproject/

以降は、ツールバーの Launch ボタン (緑丸に右">"マーク) を押すだけで再起動します。
細かい起動設定は、Run as Configurations... から調整できます。

※jetty-web.xml の設定で、コンテキスト名を修正できる
