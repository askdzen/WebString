package action;


import entity.Paragraph;
import entity.Sentence;
import parser.Parser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ParseActionOnlySentences implements Action {
    @Override
    public String execute(HttpServletRequest request) {


        Parser parser=new Parser();
        List<Sentence> sentences=parser.outSentences(parser, request.getParameter("text"));
        request.setAttribute("sentence",sentences);
        return "/WEB-INF/resultSentences.jsp";
    }
}
