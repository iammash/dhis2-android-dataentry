package org.hisp.dhis.android.dataentry.reports;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;

final class TeisNavigatorImpl implements ReportsNavigator {

    @NonNull
    private final Activity currentActivity;

    @NonNull
    private final String teName;

    TeisNavigatorImpl(@NonNull Activity currentActivity, @NonNull String teName) {
        this.currentActivity = currentActivity;
        this.teName = teName;
    }

    @Override
    public void navigateTo(@NonNull String teiUid) {
        Intent intent = ReportsActivity.createIntentForEnrollments(currentActivity, teiUid, teName);
        ActivityCompat.startActivity(currentActivity, intent, null);
    }
}
