package com.blackout.paidupdater.Credits;

import android.graphics.drawable.Drawable;

public final class UrlImageCache extends SoftReferenceHashTable<String, Drawable> {
    private static UrlImageCache mInstance = new UrlImageCache();
    
    public static UrlImageCache getInstance() {
        return mInstance;
    }
    
    private UrlImageCache() {
    }
}
