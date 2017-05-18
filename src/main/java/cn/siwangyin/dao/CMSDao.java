package cn.siwangyin.dao;

import com.alibaba.druid.pool.DruidDataSource;
import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;

/**
 * Created by zwy on 2017/5/5.
 */

public class CMSDao {


    private static Dao dao;

    private CMSDao(){}

    public static Dao getDao(){
        if (dao == null) {
            DruidDataSource ds = new DruidDataSource();
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
            ds.setUrl("jdbc:mysql://127.0.0.1:3306/screenprinting?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false");
            ds.setUsername("root");
            ds.setPassword("root");
            ds.setValidationQuery("select 1 from dual");
            ds.setTestOnBorrow(false);
            ds.setTestOnReturn(false);
            ds.setTestWhileIdle(true);
            dao = new NutDao(ds);
        }
        return dao;
    }

}