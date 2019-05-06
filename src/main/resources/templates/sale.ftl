<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sales: Main Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body  style="background-color:#261014;">
<h4><a href="/api/sale/add" style="color: #6F54AB;">Add a New Sale</a></h4> <h4><a href="/api/" style="color: #6F54AB;">Home</a></h4>
<table class="table table-dark table-sm table-bordered">
    <thead>
    <tr>
    <th>Sale Id</th>
    <th>Name</th>
    <th>Price</th>
    <th>Sale Date</th>
    <th>Delivery Date</th>
    <th>Quantity</th>
    <th>Edit</th>
    <th>Delete</th>
    </tr>
    </thead>
    <#list sales as sale>
    <tr>
        <td>${sale.id}</td>
        <td>${sale.product.name}</td>
        <td>${sale.product.price}</td>
        <td>${sale.dateOfSale}</td>
        <td>${sale.dateOfDelivery}</td>
        <td>${sale.quantity}</td>
        <td><a href="/api/sale/edit/${sale.id}" style="color: #6F54AB">Edit</a></td>
        <td><a href="/api/sale/delete/${sale.id}" style="color: #6F54AB">Delete</a></td>

    </tr>
    </#list>
</table>

</body>
</html>