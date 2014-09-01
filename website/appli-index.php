<?php
	$title = "Applications...";
	include "include/init.php";
	include "include/header.php";

	echo block_begin( "Applications...", 500 );
?>
<p>
The applications provided on these pages are not production-safe.
They are examples of what you can obtain quickly with this software.
</p>

<p>
	<b>NOTE:</p> Basically, I would package the applications
	through the JNLP system but having a full access to the
	client machine (your computer) needs to have a certificate
	and I have no time to find a free certificate but, if you're
	interested in the project, I'm glad to obtain such certificates.
	Currently, you have to download first the 
	<a href="bin/xml4swing.jar">JAR file</a> then 
	following the instructions. 
</p>

<?
	echo block_end( );
	include "include/footer.php";
?>

