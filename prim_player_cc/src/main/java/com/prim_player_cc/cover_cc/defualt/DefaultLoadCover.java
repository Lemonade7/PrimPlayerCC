package com.prim_player_cc.cover_cc.defualt;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.prim_player_cc.R;
import com.prim_player_cc.cover_cc.BaseCover;
import com.prim_player_cc.decoder_cc.event_code.PlayerEventCode;

/**
 * @author prim
 * @version 1.0.0
 * @desc
 * @time 2018/7/26 - 上午11:21
 */
public class DefaultLoadCover extends BaseCover {

    public DefaultLoadCover(Context context) {
        super(context);
        setCoverLevelHeight(10);//设置视图的优先级
        coverVisibility(View.VISIBLE);
    }

    @Override
    protected View createCoverView(Context context) {
        return View.inflate(context, R.layout.default_cover_load_layout, null);
    }

    //接收播放事件
    @Override
    public void onPlayEvent(int eventCode, Bundle bundle) {
        switch (eventCode) {
            case PlayerEventCode.PRIM_PLAYER_EVENT_PREPARED:
                coverVisibility(View.GONE);
                break;
            case PlayerEventCode.PRIM_PLAYER_EVENT_PREPARING:
                coverVisibility(View.VISIBLE);
                break;
            default:
                coverVisibility(View.GONE);
                break;
        }
    }
}
