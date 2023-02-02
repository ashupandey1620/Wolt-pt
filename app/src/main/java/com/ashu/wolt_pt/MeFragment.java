package com.ashu.wolt_pt;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import de.hdodenhof.circleimageview.CircleImageView;


public class MeFragment extends Fragment {


    private ImageView imageMsg;
    private Button button1,button2;
    private CircleImageView circleImageView;
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11,cardView12,cardView13,cardView14,cardView15;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_me, container, false);



        imageMsg = v.findViewById(R.id.messages_status);
        circleImageView = v.findViewById(R.id.imageProfile);

        button1 = v.findViewById(R.id.rechargeMe);
        button2 = v.findViewById(R.id.withDrawlMe);



        cardView1 = v.findViewById(R.id.cardViewMe1);
        cardView2 = v.findViewById(R.id.cardViewMe2);
        cardView3 = v.findViewById(R.id.cardViewMe3);
        cardView4 = v.findViewById(R.id.cardViewMe4);
        cardView5 = v.findViewById(R.id.cardViewMe5);
        cardView6 = v.findViewById(R.id.cardViewMe6);
        cardView7 = v.findViewById(R.id.cardViewMe7);
        cardView8 = v.findViewById(R.id.cardViewMe8);
        cardView9 = v.findViewById(R.id.cardViewMe9);
        cardView10 = v.findViewById(R.id.cardViewMe10);
        cardView11 = v.findViewById(R.id.cardViewMe11);
        cardView12 = v.findViewById(R.id.cardViewMe12);
        cardView13 = v.findViewById(R.id.cardViewMe13);
        cardView14 = v.findViewById(R.id.cardViewMe14);
        cardView15 = v.findViewById(R.id.cardViewMe15);





        imageMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MessagesActivity.class);
                startActivity(intent);
            }
        });




        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ProfileImageActivity.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new RechargeFragment();

                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment).commit();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),WithdrawlApplication.class);
                startActivity(intent);
            }
        });



        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new OrderFragment();

                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment).commit();



            }
        });




        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AccountDetailsActivity.class);
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), MyWalletActivity.class);
                startActivity(intent);
            }
        });


        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), InviteFriendsActivity.class);
                startActivity(intent);
            }
        });


        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), PromotionsActivity.class);
                startActivity(intent);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TeamReport.class);
                startActivity(intent);
            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MessagesActivity.class);
                startActivity(intent);
            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SystemAnnouncementActivity.class);
                startActivity(intent);

            }
        });



        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), AboutUsActivity.class);
                startActivity(intent);
            }
        });

        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), RulesAndRegulationsActivity.class);
                startActivity(intent);
            }
        });


        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), AgentCooperationActivity.class);
                startActivity(intent);
            }
        });





        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new RechargeFragment();

                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment).commit();



            }
        });




                //Recharge Promotion Fragment









        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SettingsActivity.class);
                startActivity(intent);
            }
        });

        cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TrialBonusActivity.class);
                startActivity(intent);
            }
        });

        cardView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WheelOfFortuneActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }

    private class Callback extends WebViewClient {
    }
}