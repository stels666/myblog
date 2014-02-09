<html>
<head>
<title>Home</title>
</head>
<body>
  <table>
    <tr>
        <th>id</th>  
        <th>name</th>
    </tr>
    <#list model["animals"] as animal>
    <tr>
        <td>${animal.id}</td> 
        <td>${animal.login}</td>
        <td>${animal.email}</td>
        <td>${animal.password}</td>
    </tr>
    </#list>
  </table>
  
  <a href="logout">Logout</a>
</body>
</html>