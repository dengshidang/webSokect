package wechatserver.websocketgame.service;

import java.util.List;

import wechatserver.websocketgame.entity.LoadBillDetail;
import wechatserver.websocketgame.web.param.SaleOrderParam;

public interface LoadBillDetailService {

	List<LoadBillDetail> querySaleOrderList(SaleOrderParam saleOrder);

}
