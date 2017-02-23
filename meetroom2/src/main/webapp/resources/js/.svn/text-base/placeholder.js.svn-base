$(function(){

	var aInput = $("input[placeholder]");

	aInput.each(function(index, el) {
		var phTxt = $(this).attr('placeholder');//获取placeholder内容
		if(phTxt != ''){ //判断内容是否为空
			var oInput = $(this);
			var pl = oInput.css('paddingLeft');
			var oPh = null;
			if(oInput.val()!=''){
				oPh = $('<span class="placeholder" style="display:none;">'+phTxt+'</span>');
			}else{
				oPh = $('<span class="placeholder">'+phTxt+'</span>')
			}
			var l=$(this)[0].offsetLeft,t=$(this)[0].offsetTop,h=$(this).outerHeight();

			var patt1 = new RegExp("col-offset");
			if(patt1.test($(this).parent()[0].className)){
				l=18;
			}

			oPh.css({'left':l,'top':t, 'height':h,'lineHeight':h+'px', 'paddingLeft':pl})
			oPh.insertBefore($(this));
			(function(oPh,oInput){
				oPh.bind('click',function(){
					oInput.focus();
				});

				oInput.bind('blur',function(){
					if($(this).val() ==''){
						oPh.show();
					}
				}).bind('focus',function(){
					oPh.hide();
				})
			})(oPh,oInput)
			
		}
	});



})