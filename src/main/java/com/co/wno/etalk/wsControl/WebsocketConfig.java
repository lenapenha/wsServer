package com.co.wno.etalk.wsControl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
@EnableAutoConfiguration
public class WebsocketConfig implements WebSocketConfigurer {

    @Bean
    public WebSocketHandler myMessageHandler() {
        return new CallHandler();
    }

    @Bean
    public UserRegistry registry() {
        return new UserRegistry();
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(myMessageHandler(), "/my-ws").setAllowedOrigins("*");

    }
}