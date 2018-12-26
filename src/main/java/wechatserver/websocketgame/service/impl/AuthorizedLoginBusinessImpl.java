package wechatserver.websocketgame.service.impl;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wechatserver.websocketgame.service.AuthorizedLoginService;

/**
 * @author dengshidang
 * @version 2018年9月20日下午11:48:12
 * @description
 */
@Service
public class AuthorizedLoginBusinessImpl implements AuthorizedLoginService {
    private WxMpService wxService;

    @Autowired
    private WxMpConfigStorage wxMpConfigStorage;


    public Object getWxAuthorizedUser(String code, String state, Integer from, String wechatId, Long t) {
        return null;
    }


    public Object refreshToken(String refreshToken, String wechatId) {
       return null;
    }

}
