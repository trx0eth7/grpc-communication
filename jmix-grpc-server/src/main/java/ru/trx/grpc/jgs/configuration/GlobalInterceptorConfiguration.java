package ru.trx.grpc.jgs.configuration;

import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Configuration;
import ru.trx.grpc.jgs.interceptor.LogGrpcAuthenticatingServerInterceptor;

/**
 * @author vasilev
 */
@Configuration(proxyBeanMethods = false)
public class GlobalInterceptorConfiguration {

    @GrpcGlobalServerInterceptor
    LogGrpcAuthenticatingServerInterceptor logGrpcAuthenticatingServerInterceptor() {
        return new LogGrpcAuthenticatingServerInterceptor();
    }
}
