package murach.email;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;

@WebServlet(name = "EmailListServlet", urlPatterns = {"/emailList"})
public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String url = "/index.html";  // Default URL for the join page

        // Get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // Default action
        }

        if (action.equals("join")) {
            url = "/index.html";  // Display join page
        } else if (action.equals("add")) {
            // Get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String date = request.getParameter("date");
            String radio = request.getParameter("radio");

            // Validate user inputs
            String message = "";
            if (firstName == null || lastName == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                message = "All fields are required.";
                url = "/index.html";
                request.setAttribute("message", message);
            } else {
                // Process checkboxes
                String[] checkBoxes = request.getParameterValues("checkBox");
                StringBuilder checkBoxSelections = new StringBuilder();
                if (checkBoxes != null) {
                    for (String checkBox : checkBoxes) {
                        checkBoxSelections.append(checkBox).append("<br>");
                    }
                } else {
                    checkBoxSelections.append("No selections made");
                }

                // Get combo box value
                String comBoBox = request.getParameter("country");

                // Create User object
                User user = new User(firstName, lastName, email, date, radio, checkBoxSelections.toString(), comBoBox);
                request.setAttribute("user", user);

                // Set the URL for the thanks page
                url = "/thanks.jsp";
            }
        }

        // Forward to the specified URL
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {
        // Handle GET requests by sending a 405 error
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "GET method is not supported.");
    }
}
