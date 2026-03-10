package com.aarteaga.app_config_azure;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Value("${my.custom.property}")
    private String customProperty;

    @GetMapping
    public String getCustomProperty(){
        return customProperty;
    }


}
