package com.prim_player_cc.decoder_cc.event_code;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_COMPLETION;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_DATA_SOURCE;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_DESTROY;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_INFO;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_PAUSE;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_PREPARED;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_PREPARING;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_RELEASE;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_RESET;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_RESUME;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_START;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_STATUS_CHANGE;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_STOP;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_TIMER_UPDATE;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_EVENT_VIDEO_SIZE_CHANGE;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_SEEK_COMPLETE;
import static com.prim_player_cc.decoder_cc.event_code.PlayerEventCode.PRIM_PLAYER_TIMED_TEXT;

/**
 * @author prim
 * @version 1.0.0
 * @desc
 * @time 2018/10/18 - 下午2:05
 */
@IntDef({PRIM_PLAYER_EVENT_DATA_SOURCE, PRIM_PLAYER_EVENT_PREPARED,
        PRIM_PLAYER_EVENT_VIDEO_SIZE_CHANGE, PRIM_PLAYER_EVENT_INFO,
        PRIM_PLAYER_SEEK_COMPLETE, PRIM_PLAYER_TIMED_TEXT, PRIM_PLAYER_EVENT_COMPLETION,
        PRIM_PLAYER_EVENT_START, PRIM_PLAYER_EVENT_PAUSE, PRIM_PLAYER_EVENT_RESUME
        , PRIM_PLAYER_EVENT_STOP, PRIM_PLAYER_EVENT_RESET, PRIM_PLAYER_EVENT_RELEASE
        , PRIM_PLAYER_EVENT_DESTROY, PRIM_PLAYER_EVENT_TIMER_UPDATE, PRIM_PLAYER_EVENT_STATUS_CHANGE
        , PRIM_PLAYER_EVENT_PREPARING})
@Retention(RetentionPolicy.SOURCE)
public @interface EventCode {
}
