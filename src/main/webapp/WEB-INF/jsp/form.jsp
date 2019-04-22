<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Hello Form</h2>

${attr}

<form action="/form" method="post">

    <input type="text" name="unBoundTextBox" value="${unBoundTextBox}" />

    <button>Submit</button>

</form>

<%--<form:form modelAttribute="formModel" action="/form" method="post">--%>

    <%--<div>--%>
        <%--<form:hidden path="hiddenField" />--%>
        <%--<form:input type="text" path="textField" />--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<form:select path="selectBox" items="${selectBoxList}" itemValue="id" itemLabel="value"/>--%>
    <%--</div>--%>
    <%--&lt;%&ndash;<form:checkboxes path="selectBox" items="selectBoxList" />&ndash;%&gt;--%>
    <%--<div>--%>
        <%--<input type="text" name="nonBoundTextField" />--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<form:button>Submit</form:button>--%>
    <%--</div>--%>

<%--</form:form>--%>