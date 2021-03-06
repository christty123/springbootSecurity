//package boss.portal.handler;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @Auther: christ
// * @Date: 2018/8/13 16:55
// * @Description:
// */
//@Component
//public class CustomLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler implements LogoutSuccessHandler {
//
//    public CustomLogoutSuccessHandler() {
//        super();
//    }
//
//    // API
//
//    @Override
//    public void onLogoutSuccess(final HttpServletRequest request, final HttpServletResponse response, final Authentication authentication) throws IOException, ServletException {
//        final String refererUrl = request.getHeader("Referer");
//        System.out.println(refererUrl);
//
//        super.onLogoutSuccess(request, response, authentication);
//    }
//
//}