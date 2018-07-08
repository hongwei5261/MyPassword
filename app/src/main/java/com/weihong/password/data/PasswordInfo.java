package com.weihong.password.data;

import com.weihong.password.Constants;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by hongw on 2018/7/8.
 */
@Entity
public class PasswordInfo {

    @Id(autoincrement = true)
    private Long id;

//    @Property(nameInDb = Constants.COLUMN_ACCOUNT_NAME)
    private String accountName;

//    @Property(nameInDb = Constants.COLUMN_USERNAME)
    private String username;

//    @Property(nameInDb = Constants.COLUMN_PASSWORD)
    private String password;

    @Generated(hash = 2046799923)
    public PasswordInfo(Long id, String accountName, String username,
            String password) {
        this.id = id;
        this.accountName = accountName;
        this.username = username;
        this.password = password;
    }

    @Generated(hash = 185707197)
    public PasswordInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
