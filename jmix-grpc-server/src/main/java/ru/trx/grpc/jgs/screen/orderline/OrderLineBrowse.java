package ru.trx.grpc.jgs.screen.orderline;

import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import ru.trx.grpc.jgs.entity.OrderLine;


/**
 *
 * @author vasilev
 * 
 */
@UiController("jgs_OrderLine.browse")
@UiDescriptor("order-line-browse.xml")
@LookupComponent("orderLinesTable")
public class OrderLineBrowse extends StandardLookup<OrderLine> {
}