// JavaScript Document
var cal;
var calType = '';//扩展信息类型：1 指定有效日期 2 指定有效日期范围
var calPlus = '';//日期字符串
var isFocus=false; //是否为焦点
var controlId = '';//控件ID

function SelectDate(obj, lang, type, plus)
{
	var date = new Date();
	var by = date.getFullYear()-90;  //年份最小值
	var ey = date.getFullYear()+30;  //年份最大值
	controlId = obj.id;
	var language = (lang=='en')?1:0;
	cal = (cal==null) ? new Calendar(by, ey, language) : cal;//格式化日历
	if (type != undefined && plus != undefined)
	{
		var arrtmp1, arrtmp2;//初始化扩展信息
		calType = type;
		calPlus = ',';
		arrtmp1 = plus.split(',');
		for (var i = 0;i < arrtmp1.length;i ++)
		{
			if (arrtmp1[i] == '')
			{
				calPlus += ',';
			}
			else
			{
				arrtmp2 = arrtmp1[i].split('-');
				calPlus += new Date(arrtmp2[0], arrtmp2[1], arrtmp2[2]).getTime() + ',';
			}
		}
	}
	cal.dateFormatStyle = 'yyyy-MM-dd';//日期显示样式
	cal.show(obj);//显示控件
}
/**//**//**//**
* 返回日期
* @param d the delimiter
* @param p the pattern of your date
2006-06-25 由 寒羽枫 修改为根据用户指定的 style 来确定；
*/
//String.prototype.toDate = function(x, p) {
String.prototype.toDate = function(style) {
	var y = this.substring(style.indexOf('y'),style.lastIndexOf('y')+1);//年
	var m = this.substring(style.indexOf('M'),style.lastIndexOf('M')+1);//月
	var d = this.substring(style.indexOf('d'),style.lastIndexOf('d')+1);//日
	if(isNaN(y)) y = new Date().getFullYear();
	if(isNaN(m)) m = new Date().getMonth();
	if(isNaN(d)) d = new Date().getDate();
	var dt ;
	eval ("dt = new Date('"+ y+"', '"+(m-1)+"','"+ d +"')");
	return dt;
}

/**//**//**//**
* 格式化日期
* @param   d the delimiter
* @param   p the pattern of your date
* @author  meizz
*/
Date.prototype.format = function(style) {
	var o = {
	"M+" : this.getMonth() + 1, //month
	"d+" : this.getDate(),      //day
	"h+" : this.getHours(),     //hour
	"m+" : this.getMinutes(),   //minute
	"s+" : this.getSeconds(),   //second
	"w+" : "天一二三四五六".charAt(this.getDay()),   //week
	"q+" : Math.floor((this.getMonth() + 3) / 3),  //quarter
	"S"  : this.getMilliseconds() //millisecond
	}
	if(/(y+)/.test(style)) {
	style = style.replace(RegExp.$1,
	(this.getFullYear() + "").substr(4 - RegExp.$1.length));
	}
	for(var k in o){
		if(new RegExp("("+ k +")").test(style)){
		style = style.replace(RegExp.$1,
		RegExp.$1.length == 1 ? o[k] :
		("00" + o[k]).substr(("" + o[k]).length));
		}
	}
	return style;
};

/**//**//**//**
* 日历类
* @param   beginYear 1990
* @param   endYear   2010
* @param   lang      0(中文)|1(英语) 可自由扩充
* @param   dateFormatStyle  "yyyy-MM-dd";
* @version 2006-04-01
* @author  KimSoft (jinqinghua [at] gmail.com)
* @update
*/
function Calendar(beginYear, endYear, lang, dateFormatStyle) {
	this.beginYear = 1990;
	this.endYear = 2010;
	this.lang = 0;            //0(中文) | 1(英文)
	this.dateFormatStyle = "yyyy-MM-dd";
	if (beginYear != null && endYear != null){
	this.beginYear = beginYear;
	this.endYear = endYear;
	}
	if (lang != null) {this.lang = lang;}
	if (dateFormatStyle != null) {this.dateFormatStyle = dateFormatStyle;}
	this.dateControl = null;
	this.panel = this.getElementById("calendarPanel");
	this.container = this.getElementById("ContainerPanel");
	this.form  = null;
	this.date = new Date();
	this.year = this.date.getFullYear();
	this.month = this.date.getMonth();

	this.colors = {
	"cur_word"      : "#FFFFFF",  //当日日期文字颜色
	"cur_bg"        : "#CCFF33",  //当日日期单元格背影色
	"sel_bg"        : "#FFCCCC",  //已被选择的日期单元格背影色 2006-12-03 寒羽枫添加
	"sun_word"      : "#FF0000",  //星期天文字颜色
	"sat_word"      : "#0000FF",  //星期六文字颜色
	"td_word_light" : "#333333",  //单元格文字颜色
	"td_word_dark"  : "#CCCCCC",  //单元格文字暗色
	"td_word_forbid": "#999",  //单元格不可选背影色
	"td_bg_out"     : "#FFFFFF",  //单元格背影色
	"td_bg_over"    : "#FFCC00",  //单元格背影色
	"tr_word"       : "#FFFFFF",  //日历头文字颜色
	"tr_bg"         : "#5E667B",  //日历头背影色
	"input_border"  : "#CCCCCC",  //input控件的边框颜色
	"input_tr_bg"   : "#FFFFFF",  //input控件TD的背影色		
	"input_bg"      : "#EFEFEF"   //input控件的背影色
	}

	this.draw();
	this.bindYear();
	this.bindMonth();
	this.changeSelect();
	this.bindData();
}

