package wechatserver.websocketgame.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wechatserver.websocketgame.entity.LoadBillDetail;
import wechatserver.websocketgame.service.LoadBillDetailService;
import wechatserver.websocketgame.web.param.SaleOrderParam;

@Service
@Transactional(readOnly=true)
public class LoadBillDetailServiceImpl implements LoadBillDetailService {

	/*@Autowired
	LoadBillDetailDao loadBillDetailDao;*/

	@Override
	public List<LoadBillDetail> querySaleOrderList(SaleOrderParam saleOrder) {
		return null;
		// TODO Auto-generated method stub
		//return loadBillDetailDao.queryLoadBillDetailList(saleOrder.getLoadCode());
	}
}
