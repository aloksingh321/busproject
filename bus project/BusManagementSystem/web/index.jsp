<!Doctyp html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">	
<link rel="stylesheet" href="p.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
   
 input[type=text], select {
  width: 70%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 50%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

canvas {
  display: block;
  vertical-align: bottom;
}

#particles-js {
  
  background-color:#e6f2ff;
  background-image: url("");
  background-repeat: no-repeat;
  
}
body{
   margin:0; 
   height:100vh;
   width:100vw;
}
.header{
  display:flex; 
  background-color:black; 	
  padding:0px 24px;
  flex-direction: row;
   justify-content: flex-start;
  flex-wrap: wrap;
}
 .header a{
    color:white;
    cursor:pointer;
    font-size:30px;
    border:none;
    margin:20px;
    text-decoration:none;
}
.header #head{
position:absolute;
top:24px;
left:1140px;
font-size:41px;
 color:white; 
}
.header #head1{
position:absolute;
top:22px;
left:1200px;
font-size:38px;
 color:white; 
}
 a:hover{
 	transition-duration:0.5s;
   transform: translate(0px,-5px);
 	
 }
 .container{
     display:flex;
 }
 .left
 {

  flex:0.42;
  padding:280px 12px;
  background-color:grey;
  overflow:scroll;
 }
 
  #size{
  position:absolute;
  top:124px;
 left:20px;	
 	font-size:35px;
  color:black;
	text-shadow: 0px 0px 10px black; 
  text-decoration:none;
  z-index: 1;
 }
 .right{
 	 flex:2;
    padding:202px 0px;
  height: 400px;
 	
 }
 
 .footer{
    display:flex;
    background-color:black;
    justify-content:center;
    padding:15px 24px;
    flex-direction: row;
    flex-wrap:wrap;
 }
 .footer i{
 	margin:20px;

 }
 i:hover{
 	transition-duration:0.5s;
   transform: translate(0px,-5px);
   flex-grow: 1;
 }
 .in{
 position:absolute;
  top:200px;
  left:20px; 
  font-size:35px;
  color:white;
  text-shadow: 0px 0px 5px white; 
  text-decoration:none;
  z-index: 1;
 }
 .in1{
 position:absolute;
  top:278px;
  left:20px; 
  font-size:35px;
  color:white;
  text-shadow: 0px 0px 5px white; 
  text-decoration:none;
  z-index: 1;
 }
 .in2{
 position:absolute;
  top:350px;
  left:20px; 
  font-size:35px;
  color:white;
  text-shadow: 0px 0px 5px white; 
  text-decoration:none;
  z-index: 1;
 }
 .in3{
 position:absolute;
  top:430px;
  left:20px; 
  font-size:35px;
  color:white;
  text-shadow: 0px 0px 5px white; 
  text-decoration:none;
  z-index: 1;
 }
 
 .can{
   height:150px;
   width :150px;
   background-color:black;
   margin:2px;
   flex-direction:column;

 }
 @media(max-width: 850px)
{
  #right{
   flex:2;
    padding:180px 193px;
  height: 324px;
  background-color:lightgrey;
 }
  #size{
  position:absolute;
  top:300px;
  left:20px; 
  font-size:35px;
  color:black;
  text-shadow: 0px 0px 10px black; 
  text-decoration:none;
  z-index: 1;
 }
 

 .in{
 position:absolute;
  top:382px;
  left:20px; 
  font-size:35px;
  color:white;
  text-shadow: 0px 0px 5px white; 
  text-decoration:none;
  z-index: 1;
 }

 .in1{
 position:absolute;
  top:470px;
  left:20px; 
  font-size:35px;
  color:white;
  text-shadow: 0px 0px 5px white; 
  text-decoration:none;
  z-index: 1;
 }
 .in2{
 position:absolute;
  top:554px;
  left:20px; 
  font-size:35px;
  color:white;
  text-shadow: 0px 0px 5px white; 
  text-decoration:none;
  z-index: 1;
 }
 .in3{
 position:absolute;
  top:631px;
  left:20px; 
  font-size:35px;
  color:white;
  text-shadow: 0px 0px 5px white; 
  text-decoration:none;
  z-index: 1;
 }
.two{
position:absolute;
top:880px;
left:30px;
background-color:orange;
padding:66px 84px;
 z-index: 1;
}
  
