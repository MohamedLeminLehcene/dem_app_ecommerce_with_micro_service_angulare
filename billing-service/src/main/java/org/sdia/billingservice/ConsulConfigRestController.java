package org.sdia.billingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class ConsulConfigRestController {
    @Autowired
    private MyConsulConfig myConsulConfig;
    @Autowired
    private MyVaultConfig myVaultConfig;
    //@Value("${token.accessTokenTimeemeout}")
    //private long accessTokenTemeout;
    //@Value("${token.refreshTokenTimeout}")
    //private long refreshTokenTimeout;

/*
    @GetMapping("/myConfig")
    public MyConsulConfig myConfig(){
        return myConsulConfig;
    }
 */

    @GetMapping("/myConfig")
    public Map<String,Object> myConfig(){
        return Map.of("myConsulConf : ",myConsulConfig,"myVaultConfig : ",myVaultConfig);
    }
}

