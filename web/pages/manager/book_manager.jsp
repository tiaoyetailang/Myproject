<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书管理</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp"%>
<script type="text/javascript">
	$(function () {
         $("a.deleteClass").click(function () {
                return   confirm("确定删除吗");

		 });


	});


</script>

</head>
<body>
	
	<div id="header">
			<img class="logo_img" alt="" src="../../static/img/logo.gif" >
			<span class="wel_word">图书管理系统</span>

		<%-- 静态包含 manager管理模块的菜单  --%>
		<%@include file="/pages/common/manager_menu.jsp"%>


	</div>
	
	<div id="main">
		<table>
			<tr>
				<td>名称</td>
				<td>价格</td>
				<td>作者</td>
				<td>销量</td>
				<td>库存</td>
				<td colspan="2">操作</td>
			</tr>		

			
      <c:forEach items="${info.list}" var="book">
		  <tr>
			  <td>${book.name}</td>
			  <td>${book.price}</td>
			  <td>${book.author}</td>
			  <td>${book.sales}</td>
			  <td>${book.stock}</td>
			  <td><a href="edit/${book.id}">修改</a></td>
			  <td><a class="deleteClass" href="delete/${book.id}">删除</a></td>
		  </tr>



	  </c:forEach>




			<a href="add">添加</a>

			<div id="page_nav">
				<a href="bookmanager?pn=1">首页</a>
				<a href="bookmanager?pn=${info.prePage==0?"1":info.prePage}">上一页</a>
                    <c:forEach items="${info.navigatepageNums}" var="number">
						<a href="bookmanager?pn=${number}">${number}</a>
					</c:forEach>

<%--				<a href="#">5</a>--%>
				<a href="bookmanager?pn=${info.nextPage==0?info.pages:info.nextPage}">下一页</a>
				<a href="bookmanager?pn=${info.pages}">末页</a>
				共${info.pages}页，${info.total}条记录 到第<input value="4" name="pn" id="pn_input"/>页
				<input id="search" type="button" value="确定" >
				<script type="text/javascript">
					$(function () {
                        $("#search").click(function () {
                                   var pageNp=$("#pn_input").val();

						});
					});


				</script>

			</div>

	</div>

		</table>
	</div>


	<%--静态包含页脚内容--%>
	<%@include file="/pages/common/footer.jsp"%>


</body>
</html>