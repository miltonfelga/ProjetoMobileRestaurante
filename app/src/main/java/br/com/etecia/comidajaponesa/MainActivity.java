package br.com.etecia.comidajaponesa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] nomeCardapio = {"Ultimate Greek", "Pasta Salad", "Beef Lazone", "Rice Roll"};
    int[] imagemCardapio = {R.drawable.ultimategreek, R.drawable.pastasalad, R.drawable.beeflazone, R.drawable.riceroll};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.lstCardapios);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return imagemCardapio.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            View view1 = getLayoutInflater().inflate(R.layout.modelo_cardview, null);

            TextView name = (TextView) view1.findViewById(R.id.cardapios);
            ImageView image = (ImageView) view1.findViewById(R.id.imgCardapios);

            name.setText(nomeCardapio[position]);
            image.setImageResource(imagemCardapio[position]);

            return view1;
        }
    }
}
