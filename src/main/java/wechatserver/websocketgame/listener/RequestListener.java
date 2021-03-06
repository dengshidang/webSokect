package wechatserver.websocketgame.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * 请求监听器
 * 加上自定义请求前处理逻辑。
 */
@WebListener
public class RequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void requestInitialized(ServletRequestEvent arg0) {
        //将所有request请求都携带上httpSession
         ((HttpServletRequest) arg0.getServletRequest()).getSession();
    }

}
