package cn.siwangyin.controller;

import cn.siwangyin.dao.CMSDao;
import cn.siwangyin.domainObject.SwyManager;
import cn.siwangyin.domainObject.SwyNavType;
import cn.siwangyin.domainObject.SwyTag;
import cn.siwangyin.system.Context;
import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.dao.Dao;
import org.nutz.json.Json;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/saveUser")
    public Context saveUser(@RequestParam("userJson") String json) {
        Context context = new Context();
        SwyManager manager = Json.fromJson(SwyManager.class, json);
        dao.update(manager);
        context.setObj(manager);
        context.setFlag(true);
        return context;
    }

    @RequestMapping("/addUser")
    public Context addUser(@RequestParam("userJson") String json) {
        Context context = new Context();
        SwyManager manager = Json.fromJson(SwyManager.class, json);
        manager = dao.insert(manager);
        context.setObj(manager);
        context.setFlag(true);
        return context;
    }

    @RequestMapping("/queryNav")
    public Context queryNav() {
        Context context = new Context();
        context.setFlag(true);
        context.setList(dao.query(SwyNavType.class, null));
        return context;
    }

    @RequestMapping("/queryNavTags" +
            "")
    public Context queryNavTags() {
        Context context = new Context();
        Condition cnd = Cnd.where("state","=",'Y').and("parentId", "=", 0);
        context.setFlag(true);
        context.setList(dao.query(SwyTag.class, cnd));
        return context;
    }

    @RequestMapping("/saveNav")
    public Context saveNav(@RequestParam("userJson") String json) {
        Context context = new Context();
        SwyNavType type = Json.fromJson(SwyNavType.class, json);
        dao.update(type);
        context.setObj(type);
        context.setFlag(true);
        return context;
    }

    @RequestMapping("/addNav")
    public Context addNav(@RequestParam("navJson") String json) {
        Context context = new Context();
        SwyNavType type = Json.fromJson(SwyNavType.class, json);
        type = dao.insert(type);
        context.setObj(type);
        context.setFlag(true);

        return context;
    }
}
