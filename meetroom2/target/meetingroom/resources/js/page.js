(function($) {
  $.fn.extend({
    //弹层
    dialog: function(opt) {
      $(this).click(function() {
        var d1 = new Dialog(); //实例化
        d1.init(opt);
        return false;
      })
    },
    //自定义复选框
    checkbox: function(opt){
      this.each(function(index, el) {
        $(this).find('input[type=checkbox]').change(function(){
          if($(this).is(':checked')){
            $(this).parent().addClass('checked');
          }else{
            $(this).parent().removeClass('checked');
          }
          opt && opt.change && opt.change.call($(this));
        })
      });
    },
    //自定单选选框
    radio: function(opt){
      var _this = this;
      this.each(function(index, el) {
        $(this).find('input[type=radio]').change(function(){
          $(_this).removeClass('checked');
          if($(this).is(':checked')){
            $(this).parent().addClass('checked');
          }
        })
      });
    },
    //select
    select: function(opt){
      this.each(function(){
        var oOriginSelect = $(this).find('select');//原生的select
        var aOriginOptions = oOriginSelect.find('option');//原生所有option
        var oOriginSelected = oOriginSelect.find('option:selected');//原生选中的option
        var oSelect=null, oSelectOptions = null;
        var $this = $(this);

        var init = function(){
          renderSelectText();
          renderOptions();

          oSelect.click(function(){
            aOriginOptions = oOriginSelect.find('option')
            if(oOriginSelect.is(':disabled') || aOriginOptions.length<1){
              return;
            }
            $('.u-select').removeClass('on');
            $this.addClass('on');
            return false;
          });

          $(document).click(function(){
            $this.removeClass('on');
          });

          oSelectOptions.delegate('li', 'click',function(){

            var txt = $(this).text();
            var val = $(this).attr('data-value') || txt;

            if(txt == oOriginSelect.find('option:selected').text())return;

            $(this).addClass('selected').siblings().removeClass('selected');
            oSelect.find('.selected-txt').text(txt);
            oOriginSelect.val(val);
            opt && opt.change && opt.change.call(oOriginSelect);
          })
        }

        var renderSelectText = function(){//渲染选中内容区域
          if(oOriginSelect.is(':disabled')){
            $this.addClass('disabled');
          }
          var selectTxtHtml = '<div class="select-text">'+
                                  '<div class="selected-txt">'+ oOriginSelected.text() +'</div>'+
                                  '<i class="ico"></i>'+
                              '</div>';

          oSelect = $(selectTxtHtml);
          oSelect.insertBefore(oOriginSelect);
        }

        var renderOptions = function(){//渲染options
          var optionsHtml = '<div class="select-options"><ul class="select-options-list">';
          var originVal = oOriginSelect.val();
          var bBtn = true;
          aOriginOptions.each(function() {
            var text = $(this).text();
            var optionVal = $(this).attr('value');
            var sDataVal = optionVal ? ('data-value="'+ optionVal +'"') :'';
            var sClass = 'item';

            if(bBtn && (originVal == text || originVal == optionVal)){
              sClass = 'item selected'
              bBtn = false;
            }
            optionsHtml += '<li title="'+ text +'"'+ sDataVal +' class="' + sClass + '">'+ text +'</li>';
          });
          optionsHtml += '</ul></div>'

          oSelectOptions = $(optionsHtml);

          oSelectOptions.insertBefore(oOriginSelect);
        }

        init();

      })  
      return this;
    },
    //刷新自定义select
    selectUpdate: function(){
      this.each(function(index, el) {
        var oOriginSelect = $(this).find('select');//原生的select
        var oOption = $(this).find('.select-options-list');
        var aOriginOptions = $(this).find('select option');
        var oOriginSelected = oOriginSelect.find('option:selected');//原生选中的option
        var oTxt = $(this).find('.selected-txt');
        oTxt.text(oOriginSelected.text());

        var renderOptions = function(){
          var optionsHtml = '';
          var originVal = oOriginSelect.val();
          var bBtn = true;

          aOriginOptions.each(function() {
            var text = $(this).text();
            var optionVal = $(this).attr('value');
            var sDataVal = optionVal ? ('data-value="'+ optionVal +'"') :'';
            var sClass = 'item';


            if(bBtn && (originVal == text || originVal == optionVal)){
                sClass = 'item selected';
                bBtn = false;
            }

            optionsHtml += '<li title="'+ text +'"'+ sDataVal +' class="' + sClass + '">'+ text +'</li>';
          });

          oOption.html(optionsHtml);
        }
        renderOptions();
      });
      return this;
    },
    //chart
    timeChart: function(options){
      var _this=this;
      var setting={
        'xAxis':[],
        'yAxis':[],
        'xStep':1,
        'yStep':1,
        'data':[
          {'id':'','date':'','startTime':'','endTime':'','address':'','bookPeople':'','mettingTheme':''}
        ],
        'showFigureNote':true,
        'figureNote':[]
      }
      if(options){$.extend(setting,options)}
      if(setting.showFigureNote){
        var strFigureNote='';
        for(i=0;i<setting.figureNote.length;i++){
          strFigureNote+='<li><span class="ticket-square" style="background-color:'+setting.figureNote[i].bgcolor+';border-color:'+setting.figureNote[i].bgcolor+';"></span><span>'+setting.figureNote[i].text+'</span></li>';
        }
        _this.append('<ul class="figure-note clearfix fl">'+strFigureNote+'</ul>');
      }
      var renderXaxis=function(){
        var xlength=setting.xAxis.length;
        var strXaxis='';
        for(i=0;i<xlength;i++){
          strXaxis+='<li class="time">'+setting.xAxis[i]+'</li>';
        }
        _this.append('<ul class="metting-time fr">'+strXaxis+'</ul>');
      }
      var renderYaxis=function(){
        var ylength=setting.yAxis.length;
        var strYaxis='';
        for(i=0;i<ylength;i++){
          strYaxis+='<li class="metting-name">'+setting.yAxis[i]+'</li>';
        }
        _this.append('<ul class="metting-name-list fl">'+strYaxis+'</ul>');
      }
      var renderCon=function(){
        var xlength=setting.xAxis.length;
        var ylength=setting.yAxis.length;
        var strCon='';
        for(i=0;i<12;i++){
          var strConX='';
          for(j=0;j<xlength*setting.xStep;j++){
            strConX+='<td></td>';
          }
          strCon+='<tr>'+strConX+'</tr>';
        }
        _this.append('<table class="metting-data-table fr"><tbody  align="center">'+strCon+'</tbody></table>');
      }
      var dataProcess=function(){
        var firstH=setting.xAxis[0].split(':')[0],
            firstM=setting.xAxis[0].split(':')[1];

        for(j=0;j<setting.data.length;j++){

          var startH=setting.data[j].startTime.split(':')[0],
              startM=setting.data[j].startTime.split(':')[1],
              endH=setting.data[j].endTime.split(':')[0],
              endM=setting.data[j].endTime.split(':')[1];

          var startPx=(startH-firstH)*2+Math.abs(startM-firstM)/30,
              lengthx=(endH-startH)*2+Math.abs(endM-startM)/30,
              startPy=$.inArray(setting.data[j].address,setting.yAxis);

          var strIcon='<a href="javascript:;" class="icon-instructions"></a>',
              strExplain='<div class="metting-explain">'+
                         '<h2 class="f18 fn c5">说明</h2>'+
                         '<p class="f12 mt10 lh20">预定人：'+
                         setting.data[j].bookPeople+'<br>地点：'+
                         setting.data[j].address+'<br>主题：'+
                         setting.data[j].mettingTheme+'<br>时间：<span class="mr10">'+
                         setting.data[j].date+'</span>'+
                         setting.data[j].startTime+'~'+setting.data[j].endTime+'</p>'
                         '</div>';
          //console.log(startPx,lengthx)
          var aTd=$('.metting-data-table').find('tr').eq(startPy).find('td')
          switch(setting.data[j].id){
            case 'mybook':
              for(i=startPx;i<startPx+lengthx;i++){
                aTd.eq(i).addClass('mybook').append(strIcon).append(strExplain);
              }
              //aTd.eq(i).after(strExplain);
              break;
            case 'booked':
              for(i=startPx;i<startPx+lengthx;i++){
                aTd.eq(i).addClass('booked');
              }
              break;
          }
        }
      }
      renderXaxis();
      renderYaxis();
      renderCon();
      dataProcess();
    }
    
  })
})(jQuery)

var dialog = new Dialog();
function Dialog() {
  this.setting = { //默认参数
    'w':0,
    'h':0,
    'isMask':true,
    'layer':'.layer-con'
  }
}
Dialog.prototype.init = function(opt) {
  var self = this;
  var setting = self.setting;
  $.extend(setting, opt); //参数合并
  if(setting.isMask && $(setting.layer).find('.layer-mask').length<1){
    $(setting.layer).append('<div class="layer-mask"></div>')
  }
  self.showPop();
}
Dialog.prototype.showPop = function(opt) {
  var self = this;
  var data = self.setting;
  $('.layer-con').each(function(){$('.layer-con').hide();})
  $(data.layer).find('.popupLayer').css({width:data.w-40+'px',height:data.h-80+'px',marginTop:-data.h/2+'px',marginLeft:-data.w/2+'px'});
  $(data.layer).show();
  $(data.layer).find('.u-pop-close').on('click',function(){
    self.closePop();
  });
}
Dialog.prototype.closePop = function(opt) {
  var self = this;
  var data = self.setting;
  $(data.layer).hide();
}
