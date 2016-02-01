package staksdk.android.com.staksdk.Interfaces;

public interface SpeechListener {
    public void onVoiceResult(String query);
    public void onRecognizerFailed();
}