package wechatserver.websocketgame.config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConditionalOnClass(WxMpService.class)
public class WechatConfig {
        @Bean
        @ConditionalOnMissingBean
        public WxMpConfigStorage configStorage() {
            WxMpInMemoryConfigStorage configStorage = new WxMpInMemoryConfigStorage();
            configStorage.setAppId("wxa61d318e81a9318b");
            configStorage.setSecret("87b174516590c527cf40d644f7c9e540");
            configStorage.setToken("puker_token");
            configStorage.setAesKey("dengshidang");
            return configStorage;
        }

        @Bean
        @ConditionalOnMissingBean
        public WxMpService wxMpService(WxMpConfigStorage configStorage) {
            WxMpService wxMpService = new WxMpServiceImpl();
            wxMpService.setWxMpConfigStorage(configStorage);
            return wxMpService;
        }

        @Bean
        public WxMpMessageRouter router(WxMpService wxMpService) {
            final WxMpMessageRouter newRouter = new WxMpMessageRouter(wxMpService);
         //TODO:登陆处理逻辑实现，关注事件，地理位置信息，菜单定义，等。
        return newRouter;
    }

}
