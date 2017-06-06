package cn.siwangyin.system;

import java.util.List;

/**
 * Created by zwy on 2017/5/5.
 */
public class Context{

    private boolean flag;

    private String message;

    private Object obj;

    private List<?> list;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public boolean isFlag() {
        return flag;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
