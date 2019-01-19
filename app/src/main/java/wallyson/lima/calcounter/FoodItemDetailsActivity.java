package wallyson.lima.calcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import model.Food;

public class FoodItemDetailsActivity extends AppCompatActivity {
    private TextView foodName, calories, dateTaken;
    private Button shareButton;
    private int foodId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item_details);

        foodName = findViewById(R.id.detsFoodName);
        calories = findViewById(R.id.detsCaloriesValue);
        dateTaken = findViewById(R.id.detsDateText);
        shareButton = findViewById(R.id.detsShareButton);

        Food food = (Food) getIntent().getSerializableExtra("userObj");

        foodName.setText(food.getFoodName());
        calories.setText(String.valueOf(food.getCalories()));
        dateTaken.setText(food.getRecordDate());
        foodId = food.getFoodId();

        calories.setTextSize(34.9f);
        calories.setTextColor(Color.RED);
    }
}
