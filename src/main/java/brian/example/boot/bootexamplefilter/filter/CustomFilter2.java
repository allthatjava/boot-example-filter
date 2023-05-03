package brian.example.boot.bootexamplefilter.filter;

import javax.servlet.*;
import java.io.IOException;

public class CustomFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Only go through this filter for URL /test2 "+this.getClass().getName()+"-Start");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Only go through this filter for URL /test2 "+this.getClass().getName()+"-Start");
    }
}
