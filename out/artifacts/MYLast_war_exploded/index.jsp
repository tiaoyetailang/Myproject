<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>书城首页</title>


	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp"%>


</head>
<body>


	
	<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
			<span class="wel_word">网上书城</span>
			<div>
				<c:if test="${empty username}">
					<a href="pages/user/login.jsp">登录</a> |
					<a href="pages/user/regist.jsp">注册</a> &nbsp;

				</c:if>
				<c:if test="${not empty username}">
					<span>欢迎<span class="um_span">${username}</span>光临尚硅谷书城</span>
					<a href="pages/order/order.jsp">我的订单</a>
					<a href="index.jsp">注销</a>&nbsp;&nbsp;

				</c:if>
			&nbsp;
				<a href="gouwuche">购物车</a>
				<a href="jianyan">后台管理</a>
			</div>
	</div>

	<div id="main">
		<div id="book">
			<div class="book_cond">
				<form action="fuck" >
					价格：<input id="min" type="text" name="min" value="${min}"> 元 -
						<input id="max" type="text" name="max" value="${max}"> 元
						<input type="submit" value="查询" />
				</form>
			</div>
			<div style="text-align: center">
				<span>您的购物车中有${size}件商品</span>
				<div>
					您刚刚将<span style="color: red">时间简史</span>加入到了购物车中
				</div>
			</div>
			<c:forEach items="${allbook.list}" var="book">
				<div class="b_list">
					<div class="img_div">
						<img class="book_img" alt="" src="static/img/default.jpg" />
					</div>
					<div class="book_info">
						<div class="book_name">
							<span class="sp1">书名:</span>
							<span class="sp2">${book.name}</span>
						</div>
						<div class="book_author">
							<span class="sp1">作者:</span>
							<span class="sp2">${book.author}</span>
						</div>
						<div class="book_price">
							<span class="sp1">价格:</span>
							<span class="sp2">${book.price}</span>
						</div>
						<div class="book_sales">
							<span class="sp1">销量:</span>
							<span class="sp2">${book.sales}</span>
						</div>
						<div class="book_amount">
							<span class="sp1">库存:</span>
							<span class="sp2">${book.stock}</span>
						</div>
						<div class="book_add">

							<form:form id="fffd">--%>
								<input type="hidden" name="id" value="${book.id}"--%>

							</form:form>
							<input id="haha" type="button"  value="加入购物车" />12


						</div>
					</div>
				</div>

			</c:forEach>
			<script type="text/javascript">
				$(function () {
					$("#haha").click(function () {
						$.getJSON("yanling/${book.id}",function () {  //
							alert("添加成功");
						})

					});


				});


			</script>



			<div id="page_nav">
				<a href="fuck?pn=1">首页</a>
				<a href="fuck?pn=${allbook.prePage==0?"1":allbook.prePage}">上一页</a>
				<c:forEach items="${allbook.navigatepageNums}" var="number">
					<a href="fuck?pn=${number}">${number}</a>
				</c:forEach>
				<a href="fuck?pn=${allbook.nextPage==0?allbook.pages:allbook.nextPage}">下一页</a>
				<a href="fuck?pn=${allbook.pages}">末页</a>
				共${allbook.pages}页，${allbook.total}条记录

			</div>


	
	</div>

	<%--静态包含页脚内容--%>
	<%@include file="/pages/common/footer.jsp"%>

</body>
</html>