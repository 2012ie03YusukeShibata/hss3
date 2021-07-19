package com.fujimic.hss3.view.adapter;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class HSS3BindingAdapter {
    @BindingAdapter("android:imageResource")
    public static void setImageUri(ImageView view, String imageUri) {
        if (imageUri == null) {
            view.setImageURI(null);
        } else {
            view.setImageURI(Uri.parse(imageUri));
        }
    }

    @BindingAdapter("android:src")
    public static void setImageUri(ImageView view, Uri imageUri) {
        view.setImageURI(imageUri);
    }

    @BindingAdapter("android:src")
    public static void setImageDrawable(ImageView view, Drawable drawable) {
        view.setImageDrawable(drawable);
    }

    @BindingAdapter("android:imageResource")
    public static void setBackGroundImage(ImageView view, int resourceID) {
        view.setImageResource(resourceID);
    }

}
