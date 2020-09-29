package com.zyadeh.kamel.command.impl;

import com.zyadeh.kamel.command.Command;
import com.zyadeh.kamel.dev.obj.Page;
import com.zyadeh.kamel.exceptions.ServiceException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component("command_logout")
public class LogoutUserCommand extends HttpServlet implements Command {

    @Override
    public Page execute(HttpServletRequest req) throws ServiceException {
        Page page = new Page("/", true);
        HttpSession session = req.getSession();
        session.invalidate();
        return page;
    }
}
