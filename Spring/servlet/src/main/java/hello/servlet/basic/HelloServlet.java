package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello") //hello로 오면 뜨는것임 페이지 이름은 helloServlet

//서블릿은 먼저 HTTL를  상속받아야 한다
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request); //응답은 어떤 것에 연결되는지
        System.out.println("response = " + response);

        String username = request.getParameter("username"); //응답의 파라미터를 이용해 조회
        System.out.println("username = " + username); //페이지에 username = 진짜 유저네임 출력

        response.setContentType("text/plain");//문자형식 지정 -> 헤더 정보
        response.setCharacterEncoding("utf-8");// 문자 인코딩 지정 -> 헤더 정보
        response.getWriter().write("hello "+ username); //메세지 창에 데이터 입력 hello --- 이런식으로 -> 바디정보


    }
}
