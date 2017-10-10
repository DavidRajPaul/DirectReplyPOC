package com.directreplypoc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;


/**
 * Created by gfernandez on 24/01/17.
 */

public class ReplyActivity extends AppCompatActivity {

  private static final String KEY_MESSAGE_ID = "key_message_id";
  private static final String KEY_NOTIFY_ID = "key_notify_id";

  private int mMessageId;
  private int mNotifyId;

  private ImageButton mSendButton;
  private EditText mEditReply;
  private RelativeLayout relativeLayout;


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_reply);

    Intent intent = getIntent();

    mEditReply = (EditText) findViewById(R.id.edit_reply);
    mSendButton = (ImageButton) findViewById(R.id.button_send);

    mSendButton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        sendMessage(mNotifyId, mMessageId);
      }
    });

    relativeLayout = (RelativeLayout) findViewById(R.id.activity_reply);
  }

  private void sendMessage(int notifyId, int messageId) {
    // update notification
    String message = mEditReply.getText().toString().trim();
    Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
  }
}
