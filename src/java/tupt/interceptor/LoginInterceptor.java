/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import tupt.controllers.LoginAction;

/**
 *
 * @author TuPT
 */
public class LoginInterceptor extends AbstractInterceptor {
    
    @Override
    public void destroy() {    
    }
    
    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        final ActionContext context = ai.getInvocationContext();
        HttpServletRequest request = (HttpServletRequest) context.get("HTTP_REQUEST");
        HttpSession session = request.getSession(true);
        
        //Check if there is a user object stored in the user's HttpSession
        Object user = session.getAttribute("USERLOGIN");
        if (user == null) {
            //The user has not logged in yet
            
            //The user is attemping to log in
            if (ai.getAction().getClass().equals(LoginAction.class)) {
                return ai.invoke();
            }
            return "login";
        } else {
            return ai.invoke();
        }
    }
    
}
