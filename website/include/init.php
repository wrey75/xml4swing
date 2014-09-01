<?php
	$db_type = "mysql";
	if( !strcmp( $_SERVER["SERVER_ADMIN"], "wrey@free.fr" ) ){
		$localMode = true;
		$ROOT = "E:/webwork_dev/workspace/xml4swing/website";
		$db_user = "root";
		$db_pass = "";
		$db_dsn = "127.0.0.1";
		$db_name = "xml4swing";
		$SERVER = "http://localhost:8009";
	}
	else {
		$ROOT = $_SERVER["DOCUMENT_ROOT"];
		$ROOT = ".";
	}
	$LIBROOT = "$ROOT/lib";
	include "$ROOT/lib/more.phl";

	session_start();
	setlocale( LC_ALL, 'fra' );


function block_begin( $title, $larg = 600 ){
	global $block_bgcolor;
	global $border;
	global $border_with;
	
	$borders = array( "classic"=>"/border|#EEEFE8|11",
					"menu"=>"/menu_border|#52B882|11" ) ;
	$exts = explode( "|", $borders[ $mode ] );
	$block_bgcolor = $exts[1];
	$border = $exts[0];
	$border_width = $exts[2];
	$arr = array( "bgcolor"=>$block_bgcolor, "CLASS"=>"block" );
	if( $larg ) $arr[ "WIDTH" ] = $larg;

	?>

<table cellspacing=1 border=0 cellpadding=6 bgcolor="#000000" width="<?= $larg; ?>">
      <tr><td bgcolor="#a0a0ff" width="100%" class=title><?= $title; ?></td></tr>
	  <tr><td bgcolor="#ffffff" ><?
}

function block_end(){
	?></td>
	</tr>
	</table>&nbsp;<?
}

/**
 *	Make the block based on the specified file.
 *
 */
function block_load( $filename, $larg = 270 ){
	$stopped = false;
	$handle = fopen( "$filename", "rt" );
	$buffer = fgets($handle, 4096);
	block_begin( $buffer, $larg );
	while( !$stopped && !feof($handle) ){
		$buffer = fgets($handle, 4096);
		if( !strcmp( $buffer, "+++\n" ) ){
			// Indicate a "expandable paragraph".
			$buffer = "";
			if( !strcmp( $_REQUEST["blockmore"], $filename ) ){
				// Simply ignore...
			}
			else {
				$url = "$PHP_SELF?blockmore=" . urlencode( $filename ) . ereg_replace( "blockmore=[a-zA-Z0-1+%]*", "&$QUERY_STRING", "" );
				echo "<p class='blockmore' align='right'><a href='$url'>Plus de détails</a></p>";
				$stopped = true;
			}
		}
		echo $buffer;
	}
	block_end( );
	fclose($handle);
}

function write_note( $type, $texte ) {
	?>
<table>
  <tr>
    <td valign="top"><?= imgtag( "$ROOT/img/notes/$type.png" ); ?></td>
    <td valign="top" align="left"><?= $texte; ?></td>
  </tr>
</table>
	<?
}

function is_ok( $res ){
	return !strcmp( $res, "OK" );
}

function send_a_mail( $dest, $subject, $data )
{
	mail( $dest, $subject, $data,
			"From: mailer@zygloo.com\r\n" .
			"Reply-to: webmaster@zygloo.com\r\n" .
			"Content-type: text/html\r\n" .
			"X-Mailer: PHP/" . phpversion() );
}

function add_log( $texte ){
	$user = $_SESSION[ "iuser" ];
	if( !$user ) $user = 'NULL';

	$req = "INSERT INTO loginfo ( dt_log, log_text, iuser )"
				. " VALUES ( NOW(), " . sqlstr( $texte ) . ", $user )";
	sql_execute( $req );
}

	/*
	 * Vérifie que l'utilisateur est bien enregistré pour cette page.
	 * Les pages qui nécessite une identification doivent positionner
	 * à "true" la variable $logged.
	 */
	if( $logged && !$_SESSION['iuser'] ){
		$no_init = 1;
		include "$ROOT/www/login.php";
		die();
	}

?>
