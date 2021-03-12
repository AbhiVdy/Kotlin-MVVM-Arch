package com.core.shaditest.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/core/shaditest/ui/main/ProfileAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/core/shaditest/ui/main/ProfileAdapter$ProfileViewHolder;", "profileList", "", "Lcom/core/shaditest/data/model/Profiles;", "listener", "Lcom/core/shaditest/ui/main/ProfileAdapter$ProfileEventListener;", "(Ljava/util/List;Lcom/core/shaditest/ui/main/ProfileAdapter$ProfileEventListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProfileEventListener", "ProfileViewHolder", "app_debug"})
public final class ProfileAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.core.shaditest.ui.main.ProfileAdapter.ProfileViewHolder> {
    private final java.util.List<com.core.shaditest.data.model.Profiles> profileList = null;
    private final com.core.shaditest.ui.main.ProfileAdapter.ProfileEventListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.core.shaditest.ui.main.ProfileAdapter.ProfileViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.core.shaditest.ui.main.ProfileAdapter.ProfileViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ProfileAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.core.shaditest.data.model.Profiles> profileList, @org.jetbrains.annotations.NotNull()
    com.core.shaditest.ui.main.ProfileAdapter.ProfileEventListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/core/shaditest/ui/main/ProfileAdapter$ProfileViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "btnAccept", "Landroid/widget/Button;", "btnCancelRequest", "btnReject", "ivFlag", "Landroid/widget/ImageView;", "ivProfile", "Lcom/mikhaellopez/circularimageview/CircularImageView;", "llAccept", "Landroid/widget/LinearLayout;", "llAction", "llReject", "tvAge", "Landroid/widget/TextView;", "tvName", "bind", "", "profile", "Lcom/core/shaditest/data/model/Profiles;", "listener", "Lcom/core/shaditest/ui/main/ProfileAdapter$ProfileEventListener;", "position", "", "app_debug"})
    public static final class ProfileViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView tvName;
        private com.mikhaellopez.circularimageview.CircularImageView ivProfile;
        private android.widget.TextView tvAge;
        private android.widget.ImageView ivFlag;
        private android.widget.Button btnAccept;
        private android.widget.Button btnReject;
        private android.widget.Button btnCancelRequest;
        private android.widget.LinearLayout llAction;
        private android.widget.LinearLayout llAccept;
        private android.widget.LinearLayout llReject;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.core.shaditest.data.model.Profiles profile, @org.jetbrains.annotations.NotNull()
        com.core.shaditest.ui.main.ProfileAdapter.ProfileEventListener listener, int position) {
        }
        
        public ProfileViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/core/shaditest/ui/main/ProfileAdapter$ProfileEventListener;", "", "onActionButtonClicked", "", "profile", "Lcom/core/shaditest/data/model/Profiles;", "pos", "", "status", "Lcom/core/shaditest/utils/Constants$SELECTION_STATUS;", "onPageIncresed", "app_debug"})
    public static abstract interface ProfileEventListener {
        
        public abstract void onPageIncresed();
        
        public abstract void onActionButtonClicked(@org.jetbrains.annotations.NotNull()
        com.core.shaditest.data.model.Profiles profile, int pos, @org.jetbrains.annotations.NotNull()
        com.core.shaditest.utils.Constants.SELECTION_STATUS status);
    }
}