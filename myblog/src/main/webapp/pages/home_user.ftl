<html>
<head>
<title>Home</title>
</head>
<body>
<#assign vm = model["vm"]/>
  <div>
  	<span>${vm.user.surName} ${vm.user.givenName}</span>
  </div>
  <a href="logout">Logout</a>
</body>
</html>