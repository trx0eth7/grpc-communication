package ru.trx.grpc.jgs.screen.orderline;

import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import ru.trx.grpc.jgs.entity.OrderLine;


/**
 *
 * @author vasilev
 * 
 */
@UiController("jgs_OrderLine.edit")
@UiDescriptor("order-line-edit.xml")
@EditedEntityContainer("orderLineDc")
public class OrderLineEdit extends StandardEditor<OrderLine> {
}