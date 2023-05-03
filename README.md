Adding @Component in the Filter class will automatically set Spring Boot recognize the Filter
```java
@Component
public class CustomFilter implements Filter {
    // Implements the doFilter method
}
```

To execute the filter for only certain url, remove @Component annotation from Filter class
and make a bean from Configuration class.

For example, following Filter CustomFilter2 will only trigger when the client try to access http://localhost:8080/test2
```java
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
```
