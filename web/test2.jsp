<!doctype html>
<html ng-app>
<head>
<script src="http://localhost:8888/sargeras/frame/angular-1.0.1.min.js"></script>
<script src="script.js"></script>
</head>
<body>
<div ng-controller="MyController">
Your name:
<input type="text" ng-model="username">
<button ng-click='sayHello()'>greet</button>
<hr>
{{greeting}}
</div>
</body>
</html>