package com.hadesfranklyn.atmconsultoria.ui.sobre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hadesfranklyn.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "A ATM Consultoria tem como missão apoiar organizações que " +
                "desejam alcançar o sucesso atráves da excelência em gestão e da busca pela " +
                "qualidade.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://meu-curriculo-franklyn-roberto.netlify.app/", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("FranklynRobertoDaSilva","Facebook")
                .addGitHub("hadesfranklyn","Github")
                .addInstagram("franklyn_r.s", "Instagram")
                .addTwitter("franklyn_r_s","Twitter")
                .addYoutube("UCSppGbotlcDQ17B-7Dw4Gog", "YouTube")

                .addItem(versao)

                .create();
    }
}