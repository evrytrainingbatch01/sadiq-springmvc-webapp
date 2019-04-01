<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Successful</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <script type="text/javascript">
           var moviesByCategory = {
   TELUGU: ['SHIVA','ATHADU','BUSINESS MAN','SRIMANTHUDU'],
   HINDI: ['3 IDIOTS','PK','KAABIL','DHOOM'],
   ENGLISH: ['SHAPE OF WATER','TITANIC','GRAVITY','AVATAR'],
   KANNADA: ['UPENDRA','RAA','A']
}

    function changecat(value) {
        if (value.length == 0) document.getElementById("category").innerHTML = "<option></option>";
        else {
            var catOptions = "";
            for (categoryId in moviesByCategory[value]) {
                catOptions += "<option>" + moviesByCategory[value][categoryId] + "</option>";
            }
            document.getElementById("category").innerHTML = catOptions;
        }
    }   
          
           function checkDate() {
               var selectedDate = document.getElementById('datepicker').value;
               var today = new Date();
               var dt1 = Date.parse(today),
               dt2 = Date.parse(selectedDate);
               
               if (dt2 < dt1) {
                    alert("Date must be in the future");
               }  
               
           }
        </script>
</head>
<body>
<center>
<h1>BookMyShow</h1>
<h2>Hii Welcome to Homepage</h2>
<form action="./bookTicket.do" method="post">
<table>
<tr><td>Language</td><td> <select name="language" id="meal" onchange="changecat(this.value);">
    <option value="">Select</option>
    <option value="TELUGU">TELUGU</option>
    <option value="HINDI">HINDI</option>
    <option value="ENGLISH">ENGLISH</option>
    <option value="KANNADA">KANNADA</option>
</select></td></tr>

<tr><td>Movie</td><td> <select name="movie" id="category">
    <option value="">Select</option>
</select></td></tr>
<tr><td>City</td><td> <input type="text" name="city" required></td></tr>
  <tr><td>  Date</td><td><input type="date" name="date" id="datepicker" onchange="checkDate()" required></td></tr>
  <tr><td>Seats</td><td><input type="number" name="seats" required></td></tr>
    <tr><td><input type="submit" name="submit" value="Book"></td>
<td><input type="reset" name="reset" value="Reset"></td></tr></table>
    
    


</form>
</center>
</body>
</html>