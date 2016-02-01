package staksdk.android.com.staksdk.StakUtil;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import staksdk.android.com.staksdk.Interfaces.StakListener;
import staksdk.android.com.staksdk.R;
import staksdk.android.com.staksdk.StakSearch;

/**
 * Created by amitrai on 20/1/16.
 */
public class stakmicbutton extends Button implements View.OnClickListener{

    private final String TAG = getClass().getSimpleName();

    StakListener listener ;

    public stakmicbutton(Context context) {
        super(context);
        setOnClickListener(this);
    }

    public stakmicbutton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);
    }

    public stakmicbutton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnClickListener(this);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public stakmicbutton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setOnClickListener(this);
    }

    @Override
    public void setBackground(Drawable background) {
        super.setBackground(getResources().getDrawable(R.drawable.mic_image_blue));
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText("", type);
    }

    @Override
    public void onClick(View v) {
        if(StakSearch.listener != null)
            StakSearch.listener.startListening();
    }

}
