<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html>
<html lang="zh-cn" ng-app='drag'>
<head>
 <%@include file="/frame/title.jsp" %>
</head>
<body>
<div ng-controller="bind">
<table>
<tr>
	<td>
		<input type="number" ng-model="userName" required draggable></input>
	</td>
	<td>
		{{userName|currency}}
	</td>
</tr>
</table>
</div>
</body>
<script type="text/javascript" src="frame/framework/angular-1.0.1.min.js"></script>
<script type="text/javascript" src="frame/script.js"></script>
<script type="text/javascript">
function bind($scope){
	alert(1);
}
</script>
</html>