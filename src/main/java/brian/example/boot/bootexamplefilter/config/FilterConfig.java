package brian.example.boot.bootexamplefilter.config;

import brian.example.boot.bootexamplefilter.filter.CustomFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CustomFilter2> customer2Filter(){
        FilterRegistrationBean<CustomFilter2> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new CustomFilter2());
        registrationBean.setUrlPatterns(Arrays.asList("/test2/*"));
        registrationBean.setOrder(2);

        return registrationBean;
    }
}
