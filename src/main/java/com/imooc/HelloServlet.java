package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.function.Predicate;

@Slf4j // 使用log必须加此注解
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    final Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "简易框架";
        logger.debug("name is {}" , name);
        request.setAttribute("name", name);
        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);

    }
}
