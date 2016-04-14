package io.colorgy.colorgychatapp.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.colorgy.colorgychatapp.R;

public class FriendListFragment extends Fragment {

    RecyclerView friendListRecyclerView;

    public FriendListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friend_list, container, false);
        friendListRecyclerView = (RecyclerView) view.findViewById(R.id.friendListRecyclerView);
        return view;
    }

}
