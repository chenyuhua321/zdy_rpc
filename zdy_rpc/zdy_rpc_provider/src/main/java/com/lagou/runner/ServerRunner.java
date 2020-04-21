package com.lagou.runner;

import com.lagou.config.RpcConfig;
import com.lagou.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Chenyuhua
 * @date 2020/4/21 23:49
 */
@Component
public class ServerRunner implements CommandLineRunner {

    @Value("${rpc.host}")
    private String host;

    @Resource
    private RpcConfig rpcConfig;

    public void run(String... args) throws Exception {
        UserServiceImpl.startServer(rpcConfig.getHost(), rpcConfig.getPort());
        System.out.println("rpc server start");
    }
}
