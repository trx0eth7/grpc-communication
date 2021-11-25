package ru.trx.grpc.jgs.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import ru.trx.grpc.api.OrderIdMsg;
import ru.trx.grpc.api.OrderMsg;
import ru.trx.grpc.api.OrderServiceGrpc;

/**
 * @author vasilev
 */
@GrpcService
public class OrderServiceBean extends OrderServiceGrpc.OrderServiceImplBase {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(OrderServiceBean.class);

    @Override
    public void findOrderById(OrderIdMsg request, StreamObserver<OrderMsg> responseObserver) {
        log.info("Calling find order by id: {}", request.getId());

        var orderMsg = OrderMsg.newBuilder()
                .setId("serverId")
                .build();

        responseObserver.onNext(orderMsg);
        responseObserver.onCompleted();
    }
}
