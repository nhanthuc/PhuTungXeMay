package servlets;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Gio_hang;
import model.User;
import get.UserGet;

@WebServlet(urlPatterns = {"/UserServlet"})
@SuppressWarnings("serial")
public class UserServlet extends HttpServlet {

    UserGet userGet = new UserGet();
    Gio_hang cart = new Gio_hang();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");

        String url = "";
        User users = new User();
        HttpSession session = request.getSession();
        try {
        switch (command) {
            case "insert":
                users.setIduse(new java.util.Date().getTime());//id
                users.setName(request.getParameter("fullname"));
                users.setUsename(request.getParameter("name"));
                users.setPassword(request.getParameter("pass"));
                users.setStatus("Created");
                users.setGioitinh(request.getParameter("sex"));
                users.setDia_chi(request.getParameter("address"));
                users.setSdt(request.getParameter("phone"));
                users.setMail(request.getParameter("email"));
				userGet.insertUser(users);
                session.setAttribute("user", users);
                url = "/PhuTungXeMay/navigate.jsp";
                break;
            case "update":
                long user_id = Long.parseLong(request.getParameter("user_id"));
                String name = request.getParameter("name");
                String username = request.getParameter("username");
                String useremail = request.getParameter("useremail");
                String password = request.getParameter("pass");
                String sex = request.getParameter("sex");
                String address = request.getParameter("address");
                String phone = request.getParameter("phone");
                String status = "Updated";
                userGet.updateUser(new User(user_id, name, username, password, status, sex, address, phone, useremail));
                url = "/myaccount.jsp";
                break;
            case "logindeal":
                users = userGet.login(request.getParameter("name"), (request.getParameter("pass")));
                if (users != null) {
                    session.setAttribute("user", users);
                    url = "/PhuTungXeMay/deal.jsp";
                }
                break;

            case "login":
                users = userGet.login(request.getParameter("name"), (request.getParameter("pass")));
                if (users != null) {
                    session.setAttribute("user", users);
                    url = "/PhuTungXeMay/navigate.jsp";
                    System.out.println("thanhconng");
                } else {
                    request.setAttribute("error", "error!");
                    url = "/PhuTungXeMay/login.jsp";
                    System.out.println("loi roi");
                }
                break;

        	}
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        response.sendRedirect(url);

    }

}