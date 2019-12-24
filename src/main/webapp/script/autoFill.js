function autoSuggest() {
	var color = new Array("红","黄","蓝","绿","紫");
	$("#content").html("");
	document.getElementById("content").style.display = "block";
	var temp = "";
	for(var index=0; index < color.length; index++) {
		var suggest = '<div onmouseover="javascript:suggestOver(this,this.innerHTML);" ';
		suggest += 'onmouseout="javascript:suggestOut(this);" ';
		suggest += 'onclick="javascript:setSearch(this.innerHTML);" ';
		suggest += 'class="suggest_link">' + color[index] + '</div>';
		temp+= suggest;
		$("#content").html(temp);
	}   			
}   

function suggestOver(div_value,value) {
	div_value.className = 'suggest_link_over';
	$("#txtValue").val(value);
}

function suggestOut(div_value) {
	div_value.className = 'suggest_link';
}

function setSearch(value) {
	$("#txtValue").val(value);
	$('#content').innerHTML = '';
}

function hidenDiv(){
	document.getElementById("content").style.display = "none";
}