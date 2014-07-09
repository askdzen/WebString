package action;


import entity.Paragraph;
import entity.Sentence;
import parser.Parser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {


        Parser parser=new Parser();
        List<Paragraph> paragraphs=parser.outParagraphs(parser, request.getParameter("text"));
        List<Sentence> sentences=parser.outSentences(parser, request.getParameter("text"));


        request.setAttribute("paragraph",paragraphs);
        request.setAttribute("sentence",sentences);
        return "/WEB-INF/result.jsp";
    }
}
