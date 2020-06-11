package com.example.crashlyticsandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button crashButton = new Button(this);
        crashButton.setText("Crash!");
        crashButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                throw new RuntimeException("Test Crash"); // Force a crash
            }
        });

        addContentView(crashButton, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle params = new Bundle();
        params.putString("test", "test");
        mFirebaseAnalytics.logEvent(AnalyticsLogEnum.delete_image.getText(), null);

        CrashlyticsLog.setCrashCardID("111");
        CrashlyticsLog.setCrashEmpID("112");
        CrashlyticsLog.setCrashInfoID(113);
        CrashlyticsLog.setCrashNewsID(114);
        CrashlyticsLog.setCrashShareNewsID(115);
        CrashlyticsLog.setCrashPopNewsID(116);
        CrashlyticsLog.setCrashProjectID("117");
        CrashlyticsLog.setCrashUserId("118");
    }
}
