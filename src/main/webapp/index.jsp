<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>ManageMoney</title>
    <script type="text/javascript" href="js/lib.min.js.下载"></script>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="css/global.css">
    <link rel="stylesheet" type="text/css" href="css/headAndTail.css">
</head>

<body>
    <div class="page-div">
        <div class="head-warp">
            <div class="head">
                <h1 class="logo">
					<a href="javaScript:void(0)">
						<img src="images/logo.png">
					</a>
				</h1>
                <div class="main-nav">
                    <a class="nav-index" href="javaScript:void(0)">首页</a>
                    <a class="nav-index" href="javaScript:void(0)">余额宝</a>
                    <a class="nav-index" href="javaScript:void(0)">关于我们</a>
                    <a class="text-login" href="login01.html">
						<span class="avata">
							<img src="images/header_default.jpg">
						</span>
					登录</a>
                </div>
            </div>
        </div>
        <hr>
        <div class="main-div">
            <div class="banner">
                <ul id="focus_list_box">
                    <li style="z-index: 109">
                        <div style="background-image:url(images/bannerimage.png); " class="image-warp">
                            <a href="javaScript:void(0)"></a>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="index-count-spl">
                <div class="wrap">
                </div>
            </div>
            <div class="hot-recommand">
                <ul class="hot-list clearfix wrap" id="mod_ad_index_fund">
                    <li>
                        <p class="f-name"><a href="javaScript:void(0)" target="_blank" class="js-ad-fund-link js-ad-fund-name">易方达基金易理财</a></p>
                        <p class="ranger">近7日年化</p>
                        <p class="r-num f-red js-ad-profit">4.2200%</p>
                        <div class="character">
                            <span>低风险</span>
                            <span>随存随取</span>
                            <span>0元起购</span>
                        </div>
                        <div class="btn-wrap">
                            <a href="pay.html" target="_blank" class="js-ad-fund-buy">立即买入</a>
                        </div>
                    </li>
                    <li>
                        <p class="f-name"><a href="javaScript:void(0)" target="_blank" class="js-ad-fund-link js-ad-fund-name">平安养老富盈5号</a></p>
                        <p class="ranger">近7日年化</p>
                        <p class="r-num f-red js-ad-profit">4.9344%</p>
                        <div class="character">
                            <span>中风险</span>
                            <span>灵活存取</span>
                            <span>1000元起购</span>
                        </div>
                        <div class="btn-wrap">
                            <a href="pay.html" target="_blank" class="js-ad-fund-buy">立即买入</a>
                        </div>
                    </li>
                    <li class="last" id="ad_section_3">
                        <p class="f-name"><a href="javaScript:void(0)" target="_blank" class="js-ad-fund-link js-ad-fund-name">太平养老颐养天天</a></p>
                        <p class="ranger">近7日年化</p>
                        <p class="r-num f-red js-ad-profit">4.4890%</p>
                        <div class="character">
                            <span>中风险</span>
                            <span>随存随取</span>
                            <span>1000元起购</span>
                        </div>
                        <div class="btn-wrap">
                            <a href="pay.html" target="_blank" class="js-ad-fund-buy">立即买入
                         	</a>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="main-project">
                <div class="project">理财产品</div>
                <div class="table">
                    <div class="foundation">基金
                        <br>理财</div>
                    <table class="table-content">
                        <tr>
                            <td>基金名称</td>
                            <td>近七日年化<i class="i-var"></i> </td>
                            <td>万份收益</td>
                            <td>产品期限</td>
                        </tr>
                        <tr>
                            <td>余额宝</td>
                            <td>3.300%<i class="i-var"></i> </td>
                            <td>0.832</td>
                            <td>随存随取</td>
                            <td>
                                <a href="pay.html">
                                    <input class="input" type="button" value="买入">
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>余额宝</td>
                            <td>3.530%<i class="i-var"></i> </td>
                            <td>0.932</td>
                            <td>1个月</td>
                            <td>
                                <a href="pay.html">
                                    <input class="input" type="button" value="买入">
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>余额宝</td>
                            <td>3.650%<i class="i-var"></i> </td>
                            <td>1.12</td>
                            <td>3个月</td>
                            <td>
                                <a href="pay.html">
                                    <input class="input" type="button" value="买入">
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>余额宝</td>
                            <td>4.3200%<i class="i-var"></i> </td>
                            <td>1.23</td>
                            <td>半年</td>
                            <td>
                                <a href="pay.html">
                                    <input class="input" type="button" value="买入">
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>余额宝</td>
                            <td>4.620%<i class="i-var"></i> </td>
                            <td>1.42</td>
                            <td>一年</td>
                            <td>
                                <a href="pay.html">
                                    <input class="input" type="button" value="买入">
                                </a>
                            </td>
                        </tr>
                    </table>
                </div>
                <div></div>
            </div>
            <div class="cooperation">
                <div class="cooperation-context">
                    <div class="organization"><strong>合作金融机构</strong></div>
                    <hr>
                    <img src="images/organization.png">
                </div>
            </div>
        </div>
        <div class="footer">
            <div class="wrap clearfix">
                <div class="aboutus">
                    <a target="_blank" href="javaScript:void(0)"><i class="i-logo-lct"></i></a>
                    <div class="rt">
                        <a target="_blank" href="javaScript:void(0)" style="margin:0;"><strong>关于理财精灵</strong></a> <a class="lt-line" href="javaScript:void(0)">理财精灵简介</a>
                    </div>
                </div>
                <div class="contactus">
                    <i class="i-phone"></i>
                    <div class="rt">
                        <strong>联系客服</strong>
                        <span class="lt-line">微信用户：95017（拨通后转1再转6）
					<br>QQ用户：86013860（拨通后转4）</span>
                        <span>工作时间：09:00-22:00</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>