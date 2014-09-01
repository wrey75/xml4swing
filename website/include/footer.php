</td>
  </tr>
  
  <!-- Barre d'information du bas -->
  <tr>
   <td height="19" class="black" colspan="3">
     <table cellspacing="0" cellpadding="0" border="0">
       <tr>
         <td class="footlink">&nbsp;&nbsp;</td>
         <td><a class="footlink" href="/about.php">About this site</a></td>
         <td class="footlink">&nbsp;&nbsp;|&nbsp;&nbsp;</td>
         <td><a class="footlink" href="https://sourceforge.net/projects/xml4swing/">Project summary</a></td>
       </tr>
     </table>
    </td>
  </tr>

  <tr>
    <td colspan="3">
      <font size=1><?
	  $fstat = stat( "$ROOT/$PHP_SELF" );
 	  echo "[$PHP_SELF] Last updated: " . date( "r" /* "d-M-Y H:i" */, $fstat[9] );
      ?></font>
    </td>
  </tr>
</table>
</body>
</html>
