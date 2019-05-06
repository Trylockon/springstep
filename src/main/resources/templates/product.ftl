<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Products: Main Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"></head>
<body  style="background-color:#261014;">
<h4><a href="/api/product/add" style="color: #6F54AB">Add a New Product</a></h4> <h4><a href="/api/" style="color: #6F54AB;">Home</a></h4>
<table class="table table-dark table-sm table-bordered">
    <thead>
    <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Price</th>
    <th>Units</th>
    <th>Edit</th>
    <th>Delete</th>
    </tr>
    </thead>
    <#list products as product>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>${product.valueOfMeasure} ${product.measure}</td>
        <td><a href="/api/product/edit/${product.id}" style="color: #6F54AB">Edit</td>
        <td><a href="/api/product/delete/${product.id}" style="color: #6F54AB">Delete</td>
    </tr>
    </#list>
</table>

</body>
</html>