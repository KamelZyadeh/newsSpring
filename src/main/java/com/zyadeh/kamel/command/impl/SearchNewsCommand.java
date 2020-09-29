package com.zyadeh.kamel.command.impl;

import com.zyadeh.kamel.command.Command;
import com.zyadeh.kamel.dev.obj.Page;
import com.zyadeh.kamel.exceptions.ServiceException;
import com.zyadeh.kamel.service.impl.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component("search_command")
public class SearchNewsCommand implements Command {

    private NewsService newsService;

    @Autowired
    public SearchNewsCommand(NewsService newsService) {
        this.newsService = newsService;
    }

    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        Page page = new Page("/", false);
//        String probedWord = req.getParameter();
        return page;
    }
}
