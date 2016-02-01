package staksdk.android.com.staksdk.StakUtil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.AttributeSet;
import android.view.View;

import staksdk.android.com.staksdk.Interfaces.StakListener;
import staksdk.android.com.staksdk.R;
import staksdk.android.com.staksdk.StakSearch;

/**
 * Created by amitrai on 28/1/16.
 */
public class StakFloatButton extends android.support.design.widget.FloatingActionButton implements View.OnClickListener{

    private StakListener listener ;

    public StakFloatButton(Context context) {
        super(context);
        setOnClickListener(this);
    }

    public StakFloatButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);
    }

    public StakFloatButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnClickListener(this);
    }

    @Override
    public void setBackground(Drawable background) {

        super.setBackground(getResources().getDrawable(R.drawable.mic_image));
    }

    @Override
    public void setImageIcon(Icon icon) {
        super.setImageIcon(icon);
    }

    @Override
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
    }

    @Override
    public void onClick(View v) {
        if(StakSearch.listener != null)
            StakSearch.listener.startListening();
    }


}
