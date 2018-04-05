<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Rolar imagens</title>
<style type="text/css">
body {
	padding: 10px;
	font-family:"Lucida Sans Unicode", "Lucida Grande", sans-serif;
	font-size:12px;
	background:#111;
}
.foto {
	position:relative;
	padding: 0px 3px 0px 0px;
	clear: both;
}
.dump {
	position:fixed;
	top: 5px;
	left: 5px;
	width: 400px;
	height: 600px;
	border: solid #ccc 2px;
	padding: 4px;
	color:#ffe;
}
.fotojpg {
	width:195px;
	height:300px;
	display:block;
	border:solid 1px #00F;
}
</style>

<script type="text/javascript" src="jquery-1.6.2.min.js"></script>
<script type="text/javascript">
$(document).ready(function() { 

    $(window).scroll(function () { 
		var scrollTop = $(this).scrollTop();
		var width = $(this).width();
		var height = $(this).height();
		
		var h = "";
		h = "scrollTop="+ scrollTop +"<br />";
		h += "width="+ width +"<br />";
		h += "height="+ height +"<br />";
		
		$('.fotojpg').each(function(i) {
			var os = $(this).offset();
			var tt = $(this).attr('title');
			h += "x="+ os.left + " y=" + os.top + " title=" + tt + "<br />";
		
			if ((scrollTop + height) > os.top) {
				var src = $(this).attr('src');
				var alt = $(this).attr('alt');
				if (src != alt)
					$(this).attr('src', alt);
			}
		});
		
      	$("#_dump").html(h); 
    });


	$(window).scroll();


});
</script>

</head>
<body>
<div id="_dump" class="dump"> dump
</div>
<center>
	<div class="foto"> <a href="#"><img class="fotojpg" title="01" alt="./_files/gabrielly_queirozdc3.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="02" alt="./_files/luaradc2.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="03" alt="./_files/iza_morenodc2.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="04" alt="./_files/flavia_alekssandradc.jpg" width="195" height="300" border="0"> </a> </div>
<p>&nbsp;</p>
	<div class="foto"> <a href="#"><img class="fotojpg" title="05" alt="./_files/vivianeghoular_dc1.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="06" alt="./_files/adriane_rosettedc.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="07" alt="./_files/andressagaucha_dc.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="08" alt="./_files/juliana_bergaminidc.jpg" width="195" height="300" border="0"> </a> </div>
<p>&nbsp;</p>
	<div class="foto"> <a href="#"><img class="fotojpg" title="09" alt="./_files/alinebrandaodc.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="10" alt="./_files/sofhia_mansurdc3.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="11" alt="./_files/fernanda_vegasdc.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="12" alt="./_files/fernanda_galuzidc2.jpg" width="195" height="300" border="0"> </a> </div>
<p>&nbsp;</p>
	<div class="foto"> <a href="#"><img class="fotojpg" title="13" alt="./_files/camila_diasdc2.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="14" alt="./_files/gaby_souzadc4.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="15" alt="./_files/gabrielly_queirozdc3.jpg" width="195" height="300" border="0"> </a> </div>
	<div class="foto"> <a href="#"><img class="fotojpg" title="16" alt="./_files/luaradc2.jpg" width="195" height="300" border="0"> </a> </div>
</center>
</body>
</html>