package com.weihong.password.data;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by hongw on 2018/7/8.
 */
@Entity
public class PasswordInfo implements Parcelable {

    @Id(autoincrement = true)
    private Long id;

    private String accountName;

    private String username;

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.accountName);
        dest.writeString(this.username);
        dest.writeString(this.password);
    }

    protected PasswordInfo(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.accountName = in.readString();
        this.username = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<PasswordInfo> CREATOR = new Parcelable.Creator<PasswordInfo>() {
        @Override
        public PasswordInfo createFromParcel(Parcel source) {
            return new PasswordInfo(source);
        }

        @Override
        public PasswordInfo[] newArray(int size) {
            return new PasswordInfo[size];
        }
    };
}
