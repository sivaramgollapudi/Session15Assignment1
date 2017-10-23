package com.sivaram.session15assignment1;

/**
 * Created by User on 23/10/2017.
 */

public class ItemData {

    // Create String Variable to Hold Android Version Name
    private String AndroidVersionName;

    // Create Constructor and Assign value to Android Version Name Variable
    public ItemData(String androidVersionName) {
        AndroidVersionName = androidVersionName;
    }

    // Getter And Setter for Android Version Name Variable.
    public String getAndroidVersionName() {
        return AndroidVersionName;
    }

    public void setAndroidVersionName(String androidVersionName) {
        AndroidVersionName = androidVersionName;
    }
}
