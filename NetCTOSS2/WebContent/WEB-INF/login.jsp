<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>新开普－MobCBMS</title>
        <link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" /> 
        <script type="text/javascript" src="js/jquery.min.js"></script>
    </head>
    <body class="index">
        <div class="login_box">
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input id="userformat" name="username" type="text" class="width150"/></td>
                    <td class="login_error_info"><span class="required" id="userformat1">30长度的字母、数字和下划线</span></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input id="pwdformat" name="password" type="password" class="width150" /></td>
                    <td><span class="required" id="pwdformat1">30长度的字母、数字和下划线</span></td>
                </tr>
                <tr>
                    <td class="login_info">验证码：</td>
                    <td class="width70"><input name="randomCode" type="text" class="width70" /></td>
                    <td><img src="ImgRandomServlet" alt="验证码" title="点击更换" id="altImg" click="genghuan(this)"/></td>  
                    <td><span class="required" id="codeformat">验证码错误</span></td>              
                </tr>            
                <tr>
                    <td></td>
                    <td class="login_button" colspan="2">
                        <img src="images/login_btn.png" style="cursor:pointer" id="login"/>
                    </td>    
                    <td><span class="required" id="login_info">用户名或密码错误，请重试</span></td>                
                </tr>
            </table>
        </div>
    </body>
    
    <script type="text/javascript">

    	
    	$(function(){
    		/* 点击更换验证码 */
    		 $('#altImg').click(function(){
    			$(this).attr("src","ImgRandomServlet?"+Math.random());
    		});
    		/* 账号格式判断 */
    		$('#userformat').blur(function(){
    			var pattern=/^\w{3,10}$/;
    			if(!pattern.test($(this).val())){
    				$('#userformat1').css("display","block");
    			}else{
    				$('#userformat1').css("display","none");
    			}
    			
    		})
    		/* 密码格式判断 */
    		$('#pwdformat').blur(function(){
    			var pattern=/^\w{6,20}$/;
    			if(!pattern.test($(this).val())){
    				$('#pwdformat1').css("display","block");
    			}else{
    				$('#pwdformat1').css("display","none");
    			}		
    		})
    		
    		
    		
    		/* 点击登录事件 */
    		$('#login').click(function(){
    			$.ajax({
    				type:"post",
    				url:"LoginProcessServlet",
    				data:{
    					username:$("input[name='username']").val(),
    					password:$("input[name='password']").val(),
    					randomCode:$("input[name='randomCode']").val()
    				},
    				dataType:"Json",
    				success:function(result){
    					if(result.result1=="correctcode"){
    						$('#codeformat').css('display','none');
    						if(result.result2=="correctuser"){
    							window.location.href="IndexServlet?"+Math.random();
    						}else{
    							$('#login_info').css('display','block');
    						}
    					}else{
    						$('#login_info').css('display','block');
    					}
    				}
    				
    				
    			})/* ajax结束标签*/
    			
    			
    			
    		})
    		
    		
    	})
    
    
    </script>
    
</html>
