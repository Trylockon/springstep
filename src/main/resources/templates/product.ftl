<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product: Main Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<table class="table table-sm">
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