package com.example.patryk.loginregister_v13;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Patryk on 24.04.2016.
 */
public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://ratcooding.site88.net/Register.php"  ;
    private Map<String , String> params ;

    public RegisterRequest (String name , String username , int age  , String password , Response.Listener<String> listener ) {
        super(Method.POST , REGISTER_REQUEST_URL , listener , null ) ;
        params = new HashMap<>();
        params.put("name", name);
        params.put("age", age + "");
        params.put("password" , password);
        params.put("username", username);

    }

    public Map<String, String> getParams() {
        return params;
    }
}
