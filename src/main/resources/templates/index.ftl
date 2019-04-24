<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Online Shop</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<h1>${message}</h1>
<br>
<h2>Map:</h2>
<h3><a href="<@spring.url 'product/list'/>">1)Product List</a></h3>
<h3><a href="<@spring.url 'product/add'/>">2)Add Product</a></h3>
<h3><a href="<@spring.url 'client/list'/>">3)Client List</a></h3>
<h3><a href="<@spring.url 'client/add'/>">4)Add Client</a></h3>
</body>
</html>