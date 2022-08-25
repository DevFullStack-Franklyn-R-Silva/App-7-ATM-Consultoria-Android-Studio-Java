package com.hadesfranklyn.atmconsultoria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.hadesfranklyn.atmconsultoria.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarEmail();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_principal,
                R.id.nav_servicos,
                R.id.nav_clientes,
                R.id.nav_contato,
                R.id.nav_sobre)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    public void enviarEmail(){


        String celular = "tel:82999915558";
        String imagem = "https://static.wikia.nocookie.net/marvel/images/b/bc/Thanos_%28Earth-199999%29_from_Avengers_Infinity_War_-_The_Official_Movie_Special_001.jpg/revision/latest?cb=20190503185709&path-prefix=pt-br";
        String endereco = "https://www.google.com/maps?q=arapiraca&rlz=1C1CHZN_pt-BRBR993BR993&um=1&ie=UTF-8&sa=X&ved=2ahUKEwj3wJqE4uD5AhVHvJUCHah7BEoQ_AUoAXoECAQQAw";
//        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(celular));
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(imagem));
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco));

        Intent intent = new Intent(Intent.ACTION_SEND);
        startActivity(intent);


    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}