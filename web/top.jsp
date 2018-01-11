<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="daoimpl.GoodsDaoImpl"%>
<%@ page import="entity.GoodsEntity" %>

<header class="am-topbar admin-header">
    <div class="am-topbar-brand">
        <b><a href="index.jsp">
            <img src="assets/i/favicon.png">
            小型自选商场管理系统 </a>
        </b>
    </div>

    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

            <li class="am-dropdown tognzhi" data-am-dropdown>
                <button class="am-btn am-btn-primary am-dropdown-toggle am-btn-xs am-radius am-icon-bell-o" data-am-dropdown-toggle> 消息管理<span class="am-badge am-badge-danger am-round">6</span></button>
                <ul class="am-dropdown-content">

                    <li class="am-dropdown-header">所有消息都在这里</li>

                    <li><a href="#">未激活会员 <span class="am-badge am-badge-danger am-round">556</span></a></li>
                    <li><a href="#">未激活代理 <span class="am-badge am-badge-danger am-round">69</span></a></a></li>
                    <li><a href="#">未处理汇款</a></li>
                    <li><a href="#">未发放提现</a></li>
                    <li><a href="#">未发货订单</a></li>
                    <li><a href="#">低库存产品</a></li>
                    <li><a href="#">信息反馈</a></li>
                </ul>
            </li>

            <li class="kuanjie">
                <a href="servlet/GoodsServlet?method=getall">商品管理</a>
                <a href="servlet/OutGoodsServlet?method=getall">订单管理</a>
                <a href="servlet/InGoodsServlet?method=getall">进货管理</a>
                <a href="servlet/StaffServlet?method=getall">会员管理</a>
            </li>

            <li class="soso">
                <p>
                    <select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
                        <option value="b">全部</option>
                        <option value="o">产品</option>
                        <option value="o">会员</option>
                    </select>
                </p>

                <p class="ycfg"><input type="text" class="am-form-field am-input-sm" placeholder="圆角表单域" /></p>
                <p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>
            </li>




            <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
        </ul>
    </div>
</header>

<div class="am-cf admin-main">

    <div class="nav-navicon admin-main admin-sidebar">
        <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎管理员：&nbsp&nbsp<b>张伟</b></div>
        <div class="sideMenu">
            <h3 class="am-icon-flag"><em></em> <a href="#">商品管理</a></h3>
            <ul>
                <li><a href="">商品列表</a></li>
                <li class="func" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>添加新商品</li>
                <li>商品分类</li>
                <li>用户评论</li>
                <li>商品回收站</li>
                <li>库存管理 </li>
            </ul>
            <h3 class="am-icon-cart-plus"><em></em> <a href="#"> 订单管理</a></h3>
            <ul>
                <li>订单列表</li>
                <li>合并订单</li>
                <li>订单打印</li>
                <li>添加订单</li>
                <li>发货单列表</li>
                <li>换货单列表<qing/li>
            </ul>
            <h3 class="am-icon-users on"><em></em> <a href="#">会员管理</a></h3>
            <ul>
            </ul>
            <h3 class="am-icon-volume-up"><em></em> <a href="#">信息通知</a></h3>
            <ul>

            </ul>
        </div>
        <!-- sideMenu End -->

        <script type="text/javascript">
            jQuery(".sideMenu").slide({
                titCell:"h3", //鼠标触发对象
                targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
                effect:"slideDown", //targetCell下拉效果
                delayTime:300 , //效果时间
                triggerTime:150, //鼠标延迟触发时间（默认150）
                defaultPlay:true,//默认是否执行效果（默认true）
                returnDefault:false //鼠标从.sideMen移走后返回默认状态（默认false）
            });
        </script>

    </div>

    <div class=" admin-content">
        <div class="daohang">
            <ul>
                <li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs"> 首页 </li>
                <li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">帮助中心<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
                <li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">商品管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
                <li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">产品管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
            </ul>
        </div>