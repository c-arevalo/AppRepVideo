package arevalosalazar.cesar.apprepvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.video);
        v.setVideoPath("/mnt/sdcard/movies/video.mp4");
        //v.setVideoPath("https://www.youtube.com/watch?v=hKpa9j-rVCo");
        v.setMediaController(new MediaController(this));
        v.start();
        v.requestFocus();
    }
}