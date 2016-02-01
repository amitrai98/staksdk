package staksdk.android.com.staksdk.Interfaces;


import java.util.List;

import staksdk.android.com.staksdk.Modal.KiTAG;

/**
 * Created by amitrai on 20/1/16.
 */
public interface StakListener {

    public void onJsonReceived(List<KiTAG> jsonobject_response);
    public void onFailure(String message);
    public void onListeningStart();
    public void onVoiceDataReceived(String query);

}


