//package com.example.dubbo.proto.dubbo.consumer;
//
//
//import com.example.dubbo.proto.dubbo.api.jpkg.Greeter;
//import com.example.dubbo.proto.dubbo.api.jpkg.GreeterReply;
//import com.example.dubbo.proto.dubbo.api.jpkg.GreeterRequest;
//import org.apache.dubbo.config.annotation.DubboReference;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Consumer implements CommandLineRunner {
//
//    @DubboReference(registry = "registryConfig")
//    private Greeter greeter;
//
//    @Override
//    public void run(String... args) throws Exception {
//        GreeterReply result = greeter.greet(GreeterRequest.newBuilder().setName("name").build());
//        System.out.println("Received result ======> " + result.getMessage());
//    }
//}
