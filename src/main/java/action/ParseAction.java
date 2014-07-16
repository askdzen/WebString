package action;


import entity.*;
import parser.RegexParser;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {


        RegexParser regexParser =new RegexParser();

        request.setAttribute("parsText",regexParser.parseText(request.getParameter("text")).toSourceString());
        return "/WEB-INF/result.jsp";
    }
}
