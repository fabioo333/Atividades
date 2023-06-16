package ucsal.br;



import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ExcedidosServlet")
public class ExcedidosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Define a mensagem de acesso excedido
        String mensagem = "Número de acessos excedido. Você não pode acessar esta página.";

        // Define o atributo "mensagem" na requisição para exibir na página de erro
        request.setAttribute("mensagem", mensagem);

        // Redireciona para a página de erro
        response.sendRedirect("erro.jsp");
    }
}