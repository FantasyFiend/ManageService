package cn.siwangyin.domainObject;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * Created by zwy on 2017/7/19.
 */
@Table("swy_article_series")
public class SwyArticleSeries {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private char state;
}
