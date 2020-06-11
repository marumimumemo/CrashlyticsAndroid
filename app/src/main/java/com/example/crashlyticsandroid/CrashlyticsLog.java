package com.example.crashlyticsandroid;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.firebase.crashlytics.FirebaseCrashlytics;

 class CrashlyticsLog {
    // クラッシュしたuserId
     static void setCrashUserId(String userId) {
//        SharedPreferences data = this.getActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);
//        String userId = data.getString("user_name", "");

        if (!userId.isEmpty()) {
            FirebaseCrashlytics.getInstance().setUserId(userId);
        }
    }

    // クラッシュした名刺ID
    static void setCrashCardID(String cardId) {
        if (!cardId.isEmpty()) {
            FirebaseCrashlytics.getInstance().setCustomKey("cardId", cardId);
        }
    }

    // クラッシュした社員ID
    static void setCrashEmpID(String empId) {
        if (!empId.isEmpty()) {
            FirebaseCrashlytics.getInstance().setCustomKey("empId", empId);
        }
    }

    // クラッシュしたニュースID
    static void setCrashNewsID(Integer newsId) {
        FirebaseCrashlytics.getInstance().setCustomKey("newsId", newsId);
    }

    // クラッシュした人気のニュースID
    static void setCrashPopNewsID(Integer popNewsId) {
        FirebaseCrashlytics.getInstance().setCustomKey("popNewsId", popNewsId);
    }

    // クラッシュしたシェアニュースID
    static void setCrashShareNewsID(Integer shareNewsId) {
        FirebaseCrashlytics.getInstance().setCustomKey("shareNewsId", shareNewsId);
    }

    // クラッシュした商談ID
    static void setCrashProjectID(String projectId) {
        if (!projectId.isEmpty()) {
            FirebaseCrashlytics.getInstance().setCustomKey("projectId", projectId);
        }
    }

    // クラッシュしたお知らせID
    static void setCrashInfoID(Integer infoId) {
        FirebaseCrashlytics.getInstance().setCustomKey("infoId", infoId);
    }

}