/**//**//**//**
* 日历类属性（语言包，可自由扩展）
*/
Calendar.language = {
	"year"   : [[""], [""]],
	"months" : [["一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"],
	["JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"]
	],
	"weeks"  : [["日","一","二","三","四","五","六"],
	["SUN","MON","TUR","WED","THU","FRI","SAT"]
	],
	"clear"  : [["清空"], ["CLS"]],
	"today"  : [["今天"], ["TODAY"]],
	"close"  : [["关闭"], ["CLOSE"]]
}

Calendar.prototype.draw = function() {
calendar = this;

var mvAry = [];
if (window.location.protocol.toLowerCase() == 'https:')
	mvAry[mvAry.length]  = '<iframe src="/blank.html" frameborder="0" style="position: absolute;z-index:9900; width:224px; height:210px;"></iframe>';
else
	mvAry[mvAry.length]  = '<iframe src="about:blank" frameborder="0" style="position: absolute;z-index:9900; width:224px; height:210px;"></iframe>';
//mvAry[mvAry.length]  = '  < form name="calendarForm" style="margin: 0px;">'; //因 <form> 不能嵌套， 2006-12-01 由寒羽枫改用 Div
mvAry[mvAry.length]  = '  <div name="calendarForm" style="margin: 0px;position: absolute;z-index:9950;">';
mvAry[mvAry.length]  = '    <table width="100%" border="0" cellpadding="0" cellspacing="1">';
mvAry[mvAry.length]  = '      <tr>';
mvAry[mvAry.length]  = '        <th align="left" width="1%"><input style="border: 1px solid ' + calendar.colors["input_border"] + ';background-color:' + calendar.colors["input_bg"] + ';width:16px;height:20px;" name="prevMonth" type="button" id="prevMonth" value="&lt;" /></th>';
mvAry[mvAry.length]  = '        <th align="center" width="98%" nowrap="nowrap"><select name="calendarYear" id="calendarYear" style="font-size:12px;"></select> <select name="calendarMonth" id="calendarMonth" style="font-size:12px;"></select></th>';
mvAry[mvAry.length]  = '        <th align="right" width="1%"><input style="border: 1px solid ' + calendar.colors["input_border"] + ';background-color:' + calendar.colors["input_bg"] + ';width:16px;height:20px;" name="nextMonth" type="button" id="nextMonth" value="&gt;" /></th>';
mvAry[mvAry.length]  = '      </tr>';
mvAry[mvAry.length]  = '    </table>';
mvAry[mvAry.length]  = '    <table id="calendarTable" width="100%" style="border:0px solid #CCCCCC;background-color:#ECECEC" border="0" cellpadding="3" cellspacing="1">';
mvAry[mvAry.length]  = '      <tr>';
for(var i = 0; i < 7; i++) {
	mvAry[mvAry.length]  = '      <th height="20" style="font-weight:normal;background-color:' + calendar.colors["tr_bg"] + ';color:' + calendar.colors["tr_word"] + ';">' + Calendar.language["weeks"][this.lang][i] + '</th>';
}
mvAry[mvAry.length]  = '      </tr>';
for(var i = 0; i < 6;i++){
mvAry[mvAry.length]  = '    <tr align="center">';
for(var j = 0; j < 7; j++) {
mvAry[mvAry.length]  = '  <td height="20"></td>';
}
mvAry[mvAry.length]  = '    </tr>';
}
mvAry[mvAry.length]  = '      <tr style="background-color:' + calendar.colors["input_tr_bg"] + ';">';
mvAry[mvAry.length]  = '        <th colspan="2"><input name="calendarClear" type="button" id="calendarClear" value="' + Calendar.language["clear"][this.lang] + '" style="border: 1px solid ' + calendar.colors["input_border"] + ';background-color:' + calendar.colors["input_bg"] + ';width:100%;height:20px;font-size:12px; cursor:pointer;"/></th>';
mvAry[mvAry.length]  = '        <th colspan="3"><input name="calendarToday" type="button" id="calendarToday" value="' + Calendar.language["today"][this.lang] + '" style="border: 1px solid ' + calendar.colors["input_border"] + ';background-color:' + calendar.colors["input_bg"] + ';width:100%;height:20px;font-size:12px; cursor:pointer;"/></th>';
mvAry[mvAry.length]  = '        <th colspan="2"><input name="calendarClose" type="button" id="calendarClose" value="' + Calendar.language["close"][this.lang] + '" style="border: 1px solid ' + calendar.colors["input_border"] + ';background-color:' + calendar.colors["input_bg"] + ';width:100%;height:20px;font-size:12px; cursor:pointer;"/></th>';
mvAry[mvAry.length]  = '      </tr>';
mvAry[mvAry.length]  = '    </table>';
//mvAry[mvAry.length]  = '  </from>';
mvAry[mvAry.length]  = '  </div>';
this.panel.innerHTML = mvAry.join("");

/**//******** 以下代码由寒羽枫 2006-12-01 添加 **********/
var obj = this.getElementById("prevMonth");
obj.onclick = function () {calendar.goPrevMonth(calendar);}
obj.onblur = function () {calendar.onblur();}
this.prevMonth= obj;

obj = this.getElementById("nextMonth");
obj.onclick = function () {calendar.goNextMonth(calendar);}
obj.onblur = function () {calendar.onblur();}
this.nextMonth= obj;

obj = this.getElementById("calendarClear");
obj.onclick = function () {calendar.dateControl.value = "";calendar.hide();calendar_callback(controlId);}
this.calendarClear = obj;

obj = this.getElementById("calendarClose");

obj.onclick = function () {calendar.hide();}
this.calendarClose = obj;

obj = this.getElementById("calendarYear");
obj.onchange = function () {calendar.update(calendar);}
obj.onblur = function () {calendar.onblur();}
this.calendarYear = obj;

obj = this.getElementById("calendarMonth");
with(obj)
{
onchange = function () {calendar.update(calendar);}
onblur = function () {calendar.onblur();}
}this.calendarMonth = obj;

obj = this.getElementById("calendarToday");
obj.onclick = function () {
	var today = new Date();
	calendar.date = today;
	calendar.year = today.getFullYear();
	calendar.month = today.getMonth();
	calendar.changeSelect();
	calendar.bindData();
	calendar.dateControl.value = today.format(calendar.dateFormatStyle);
	calendar.hide();
	calendar_callback(controlId);
}
this.calendarToday = obj;
}

