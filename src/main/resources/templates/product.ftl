<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product: Main Page</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<table border="1">
    <thead>
    <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Price</th>
    <th>Units</th>
    </tr>
    </thead>
    <#list products as product>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>${product.valueOfMeasure} ${product.measure}</td>
    </tr>
    </#list>
</table>

</body>
</html>