package com.example.androidsolutions;

import android.animation.Animator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidsolutions.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                //Here you can write code to be executed when animation gets started
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                //Here you can write code to be executed when animation gets ended

            }

            @Override
            public void onAnimationCancel(Animator animation) {
                //Here you can write code to be executed when animation gets cancelled

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                //Here you can write code to be executed when animation gets restarts

            }
        });
    }
}