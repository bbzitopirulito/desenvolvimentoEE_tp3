<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>               
        <style>
            #button {
                font-family: sans-serif;  
                color: white;
                margin-top: 25px;
                margin-left: 7%;
                padding: 10px;
                padding-right: 50px;
                padding-left: 50px;
                background-color: blue;
            }
            .inp {
                padding-top: 20px;
            }
            
            label {
                font-family: sans-serif;
            }
            
            input {
                border-radius: 4px;
                padding: 5px;
            }
            #rform {
                padding-left:28%;
                padding-top:10%;
            }
            #form {
                width: 400px;
                height: 400px;
                background-color: #e8e8e8;
                border-radius: 6px;
                margin-left: 38%;
                margin-top: 7%;
            
        </style>
    </head>
    <body>
        <div id="form">
            <form id="rform" action="olaMundo" method="post" onsubmit="return validateForm()">
                <div id="inputs">                    
                    <div class="inp">
                        <label>E-mail</label><br/>                        
                        <input class="input" type="email" name="email" required=""/> <br/>
                    </div>
                    
                    <div  class="inp">
                        <label>Senha</label><br/>                        
                        <input id="password" class="input" type="password" name="password" required=""/> <br/>
                    </div>
                    
                </div>                
                <input type="submit" id="button" value="Logar" />
            </form>                
        </div>       
        <script src="<c:url value = "resources/js/tp1.js" />" type="text/javascript"></script>
    </body>
</html>
