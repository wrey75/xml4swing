<?php

	/**
	 *	Displays the menu on the left side of the screen.
	 *	
	 *	
	 *
	 */
	function menu_display( $arr )
	{
		global $_SERVER;
		$page = $_SERVER["PHP_SELF"];

		?><table width="150" cellspacing="0" cellpadding="0" border="0"><?

		$holded = "";
		$must_display = false;
		foreach( $arr as $entry ){
			list( $item1, $url ) = explode( '|', $entry, 2 );
			$mode = $item1[0];
			$item = substr( $item1, 1 );
			
			list( $simple_url ) = explode( "?", $url );

			if( $url && $mode == '+' ){
				$txt = "<tr>" 
						. tag( "td", array( "colspan"=>"2", "class"=>"item-left" )) 
						. tag( "a", array( "href"=>"$url", "class"=>"item-left" )) . $item . "</a></td></tr>";
			}
			else if( $url ){
				$txt = "<tr>" 
						. tag( "td", array( "colspan"=>"2", "class"=>"item-left" )) 
						. "&gt;&nbsp;" . tag( "a", array( "href"=>"$url", "class"=>"subitem-left" )) . "$item</a></td></tr>";
			}
			else {
				$txt = "<tr>" 
						. tag( "td", array( "colspan"=>"2", "class"=>"menu-left" ))
						. $item  . "</td></tr>";
			}

			if( $mode == '+' ){
				if( $must_display ) echo $holded;
				echo "$txt";
				$holded = "";
				$must_display = false;
			}
			else if( $mode == '-' ){
				$holded .= $txt;
			}
			if( !strcmp( $simple_url, $page ) ){
				$must_display = true;
			}
		}
		if( $must_display ) echo $holded;

		?>
  <tr class="left-nav-last">
    <td width="14"  class="item-left-close"><img alt="" height="1" width="14" src="/img/spacer.gif" /></td>
    <td width="136" class="item-left-close"><img height="19" width="136" alt="" src="/img/left-nav-corner.gif" /></td>
  </tr>
  </table><br /><?
	}

	$menu[] = "+Accueil|/index.php";
	$menu[] = "+Tutorial (PDF)|/docs/xml4swing.pdf";
	$menu[] = "+Applications|/appli/index.php";
        $menu[] = "+> Explorer|/appli/explorer.php";
	$menu[] = "+Project Summary|https://sourceforge.net/projects/xml4swing/";
	menu_display( $menu );
?>
