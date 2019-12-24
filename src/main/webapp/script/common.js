function reload(){
	window.location.reload();
}
function help(msg){
	alert('��ӭʹ��'+msg);
}

//页面的是点击to方法进行跳转的，定位到to(url) 
function to(url){
	window.location.href=url;
}
function back(){
	history.go(-1);
}

//保存不了数据，要修改写法
function save(id){
	var form = document.getElementById(id);
	form.submit();
}

 function Obj(OCtl)
 {
    return document.getElementById(OCtl);
 }
function add(url){
	alert('�½��ɹ���');
	to(url);
}

function del(url){
	if (window.confirm("确定删除吗")){
		 // location.href='saleList.do?operator=doDelete&&chcId='+arguments[1];
		to(url);
	}
}

  function createXmlHttpRequest()
      {
        if(window.ActiveXObject)
        {
         return new ActiveXObject("Microsoft.XMLHTTP");
        }else if(window.XMLHttpRequest)
        {
           return new XMLHttpRequest();
        }        
      }

//获取当前的时间
function setCurTime(oid){
	var now=new Date();
	var year=now.getYear();
	var month=now.getMonth()+1;
	var day=now.getDate();
	var hours=now.getHours();
	var minutes=now.getMinutes();
	var seconds=now.getSeconds();
	var timeString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
	var oCtl = document.getElementById(oid);
	oCtl.value = timeString;
}