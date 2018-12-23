package wechatserver.websocketgame.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wechatserver.websocketgame.service.LoadBillDetailService;
import wechatserver.websocketgame.util.StringUtils;
import wechatserver.websocketgame.web.param.SaleOrderParam;
import wechatserver.websocketgame.web.result.SaleOrderResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoadBillDetailController {

	@Autowired
    HttpServletRequest request;

	@Autowired
    HttpServletResponse response;

	@Autowired
	LoadBillDetailService loadBillDetailService;

	@RequestMapping("/saleOrderList")
	@ResponseBody
	public SaleOrderResult saleOrderList(SaleOrderParam saleOrder){
		if (StringUtils.isEmpty(saleOrder.getLoadCode())) {
			new SaleOrderResult("装载单号不能为空","-1");
		}
		SaleOrderResult result = new SaleOrderResult();
		result.setOrderList(loadBillDetailService.querySaleOrderList(saleOrder));
		return result;
	}

}
