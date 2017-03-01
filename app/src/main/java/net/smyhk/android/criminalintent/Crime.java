package net.smyhk.android.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/**
 * Created by Steven on 2/23/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mToday;
    private boolean mSolved;
    //private boolean mRequiresPolice;
    private SimpleDateFormat mFormatter;
    private String mDate;

    // constructor
    public Crime() {
        mId = UUID.randomUUID();
        mToday = new Date();
    }

    /* public boolean getRequiresPolice() {
        return mRequiresPolice;
    }

    public void setRequiresPolice(boolean requiresPolice) {
        mRequiresPolice = requiresPolice;
    } */

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        mFormatter = new SimpleDateFormat("EEEE d MMM yyyy", Locale.US);
        mDate = mFormatter.format(mToday);
        return mDate;
    }

    //public void setDate(Date date) {
    //    mToday = date;
    //}

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }
}
