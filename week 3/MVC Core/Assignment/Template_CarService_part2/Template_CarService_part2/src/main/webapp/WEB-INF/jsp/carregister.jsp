<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<h1>This is the signup page</h1>

<form:form action="/done" modelAttribute="vehicle">
Car Number
<form:input path="RegisterationNumber"/>
<br/>
<br/>
Car Name
<form:select path="CarName">
<form:option value="Seltos"></form:option>
<form:option value="KIA"></form:option>
</form:select>
<br/>
<br/>
Covered in Warranty
<form:select path="CarDetails">
<form:option value="Yes"></form:option>
<form:option value="No"></form:option>
</form:select>
<br/>
<br/>
Any Remarks
<form:input path="CarWork"/>
<input type="submit">
</form:form>
</html>
