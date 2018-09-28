package teresa.com.bingopractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class BingoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView info;
    private String roomId;
    private boolean isCreator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bingo);
        findViews();
        roomId = getIntent().getStringExtra("ROOM_ID");
        isCreator = getIntent().getBooleanExtra("IS_CREATOR", false);
        if (isCreator){
            // fill FireBase room numbers
        }
    }

    private void findViews() {
        recyclerView = findViewById(R.id.recycler);
        info = findViewById(R.id.info);
    }
}
