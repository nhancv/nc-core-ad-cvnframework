package cvnhan.android.cvnframework.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import cvnhan.android.cvnframework.R;
import cvnhan.android.cvnframework.core.ui.adapter.RecyclerTypedAdapter;
import cvnhan.android.cvnframework.utils.EventBus;
import cvnhan.android.cvnframework.utils.ImageLoader;
import cvnhan.android.cvnframework.viewholder.UserViewHolder;
import cvnhan.android.mvp.model.User;

public class UsersAdapter extends RecyclerTypedAdapter<User, UserViewHolder> {

    @Inject
    LayoutInflater layoutInflater;

    @Inject
    ImageLoader imageLoader;

    @Inject
    EventBus eventBus;

    @Inject
    public UsersAdapter() {
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder(layoutInflater.inflate(R.layout.item_user, parent, false), eventBus);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.bind(getItem(position), imageLoader);
    }
}
