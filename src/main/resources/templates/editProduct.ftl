<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product: Add</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"></head>
<body  style="background-color:#261014;">

<div>
    <fieldset style="background-color:#353B40; width:400px; border-radius:5px">
        <form name="product" action="" method="POST">
            <br>
            <h5 style="color: white">Add Product:</h5>
            <br>
            <h5 style="color: white">Product Name:<@spring.formInput "productForm.name" "" "text"/></h5>
            <br>
            <h5 style="color: white">Price:<@spring.formInput "productForm.price" "" "text"/></h5>
            <br>
            <h5 style="color: white">Type of measure:<@spring.formInput "productForm.measure" "" "text"/></h5>
            <br>
            <h5 style="color:white;">Value of Measure:<@spring.formInput "productForm.valueOfMeasure" "" "text"/></h5>
            <br>
            <input type="submit" value="Edit" style="border-radius:10px"/>
            <br>
        </form>
    </fieldset>
</div>

</body>
</html>