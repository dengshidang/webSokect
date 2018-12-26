package wechatserver.websocketgame.controller;

import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wechatserver.websocketgame.service.AuthorizedLoginService;

@RestController
public class DemoAuthTokenController {
    @Autowired
    private AuthorizedLoginService authorizedLoginService;
    @Autowired
   private  WxMpService wxMpService ;

    /**
     * 前端的code 换取token，
     * 如果所以业务必须经过后台，则可以考虑将微信token换成定义的token给前端。
     * 当，前端请求微信业务时，后台再去缓存取出token去访问微信服务器即可。
     * 而这个定义的token 用于鉴别是否为客户端已授权对象。
     * @param loginCode
     * @return
     */
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
