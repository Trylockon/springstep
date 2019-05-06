<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sale: Edit</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"></head>
<body  style="background-color:#261014;">

<div>
    <fieldset style="background-color:#353B40; width:400px; border-radius:5px">
        <legend>Edit a sale</legend>
        <form name="sale" action="" method="POST" >
            <h5 style="color: white">Product:<@spring.formSingleSelect "saleForm.product", mavs, ""/></h5>
            <br>
            <h5 style="color: white">Date of Sale:<@spring.formInput "saleForm.dateOfSale" "" "date"/></h5>
            <br>
            <h5 style="color: white"> Date of Delivery:<@spring.formInput "saleForm.dateOfDelivery" "" "date"/></h5>
            <br>
            <h5 style="color: white">Quantity:<@spring.formInput "saleForm.quantity" "" "text"/></h5>
            <br>
            <input type="submit" value="Edit" style="border-radius:10px"/>
        </form>
    </fieldset>
</div>

</body>
</html>