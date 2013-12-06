package controllers;

import models.User;
import play.*;
import play.api.data.Form;
import play.data.validation.*;
import play.mvc.*;
import play.mvc.Http.Session;
import views.html.*;

public class Application extends Controller {
		
    public static Result index()
    {
        return ok(index.render("Future home of aoegaming..."));
    }
    
    public static Result signup()
    {
    	return ok(signup.render());
    }
    
    public static Result register(String username, String password)
    {
    	User user = new User(username, password, 3);
    	session("connected", username);
    	return ok(login.render());
    }
    
    public static Result login()
    {
    	return ok(login.render());
    }



}
