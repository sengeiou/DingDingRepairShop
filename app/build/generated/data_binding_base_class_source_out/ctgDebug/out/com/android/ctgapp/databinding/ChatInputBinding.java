// Generated by view binder compiler. Do not edit!
package com.android.ctgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.android.ctgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChatInputBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnAdd;

  @NonNull
  public final ImageButton btnEmoticon;

  @NonNull
  public final LinearLayout btnFile;

  @NonNull
  public final LinearLayout btnImage;

  @NonNull
  public final ImageButton btnKeyboard;

  @NonNull
  public final LinearLayout btnPhoto;

  @NonNull
  public final ImageButton btnSend;

  @NonNull
  public final LinearLayout btnVideo;

  @NonNull
  public final ImageButton btnVoice;

  @NonNull
  public final LinearLayout emoticonPanel;

  @NonNull
  public final EditText input;

  @NonNull
  public final LinearLayout morePanel;

  @NonNull
  public final LinearLayout textPanel;

  @NonNull
  public final TextView voicePanel;

  private ChatInputBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnAdd,
      @NonNull ImageButton btnEmoticon, @NonNull LinearLayout btnFile,
      @NonNull LinearLayout btnImage, @NonNull ImageButton btnKeyboard,
      @NonNull LinearLayout btnPhoto, @NonNull ImageButton btnSend, @NonNull LinearLayout btnVideo,
      @NonNull ImageButton btnVoice, @NonNull LinearLayout emoticonPanel, @NonNull EditText input,
      @NonNull LinearLayout morePanel, @NonNull LinearLayout textPanel,
      @NonNull TextView voicePanel) {
    this.rootView = rootView;
    this.btnAdd = btnAdd;
    this.btnEmoticon = btnEmoticon;
    this.btnFile = btnFile;
    this.btnImage = btnImage;
    this.btnKeyboard = btnKeyboard;
    this.btnPhoto = btnPhoto;
    this.btnSend = btnSend;
    this.btnVideo = btnVideo;
    this.btnVoice = btnVoice;
    this.emoticonPanel = emoticonPanel;
    this.input = input;
    this.morePanel = morePanel;
    this.textPanel = textPanel;
    this.voicePanel = voicePanel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChatInputBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChatInputBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.chat_input, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChatInputBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add;
      ImageButton btnAdd = rootView.findViewById(id);
      if (btnAdd == null) {
        break missingId;
      }

      id = R.id.btnEmoticon;
      ImageButton btnEmoticon = rootView.findViewById(id);
      if (btnEmoticon == null) {
        break missingId;
      }

      id = R.id.btn_file;
      LinearLayout btnFile = rootView.findViewById(id);
      if (btnFile == null) {
        break missingId;
      }

      id = R.id.btn_image;
      LinearLayout btnImage = rootView.findViewById(id);
      if (btnImage == null) {
        break missingId;
      }

      id = R.id.btn_keyboard;
      ImageButton btnKeyboard = rootView.findViewById(id);
      if (btnKeyboard == null) {
        break missingId;
      }

      id = R.id.btn_photo;
      LinearLayout btnPhoto = rootView.findViewById(id);
      if (btnPhoto == null) {
        break missingId;
      }

      id = R.id.btn_send;
      ImageButton btnSend = rootView.findViewById(id);
      if (btnSend == null) {
        break missingId;
      }

      id = R.id.btn_video;
      LinearLayout btnVideo = rootView.findViewById(id);
      if (btnVideo == null) {
        break missingId;
      }

      id = R.id.btn_voice;
      ImageButton btnVoice = rootView.findViewById(id);
      if (btnVoice == null) {
        break missingId;
      }

      id = R.id.emoticonPanel;
      LinearLayout emoticonPanel = rootView.findViewById(id);
      if (emoticonPanel == null) {
        break missingId;
      }

      id = R.id.input;
      EditText input = rootView.findViewById(id);
      if (input == null) {
        break missingId;
      }

      id = R.id.morePanel;
      LinearLayout morePanel = rootView.findViewById(id);
      if (morePanel == null) {
        break missingId;
      }

      id = R.id.text_panel;
      LinearLayout textPanel = rootView.findViewById(id);
      if (textPanel == null) {
        break missingId;
      }

      id = R.id.voice_panel;
      TextView voicePanel = rootView.findViewById(id);
      if (voicePanel == null) {
        break missingId;
      }

      return new ChatInputBinding((LinearLayout) rootView, btnAdd, btnEmoticon, btnFile, btnImage,
          btnKeyboard, btnPhoto, btnSend, btnVideo, btnVoice, emoticonPanel, input, morePanel,
          textPanel, voicePanel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
