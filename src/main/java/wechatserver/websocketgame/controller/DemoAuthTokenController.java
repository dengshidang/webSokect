package wechatserver.websocketgame.controller;

import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wechatserver.websocketgame.service.AuthorizedLoginBusiness;

@RestController
public class DemoAuthTokenController {
    @Autowired
    private AuthorizedLoginBusiness authorizedLoginBusiness;
    @Autowired
   private  WxMpService wxMpService ;
    @RequestMapping("login")
    public Object testToken(String loginCode){
        try {
            WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(loginCode);
            return wxMpOAuth2AccessToken;
        } catch (WxErrorException e) {
           System.out.println(e.getMessage());
        }
        return "获取token失败";
    }
}