.container{
  flex-direction:column;
}
}
.five{
  display:none;
  position:absolute;
  top:140px;
  left:620px;
}
#admin{
    position:absolute;
    top:200px;
    left:160px;
    text-shadow:0px 0px 10px white;
	color:white;
        font-size:60px; 
}
#admin1{
   
    text-shadow:0px 0px 10px white;
	color:white;
        font-size:60px; 
}
.btn1{

 background-color:black;
 margin:40px;
 padding:20px;
 height:200px;
 width:322px;
 cursor:pointer;
}
.regbtn{
  height:60px;
 width:110px;
}
.middle1
{
  position:absolute;
  top:150px;
  left:520px;
  height:600px;
  width:730px;
  display:none;
  background-color:black;
  overflow-y:scroll;
}
.middle
{
  position:absolute;
  top:160px;
  left:520px;
  height:600px;
  width:730px;
  background-color:black;
  overflow-y:scroll;
}
#a:hover{
  background-color:black;
  width:15%;
  cursor:pointer;
}
#b:hover{
  background-color:black;
  width:15%;
  cursor:pointer;
}
#c:hover{
  background-color:black;
  width:15%;
  cursor:pointer;
}
#d:hover{
  background-color:black;
  width:15%;
  cursor:pointer;
}


@import url(https://fonts.googleapis.com/css?family=Open+Sans);

.search {
  top:0px;
  width: 100%;
  position: relative
}

.searchTerm {
  float: left;
  width: 138%;
  border: 3px solid black;
  padding: 27px;
  height: 36px;
  border-radius: 80px;
  outline: none;
  color: #9DBFAF;
}

.searchTerm:focus{
  color: #00B4CC;
}

.searchButton {
  top:-38px;
  position: absolute; 
  right: -279px;
  width: 60px;
  height: 60px;
  border: 1px solid #00B4CC;
  background: black;
  text-align: center;
  color: #fff;
  border-radius: 21px;
  cursor: pointer;
  font-size: 20px;
}

/*Resize the wrap to see the search bar change!*/
.wrap{
  width: 30%;
  position: absolute;
  top: 23%;
  left: 50%;
  transform: translate(-50%, -50%);
  display:none;
}

</style>
</head>
<body>
<div class="header">
<a href="index.jsp">Home</a> 
<a href="#">Contact</a>
<a href="#">Term and condition</a>
<a href="#">About Us</a>
<i class="fa fa-bus" id="head"></i>
<span id="head1">Bus-Management</span>  
 </div> 

<div class="container">
<div class="left">
<sapn id="size">DASHBOARD</sapn>
<span id="a" class="in" onclick="fun()"><i class="fa fa-user" style="font-size:25px;color:black; margin:5px"></i>ADD BUS</span>
<span id="b" class="in1" onclick="fun1()"><i class="fa fa-eye fa-fw" style="font-size:25px;color:black; margin:1px"  ></i>View</span>
<span id="c" class="in2" onclick="fun2()"><i class="fa fa-refresh" style="font-size:25px;color:black; margin:5px"></i>EDIT</span>
<span id="d" class="in3" onclick="fun3()"><i class="fa fa-trash-o" style="font-size:25px;color:black; margin:5px"></i>DELETE</span>
</div>


<div class="right" id="particles-js">


    <div class="middle" id="one">
        <h1 id="admin"> Welcome Admin </h1>
        
    </div>
    


<div class="wrap" id="s1">
   <div class="search">
      <input type="text" class="searchTerm" placeholder="Search Buses......">
      <button class="btn1" type="submit" class="searchButton">
        <i class="fa fa-search"></i>
     </button>
   </div>
</div>

 <div id="form" class="five">
 <div class="demo" >
<div class="main"> 
    <form action="detail" method="post">
     <div  class="effect">
    <h1>Add Bus Details</h1>
      </div>
      <div>
    <sapn id="abc">BusNo</span> <input  id="a" vlaue="" type="text"  name="a" required>   
      </div>
      <br>

      <div>     
   <sapn id="abc">DriverName</span> <input  id="b" value="" type="text" name="b" required>
     </div>
      <br>

       <div>     
   <sapn id="abc">LicenseNo</span> <input id="c" value="" type="text"  name="c" required>
     </div>
      <br>
      
       <div>     
   <sapn id="abc">RouteDetail</span> <input id="d" value="" type="text"  name="d" required>
     </div>
      <br>

      <div>     
   <sapn id="abc">MobileNo</span> <input id= "e" vlaue=""  type="text" name="e" required>
     </div>
      <br>
  <div class="test"> 
<button class="btn" style="float:right;background-color:orange"><span style="color:black" onclick="sun()">Register</span></button>
</div>
   
</form>
</div>
 </div> 
 
 </div>


<div id="form2" class="five"> 
     <div class="demo" >
<div class="main"> 
  <form action="update" method="post">
     <div  class="effect">
         <h1 >Update information By Bus No</h1>
      </div>
      <div>
    <sapn id="abc">BusNo</span> <input  type="text" placeholder="Busno" name="a" required>   
      </div>
      <br>

      <div>     
   <sapn id="abc">DriverName</span> <input  type="text" placeholder="DriverName" name="b" required>
     </div>
      <br>

       <div>     
   <sapn id="abc">LicenseNo</span> <input  type="text" placeholder="License No" name="c" required>
     </div>
      <br>
      
       <div>     
   <sapn id="abc">RouteDetail</span> <input  type="text" placeholder="Route Detail" name="d" required>
     </div>
      <br>

      <div>     
   <sapn id="abc">MobileNo</span> <input  type="text" placeholder="Mobile No" name="e" required>
     </div>
      <br>
  <div class="test"> 
<button class="btn" style="float:right;background-color:whitesmoke" onClick= alert("data is Updated")><span style="color:black">Register</span></button>
</div>
   
</form>
   </div>
         </div>
 </div>

<div id="form3" class="middle1"> 
    <h1 id="admin1"><center>Delete User Detail</center></h1>
    <center>
  <form action="Delete" method="post">
    <label for="fname" Style="color:white;font-size:30px">BUS NO</label>
    <br>
    <input type="text" id="fname" name="firstname" placeholder="busno" required>
   <input type="submit" value="Delete" onClick= alert("data is Updated")>
  </form>
        </center>
</div>


 </div>
</div>



<div class="footer">
<a href="https://www.youtube.com"><i class="fa fa-youtube-square" style="font-size:48px;color:white;"></i></a>
<a href="#"><i class="fa fa-facebook-square" style="font-size:48px;color:white"></i></a>
<a href="#"><i class="fa fa-github-square" style="font-size:48px;color:white"></i></a>
<a href="#"><i class="fa fa-instagram" style="font-size:48px;color:white"></i></a>
</div>


<script>
function fun()
{
  document.getElementById("form").style.display="block";
  document.getElementById("s1").style.display="none";
   document.getElementById("one").style.display="none";
    document.getElementById("form2").style.display="none";
     document.getElementById("form3").style.display="none";
      document.getElementById("form4").style.display="none";
}
function fun1()
{
 fetch();   
document.getElementById("s1").style.display="none"; 
 document.getElementById("one").style.display="block";
   document.getElementById("form").style.display="none";
      document.getElementById("form2").style.display="none";
         document.getElementById("form3").style.display="none";
            document.getElementById("form4").style.display="none";
            
           
}
function fun2()
{
  document.getElementById("form2").style.display="block";
  document.getElementById("s1").style.display="none";
   document.getElementById("one").style.display="none";
    document.getElementById("form").style.display="none";
    document.getElementById("form3").style.display="none";
    document.getElementById("form4").style.display="none";
              

  
}
function fun3()
{
  document.getElementById("form3").style.display="block";
  document.getElementById("s1").style.display="none";
   document.getElementById("one").style.display="none";
   document.getElementById("form").style.display="none";
         document.getElementById("form2").style.display="none";
            document.getElementById("form4").style.display="none";
  
}
function fun4()
{
 document.getElementById("one").style.display="none";
  document.getElementById("s1").style.display="block";
  document.getElementById("form").style.display="none";
  
}
function sun()
{
   document.getElementById("a").value="";
    document.getElementById("b").value="";
    document.getElementById("c").value="";
     document.getElementById("d").value="";
      document.getElementById("a").value="";
   
}

</script>
<script>
 function fetch() {
       var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function(){
          if(this.readyState==4 && this.status==200){
          
            var details=this.responseText;
           document.getElementById("one").innerHTML=details;
           
          }
        };
            
              xhttp.open("POST","Display",true);
              xhttp.send();
         }
  
  
</script>
<script src="Particles.js"> </script>
<script src="App.js"></script>
</body>
</html>
