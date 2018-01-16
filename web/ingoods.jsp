<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="daoimpl.GoodsDaoImpl"%>
<%@ page import="entity.GoodsEntity" %>
<%@ page import="entity.VIngoodsEntity" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze UI Admin index Examples</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="assets/css/admin.css">
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/app.js"></script>
</head>

<body>

        <jsp:include page="top.jsp"/>

        <div class="am-popup am-popup-inner" id="my-popup">
            <div class="am-popup-hd">
                <h4 class="am-popup-title">添加进货</h4>
                <span data-am-modal-close class="am-close">&times;</span>
            </div>
            <div class="am-popup-bd">
                <form class="am-form tjlanmu" method="post" action="servlet/InGoodsServlet?method=add">
                    <div class="am-form-group">
                        <div class="zuo">商品名称</div>
                        <div class="you">
                            <input required="required" name="name" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo"></div>
                        <div class="you">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo">进价</div>
                        <div class="you">
                            <input required="required" name="inprice" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo">数量</div>
                        <div class="you">
                            <input required="required" name="count" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                        </div>
                    </div>

                    <div class="am-form-group am-cf">
                        <div class="zuo">职员</div>
                        <div class="you" style="margin-top: 3px;">
                            <label class="am-checkbox-inline">
                                <input type="checkbox" value="option1">
                                显示 </label>
                            <label class="am-checkbox-inline">
                                <input type="checkbox" value="option2">
                                隐藏 </label>
                        </div>
                    </div>
                    <div class="am-form-group am-cf">
                        <div class="you">
                            <p>
                                <button type="submit" class="am-btn am-btn-success am-radius">提交</button>
                            </p>
                        </div>
                    </div>
                </form>
            </div>
        </div>




        <div class="admin-biaogelist">
            <div class="listbiaoti am-cf">
                <ul class="am-icon-flag on">
                    进货管理
                </ul>
                <dl class="am-icon-home" style="float: right;">
                    当前位置：<a href="#"> 首页 ></a> 添加新进货
                </dl>
                <dl>
                    <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus" data-am-modal="{target: '#my-popup'}">添加新进货</button>
                </dl>
                <!--data-am-modal="{target: '#my-popup'}" 弹出层 ID  弹出层 190行 开始  271行结束-->

            </div>

            <form  method="post" action="servlet/InGoodsServlet?method=search">
                <div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
                    <ul>
                        <li>
                            <div class="am-btn-group am-btn-group-xs">
                                <select name="kind" data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}" >
                                    <option value="" selected="selected" >选择分类</option>
                                    <option value="食物">食物</option>
                                    <option value="饮品">饮品</option>
                                    <option value="学习用品">学习用品</option>
                                    <option value="生活用品">生活用品</option>
                                </select>
                            </div>
                        </li>
                        <li>
                            <div class="am-btn-group am-btn-group-xs">
                                <select name="productor" data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}" >
                                    <option value="" selected="selected" >厂家</option>
                                    <option value="赛诺有限公司">赛诺有限公司</option>
                                    <option value="建和有限公司">建和有限公司</option>
                                    <option value="九鼎有限公司">九鼎有限公司</option>
                                    <option value="洲际有限公司">洲际有限公司</option>
                                    <option value="花城有限公司">花城有限公司</option>
                                    <option value="九恒有限公司">九恒有限公司</option>
                                    <option value="建和有限公司">建和有限公司</option>
                                    <option value="安琪有限公司">安琪有限公司</option>
                                    <option value="新天有限公司">新天有限公司</option>
                                    <option value="聚商有限公司">聚商有限公司</option>

                                </select>
                            </div>
                        </li>

                        <li style="margin-right: 0;">
                            <span class="tubiao am-icon-calendar"></span>
                            <input name="startdate" type="text" class="am-form-field am-input-sm am-input-zm  am-icon-calendar" placeholder="开始日期" data-am-datepicker="{theme: 'success',}"  readonly/>
                        </li>
                        <li style="margin-left: -4px;">
                            <span class="tubiao am-icon-calendar"></span>
                            <input name="enddate" type="text" class="am-form-field am-input-sm am-input-zm  am-icon-calendar" placeholder="开始日期" data-am-datepicker="{theme: 'success',}"  readonly/>
                        </li>

                        <li><input name="words" type="text" class="am-form-field am-input-sm am-input-xm" placeholder="关键词搜索" /></li>
                        <li><button type="submit" value="submit" class="am-btn am-radius am-btn-xs am-btn-success" style="margin-top: -1px;">搜索</button></li>
                    </ul>
                </div>
                </from>


            <form class="am-form am-g">
                <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
                    <thead>
                    <tr class="am-success">
                        <th class="table-id">编号</th>
                        <th class="table-title">名称</th>
                        <th class="table-type">类别</th>
                        <th class="table-type">厂家</th>
                        <th class="table-type">进货数量</th>
                        <th class="table-title">进价</th>
                        <th class="table-type">进货时间</th>
                        <th class="table-set">经手人</th>
                    </tr>
                    </thead>
                    <tbody>


                    <%
                        List<VIngoodsEntity> list=(List<VIngoodsEntity>)request.getSession().getAttribute("allVInGoodsList");
                        if(list!=null)
                        {
                            for(VIngoodsEntity goodsEntity:list)
                            {
                    %>

                    <tr>
                        <td><%= goodsEntity.getId()%></td>
                        <td><%= goodsEntity.getGoodsName()%></td>
                        <td><%= goodsEntity.getKindName()%></td>
                        <td><%= goodsEntity.getProductorName()%></td>
                        <td><%= goodsEntity.getCount()%></td>
                        <td><%= goodsEntity.getInprice()%></td>
                        <td><%= goodsEntity.getIndate()%></td>
                        <td><%= goodsEntity.getUsername()%></td>

                    </tr>
                    <%
                             }
                        }
                    %>
                    </tbody>
                </table>

                <div class="am-btn-group am-btn-group-xs">
                    <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 删除</button>
                    <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 上架</button>
                    <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 下架</button>
                    <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 移动</button>
                    <button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</button>
                    <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
                    <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 移动</button>
                    <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button>
                </div>

                <ul class="am-pagination am-fr">
                    <li class="am-disabled"><a href="#">«</a></li>
                    <li class="am-active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">»</a></li>
                </ul>
                <hr />
                <p>
                    备注：操作图标含义
                    <a class="am-text-success am-icon-file" title="添加子栏目"> 添加子栏目</a>
                    <a class="am-icon-pencil-square-o am-text-secondary" title="修改"> 修改栏目</a>
                    <a class="am-icon-copy am-text-warning" title="复制"> 复制栏目</a>
                    <a class="am-icon-trash-o am-text-danger" title="删除"> 删除栏目</a>
                </p>
            </form>


            <div class="foods">
                <ul>
                    版权所有@2015. 模板收集自 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> -  More Templates<a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
                </ul>
                <dl>
                    <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
                </dl>
            </div>
        </div>
    </div>
</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->

</body>
</html>