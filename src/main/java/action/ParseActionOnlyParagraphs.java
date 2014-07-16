package action;


import parser.RegexParser;

import javax.servlet.http.HttpServletRequest;

public class ParseActionOnlyParagraphs implements Action {
    @Override
    public String execute(HttpServletRequest request) {


        RegexParser regexParser =new RegexParser();

        return "/WEB-INF/resultParagraphs.jsp";
    }
}
