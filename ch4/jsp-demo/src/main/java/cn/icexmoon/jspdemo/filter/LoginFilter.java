package cn.icexmoon.jspdemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : jsp-demo
 * @Package : cn.icexmoon.jspdemo.filter
 * @ClassName : .java
 * @createTime : 2023/9/21 15:36
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description : 对需要登录权限的页面进行过滤
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 不需要登录也能访问的 url
        String[] noLoginUrls = {"/static/", "/jsp/user/login.jsp", "/user/login"};
        if (!(request instanceof HttpServletRequest) ||
                !(response instanceof HttpServletResponse)) {
            throw new RuntimeException("这不是一个 HTTP 请求");
        }
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String uri = httpServletRequest.getRequestURI();
        for(String u :noLoginUrls){
            if (uri.indexOf(u) == 0){
                // 当前请求路径与不需要登录的路径匹配，直接放行
                chain.doFilter(httpServletRequest, httpServletResponse);
                return;
            }
        }
        // 检查是否已经登录
        HttpSession session = httpServletRequest.getSession();
        String username = (String) session.getAttribute("username");
        if (username == null){
            // 需要登录，跳转到登录页
            httpServletResponse.sendRedirect("/jsp/user/login.jsp");
            return;
        }
        // 已经登录，放行
        chain.doFilter(httpServletRequest, httpServletResponse);
    }
}
