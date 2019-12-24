
//Gets the browser specific XmlHttpRequest Object
function getXmlHttpRequestObject() {
	if (window.XMLHttpRequest) {
		return new XMLHttpRequest();
	} else if(window.ActiveXObject) {
		return new ActiveXObject("Microsoft.XMLHTTP");
	} else {
		alert("Your Browser Sucks!\nIt's about time to upgrade don't you think?");
	}
}
function createAjaxObj(){
  var httprequest=false
  if (window.XMLHttpRequest)
  { // if Mozilla, Safari etc
    httprequest=new XMLHttpRequest()
    if (httprequest.overrideMimeType)
      httprequest.overrideMimeType('text/xml')
   }
   else if (window.ActiveXObject)
   { // if IE
     try {
       httprequest=new ActiveXObject("Msxml2.XMLHTTP");
     }
     catch (e){
       try{
          httprequest=new ActiveXObject("Microsoft.XMLHTTP");
       }
       catch (e){}
     }
   }
   return httprequest
}
//Our XmlHttpRequest object to get the auto suggest
var searchReq = createAjaxObj();

//Called from keyup on the search textbox.
//Starts the AJAX request.

 var chcCustNames="";var search_chcCustNames="";
function searchSuggest(s,search_chcCustName,chcCustName) {
   chcCustNames=chcCustName;search_chcCustNames=search_chcCustName;
	if (searchReq.readyState == 4 || searchReq.readyState == 0) {
		var str = document.getElementById(chcCustName).value;
		if(!str)
		  {
		  document.getElementById(search_chcCustName).style.display="none";
		  }else
		  {
		    
		searchReq.open("GET", s+'.do?operator=doCustNoAjaxSearch&&search='+ str, true);
		searchReq.onreadystatechange = handleSearchSuggest; 
		searchReq.send(null);
		}
	}		
}
 
//Called when the AJAX response is returned.
function handleSearchSuggest() {
          
	if (searchReq.readyState == 4) {
	 
		var ss = document.getElementById(search_chcCustNames)
		ss.innerHTML = '';
		var str = searchReq.responseText.split("\n");
		for(i=0; i < str.length - 1; i++) {
			//Build our element string.  This is cleaner using the DOM, but
			//IE doesn't support dynamically added attributes.
			var suggest = '<div onmouseover="javascript:suggestOver(this,this.innerHTML);"';
			suggest += 'onmouseout="javascript:suggestOut(this);" ';
			suggest += 'onclick="javascript:setSearch(this.innerHTML);" ';
			suggest += 'class="suggest_link">' + str[i] + '</div>';
			document.getElementById(search_chcCustNames).style.display="block";
			ss.innerHTML += suggest;
		}
		if(str.length==0)
		  {
		  document.getElementById(search_chcCustNames).style.display="none";
		  }
	}
}

//Mouse over function
function suggestOver(div_value,value) {
	div_value.className = 'suggest_link_over';
	
	document.getElementById(chcCustNames).value=value;
}
//Mouse out function
function suggestOut(div_value) {
	div_value.className = 'suggest_link';
}
//Click function
function setSearch(value) {
	document.getElementById(chcCustNames).value = value;
	document.getElementById(search_chcCustNames).innerHTML = '';
	document.getElementById(search_chcCustNames).style.display="none";
}