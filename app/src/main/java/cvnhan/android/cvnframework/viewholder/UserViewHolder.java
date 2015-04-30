package cvnhan.android.cvnframework.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import cvnhan.android.cvnframework.R;
import cvnhan.android.cvnframework.utils.EventBus;
import cvnhan.android.cvnframework.utils.ImageLoader;
import cvnhan.android.mvp.model.User;

public class UserViewHolder extends RecyclerView.ViewHolder {

    @InjectView(R.id.ivAvatar)
    ImageView ivAvatar;
    @InjectView(R.id.tvLogin)
    TextView tvLogin;

    private final EventBus eventBus;
    private User user;

    public UserViewHolder(View itemView, EventBus eventBus) {
        super(itemView);
        ButterKnife.inject(this, itemView);
        this.eventBus = eventBus;
        itemView.setOnClickListener(v -> this.eventBus.post(user));
    }

    public void bind(User user, ImageLoader imageLoader) {
        tvLogin.setText(user.login);
        imageLoader.load(user.avatar_url, ivAvatar, R.drawable.ic_avatar_default);
        this.user = user;
    }
}