//年份下拉框绑定数据
Calendar.prototype.bindYear = function() {
	var cy = this.calendarYear;
	cy.length = 0;
	for (var i = this.beginYear; i <= this.endYear; i++){
	cy.options[cy.length] = new Option(i + Calendar.language["year"][this.lang], i);
	}
}

//月份下拉框绑定数据
Calendar.prototype.bindMonth = function() {
	var cm = this.calendarMonth;
	cm.length = 0;
	for (var i = 0; i < 12; i++){
	cm.options[cm.length] = new Option(Calendar.language["months"][this.lang][i], i);
	}
}

//向前一月
Calendar.prototype.goPrevMonth = function(e){
	if (this.year == this.beginYear && this.month == 0){return;}
	this.month--;
	if (this.month == -1) {
	this.year--;
	this.month = 11;
	}
	this.date = new Date(this.year, this.month, 1);
	this.changeSelect();
	this.bindData();
}

//向后一月
Calendar.prototype.goNextMonth = function(e){
	if (this.year == this.endYear && this.month == 11){return;}
	this.month++;
	if (this.month == 12) {
	this.year++;
	this.month = 0;
	}
	this.date = new Date(this.year, this.month, 1);
	this.changeSelect();
	this.bindData();
}

//改变SELECT选中状态
Calendar.prototype.changeSelect = function() {
	var cy = this.calendarYear;
	var cm = this.calendarMonth;
	for (var i= 0; i < cy.length; i++){
	if (cy.options[i].value == this.date.getFullYear()){
	cy[i].selected = true;
	break;
	}
	}
	for (var i= 0; i < cm.length; i++){
	if (cm.options[i].value == this.date.getMonth()){
	cm[i].selected = true;
	break;
	}
	}
}

