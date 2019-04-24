<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add a product</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Add Product</legend>
        <form name="product" action="" method="POST">
            Product Name:<@spring.formInput "productForm.name" "" "text"/>
            <br>
            Price:<@spring.formInput "productForm.price" "" "text"/>
            <br>
            Type of measure:<@spring.formInput "productForm.measure" "" "text"/>
            <br>
            Value of Measure:<@spring.formInput "productForm.valueOfMeasure" "" "text"/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>