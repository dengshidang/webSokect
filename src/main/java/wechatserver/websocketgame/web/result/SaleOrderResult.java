package wechatserver.websocketgame.web.result;

import wechatserver.websocketgame.entity.LoadBillDetail;

import java.util.List;

public class SaleOrderResult extends BaseResult {

	public SaleOrderResult(){}
	
	public SaleOrderResult(String msg, String msgCode) {
		// TODO Auto-generated constructor stub
		super(msgCode, msg);
	}
	
	private List<LoadBillDetail> orderList;
	
	public List<LoadBillDetail> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<LoadBillDetail> orderList) {
		this.orderList = orderList;
	}
}
