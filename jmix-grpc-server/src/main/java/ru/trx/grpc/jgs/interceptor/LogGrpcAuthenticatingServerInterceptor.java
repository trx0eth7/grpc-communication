package ru.trx.grpc.jgs.interceptor;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import net.devh.boot.grpc.server.security.interceptors.AuthenticatingServerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author vasilev
 */
public class LogGrpcAuthenticatingServerInterceptor implements AuthenticatingServerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(LogGrpcAuthenticatingServerInterceptor.class);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call,
                                                                 Metadata headers,
                                                                 ServerCallHandler<ReqT, RespT> next) {
        log.info(call.getMethodDescriptor().getFullMethodName());
        return next.startCall(call, headers);
    }
}
