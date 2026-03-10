package com.aarteaga.app_config_azure;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Value("${my.custom.property}")
    private String customProperty;

    @Value("${message}")
    private String message;

    @Value("${my.custom.other}")
    private String other;

    @GetMapping
    public String getCustomProperty(){
        return customProperty;
    }

    @GetMapping("/hola")
    public String getMessage(){
        return message;
    }

    @GetMapping("/other")
    public String getOther(){
        return other;
    }


}
