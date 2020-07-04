package com.serezha.config;

import com.serezha.config.core.ApplicationCoreConfiguration;
import com.serezha.config.mvc.ApplicationWebMvcConfiguration;
import com.serezha.config.socket.raw.ApplicationWebSocketConfig;
import com.serezha.config.socket.stomp.ApplicationWebSocketMessageBrokerConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationCoreConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ApplicationWebMvcConfiguration.class, ApplicationWebSocketConfig.class, ApplicationWebSocketMessageBrokerConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
