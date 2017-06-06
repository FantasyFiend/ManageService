package cn.siwangyin.controller;

import cn.siwangyin.dao.CMSDao;
import cn.siwangyin.domainObject.SwyManager;
import cn.siwangyin.system.Context;
import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.dao.Dao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by zwy on 2017/5/3.
 */
@RestController
public class Controller {

    private static Dao dao = CMSDao.getDao();

    @RequestMapping("/login")
    public Context Login(@RequestParam("username") String username, @RequestParam("password") String password) {
        Context context = new Context();
        Condition cnd = Cnd.where("username", "=", username).and("password", "=", password);
        SwyManager sm = dao.fetch(SwyManager.class,cnd);
        context.setFlag(true);
        context.setObj(sm);
        return context;
    }

    @RequestMapping("/queryUser")
    public Context queryUser() {
        Context context = new Context();
        context.setFlag(true);
        context.setList(dao.query(SwyManager.class, null));
        return context;
    }

    @RequestMapping("/checkLogin")
    public Context checkLogin(HttpSession session) {
        Context context = new Context();
        SwyManager sm = (SwyManager) session.getAttribute("user");
        context.setFlag(true);
        context.setObj(sm);
        return context;
    }

}