//更新年、月
Calendar.prototype.update = function (e){
	this.year  = e.calendarYear.options[e.calendarYear.selectedIndex].value;//2006-12-01 由寒羽枫修改
	this.month = e.calendarMonth.options[e.calendarMonth.selectedIndex].value;
	this.date = new Date(this.year, this.month, 1);
	this.changeSelect();
	this.bindData();
}

//绑定数据到月视图
Calendar.prototype.bindData = function () {
	var calendar = this;
	var dateArray = this.getMonthViewArray(this.date.getFullYear(), this.date.getMonth());
	var tds = this.getElementById("calendarTable").getElementsByTagName("td");
	for(var i = 0; i < tds.length; i++)
	{
		tds[i].style.backgroundColor = calendar.colors["td_bg_out"];
		tds[i].onclick = function () {return;}
		tds[i].onmouseover = function () {return;}
		tds[i].onmouseout = function () {return;}
		if (i > dateArray.length - 1) break;
		tds[i].innerHTML = dateArray[i];
		if (dateArray[i] != "&nbsp;")
		{
			tds[i].style.cursor = 'pointer';
			//周日
			if (i % 7 == 0)
			{
				tds[i].style.color = calendar.colors["sun_word"];
			}
			//周六
			else if ((i + 1) % 7 == 0)
			{
				tds[i].style.color = calendar.colors["sat_word"];
			}
			else
			{
				tds[i].style.color = calendar.colors["td_word_light"];
			}
			if (isValid(calendar.date.getFullYear(), calendar.date.getMonth() + 1,dateArray[i]))
			{
				tds[i].onclick = function () {
				if (calendar.dateControl != null){
				calendar.dateControl.value = new Date(calendar.date.getFullYear(),
				calendar.date.getMonth(),
				this.innerHTML).format(calendar.dateFormatStyle);
				}
				calendar.hide();
				calendar_callback(controlId);
				}
				tds[i].onmouseover = function () {
				this.style.backgroundColor = calendar.colors["td_bg_over"];
				}
				tds[i].onmouseout = function () {
				this.style.backgroundColor = calendar.colors["td_bg_out"];
				}
				if (new Date().format(calendar.dateFormatStyle) ==
				new Date(calendar.date.getFullYear(),
				calendar.date.getMonth(),
				dateArray[i]).format(calendar.dateFormatStyle)) {
				//tds[i].style.color = calendar.colors["cur_word"];
				tds[i].style.backgroundColor = calendar.colors["cur_bg"];
				tds[i].onmouseover = function () {
				this.style.backgroundColor = calendar.colors["td_bg_over"];
				}
				tds[i].onmouseout = function () {
				this.style.backgroundColor = calendar.colors["cur_bg"];
				}
				//continue; //若不想当天单元格的背景被下面的覆盖，请取消注释
				}//end if
				
				//设置已被选择的日期单元格背影色
				if (calendar.dateControl != null && calendar.dateControl.value == new Date(calendar.date.getFullYear(),
				calendar.date.getMonth(),
				dateArray[i]).format(calendar.dateFormatStyle)) {
				tds[i].style.backgroundColor = calendar.colors["sel_bg"];
				tds[i].onmouseover = function () {
				this.style.backgroundColor = calendar.colors["td_bg_over"];
				}
				tds[i].onmouseout = function () {
				this.style.backgroundColor = calendar.colors["sel_bg"];
				}
				}
			}
			else
			{
				tds[i].style.color = calendar.colors["td_word_forbid"];
				tds[i].style.cursor = 'inherit';
			}
		}
	}
	//检查当天是否是有效日期，如果不是则隐藏
	var obj = this.getElementById("calendarToday");
	if (!isValid(new Date().getFullYear(), new Date().getMonth() + 1, new Date().getDate()))
		obj.disabled = true;
	else
		obj.disabled = false;
}

//根据年、月得到月视图数据(数组形式)
Calendar.prototype.getMonthViewArray = function (y, m) {
var mvArray = [];
var dayOfFirstDay = new Date(y, m, 1).getDay();
var daysOfMonth = new Date(y, m + 1, 0).getDate();
for (var i = 0; i < 42; i++) {
mvArray[i] = "&nbsp;";
}
for (var i = 0; i < daysOfMonth; i++){
mvArray[i + dayOfFirstDay] = i + 1;
}
return mvArray;
}

