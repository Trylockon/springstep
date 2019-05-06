<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product: Main Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"></head>
<body  style="background-color:#261014;">
<h4><a href="/api/client/add" style="color: #6F54AB">Add a New Client</a></h4> <h4><a href="/api/" style="color: #6F54AB;">Home</a></h4>
<table class="table table-dark table-sm table-bordered">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date of Birth</th>
        <th>Phone number</th>
        <th>Email</th>
        <th>Order Book</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <#list clients as client>
        <tr>
            <td>${client.id}</td>
            <td>${client.name}</td>
            <td>${client.dateOfBirth}</td>
            <td>${client.phoneNumber}</td>
            <td>${client.email}</td>
            <#if client.orderBook??>
            <td>${client.orderBook.sale.product.name}:${client.orderBook.sale.product.price}</td>
                <td><a href="/api/client/edit/${client.id}">Edit</a></td>
                <td><a href="/api/client/delete/${client.id}">Delete</a></td>
            </#if>
            <#else>
                <td>-</td>
            <td><a href="/api/client/edit/${client.id}" style="color: #6F54AB">Edit</a></td>
            <td><a href="/api/client/delete/${client.id}" style="color: #6F54AB">Delete</a></td>
        </tr>
    </#list>
</table>
</body>
</html>