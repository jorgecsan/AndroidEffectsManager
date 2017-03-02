package com.hlocal.android.babyup_project.transitions;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;

public class EffectsManager {

    public static void slideToAbove(final RelativeLayout relativeLayout) {
        Animation slide = null;

        //fromXType, fromXValue, toXType, toXValue, fromYType, fromYValue, toYType, toYValue
        slide = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                1.0f, Animation.RELATIVE_TO_SELF, 0.0f);

        slide.setDuration(1000);
        //slide.setFillAfter(true);
        slide.setFillEnabled(true);
        relativeLayout.startAnimation(slide);

        slide.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
/*                relativeLayout.clearAnimation();

                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                        relativeLayout.getWidth(), relativeLayout.getHeight());
                // lp.setMargins(0, 0, 0, 0);
                lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
                relativeLayout.setLayoutParams(lp);*/
            }

        });

    }


    public static void slideToBelow(final RelativeLayout relativeLayout) {
        Animation slide = null;

        //fromXType, fromXValue, toXType, toXValue, fromYType, fromYValue, toYType, toYValue
        slide = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                0.0f, Animation.RELATIVE_TO_SELF, 1.0f);

        slide.setDuration(1000);
        //slide.setFillAfter(true);
        //slide.setFillEnabled(true);
        relativeLayout.startAnimation(slide);

        slide.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                relativeLayout.setVisibility(View.GONE);
/*                relativeLayout.clearAnimation();

                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                        relativeLayout.getWidth(), relativeLayout.getHeight());
                // lp.setMargins(0, 0, 0, 0);
                lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
                relativeLayout.setLayoutParams(lp);*/
            }

        });

    }
}