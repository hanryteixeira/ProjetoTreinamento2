package com.ibm.hanryteixeira.projetotreinamento.ViewModel;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ibm.hanryteixeira.projetotreinamento.Model.Model;
import com.ibm.hanryteixeira.projetotreinamento.R;

import java.util.List;

//ViewModel organiza as informações para a Activity

public class ViewModel {



    public static class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

        public List<Model> listaFilmes;

        public Adapter(List<Model> lista) {
            this.listaFilmes = lista;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View itemLista = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.activity_filme, parent, false);

            return new MyViewHolder(itemLista);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            Model filme = listaFilmes.get( position );
            holder.titulo.setText( filme.getTituloFilme() );
            holder.genero.setText( filme.getGenero() );
            holder.ano.setText( filme.getAno() );

        }

        @Override
        public int getItemCount() {
            return listaFilmes.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView titulo;
            TextView ano;
            TextView genero;

            public MyViewHolder(View itemView) {
                super(itemView);

                titulo = itemView.findViewById(R.id.textTitulo);
                ano = itemView.findViewById(R.id.textAno);
                genero = itemView.findViewById(R.id.textGenero);

            }
        }

    }
}
