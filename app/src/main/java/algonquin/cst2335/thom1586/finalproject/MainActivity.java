package algonquin.cst2335.thom1586.finalproject;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;


import algonquin.cst2335.thom1586.databinding.ActivityMainBinding;
import algonquin.cst2335.thom1586.finalproject.UI.WeatherStackPage;

/**
 * This is the landing page of the projecct
 * @author Sathal binila Thomas
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        navigation();
    }
    void navigation(){

        binding.weather.setOnClickListener(clk->{
            Intent WeatherStackPage=new Intent(this, algonquin.cst2335.thom1586.finalproject.UI.WeatherStackPage.class);
            startActivity(WeatherStackPage);
        });
    }
}