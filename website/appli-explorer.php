<?php
	$title = "Explorer...";
	include "include/init.php";
	include "include/header.php";

	echo block_begin( "Applications...", 500 );
?>
<p>
The explorer. The explorer is a very simple file explorer
(on Mac, it is known as Finder). During the run of the application,
do not expect to see changes: it is a very simple application
as an example of what you can do with the application. 
</p>


<p>
	<a href="/bin/explorer.jnlp">Click here to start the application</a>
	(you need to have JAVA installed on your machine, if not, you can
	download it at: 
	<a href="http://www.java.com/">http://www.java.com/</a>.
</p>

<p>
	<b>NOTE: we don't use authenticated certificates. You must accept
	the certificates of the JAR file to be able to run the example.</b>
	
</p>


<p>
	Please download the <a href="bin/xml4swing.jar">xml4swing.jar</a> then
	run the application as follow:
	<code>
	java -cp .\xml4swing.jar com.oxande.xmlswing.example.explorer.Explorer
	</code>
</p>
<?
	echo block_end( );
	include "include/footer.php";
?>

