package com.thanhsang.android.quanlydoibong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.thanhsang.android.adapters.FootballClubAdapter;
import com.thanhsang.android.models.FootballClub;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvFootballClub;
    ArrayList<FootballClub> listFootballClub;
    FootballClubAdapter footballClubAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Coding from here
        addControls();
        addEvents();
    }

    private void addControls() {
        lvFootballClub = (ListView) findViewById(R.id.lvDanhSachCLB);
        listFootballClub = new ArrayList<>();

        listFootballClub.add(new FootballClub("Asenal","Anh", R.drawable.arsenal, 4, 3, 2));
        listFootballClub.add(new FootballClub("Chelsea","Anh", R.drawable.chelsea, 5, 3, 2));
        listFootballClub.add(new FootballClub("Brighton","Anh", R.drawable.brighton, 6, 3, 2));
        listFootballClub.add(new FootballClub("Bournemouth","Anh", R.drawable.afc_bournemouth, 7, 3, 2));
        listFootballClub.add(new FootballClub("Burnley","Anh", R.drawable.burnley, 8, 3, 2));
        listFootballClub.add(new FootballClub("Crystal Palace","Anh", R.drawable.crystal_palace, 9, 3, 2));
        listFootballClub.add(new FootballClub("Everton","Anh", R.drawable.everton, 6, 3, 2));
        listFootballClub.add(new FootballClub("Huddersfield","Anh", R.drawable.huddersfield_town, 5, 3, 2));
        listFootballClub.add(new FootballClub("Leicester City","Anh", R.drawable.leicester_city, 4, 3, 2));
        listFootballClub.add(new FootballClub("Liverpool","Anh", R.drawable.liverpool, 3, 3, 2));
        listFootballClub.add(new FootballClub("Manchester City","Anh", R.drawable.manchester_city, 2, 3, 2));
        listFootballClub.add(new FootballClub("ManchesterUnited","Anh", R.drawable.manchester_united, 4, 3, 2));
        listFootballClub.add(new FootballClub("Newcastle United","Anh", R.drawable.newcastle_united, 4, 3, 2));
        listFootballClub.add(new FootballClub("Southampton","Anh", R.drawable.southampton, 3, 3, 2));
        listFootballClub.add(new FootballClub("Stoke City","Anh", R.drawable.stoke_city, 2, 3, 2));
        listFootballClub.add(new FootballClub("Swansea City","Anh", R.drawable.swansea_city, 4, 3, 2));
        listFootballClub.add(new FootballClub("Tottenham","Anh", R.drawable.tottenham_hotspur, 4, 3, 2));
        listFootballClub.add(new FootballClub("Watford","Anh", R.drawable.watford, 3, 3, 2));
        listFootballClub.add(new FootballClub("BromwichAlbion","Anh", R.drawable.west_bromwich_albion, 2, 3, 2));
        listFootballClub.add(new FootballClub("West Ham United","Anh", R.drawable.west_ham_united, 4, 3, 2));

        footballClubAdapter = new FootballClubAdapter(MainActivity.this, R.layout.item_club, listFootballClub);
        lvFootballClub.setAdapter(footballClubAdapter);
    }

    private void addEvents() {
    }
}
