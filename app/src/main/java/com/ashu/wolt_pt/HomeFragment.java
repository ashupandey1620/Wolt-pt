package com.ashu.wolt_pt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private CardView aboutUs,rulesAndRegulations,AgentCooperation,promotions,inviteFriends;
    private Button recharge,withDrawl;
    private CardView CV1;
    private ImageSlider imageSlider;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);;

        imageSlider = v.findViewById(R.id.image_slider);

        aboutUs = v.findViewById(R.id.cardView1);
        rulesAndRegulations = v.findViewById(R.id.cardView2);
        AgentCooperation = v.findViewById(R.id.cardView3);
        promotions = v.findViewById(R.id.cardView4);
        inviteFriends = v.findViewById(R.id.cardView5);


        recharge = v.findViewById(R.id.recharge);
        withDrawl = v.findViewById(R.id.withDrawl);



        CV1 = v.findViewById(R.id.cardViewBelow1);


        ArrayList<SlideModel> slideModel = new ArrayList<>();
        slideModel.add(new SlideModel(R.drawable.pic_3, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.pic_2, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.pic_1, ScaleTypes.FIT));




        imageSlider.setImageList(slideModel,ScaleTypes.FIT);











        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), AboutUsActivity.class);
                startActivity(intent);
            }
        });

        rulesAndRegulations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), RulesAndRegulationsActivity.class);
                startActivity(intent);
            }
        });

        AgentCooperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), AgentCooperationActivity.class);
                startActivity(intent);
            }
        });

        promotions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PromotionsActivity.class);
                startActivity(intent);

            }
        });

        inviteFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), InviteFriendsActivity.class);
                startActivity(intent);
            }
        });


        recharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        withDrawl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });







        CV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OfferActivity.class);
                startActivity(intent);
            }
        });


        return v;
    }
}