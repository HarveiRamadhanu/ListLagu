package org.d3ifcool.listlagu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.kodmap.library.kmrecyclerviewstickyheader.KmHeaderItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerViewAdapter adapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private KmHeaderItemDecoration kmHeaderItemDecoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAdapter();
        initData();
    }

    private void initAdapter() {
        adapter = new RecyclerViewAdapter();
        layoutManager = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        kmHeaderItemDecoration = new KmHeaderItemDecoration(adapter);
        recyclerView.setAdapter(adapter);
    }



    private void initData() {
        List<Model> modelList = new ArrayList<>();

        modelList.add(new Model("Adam Levine", ItemType.Header));
        modelList.add(new Model("Girls Like You", ItemType.Post));
        modelList.add(new Model("Maps", ItemType.Post));
        modelList.add(new Model("Animals", ItemType.Post));
        modelList.add(new Model("Sugar", ItemType.Post));
        modelList.add(new Model("Misery", ItemType.Post));


        modelList.add(new Model("Bob Marley", ItemType.Header));
        modelList.add(new Model("No Woman,No Cry", ItemType.Post));
        modelList.add(new Model("Stir It Up", ItemType.Post));
        modelList.add(new Model("In This Love", ItemType.Post));
        modelList.add(new Model("Exodus", ItemType.Post));
        modelList.add(new Model("Jamming", ItemType.Post));


        modelList.add(new Model("Charlie Puth", ItemType.Header));
        modelList.add(new Model("Attention", ItemType.Post));
        modelList.add(new Model("Marvin Gayc", ItemType.Post));
        modelList.add(new Model("As You Are", ItemType.Post));
        modelList.add(new Model("Up All Night", ItemType.Post));
        modelList.add(new Model("Suffer", ItemType.Post));


        modelList.add(new Model("David Guetta", ItemType.Header));
        modelList.add(new Model("Titanium", ItemType.Post));
        modelList.add(new Model("2U", ItemType.Post));
        modelList.add(new Model("Another Life", ItemType.Post));
        modelList.add(new Model("Shed A Light", ItemType.Post));
        modelList.add(new Model("Hey Mama", ItemType.Post));

        modelList.add(new Model("Endank Soekamti", ItemType.Header));
        modelList.add(new Model("Ojo Nesu", ItemType.Post));
        modelList.add(new Model("Maling Kondang", ItemType.Post));
        modelList.add(new Model("Semoga Kau Di Neraka", ItemType.Post));
        modelList.add(new Model("Mantan Jadi Teman", ItemType.Post));
        modelList.add(new Model("Satria Bergitar", ItemType.Post));

        modelList.add(new Model("Foo Fighters", ItemType.Header));
        modelList.add(new Model("Best Of You", ItemType.Post));
        modelList.add(new Model("Rope", ItemType.Post));
        modelList.add(new Model("Wheels", ItemType.Post));
        modelList.add(new Model("Aurora", ItemType.Post));
        modelList.add(new Model("Walk", ItemType.Post));

        modelList.add(new Model("Guns N Roses", ItemType.Header));
        modelList.add(new Model("Don't Cry", ItemType.Post));

        modelList.add(new Model("November Rain", ItemType.Post));
        modelList.add(new Model("Sweet Child O'Mine", ItemType.Post));
        modelList.add(new Model("This I Love", ItemType.Post));
        modelList.add(new Model("Better", ItemType.Post));

        modelList.add(new Model("HIVI", ItemType.Header));
        modelList.add(new Model("Pelangi", ItemType.Post));
        modelList.add(new Model("Orang Ketiga", ItemType.Post));
        modelList.add(new Model("Remaja", ItemType.Post));
        modelList.add(new Model("Kereta Kencan", ItemType.Post));
        modelList.add(new Model("Curu-Curi", ItemType.Post));

        modelList.add(new Model("Inka Christie", ItemType.Header));
        modelList.add(new Model("Yang Kunanti", ItemType.Post));
        modelList.add(new Model("Cintaku", ItemType.Post));
        modelList.add(new Model("Apa Salahku", ItemType.Post));
        modelList.add(new Model("Mengapa Saling Terluka", ItemType.Post));
        modelList.add(new Model("Laut Asmara", ItemType.Post));

        modelList.add(new Model("Jikustik", ItemType.Header));
        modelList.add(new Model("Puisi", ItemType.Post));
        modelList.add(new Model("Saat Kau Tak Disini", ItemType.Post));
        modelList.add(new Model("Setia", ItemType.Post));
        modelList.add(new Model("Untuk Di Kenang", ItemType.Post));
        modelList.add(new Model("Antahlah", ItemType.Post));

//        for (Integer i = 1; i < 24; i++) {
//            Model headerModel = new Model(getCharForNumber(i), ItemType.Header);
//            modelList.add(headerModel);
//            for (Integer j = 1; j < 8; j++) {
//                Model model = new Model("Post " + i + " " + j, ItemType.Post);
//                modelList.add(model);
//            }
//        }
        adapter.submitList(modelList);
    }

    private String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 'A' - 1)) : null;
    }
}
