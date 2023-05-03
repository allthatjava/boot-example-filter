package brian.example.boot.bootexamplefilter.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class CustomFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Every call will go through this filter-"+this.getClass().getName()+"-Start");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Every call will go through this filter-"+this.getClass().getName()+"-End");
    }
}
