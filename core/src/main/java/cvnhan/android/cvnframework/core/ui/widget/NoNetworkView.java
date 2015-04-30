package cvnhan.android.cvnframework.core.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import cvnhan.android.cvnframework.core.R;
import cvnhan.android.cvnframework.core.utils.Views;

public class NoNetworkView extends RelativeLayout {

    private ImageView ivIcon;

    public NoNetworkView(Context context, AttributeSet attrs,
                         int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.view_no_network, this);
    }

    public NoNetworkView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NoNetworkView(Context context) {
        this(context, null, 0);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ivIcon = Views.findViewById(this, R.id.ivIcon);
    }

    public ImageView getIconView() {
        return ivIcon;
    }
}
