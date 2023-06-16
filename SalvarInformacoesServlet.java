package ucsal.br;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SalvarInformacoesServlet")
public class SalvarInformacoesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os parâmetros do formulário
        String login = request.getParameter("login");
        String nome = request.getParameter("nome");
        String instituicao = request.getParameter("instituicao");
        String cargo = request.getParameter("cargo");

        // Obtém a sessão HTTP
        HttpSession session = request.getSession();

        // Verifica a quantidade de acessos
        if (session.getAttribute("acessos") == null) {
            session.setAttribute("acessos", 1);
        } else {
            int acessos = (int) session.getAttribute("acessos");
            if (acessos >= 3) {
                response.sendRedirect("ExcedidosServlet");
                return;
            }
            session.setAttribute("acessos", acessos + 1);
        }

        // Salva as informações na sessão
        session.setAttribute("login", login);
        session.setAttribute("nome", nome);
        session.setAttribute("instituicao", instituicao);
        session.setAttribute("cargo", cargo);

        // Redireciona para a página de sucesso
        response.sendRedirect("sucesso.jsp");
    }
}