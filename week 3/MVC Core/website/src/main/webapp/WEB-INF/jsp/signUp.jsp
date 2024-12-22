<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <h1>sign up Page</h1>
    <form:form action="registerUser" modelAttribute ="user">
        <form:input path="name"/>
        
    <br/>
    Male<form:radiobutton path="gender" value="male"/>
    Female<form:radiobutton path="gender" value="female"/>
    <br/>
    location:
    <form:select path="Location">
        <form:option value="India"></form:option>
        <form:option value="NRI"></form:option>

    </form:select>
    <br/>
    college 
    <form:select path="college">
        <form:option value="test123"></form:option>
        <form:option value="testCollege"></form:option>

    </form:select>
    <input type="submit"/>
    </form:form>
</html>