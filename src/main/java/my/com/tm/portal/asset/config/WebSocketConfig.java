package my.com.tm.portal.asset.config;

import my.com.tm.portal.asset.websocket.CustomHandshakeHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurationSupport;

@Configuration
@EnableWebSocket
public class WebSocketConfig extends WebSocketMessageBrokerConfigurationSupport {

    @Override
    protected void registerStompEndpoints(StompEndpointRegistry registry) {
        registry
                .addEndpoint("/message")
                .setHandshakeHandler(new CustomHandshakeHandler())
                .setAllowedOrigins("*")
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }
}
