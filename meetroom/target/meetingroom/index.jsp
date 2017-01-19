<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="webkit" name="renderer">
    <title>会议室预定记录</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/jquery.js"></script>
</head>

<body>
<!-- siteNav start -->
<script type="text/javascript" src="./temp/siteNav.js"></script>
<!-- siteNav end -->

<!-- header start -->
<script type="text/javascript" src="./temp/header.js"></script>
<!-- header end -->

<!-- content start -->
<div class="nav-main">
    <div class="container clearfix">
        <div class="nav-list fr">
            <a href="#">预定管理</a>
            <a href="#" class="nav-active">预定记录</a>
        </div>
        <h1>会议室预定</h1>
    </div>
</div>

<div class="container wrap">
    <div class="table-search">
        <table width="100%">
            <tr>
                <td width="9%">预定主题</td>
                <td width="36%"><input type="text" class="u-txt" style="width:80%"></td>
                <td width="8%">预定时间</td>
                <td width="30%">
                    <input type="text" class="u-txt date" value="2016-07-01" onfocus="SelectDate(this, 0);">
                    -
                    <input type="text" class="u-txt date" value="2016-07-01" onfocus="SelectDate(this, 0);">
                </td>
                <td align="right" rowspan="2">
                    <a href="#" class="u-btn u-btn-default"><i class="iconfont mr10 f16 c1">&#xe618;</i>搜索</a>
                </td>
            </tr>
            <tr>
                <td width="9%">会议室名称</td>
                <td width="36%"><input type="text" class="u-txt" style="width:80%"></td>
                <td width="8%">状态</td>
                <td>
                    <div class="u-select" style="width:126px;">
                        <select name="" id="select1">
                            <option value="0">全部</option>
                            <option value="1">已结束</option>
                        </select>
                    </div>
                </td>
            </tr>
        </table>
    </div>
    <h2 class="h2 mt30">预定记录</h2>
    <table class="table" width="100%">
        <colgroup>
            <col width="22%">
            <col width="22%">
            <col width="22%">
            <col width="22%">
            <col width="12%">
        </colgroup>
        <thead>
        <tr>
            <td>预定时间</td>
            <td>主题名称</td>
            <td>会议室名称</td>
            <td>结束时间</td>
            <td align="center">状态</td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td>东风汽车年度员工...</td>
            <td>平台中心会议室（1~6人）</td>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td align="center">已结束</td>
        </tr>
        <tr>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td>东风汽车年度员工...</td>
            <td>平台中心会议室（1~6人）</td>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td align="center"><a href="javascript:;" onclick="cancelReservation()">取消预定</a></td>
        </tr>
        <tr>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td>东风汽车年度员工...</td>
            <td>平台中心会议室（1~6人）</td>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td align="center">已结束</td>
        </tr>
        <tr>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td>东风汽车年度员工...</td>
            <td>平台中心会议室（1~6人）</td>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td align="center">已结束</td>
        </tr>
        <tr>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td>东风汽车年度员工...</td>
            <td>平台中心会议室（1~6人）</td>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td align="center">已结束</td>
        </tr>
        <tr>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td>东风汽车年度员工...</td>
            <td>平台中心会议室（1~6人）</td>
            <td>2016-08-08<span class="ml10">12:00</span></td>
            <td align="center">已结束</td>
        </tr>
        </tbody>
    </table>
    <div class="clearfix mt30 mb20">
        <div class="m-page">
            <a href="#" class="first"><i></i> </a>
            <a href="#" class="prev"><i></i>上一页</a>
            <a href="#">1</a>
            <a href="#">2</a>
            <span class="cur">3</span>
            <a href="#">4</a>
            <span class="dot">...</span>
            <a href="#">6</a>
            <a href="#" class="next">下一页<i></i></a>
            <a href="#" class="last"><i></i></a>
        </div>
    </div>
</div>
<!-- content end -->

<!-- footer start -->
<script type="text/javascript" src="./temp/footer.js"></script>
<!-- footer end -->

<div class="layer-con">
    <div class="popupLayer">
        <div class="pop-bd">
            <h3 class="mb10 f20 tc">取消预定</h3>
            <p class="f14 c3 tc">确定取消该预定会议室么？</p>
        </div>
        <div class="pop-ft tc m-btn-group">
            <a href="#" class="u-btn u-btn-primary">确定</a>
            <a href="javascript:;" class="u-btn u-btn-default" onclick="dialog.closePop()">取消</a>
        </div>
        <a href="javascript:;" class="u-pop-close close">&#xe600;</a>
    </div>
</div>

</body>

<script src="js/calendar.js"></script>
<script src="js/page.js"></script>
<script>
    $(function(){
        $('.u-select').select();
    })
    //弹出层-取消预定
    function cancelReservation(){
        dialog.init({
            'w':580,
            'h':200
        })
    }
</script>
</html>