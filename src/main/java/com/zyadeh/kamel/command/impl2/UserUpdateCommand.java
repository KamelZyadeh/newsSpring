//package com.zyadeh.kamel.command.impl2;
//
//import com.zyadeh.kamel.command.Command;
//import com.zyadeh.kamel.dev.obj.Page;
//import com.zyadeh.kamel.entities.Role;
//import com.zyadeh.kamel.entities.User;
//import com.zyadeh.kamel.exceptions.ServiceException;
//
//import com.zyadeh.kamel.service.impl.UserService;
//
//import javax.servlet.http.HttpServletRequest;
//
//public class UserUpdateCommand implements Command {
//    private final UserService service = new UserService();
//
//    @Override
//    public Page execute(HttpServletRequest req) throws ServiceException {
//        User user = service.read(2);
//        user.setLogin("admin");
//        service.update(user);
//        return null;
//    }
//}
