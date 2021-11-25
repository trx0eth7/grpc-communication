package ru.trx.grpc.jgs.screen.order;

import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.slf4j.Logger;
import ru.trx.grpc.jgs.entity.Order;


/**
 * @author vasilev
 */
@UiController("jgs_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
public class OrderBrowse extends StandardLookup<Order> {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(OrderBrowse.class);

}