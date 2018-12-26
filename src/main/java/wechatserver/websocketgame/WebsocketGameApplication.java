package wechatserver.websocketgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class WebsocketGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketGameApplication.class, args);
    }

}

