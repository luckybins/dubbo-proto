package com.example.dubbo.proto.dubbo.service;


import com.example.dubbo.proto.dubbo.api.jpkg.DubboGreeterTriple;
import com.example.dubbo.proto.dubbo.api.jpkg.GreeterReply;
import com.example.dubbo.proto.dubbo.api.jpkg.GreeterRequest;
import org.apache.dubbo.common.stream.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService(registry = "registryConfig")
public class GreeterImpl extends DubboGreeterTriple.GreeterImplBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreeterImpl.class);

//    @Override
//    public GreeterReply greet(GreeterRequest request) {
//        LOGGER.info("Server received greet request {}" , request);
//        return GreeterReply.newBuilder()
//                .setMessage("hello," + request.getName())
//                .build();
//    }

    @Override
    public void greet(GreeterRequest request, StreamObserver<GreeterReply> responseObserver) {
        LOGGER.info("Server received greet request {}" , request);
        GreeterReply reply = GreeterReply.newBuilder()
                .setMessage("hello," + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
