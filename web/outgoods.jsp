<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="daoimpl.GoodsDaoImpl"%>
<%@ page import="entity.GoodsEntity" %>
<%@ page import="entity.StaffEntity" %>
<%@ page import="daoimpl.OutGoodsDaoImpl" %>
<%@ page import="entity.OutgoodsEntity" %>
<%@ page import="entity.VOutgoodsEntity" %>
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
        <h4 class="am-popup-title">添加新订单</h4>
        <span data-am-modal-close class="am-close">&times;</span>
    </div>
    <div class="am-popup-bd">

        <form class="am-form tjlanmu" action="servlet/AddGoodsServlet">
            <div class="am-form-group">
                <div class="zuo">商品名称</div>
                <div class="you">
                    <input name="name" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                </div>
            </div>

            <div class="am-form-group">
                <div class="zuo">品种</div>
                <div class="you">
                    <input name="kind" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                </div>
            </div>

            <div class="am-form-group">
                <div class="zuo">厂家</div>
                <div class="you">
                    <input name="productor" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                </div>
            </div>

            <div class="am-form-group">
                <div class="zuo">进价</div>
                <div class="you">
                    <input name="inprice" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                </div>
            </div>

            <div class="am-form-group">
                <div class="zuo">售价</div>
                <div class="you">
                    <input name="outprice" type="email" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                </div>
            </div>

            <div class="am-form-group">
                <div class="zuo">折扣</div>
                <div class="you">
                    <input name="dicount" type="text" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                </div>
            </div>

            <div class="am-form-group am-cf">
                <div class="zuo">售价</div>
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


<div class="am-popup am-popup-inner" id="my-popupss">
    <div class="am-popup-hd">
        <h4 class="am-popup-title">复制栏目</h4>
        <span data-am-modal-close class="am-close">&times;</span> </div>
    <div class="am-popup-bd">
        <form class="am-form tjlanmu">


            <div class="am-form-group">
                <div class="zuo">复制到：</div>
                <div class="you">

                    <select data-am-selected="{btnWidth: 200, btnSize: 'sm', btnStyle: 'danger'}">
                        <option value="a">Apple</option>
                        <option value="b">Banana</option>
                        <option value="o">Orange</option>
                        <option value="m">Mango</option>
                    </select>
                    顶级栏目选默认

                </div>
            </div>


            <div class="am-form-group">
                <div class="zuo">新栏目名称：</div>
                <div class="you">
                    <input type="email" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
                </div>
            </div>
            <div class="am-form-group">
                <div class="zuo">栏目关键词：</div>
                <div class="you">
                    <input type="password" class="am-input-sm" id="doc-ipt-pwd-1" placeholder="请输入关键词">
                </div>
            </div>
            <div class="am-form-group am-cf">
                <div class="zuo">栏目描述：</div>
                <div class="you">
                    <textarea class="" rows="2" id="doc-ta-1"></textarea>
                </div>
            </div>
            <div class="am-form-group am-cf">
                <div class="zuo">栏目图片：</div>
                <div class="you" style="height: 45px;">
                    <input type="file" id="doc-ipt-file-1">
                    <p class="am-form-help">请选择要上传的文件...</p>
                </div>
            </div>
            <div class="am-form-group am-cf">
                <div class="zuo">简介：</div>
                <div class="you">
                    <textarea class="" rows="2" id="doc-ta-1"></textarea>
                </div>
            </div>
            <div class="am-form-group am-cf">
                <div class="zuo">状态：</div>
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
            订单管理
        </ul>
        <dl class="am-icon-home" style="float: right;">
            当前位置：<a href="#"> 首页 ></a> 订单管理
        </dl>
        <dl>
            <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus" data-am-modal="{target: '#my-popup'}">添加新订单</button>
        </dl>
        <!--data-am-modal="{target: '#my-popup'}" 弹出层 ID  弹出层 190行 开始  271行结束-->

    </div>


    <from action="servlet/SearchGoodsServlet" >
        <div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
            <ul>
                <li>
                    <div class="am-btn-group am-btn-group-xs">
                        <select name="kind" data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}" >
                            <option value="kind1">会员1</option>
                            <option value="kind2">会员2</option>
                            <option value="kind3">会员3</option>
                            <option value="kind4">会员4</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div class="am-btn-group am-btn-group-xs">
                        <select name="discount" data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}" >
                            <option value="1.0">1折</option>
                            <option value="2.2">2折</option>
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

                <li style="margin-left: -10px;">
                    <div class="am-btn-group am-btn-group-xs">
                        <select data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}">
                            <option value="b">产品分类</option>
                            <option value="o">下架</option>
                        </select>
                    </div>
                </li>
                <li><input name="words" type="text" class="am-form-field am-input-sm am-input-xm" placeholder="关键词搜索" /></li>
                <li><button type="button" class="am-btn am-radius am-btn-xs am-btn-success" style="margin-top: -1px;">搜索</button></li>
            </ul>
        </div>
    </from>


    <form class="am-form am-g">
        <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
            <thead>
            <tr class="am-success">
                <th align="center" class="table-id">编号</th>
                <th align="center" class="table-type">存根</th>
                <th class="table-type">商品名称</th>
                <th class="table-type">数量</th>
                <th class="table-type">商品类别</th>
                <th class="table-type">厂家</th>
                <th class="table-type">出库时间</th>
                <th class="table-type">经手人</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<VOutgoodsEntity> list=(List<VOutgoodsEntity>)request.getSession().getAttribute("allVOutGoodsList");
                if(list!=null)
                {
                    for(VOutgoodsEntity outgoodsEntity:list)
                    {
            %>

            <tr>
                <td><%= outgoodsEntity.getId()%></td>
                <td><%= outgoodsEntity.getNum()%></td>
                <td><%= outgoodsEntity.getGoodsName()%></td>
                <td><%= outgoodsEntity.getCount()%></td>
                <td><%= outgoodsEntity.getKindName()%></td>
                <td><%= outgoodsEntity.getProductorName()%></td>
                <td><%= outgoodsEntity.getOutdate()%></td>
                <td><%= outgoodsEntity.getUsername()%></td>

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