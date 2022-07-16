package com.adilash.pwdmgr;

public class Password {

    private String mLink;
    private String mUsername;
    private String mPassword;

    public Password(String mLink, String mUsername, String mPassword) {
        this.mLink = mLink;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }

    public String getmLink() {
        return mLink;
    }

    public void setmLink(String mLink) {
        this.mLink = mLink;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
}
