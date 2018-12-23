package wechatserver.websocketgame.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author dengshidang@163.com
 * @date 2018/12/23 0023 14:44
 */
@RestController
public class LoginCotroller {
	@RequestMapping("/toLogin")
	@ResponseBody
	public String toLogin( HttpServletRequest request,String userId){
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("webSocketSessionId", userId);
		return userId;
	}

	@RequestMapping("/queryUserName")
	@ResponseBody
	public String queryUserName(HttpServletRequest request){
		String userId = (String) request.getSession().getAttribute("webSocketSessionId");
		return userId;
	}

	@RequestMapping("/queryRoomCode")
	@ResponseBody
	public String queryRoomCode(HttpServletRequest request){
		String roomCode = (String) request.getSession().getAttribute("roomCode");
		return roomCode;
	}

	@RequestMapping("/toWebsocket")
	public String toWebsocket(HttpServletRequest request,String userId){
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("webSocketSessionId", userId);
		return "login";
	}
}
