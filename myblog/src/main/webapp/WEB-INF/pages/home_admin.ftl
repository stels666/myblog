<html>
<head>
<title>Home</title>
</head>
<body>
<#assign vm = model["vm"]/>
  <table>
    <tr>
        <th>id</th>  
        <th>email</th>
        <th>surName</th>  
        <th>givenName</th>
    </tr>
    <#list vm.users as user>
    <tr>
        <td>${user.id}</td> 
        <td>${user.email}</td>
        <td>${user.surName}</td>
        <td>${user.givenName}</td>
    </tr>
    </#list>
  </table>
  
  <a href="logout">Logout</a>
</body>
</html>