package br.senai.sp.cotia.jogodavelhaapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.senai.sp.cotia.jogodavelhaapp.R;
import br.senai.sp.cotia.jogodavelhaapp.databinding.FragmentJogoBinding;

public class JogoFragment extends Fragment {
        //variavel para acessar o elements da view PrefFragment
        private FragmentJogoBinding binding;
        //vetor
        private Button[] botoes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //intanciando o  vetor
        botoes = new Button[9];
        //instanciando o binding
        binding = FragmentJogoBinding.inflate(inflater, container,false);
        //binding = FragmentJogoBinding.inflate(inflater, container,false);

        botoes[0] = binding.bt00;
        botoes[1] = binding.bt01;
        botoes[2] = binding.bt02;
        botoes[3] = binding.bt10;
        botoes[4] = binding.bt11;
        botoes[5] = binding.bt12;
        botoes[6] = binding.bt20;
        botoes[7] = binding.bt21;
        botoes[8] = binding.bt22;

    //for para ele correr entre os 9 botoes
        for (Button bt :botoes){
            bt.setOnClickListener(listenerBotoes);
        }


        //retorno da view
        return binding.getRoot();
    }
    //listerner para os botoes

    //colocar botões para funcionar.
    private View.OnClickListener listenerBotoes = btPress -> {
        Log.w("BOTAO",getContext().getResources().getResourceName(btPress.getId()));
        //Obtem o nome do botao
        String nomeBotao = getContext().getResources().getResourceName(btPress.getId());
        //extrair posiçao do atraves do botao
        String posicao = nomeBotao.substring(nomeBotao.length()-2);
        //extraindo a linha e coluna da string posicao
        //character para o voltar o numero do ID
        int linha = Character.getNumericValue( posicao.charAt(0));
        int coluna = Character.getNumericValue(posicao.charAt(1));
        Log.w("BOTAO", linha+"");
        Log.w("BOTAO", coluna+"");

    };
}