<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page import="daoimpl.GoodsDaoImpl"%>
<%@ page import="entity.GoodsEntity" %>
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
                <h4 class="am-popup-title">添加新商品</h4>
                <span data-am-modal-close class="am-close">&times;</span>
            </div>
            <div class="am-popup-bd">

                <form class="am-form tjlanmu" method="post" action="servlet/GoodsServlet?method=add">
                    <div class="am-form-group">
                        <div class="zuo">商品名称</div>
                        <div class="you">
                            <input required="required" name="name" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="牙刷">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo"></div>
                        <div class="you">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo">品种</div>
                        <div class="you">
                            <input required="required" name="kind_name" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="生活用品">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo">最小库存</div>
                        <div class="you">
                            <input required="required"  name="min_num" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="7.5">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo">厂家</div>
                        <div class="you">
                            <input  required="required" name="productor_name" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="赛诺有限公司">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo">进价</div>
                        <div class="you">
                            <input required="required" name="inprice" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="12.3">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo">售价</div>
                        <div class="you">
                            <input required="required" name="outprice" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="15">
                        </div>
                    </div>

                    <div class="am-form-group">
                        <div class="zuo">折扣</div>
                        <div class="you">
                            <input required="required" name="discount" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="7.5">
                        </div>
                    </div>

                    <div class="am-form-group am-cf">
                        <div class="zuo">是否上架</div>
                        <div class="zuo">是否上架</div>
                        <div class="you" style="margin-top: 3px;">
                            <label class="am-checkbox-inline">
                                <input type="checkbox" value="option1">
                                是 </label>
                            <label class="am-checkbox-inline">
                                <input type="checkbox" value="option2">
                                否</label>
                        </div>
                    </div>
                    <div class="am-form-group am-cf">
                        <div class="you">
                            <p>
                                <button type="submit" value="submit" class="am-btn am-btn-success am-radius">提交</button>
                            </p>
                        </div>
                    </div>
                </form>
            </div>
        </div>




        <div class="admin-biaogelist">
            <div class="listbiaoti am-cf">
                <ul class="am-icon-flag on">
                    库存管理
                </ul>
                <dl class="am-icon-home" style="float: right;">
                    当前位置：<a href="#"> 首页 ></a> 库存管理
                </dl>
                <dl>
                    <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus" data-am-modal="{target: '#my-popup'}">添加新商品</button>
                </dl>
                <!--data-am-modal="{target: '#my-popup'}" 弹出层 ID  弹出层 190行 开始  271行结束-->

            </div>

            <form  method="post" action="servlet/GoodsServlet?method=search">
                <div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
                    <ul>
                        <li>
                            <div class="am-btn-group am-btn-group-xs">
                                <select name="kind" data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}" >
                                    <option value="1.0" selected="selected" >选择分类</option>
                                    <option value="食品">食品</option>
                                    <option value="饮品">饮品</option>
                                    <option value="学习用品">学习用品</option>
                                    <option value="生活用品">生活用品</option>
                                </select>
                            </div>
                        </li>
                        <li>
                            <div class="am-btn-group am-btn-group-xs">
                                <select name="productor" data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}" >
                                    <option value="1.0" selected="selected" >厂家</option>
                                    <option value="赛诺有限公司">赛诺有限公司</option>
                                </select>
                            </div>
                        </li>

                        <li style="margin-right: 0;">
                            <span class="tubiao am-icon-calendar"></span>
                            <input name="starttime" type="text" class="am-form-field am-input-sm am-input-zm  am-icon-calendar" placeholder="开始日期" data-am-datepicker="{theme: 'success',}"  readonly/>
                        </li>
                        <li style="margin-left: -4px;">
                            <span class="tubiao am-icon-calendar"></span>
                            <input name="endtime" type="text" class="am-form-field am-input-sm am-input-zm  am-icon-calendar" placeholder="开始日期" data-am-datepicker="{theme: 'success',}"  readonly/>
                        </li>

                        <li><input name="words" type="text" class="am-form-field am-input-sm am-input-xm" placeholder="关键词搜索" /></li>
                        <li><button type="submit" value="submit" class="am-btn am-radius am-btn-xs am-btn-success" style="margin-top: -1px;">搜索</button></li>
                    </ul>
                </div>
            </from>


            <form class="am-form am-g">
                <table align="center" width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
                    <thead>
                    <tr class="am-success" align="center">
                        <th class="table-id" align="center">编号</th>
                        <th class="table-title" align="center">名称</th>
                        <th class="table-type" align="center">类别</th>
                        <th class="table-type" align="center">厂家</th>
                        <th class="table-type" align="center">库存</th>
                        <th class="table-title" align="center">进价</th>
                        <th class="table-type" align="center">售价</th>
                        <th class="table-type" align="center">折扣</th>
                        <th class="table-type" align="center">最小库存</th>

                        <th class="table-author am-hide-sm-only" align="center">上架/下架 </th>
                        <th class="table-date am-hide-sm-only" align="center">上架时间</th>
                        <th width="163px" class="table-set" align="center">操作</th>
                    </tr>
                    </thead>
                    <tbody>

                    <%
                        List<GoodsEntity> list=(List<GoodsEntity>)request.getSession().getAttribute("allGoodsList");
                        if(list!=null)
                        {
                        for(GoodsEntity goodsEntity:list)
                        {
                    %>

                    <tr>
                        <td><%= goodsEntity.getId()%></td>
                        <td><%= goodsEntity.getName()%></td>
                        <td><%= goodsEntity.getKindName()%></td>
                        <td><%= goodsEntity.getProductorName()%></td>
                        <td><%= goodsEntity.getCount()%></td>
                        <td><%= goodsEntity.getMinNum()%></td>
                        <td><%= goodsEntity.getInprice()%></td>
                        <td><%= goodsEntity.getOutprice()%></td>
                        <td><%= goodsEntity.getDiscount()%></td>

                        <td class="am-hide-sm-only" align="center"><i class="am-icon-check am-text-warning"></i></td>
                        <td class="am-hide-sm-only">2014年9月4日 7:28:47</td>

                        <td>
                            <div class="am-btn-toolbar">
                                <div class="am-btn-group am-btn-group-xs">
                                    <a href='servlet/GoodsServlet?method=delete&deleteGoodsId=<%= goodsEntity.getId()%>'>
                                        <input type='button' class="am-btn am-btn-default am-btn-xs am-text-danger am-round am-icon-trash-o" value='删除'></a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    <%
                        }}
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