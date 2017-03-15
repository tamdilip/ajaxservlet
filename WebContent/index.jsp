<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>State List !!</title>

<script src="http://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
<script src="js/ajax.js" type="text/javascript"></script>
</head>
<body>

	<form>
		Select a Country :
        <select id="countryList">
                <option>Select Country</option>
                <option value="India">India</option>
                <option value="United States">United States</option>
        </select> <br>
        States :
        <select id="stateList">
                <option>Select state</option>
        </select>
	</form>

</body>
</html>