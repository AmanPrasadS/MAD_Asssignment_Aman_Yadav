package com.example.lottie;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    // Declare the LottieAnimationView variable
    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to our activity_main layout
        setContentView(R.layout.activity_main);

        // Initialize the LottieAnimationView by referencing its ID from the layout
        lottieAnimationView = findViewById(R.id.lottieAnimationView);

        // Optionally, you can programmatically start the animation
        // lottieAnimationView.playAnimation();

        // You can also add listener events if needed:
        // lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
        //    @Override
        //    public void onAnimationStart(Animator animation) {
        //        // Code to execute when animation starts
        //    }
        //    @Override
        //    public void onAnimationEnd(Animator animation) {
        //        // Code to execute when animation ends
        //    }
        //    @Override
        //    public void onAnimationCancel(Animator animation) {
        //        // Code to execute if animation is cancelled
        //    }
        //    @Override
        //    public void onAnimationRepeat(Animator animation) {
        //        // Code to execute on each animation repeat
        //    }
        // });
    }
}
