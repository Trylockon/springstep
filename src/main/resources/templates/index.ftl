<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Online Shop</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"></head>
<body  style="background-color:#261014;">

<h1 style="color:white">Online Shop</h1>
<br>
<h2 style="color:white">Map:</h2>
<h3><a href="<@spring.url 'client/list'/>"style="color: #6F54AB">1)Clients</a></h3>
<h3><a href="<@spring.url 'product/list'/>"style="color: #6F54AB">2)Products</a></h3>
<h3><a href="<@spring.url 'sale/list'/>"style="color: #6F54AB">3)Sales</a></h3>
<h3 style="color:#"><a href="<@spring.url 'orderbook/list'/>"style="color: #6F54AB">4)Order Books</a></h3>
</body>
</html>