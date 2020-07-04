package com.serezha.config.socket.raw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class ApplicationWebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(applicationWebSocketHandler(), "/raw-ws-handler")
                .addInterceptors(new ApplicationWebSocketHandshakeInterceptor());
    }

    @Bean
    public WebSocketHandler applicationWebSocketHandler() {
        return new ApplicationWebSocketHandler();
    }
}
