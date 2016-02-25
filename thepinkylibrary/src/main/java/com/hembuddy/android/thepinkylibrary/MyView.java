package com.hembuddy.android.thepinkylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Jimmy on 2/24/2016.
 */
public class MyView extends LinearLayout {
  public MyView(Context context) {
    super(context);
    initialize(context);
  }
  public MyView(Context context, AttributeSet attrs) {
    super(context, attrs);
    initialize(context);
  }
  private void initialize(Context context){
    inflate(context, R.layout.my_view, this);
  }

}
