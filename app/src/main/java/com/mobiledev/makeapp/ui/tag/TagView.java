package com.mobiledev.makeapp.ui.tag;

import com.mobiledev.makeapp.ui.base.MvpView;

import java.util.List;

/**
 * Created by manu on 2/22/2018.
 */

public interface TagView extends MvpView {
    void onGettingTagList(List<String> stringList);
}
