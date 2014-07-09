package action;


import entity.Paragraph;
import entity.Sentence;
import parser.Parser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ParseActionOnlyParagraphs implements Action {
    @Override
    public String execute(HttpServletRequest request) {


        Parser parser=new Parser();
        List<Paragraph> paragraphs=parser.outParagraphs(parser, request.getParameter("text"));
        request.setAttribute("paragraph",paragraphs);
        return "/WEB-INF/resultParagraphs.jsp";
    }
}
