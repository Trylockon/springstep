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
        <th>ID</th>
        <th>Name</th>
        <th>Date of Birth</th>
        <th>Phone number</th>
        <th>Email</th>
        <th>Order Book</th>
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
                <td>${client.orderBook.sale.productId.name} : ${client.orderBook.sale.productId.price}$</td>
            <#else>
                <td>-----------</td>
            </#if>
        </tr>
    </#list>
</table>
</body>
</html>