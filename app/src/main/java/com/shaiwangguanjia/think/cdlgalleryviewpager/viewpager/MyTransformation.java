package com.shaiwangguanjia.think.cdlgalleryviewpager.viewpager;

import android.graphics.Camera;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * @author:程龙 date; On 2018/9/19
 */
public class MyTransformation implements ViewPager.PageTransformer {

    private static final float MIN_SCALE = 0.85f;
    private static final float MIN_ALPHA = 0.5f;
    private static final float MAX_ROTATE = 30;
    private Camera camera = new Camera();

    @Override
    public void transformPage(View page, float position) {
        float centerX = page.getWidth() / 2;
        float centerY = page.getHeight() / 2;
        float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
        float rotate = 20 * Math.abs(position);
        if (position < -1) {

        } else if (position < 0) {
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);
            page.setRotationY(rotate);
        } else if (position >= 0 && position < 1) {
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);
            page.setRotationY(-rotate);
        } else if (position >= 1) {
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);
            page.setRotationY(-rotate);
        }
    }
}
