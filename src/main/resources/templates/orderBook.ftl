<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Books: Main Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"></head>
<body  style="background-color:#261014;">
<h4><a href="/api/orderbook/add" style="color: #6F54AB">Add a new Order Book</a></h4> <h4><a href="/api/" style="color: #6F54AB;">Home</a></h4>
<table class="table table-dark table-sm table-bordered">
    <thead>
    <tr>
    <th>Book Id</th>
    <th>Sale Id</th>
    <th>Product Name</th>
    <th>Product Price</th>
    <th>Quantity</th>
    <th>Sale Date</th>
    <th>Edit</th>
    <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <#list orderBooks as orderBook>
        <tr>
        <td>${orderBook.id}</td>
        <td>${orderBook.sale.id}</td>
        <td>${orderBook.sale.product.name}</td>
        <td>${orderBook.sale.product.price}</td>
        <td>${orderBook.sale.quantity}</td>
        <td>${orderBook.sale.dateOfSale}</td>
        <td><a href="/api/orderbook/edit/${orderBook.id}" style="color: #6F54AB">Edit</a></td>
        <td><a href="/api/orderbook/delete/${orderBook.id}" style="color: #6F54AB">Delete</a></td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>