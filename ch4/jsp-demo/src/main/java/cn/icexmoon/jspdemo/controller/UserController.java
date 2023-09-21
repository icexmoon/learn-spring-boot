package cn.icexmoon.jspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : jsp-demo
 * @Package : cn.icexmoon.jspdemo.controller
 * @ClassName : .java
 * @createTime : 2023/9/21 15:27
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final String LOGIN_URL = "/jsp/user/login.jsp";
    private static Map<String, String> users = new HashMap<>();

    static {
        users.put("icexmoon", "123");
    }

    /**
     * 登录
     *
     * @return
     */
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpServletRequest httpServletRequest) {
        String correctPassword = users.get(username);
        if (correctPassword == null || correctPassword.isEmpty()) {
            // 帐号不存在
            model.addAttribute("errorMsg", "帐号不存在");
            // 加载登录页
            return LOGIN_URL;
        }
        // 检查密码是否正确
        if (!correctPassword.equals(password)) {
            // 密码不正确
            model.addAttribute("errorMsg", "密码不正确");
            // 加载登录页
            return LOGIN_URL;
        }
        // 密码正确，将登录凭证写入 session
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("username", username);
        // 跳转到用户主页
        return "redirect:/jsp/user/home.jsp";
    }

    /**
     * 加载用户主页
     *
     * @return
     */
    @GetMapping("/home")
    public String homePage(Model model, HttpServletRequest request) {
        String username = (String) request.getSession().getAttribute("username");
        model.addAttribute("username", username);
        return "/jsp/user/home.jsp";
    }

    /**
     * 注销用户
     *
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:" + LOGIN_URL;
    }
}
