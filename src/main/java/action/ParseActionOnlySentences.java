package action;


import parser.RegexParser;

import javax.servlet.http.HttpServletRequest;

public class ParseActionOnlySentences implements Action {
    @Override
    public String execute(HttpServletRequest request) {


        RegexParser regexParser =new RegexParser();
      //  List<Sentence> sentences=parser.outSentences(parser, request.getParameter("text"));
      //  request.setAttribute("sentence",sentences);
        return "/WEB-INF/resultSentences.jsp";
    }
}
