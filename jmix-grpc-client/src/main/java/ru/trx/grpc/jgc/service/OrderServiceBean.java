package ru.trx.grpc.jgc.service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.trx.grpc.api.OrderIdMsg;
import ru.trx.grpc.api.OrderMsg;
import ru.trx.grpc.api.OrderServiceGrpc;

/**
 * @author vasilev
 */
@Primary
@Service
public class OrderServiceBean {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(OrderServiceBean.class);

    @GrpcClient(OrderServiceGrpc.SERVICE_NAME)
    protected OrderServiceGrpc.OrderServiceBlockingStub orderServiceStub;

    public OrderMsg findOrderById(String id) {
        log.info("Calling find order by id: {}", id);

        var orderId = OrderIdMsg.newBuilder()
                .setId(id)
                .build();

        return orderServiceStub.findOrderById(orderId);
    }
}
