package com.rubin.webapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by rubin on 16-4-10.
 */
@Configuration
public class WebAppConfiguration extends WebMvcConfigurerAdapter {

    @Override public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
    }

}
