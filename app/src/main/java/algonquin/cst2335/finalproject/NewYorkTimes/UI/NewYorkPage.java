package algonquin.cst2335.finalproject.NewYorkTimes.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import algonquin.cst2335.finalproject.R;
import algonquin.cst2335.finalproject.databinding.ActivityNewYorkPageBinding;

public class NewYorkPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityNewYorkPageBinding binding=ActivityNewYorkPageBinding.inflate(getLayoutInflater());


        setContentView(binding.getRoot());
    }
}