package com.amitkumar.myapplication;

import java.util.TreeMap;

/**
 * Created by AmitKumar on 5/30/2017.
 */

public interface PictureCapturingListener {

    void onCaptureDone(String pictureUrl, byte[] pictureData);
    void onDoneCapturingAllPhotos(TreeMap<String, byte[]> picturesTaken);

}
