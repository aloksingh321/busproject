package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!Doctyp html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\t\n");
      out.write("<link rel=\"stylesheet\" href=\"p.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("   \n");
      out.write(" input[type=text], select {\n");
      out.write("  width: 70%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  width: 50%;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write("canvas {\n");
      out.write("  display: block;\n");
      out.write("  vertical-align: bottom;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#particles-js {\n");
      out.write("  \n");
      out.write("  background-color:#e6f2ff;\n");
      out.write("  background-image: url(\"\");\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("body{\n");
      out.write("   margin:0; \n");
      out.write("   height:100vh;\n");
      out.write("   width:100vw;\n");
      out.write("}\n");
      out.write(".header{\n");
      out.write("  display:flex; \n");
      out.write("  background-color:black; \t\n");
      out.write("  padding:0px 24px;\n");
      out.write("  flex-direction: row;\n");
      out.write("   justify-content: flex-start;\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("}\n");
      out.write(" .header a{\n");
      out.write("    color:white;\n");
      out.write("    cursor:pointer;\n");
      out.write("    font-size:30px;\n");
      out.write("    border:none;\n");
      out.write("    margin:20px;\n");
      out.write("    text-decoration:none;\n");
      out.write("}\n");
      out.write(".header #head{\n");
      out.write("position:absolute;\n");
      out.write("top:24px;\n");
      out.write("left:1140px;\n");
      out.write("font-size:41px;\n");
      out.write(" color:white; \n");
      out.write("}\n");
      out.write(".header #head1{\n");
      out.write("position:absolute;\n");
      out.write("top:22px;\n");
      out.write("left:1200px;\n");
      out.write("font-size:38px;\n");
      out.write(" color:white; \n");
      out.write("}\n");
      out.write(" a:hover{\n");
      out.write(" \ttransition-duration:0.5s;\n");
      out.write("   transform: translate(0px,-5px);\n");
      out.write(" \t\n");
      out.write(" }\n");
      out.write(" .container{\n");
      out.write("     display:flex;\n");
      out.write(" }\n");
      out.write(" .left\n");
      out.write(" {\n");
      out.write("\n");
      out.write("  flex:0.42;\n");
      out.write("  padding:280px 12px;\n");
      out.write("  background-color:grey;\n");
      out.write("  overflow:scroll;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write("  #size{\n");
      out.write("  position:absolute;\n");
      out.write("  top:124px;\n");
      out.write(" left:20px;\t\n");
      out.write(" \tfont-size:35px;\n");
      out.write("  color:black;\n");
      out.write("\ttext-shadow: 0px 0px 10px black; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(" .right{\n");
      out.write(" \t flex:2;\n");
      out.write("    padding:202px 0px;\n");
      out.write("  height: 400px;\n");
      out.write(" \t\n");
      out.write(" }\n");
      out.write(" \n");
      out.write(" .footer{\n");
      out.write("    display:flex;\n");
      out.write("    background-color:black;\n");
      out.write("    justify-content:center;\n");
      out.write("    padding:15px 24px;\n");
      out.write("    flex-direction: row;\n");
      out.write("    flex-wrap:wrap;\n");
      out.write(" }\n");
      out.write(" .footer i{\n");
      out.write(" \tmargin:20px;\n");
      out.write("\n");
      out.write(" }\n");
      out.write(" i:hover{\n");
      out.write(" \ttransition-duration:0.5s;\n");
      out.write("   transform: translate(0px,-5px);\n");
      out.write("   flex-grow: 1;\n");
      out.write(" }\n");
      out.write(" .in{\n");
      out.write(" position:absolute;\n");
      out.write("  top:200px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:white;\n");
      out.write("  text-shadow: 0px 0px 5px white; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(" .in1{\n");
      out.write(" position:absolute;\n");
      out.write("  top:278px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:white;\n");
      out.write("  text-shadow: 0px 0px 5px white; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(" .in2{\n");
      out.write(" position:absolute;\n");
      out.write("  top:350px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:white;\n");
      out.write("  text-shadow: 0px 0px 5px white; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(" .in3{\n");
      out.write(" position:absolute;\n");
      out.write("  top:430px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:white;\n");
      out.write("  text-shadow: 0px 0px 5px white; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write(" .can{\n");
      out.write("   height:150px;\n");
      out.write("   width :150px;\n");
      out.write("   background-color:black;\n");
      out.write("   margin:2px;\n");
      out.write("   flex-direction:column;\n");
      out.write("\n");
      out.write(" }\n");
      out.write(" @media(max-width: 850px)\n");
      out.write("{\n");
      out.write("  #right{\n");
      out.write("   flex:2;\n");
      out.write("    padding:180px 193px;\n");
      out.write("  height: 324px;\n");
      out.write("  background-color:lightgrey;\n");
      out.write(" }\n");
      out.write("  #size{\n");
      out.write("  position:absolute;\n");
      out.write("  top:300px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:black;\n");
      out.write("  text-shadow: 0px 0px 10px black; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write("\n");
      out.write(" .in{\n");
      out.write(" position:absolute;\n");
      out.write("  top:382px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:white;\n");
      out.write("  text-shadow: 0px 0px 5px white; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" .in1{\n");
      out.write(" position:absolute;\n");
      out.write("  top:470px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:white;\n");
      out.write("  text-shadow: 0px 0px 5px white; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(" .in2{\n");
      out.write(" position:absolute;\n");
      out.write("  top:554px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:white;\n");
      out.write("  text-shadow: 0px 0px 5px white; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(" .in3{\n");
      out.write(" position:absolute;\n");
      out.write("  top:631px;\n");
      out.write("  left:20px; \n");
      out.write("  font-size:35px;\n");
      out.write("  color:white;\n");
      out.write("  text-shadow: 0px 0px 5px white; \n");
      out.write("  text-decoration:none;\n");
      out.write("  z-index: 1;\n");
      out.write(" }\n");
      out.write(".two{\n");
      out.write("position:absolute;\n");
      out.write("top:880px;\n");
      out.write("left:30px;\n");
      out.write("background-color:orange;\n");
      out.write("padding:66px 84px;\n");
      out.write(" z-index: 1;\n");
      out.write("}\n");
      out.write("  \n");
      out.write(".container{\n");
      out.write("  flex-direction:column;\n");
      out.write("}\n");
      out.write("}\n");
      out.write(".five{\n");
      out.write("  display:none;\n");
      out.write("  position:absolute;\n");
      out.write("  top:140px;\n");
      out.write("  left:620px;\n");
      out.write("}\n");
      out.write("#admin{\n");
      out.write("    position:absolute;\n");
      out.write("    top:200px;\n");
      out.write("    left:160px;\n");
      out.write("    text-shadow:0px 0px 10px white;\n");
      out.write("\tcolor:white;\n");
      out.write("        font-size:60px; \n");
      out.write("}\n");
      out.write("#admin1{\n");
      out.write("   \n");
      out.write("    text-shadow:0px 0px 10px white;\n");
      out.write("\tcolor:white;\n");
      out.write("        font-size:60px; \n");
      out.write("}\n");
      out.write(".btn1{\n");
      out.write("\n");
      out.write(" background-color:black;\n");
      out.write(" margin:40px;\n");
      out.write(" padding:20px;\n");
      out.write(" height:200px;\n");
      out.write(" width:322px;\n");
      out.write(" cursor:pointer;\n");
      out.write("}\n");
      out.write(".regbtn{\n");
      out.write("  height:60px;\n");
      out.write(" width:110px;\n");
      out.write("}\n");
      out.write(".middle1\n");
      out.write("{\n");
      out.write("  position:absolute;\n");
      out.write("  top:150px;\n");
      out.write("  left:520px;\n");
      out.write("  height:600px;\n");
      out.write("  width:730px;\n");
      out.write("  display:none;\n");
      out.write("  background-color:black;\n");
      out.write("  overflow-y:scroll;\n");
      out.write("}\n");
      out.write(".middle\n");
      out.write("{\n");
      out.write("  position:absolute;\n");
      out.write("  top:160px;\n");
      out.write("  left:520px;\n");
      out.write("  height:600px;\n");
      out.write("  width:730px;\n");
      out.write("  background-color:black;\n");
      out.write("  overflow-y:scroll;\n");
      out.write("}\n");
      out.write("#a:hover{\n");
      out.write("  background-color:black;\n");
      out.write("  width:15%;\n");
      out.write("  cursor:pointer;\n");
      out.write("}\n");
      out.write("#b:hover{\n");
      out.write("  background-color:black;\n");
      out.write("  width:15%;\n");
      out.write("  cursor:pointer;\n");
      out.write("}\n");
      out.write("#c:hover{\n");
      out.write("  background-color:black;\n");
      out.write("  width:15%;\n");
      out.write("  cursor:pointer;\n");
      out.write("}\n");
      out.write("#d:hover{\n");
      out.write("  background-color:black;\n");
      out.write("  width:15%;\n");
      out.write("  cursor:pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("@import url(https://fonts.googleapis.com/css?family=Open+Sans);\n");
      out.write("\n");
      out.write(".search {\n");
      out.write("  top:0px;\n");
      out.write("  width: 100%;\n");
      out.write("  position: relative\n");
      out.write("}\n");
      out.write("\n");
      out.write(".searchTerm {\n");
      out.write("  float: left;\n");
      out.write("  width: 138%;\n");
      out.write("  border: 3px solid black;\n");
      out.write("  padding: 27px;\n");
      out.write("  height: 36px;\n");
      out.write("  border-radius: 80px;\n");
      out.write("  outline: none;\n");
      out.write("  color: #9DBFAF;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".searchTerm:focus{\n");
      out.write("  color: #00B4CC;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".searchButton {\n");
      out.write("  top:-38px;\n");
      out.write("  position: absolute; \n");
      out.write("  right: -279px;\n");
      out.write("  width: 60px;\n");
      out.write("  height: 60px;\n");
      out.write("  border: 1px solid #00B4CC;\n");
      out.write("  background: black;\n");
      out.write("  text-align: center;\n");
      out.write("  color: #fff;\n");
      out.write("  border-radius: 21px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*Resize the wrap to see the search bar change!*/\n");
      out.write(".wrap{\n");
      out.write("  width: 30%;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 23%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  display:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\">\n");
      out.write("<a href=\"index.jsp\">Home</a> \n");
      out.write("<a href=\"#\">Contact</a>\n");
      out.write("<a href=\"#\">Term and condition</a>\n");
      out.write("<a href=\"#\">About Us</a>\n");
      out.write("<i class=\"fa fa-bus\" id=\"head\"></i>\n");
      out.write("<span id=\"head1\">Bus-Management</span>  \n");
      out.write(" </div> \n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"left\">\n");
      out.write("<sapn id=\"size\">DASHBOARD</sapn>\n");
      out.write("<span id=\"a\" class=\"in\" onclick=\"fun()\"><i class=\"fa fa-user\" style=\"font-size:25px;color:black; margin:5px\"></i>ADD BUS</span>\n");
      out.write("<span id=\"b\" class=\"in1\" onclick=\"fun1()\"><i class=\"fa fa-eye fa-fw\" style=\"font-size:25px;color:black; margin:1px\"  ></i>View</span>\n");
      out.write("<span id=\"c\" class=\"in2\" onclick=\"fun2()\"><i class=\"fa fa-refresh\" style=\"font-size:25px;color:black; margin:5px\"></i>EDIT</span>\n");
      out.write("<span id=\"d\" class=\"in3\" onclick=\"fun3()\"><i class=\"fa fa-trash-o\" style=\"font-size:25px;color:black; margin:5px\"></i>DELETE</span>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"right\" id=\"particles-js\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"middle\" id=\"one\">\n");
      out.write("        <h1 id=\"admin\"> Welcome Admin </h1>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrap\" id=\"s1\">\n");
      out.write("   <div class=\"search\">\n");
      out.write("      <input type=\"text\" class=\"searchTerm\" placeholder=\"Search Buses......\">\n");
      out.write("      <button class=\"btn1\" type=\"submit\" class=\"searchButton\">\n");
      out.write("        <i class=\"fa fa-search\"></i>\n");
      out.write("     </button>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" <div id=\"form\" class=\"five\">\n");
      out.write(" <div class=\"demo\" >\n");
      out.write("<div class=\"main\"> \n");
      out.write("    <form action=\"detail\" method=\"post\">\n");
      out.write("     <div  class=\"effect\">\n");
      out.write("    <h1>Add Bus Details</h1>\n");
      out.write("      </div>\n");
      out.write("      <div>\n");
      out.write("    <sapn id=\"abc\">BusNo</span> <input  id=\"a\" vlaue=\"\" type=\"text\"  name=\"a\" required>   \n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("      <div>     \n");
      out.write("   <sapn id=\"abc\">DriverName</span> <input  id=\"b\" value=\"\" type=\"text\" name=\"b\" required>\n");
      out.write("     </div>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("       <div>     \n");
      out.write("   <sapn id=\"abc\">LicenseNo</span> <input id=\"c\" value=\"\" type=\"text\"  name=\"c\" required>\n");
      out.write("     </div>\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("       <div>     \n");
      out.write("   <sapn id=\"abc\">RouteDetail</span> <input id=\"d\" value=\"\" type=\"text\"  name=\"d\" required>\n");
      out.write("     </div>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("      <div>     \n");
      out.write("   <sapn id=\"abc\">MobileNo</span> <input id= \"e\" vlaue=\"\"  type=\"text\" name=\"e\" required>\n");
      out.write("     </div>\n");
      out.write("      <br>\n");
      out.write("  <div class=\"test\"> \n");
      out.write("<button class=\"btn\" style=\"float:right;background-color:orange\"><span style=\"color:black\" onclick=\"sun()\">Register</span></button>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write(" </div> \n");
      out.write(" \n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"form2\" class=\"five\"> \n");
      out.write("     <div class=\"demo\" >\n");
      out.write("<div class=\"main\"> \n");
      out.write("  <form action=\"update\" method=\"post\">\n");
      out.write("     <div  class=\"effect\">\n");
      out.write("         <h1 >Update information By Bus No</h1>\n");
      out.write("      </div>\n");
      out.write("      <div>\n");
      out.write("    <sapn id=\"abc\">BusNo</span> <input  type=\"text\" placeholder=\"Busno\" name=\"a\" required>   \n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("      <div>     \n");
      out.write("   <sapn id=\"abc\">DriverName</span> <input  type=\"text\" placeholder=\"DriverName\" name=\"b\" required>\n");
      out.write("     </div>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("       <div>     \n");
      out.write("   <sapn id=\"abc\">LicenseNo</span> <input  type=\"text\" placeholder=\"License No\" name=\"c\" required>\n");
      out.write("     </div>\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("       <div>     \n");
      out.write("   <sapn id=\"abc\">RouteDetail</span> <input  type=\"text\" placeholder=\"Route Detail\" name=\"d\" required>\n");
      out.write("     </div>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("      <div>     \n");
      out.write("   <sapn id=\"abc\">MobileNo</span> <input  type=\"text\" placeholder=\"Mobile No\" name=\"e\" required>\n");
      out.write("     </div>\n");
      out.write("      <br>\n");
      out.write("  <div class=\"test\"> \n");
      out.write("<button class=\"btn\" style=\"float:right;background-color:whitesmoke\" onClick= alert(\"data is Updated\")><span style=\"color:black\">Register</span></button>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("</form>\n");
      out.write("   </div>\n");
      out.write("         </div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<div id=\"form3\" class=\"middle1\"> \n");
      out.write("    <h1 id=\"admin1\"><center>Delete User Detail</center></h1>\n");
      out.write("    <center>\n");
      out.write("  <form action=\"Delete\" method=\"post\">\n");
      out.write("    <label for=\"fname\" Style=\"color:white;font-size:30px\">BUS NO</label>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"busno\" required>\n");
      out.write("   <input type=\"submit\" value=\"Delete\" onClick= alert(\"data is Updated\")>\n");
      out.write("  </form>\n");
      out.write("        </center>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("<a href=\"https://www.youtube.com\"><i class=\"fa fa-youtube-square\" style=\"font-size:48px;color:white;\"></i></a>\n");
      out.write("<a href=\"#\"><i class=\"fa fa-facebook-square\" style=\"font-size:48px;color:white\"></i></a>\n");
      out.write("<a href=\"#\"><i class=\"fa fa-github-square\" style=\"font-size:48px;color:white\"></i></a>\n");
      out.write("<a href=\"#\"><i class=\"fa fa-instagram\" style=\"font-size:48px;color:white\"></i></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function fun()\n");
      out.write("{\n");
      out.write("  document.getElementById(\"form\").style.display=\"block\";\n");
      out.write("  document.getElementById(\"s1\").style.display=\"none\";\n");
      out.write("   document.getElementById(\"one\").style.display=\"none\";\n");
      out.write("    document.getElementById(\"form2\").style.display=\"none\";\n");
      out.write("     document.getElementById(\"form3\").style.display=\"none\";\n");
      out.write("      document.getElementById(\"form4\").style.display=\"none\";\n");
      out.write("}\n");
      out.write("function fun1()\n");
      out.write("{\n");
      out.write(" fetch();   \n");
      out.write("document.getElementById(\"s1\").style.display=\"none\"; \n");
      out.write(" document.getElementById(\"one\").style.display=\"block\";\n");
      out.write("   document.getElementById(\"form\").style.display=\"none\";\n");
      out.write("      document.getElementById(\"form2\").style.display=\"none\";\n");
      out.write("         document.getElementById(\"form3\").style.display=\"none\";\n");
      out.write("            document.getElementById(\"form4\").style.display=\"none\";\n");
      out.write("            \n");
      out.write("           \n");
      out.write("}\n");
      out.write("function fun2()\n");
      out.write("{\n");
      out.write("  document.getElementById(\"form2\").style.display=\"block\";\n");
      out.write("  document.getElementById(\"s1\").style.display=\"none\";\n");
      out.write("   document.getElementById(\"one\").style.display=\"none\";\n");
      out.write("    document.getElementById(\"form\").style.display=\"none\";\n");
      out.write("    document.getElementById(\"form3\").style.display=\"none\";\n");
      out.write("    document.getElementById(\"form4\").style.display=\"none\";\n");
      out.write("              \n");
      out.write("\n");
      out.write("  \n");
      out.write("}\n");
      out.write("function fun3()\n");
      out.write("{\n");
      out.write("  document.getElementById(\"form3\").style.display=\"block\";\n");
      out.write("  document.getElementById(\"s1\").style.display=\"none\";\n");
      out.write("   document.getElementById(\"one\").style.display=\"none\";\n");
      out.write("   document.getElementById(\"form\").style.display=\"none\";\n");
      out.write("         document.getElementById(\"form2\").style.display=\"none\";\n");
      out.write("            document.getElementById(\"form4\").style.display=\"none\";\n");
      out.write("  \n");
      out.write("}\n");
      out.write("function fun4()\n");
      out.write("{\n");
      out.write(" document.getElementById(\"one\").style.display=\"none\";\n");
      out.write("  document.getElementById(\"s1\").style.display=\"block\";\n");
      out.write("  document.getElementById(\"form\").style.display=\"none\";\n");
      out.write("  \n");
      out.write("}\n");
      out.write("function sun()\n");
      out.write("{\n");
      out.write("   document.getElementById(\"a\").value=\"\";\n");
      out.write("    document.getElementById(\"b\").value=\"\";\n");
      out.write("    document.getElementById(\"c\").value=\"\";\n");
      out.write("     document.getElementById(\"d\").value=\"\";\n");
      out.write("      document.getElementById(\"a\").value=\"\";\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write(" function fetch() {\n");
      out.write("       var xhttp = new XMLHttpRequest();\n");
      out.write("        xhttp.onreadystatechange = function(){\n");
      out.write("          if(this.readyState==4 && this.status==200){\n");
      out.write("          \n");
      out.write("            var details=this.responseText;\n");
      out.write("           document.getElementById(\"one\").innerHTML=details;\n");
      out.write("           \n");
      out.write("          }\n");
      out.write("        };\n");
      out.write("            \n");
      out.write("              xhttp.open(\"POST\",\"Display\",true);\n");
      out.write("              xhttp.send();\n");
      out.write("         }\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</script>\n");
      out.write("<script src=\"Particles.js\"> </script>\n");
      out.write("<script src=\"App.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}