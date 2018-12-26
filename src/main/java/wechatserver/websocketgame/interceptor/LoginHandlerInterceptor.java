package wechatserver.websocketgame.interceptor;



import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    /**
     * 开放url ，可以再配置文件中定义，或者直接赋值。例如：/api/login/
     */
    private List<String> allowUrls;
    
    public void setAllowUrls(List<String> allowUrls) {
        this.allowUrls = allowUrls;
    }

    //执行action之前来执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws
            Exception {
        /**这里可以添加：
         * 拦截逻辑处理，对请求头进行拦截，或者定义切面注解过滤。
         */
        String requestUri = request.getRequestURI();
        if(requestUri.startsWith(request.getContextPath())){
            requestUri = requestUri.substring(request.getContextPath().length(), requestUri.length());
        }
        //系统根目录
        if ("/".equals(requestUri)) {
            return true;
        }
        //放行exceptUrls中配置的url
        for (String url:allowUrls
             ) {
            if(url.endsWith("/**")){
                if (requestUri.startsWith(url.substring(0, url.length() - 3))) {
                    return true;
                }
            } else if (requestUri.startsWith(url)) {
                return true;
            }
        }
        return true;
    }
}
