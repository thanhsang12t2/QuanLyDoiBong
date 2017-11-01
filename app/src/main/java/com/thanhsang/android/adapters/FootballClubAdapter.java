package com.thanhsang.android.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.thanhsang.android.models.FootballClub;
import com.thanhsang.android.quanlydoibong.R;

import java.util.List;
//thư viện nào không dùng thì xóa đi cho sạch code
public class FootballClubAdapter extends ArrayAdapter {

    Activity context;
    int resource;
    List objects;//Đổi tên khác rõ ràng hơn một chút
    //set private hết, cái nào cần thiết thì để public
    public FootballClubAdapter(Activity context, int resource, List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        TextView txtFootballClubName = row.findViewById(R.id.txtFootballClubName);
        TextView txtRegion = row.findViewById(R.id.txtRegion);
        TextView txtWin = row.findViewById(R.id.txtWin);
        TextView txtLose = row.findViewById(R.id.txtLose);
        TextView txtDraw = row.findViewById(R.id.txtDraw);
        TextView txtFootballClubLabel = row.findViewById(R.id.txtFootballClubLabel);
        TextView txtRegionLabel = row.findViewById(R.id.txtRegionLabel);
        TextView txtScore = row.findViewById(R.id.txtScore);
        ImageView imgLogo = row.findViewById(R.id.imgLogo);

        final FootballClub footballClub = (FootballClub) this.objects.get(position);
        txtFootballClubName.setText(footballClub.getName().toString());
        txtRegion.setText(footballClub.getRegion().toString());
        txtWin.setText("Win: " + footballClub.getWin());
        txtLose.setText("Lose: " + footballClub.getLose());
        txtDraw.setText("Draw: " + footballClub.getDraw());
        txtFootballClubLabel.setText("Tên đội: ");
        txtRegionLabel.setText("Quốc gia: ");
        int score = footballClub.getWin()*3 + footballClub.getDraw();
        txtScore.setText(score + "");
        imgLogo.setImageResource(footballClub.getLogo());
        return row;
    }
}
