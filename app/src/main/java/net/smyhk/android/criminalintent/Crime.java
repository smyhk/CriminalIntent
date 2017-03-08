package net.smyhk.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Steven on 2/23/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    //private boolean mRequiresPolice;
    //private SimpleDateFormat mFormatter;
    //private String mDate;

    // constructor
    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
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

    public Date getDate() {
        //mFormatter = new SimpleDateFormat("EEEE d MMM yyyy", Locale.US);
        //mDate = mFormatter.format(mToday);
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

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
