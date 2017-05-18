package cn.siwangyin.domainObject;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * Created by Administrator on 2017/5/5.
 */
@Table("swy_manager")
public class SwyManager {

    @Id
    private int id;

    @Column
    private String username;

    @Column
    private String password;

    @Column("account_level")
    private String accountLevel;

    @Column("default_system")
    private String system;

    @Column("default_module")
    private String module;

    @Column
    private char state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

}
