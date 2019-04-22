<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form:form modelAttribute="contact" action="/contact" method="post">

    <form:hidden path="contactId" />

    <div>
        <label>First Name:</label>
        <form:input type="text" path="firstName" />
    </div>

    <div>
        <label>Last Name:</label>
        <form:input type="text" path="lastName" />
    </div>

    <div>
        <label>Address</label>
        <form:input type="text" path="address" />
    </div>

    <div>
        <label>City</label>
        <form:input type="text" path="city" />
    </div>

    <div>
        <label>State</label>
        <form:input type="text" path="state" />
    </div>

    <div>
        <label>Zip Code</label>
        <form:input type="text" path="zipCode" />
    </div>

    <div>
        <button>Add Contact</button>
    </div>


</form:form>