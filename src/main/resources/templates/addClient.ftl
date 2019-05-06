<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Client: Add</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body  style="background-color:#261014;">

<div>
    <fieldset style="background-color:#353B40; width:400px; border-radius:5px">
        <legend>Add Client</legend>
        <form name="client" action="" method="POST">
            <h5 style="color: white">Name:<@spring.formInput "clientForm.name" "" "text"/></h5>
            <br>
            <h5 style="color: white">Date Of Birth:<@spring.formInput "clientForm.dateOfBirth" "" "date"/></h5>
            <br>
            <h5 style="color: white"> Email:<@spring.formInput "clientForm.email" "" "text"/></h5>
            <br>
            <h5 style="color: white">Phone Number:<@spring.formInput "clientForm.phoneNumber" "" "text"/></h5>
            <br>
            <input type="submit" value="Create" style="border-radius:10px"/>
        </form>
    </fieldset>
</div>

</body>
</html>