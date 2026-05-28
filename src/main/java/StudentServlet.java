import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");

        out.println("<head>");

        out.println("<title>Student Dashboard</title>");

        out.println("<link rel='stylesheet' href='style.css'>");

        out.println("</head>");

        out.println("<body>");

        out.println("<div class='header'>");
        out.println("Student Dashboard");
        out.println("</div>");

        out.println("<div class='container'>");

        out.println("<div class='card'>");

        out.println("<h2>Student Details</h2>");

        out.println("<table>");

        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>Name</th>");
        out.println("<th>Course</th>");
        out.println("<th>Marks</th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>101</td>");
        out.println("<td>Rahul</td>");
        out.println("<td>Java</td>");
        out.println("<td>89</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>102</td>");
        out.println("<td>Anjali</td>");
        out.println("<td>Python</td>");
        out.println("<td>92</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>103</td>");
        out.println("<td>Virat</td>");
        out.println("<td>DevOps</td>");
        out.println("<td>95</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("<br>");

        out.println("<button class='btn'>Add Student</button>");

        out.println("</div>");

        out.println("</div>");

        out.println("<div class='footer'>");
        out.println("© 2026 Student Application");
        out.println("</div>");

        out.println("</body>");

        out.println("</html>");
    }
}
