package util;

import action.Action;
import action.ActionFactory;
import entity.Paragraph;
import entity.Sentence;
import parser.Parser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Askar on 01.07.2014.
 */
public class ParserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      /*   Parser parser=new Parser();
      List<Paragraph> paragraphs=parser.outParagraphs(parser, request.getParameter("text"));
       List<Sentence> sentences=parser.outSentences(parser, request.getParameter("text"));

        request.setCharacterEncoding("UTF-8");
        request.setAttribute("paragraph",paragraphs);
       request.setAttribute("sentence",sentences);
*/
        String actionName = request.getParameter("action");
        Action action = ActionFactory.getAction(actionName);
        String result = action.execute(request);
        request.getRequestDispatcher(result).forward(request, response);
        //request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
