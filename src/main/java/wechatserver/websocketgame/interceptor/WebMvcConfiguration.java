package wechatserver.websocketgame.interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 将自定义的拦截器 进行注册
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 注册监控拦截器
		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

}