//扩展 document.getElementById(id) 多浏览器兼容性 from meizz tree source
Calendar.prototype.getElementById = function(id){
if (typeof(id) != "string" || id == "") return null;
if (document.getElementById) return document.getElementById(id);
if (document.all) return document.all(id);
try {return eval(id);} catch(e){ return null;}
}

//扩展 object.getElementsByTagName(tagName)
Calendar.prototype.getElementsByTagName = function(object, tagName){
if (document.getElementsByTagName) return document.getElementsByTagName(tagName);
if (document.all) return document.all.tags(tagName);
}

//取得HTML控件绝对位置
Calendar.prototype.getAbsPoint = function (e){
var x = e.offsetLeft;
var y = e.offsetTop;
while(e = e.offsetParent){
x += e.offsetLeft;
y += e.offsetTop;
}
return {"x": x, "y": y};
}

//显示日历
Calendar.prototype.show = function (dateObj, popControl) {
if (dateObj == null){
throw new Error("arguments[0] is necessary")
}
this.dateControl = dateObj;

this.date = (dateObj.value.length > 0) ? new Date(dateObj.value.toDate(this.dateFormatStyle)) : new Date() ;//若为空则显示当前月份
this.year = this.date.getFullYear();
this.month = this.date.getMonth();
this.changeSelect();
this.bindData();
//}
if (popControl == null){
popControl = dateObj;
}
var xy = this.getAbsPoint(popControl);
//2010-8-23 samuel修改 随窗口大小自动调整日历控件的位置
/*
this.panel.style.left = (window.document.body.clientWidth - xy.x < 226 ? window.document.body.clientWidth - 226 : xy.x) + "px";
if (window.document.body.clientHeight < 204)
	this.panel.style.top = "0px";
else
	this.panel.style.top = (window.document.body.clientHeight - xy.y - dateObj.offsetHeight < 204 ? window.document.body.clientHeight - 204 : (xy.y + dateObj.offsetHeight)) + "px";
*/
//2012-6-17 jemmy修改
var This = this;

resize();

window.onresize = resize;

function resize() {
	var xy = This.getAbsPoint(popControl);
	This.panel.style.left = (window.document.body.clientWidth - xy.x < 226 ? window.document.body.clientWidth - 226 : xy.x) + "px";
if (window.document.body.clientHeight < 204)
	This.panel.style.top = "0px";
else
	This.panel.style.top = (window.document.body.clientHeight - xy.y - dateObj.offsetHeight < 204 ? window.document.body.clientHeight - 204 : (xy.y + dateObj.offsetHeight)) + "px";	
}
//把 visibility 变为 display，并添加失去焦点的事件
//this.setDisplayStyle("select", "hidden");
//this.panel.style.visibility = "visible";
//this.container.style.visibility = "visible";
this.panel.style.display = "";
this.container.style.display = "";

dateObj.onblur = function(){calendar.onblur();}
this.container.onmouseover = function(){isFocus=true;}
this.container.onmouseout = function(){isFocus=false;}
}

//隐藏日历
Calendar.prototype.hide = function() {
//this.setDisplayStyle("select", "visible");
//this.panel.style.visibility = "hidden";
//this.container.style.visibility = "hidden";
this.panel.style.display = "none";
this.container.style.display = "none";
isFocus=false;
}

//焦点转移时隐藏日历 → 由寒羽枫 2006-06-25 添加
Calendar.prototype.onblur = function() {
if(!isFocus){this.hide();}
}

document.write('<div id="ContainerPanel" style="display:none">');
//document.write('<iframe frameborder="0" style="position: relative;z-index:9998; width:324px; background-color: #000000;"></iframe>');
document.write('<div id="calendarPanel" style="position: absolute;display: none;z-index: 9999;background-color: #FFFFFF;border: 1px solid #CCCCCC;width:224px;font-size:12px;">');
document.write('</div>');
document.write('</div>');

//2010-9-19 samuel添加 日历控件修改时，增加回调函数
function calendar_callback(objId)
{
}
function isValid(nowYear, nowMonth, nowDay)
{
	var nowTime = new Date(nowYear, nowMonth, nowDay).getTime();
	if (calType == 1)
	{
		if (calPlus.indexOf (',' + nowTime + ',') == -1)
			return false;		
	}
	else if (calType == 2)
	{
		var arrtmp = calPlus.split(',');
		if (arrtmp[1] != '' && nowTime < arrtmp[1])
			return false;
		if (arrtmp[2] != '' && nowTime > arrtmp[2])
			return false;
	}
	return true;
}