<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
</head>
<body>
<div class="col-lg-6">
<form:form modelAttribute="contact" action="/contactBoot" method="post" class="form-horizontal">

    <fieldset>
        <legend>Contact Form</legend>

        <form:hidden path="contactId" />

        <div class="form-group">
            <label class="col-sm-2 control-label">First Name</label>
            <div class="col-sm-6">
                <form:input type="text" path="firstName" class="form-control" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Last Name</label>
            <div class="col-sm-6">
                <form:input type="text" path="lastName" class="form-control" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Address</label>
            <div class="col-sm-6">
                <form:input type="text" path="address" class="form-control" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">City</label>
            <div class="col-sm-6">
                <form:input type="text" path="city" class="form-control" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">State</label>
            <div class="col-sm-6">
                <form:input type="text" path="state" class="form-control" />
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Zip Code</label>
            <div class="col-sm-6">
                <form:input type="text" path="zipCode" class="form-control" />
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-4 col-sm-offset-2">
                <button type="submit" class="btn btn-primary">Add Contact</button>
            </div>
        </div>

    </fieldset>

</form:form>
</div>
</body>
</html>
