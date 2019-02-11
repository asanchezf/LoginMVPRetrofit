package com.antonio.login_mvp_retrofit.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.antonio.login_mvp_retrofit.R;
import com.antonio.login_mvp_retrofit.model.modelos.Usuario;

import java.util.ArrayList;

public class AdaptadorRecyclerView extends RecyclerView.Adapter<AdaptadorRecyclerView.UsuariosViewHolder>  {


    private ArrayList<Usuario> items;//ArrayList de contactos sin filtrar

    private OnItemClickListener escucha;
    private final Context contexto;

    Usuario usuarios;
   // private UserFilter  friendFilter;//Clase para gestionar el filtrado
    //private UserFilter userFilter;//Clase para gestionar el filtrado
    //private CustomFilter userFilter;
    //private ArrayList<Contactos> userList;//Contactos  sin filtrar
    //ArrayList<Contactos> filteredUserList;//Contactos filtrados

      //String filter = "";//Caracteres introducidos para el filtrado
    //private String itemValue = "";//Nombre completo que aparece en el textview del nombre



    //CONSTRUCTOR DEL ADAPTADOR
    public AdaptadorRecyclerView(ArrayList<Usuario> datos, OnItemClickListener escucha, Context contexto) {

        items = datos;//items==userList
        this.escucha = escucha;
        this.contexto = contexto;
        //this.filteredUserList = new ArrayList<>();//ArrayList de los contactos filtrados...
        //this.filteredUserList=datos;

        // getFilter();



    }

    /**
     Obligatorio porque implementa Filterable. el filtrado se gestiona con la clase CustomFilter
     */
 /*   @Override
    public Filter getFilter() {
        if(userFilter == null) {
            userFilter = new CustomFilter(filteredUserList, this);
             filter = "";
        }
        return userFilter;
    }*/





    public interface OnItemClickListener {
        public void onClick(RecyclerView.ViewHolder holder, int idPromocion, View v);
    }

    //CLASE INTERNA CON VIEWHOLDER. CONTIENE EL MANEJADOR DE EVENTOS
    public class UsuariosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        TextView nombre;
        TextView email;
        TextView telefono;


      /*  TextView telefono;
        ImageView categoria;
        TextView txtObservaciones;
        Button contactar;

        ImageView ubicacion;
        TextView txtUbicacion;
        //Button ruta;
        TextView txtRuta;
        ImageView ruta;*/

        UsuariosViewHolder(View v) {
            super(v);

            //Agregamos los controles
            this.nombre =  v.findViewById(R.id.txtNombre);//Muestra el nombre.
            this.email =  v.findViewById(R.id.txEmail);
            this.telefono =  v.findViewById(R.id.txtTelefono);


            /*this.categoria = (ImageView) v.findViewById(R.id.category);
            this.telefono = (TextView) v.findViewById(R.id.text4);
            this.txtObservaciones = (TextView) v.findViewById(R.id.txtobservaciones);
            this.contactar=(Button)v.findViewById(R.id.btncontactar);

            this.ubicacion= (ImageView) v.findViewById(R.id.posicionamiento);
            this.txtUbicacion= (TextView) v.findViewById(R.id.txtubicacion);
            this.ruta= (ImageView) v.findViewById(R.id.imgruta);
            this.txtRuta= (TextView) v.findViewById(R.id.txtruta);*/

            //Agregamos el listener y lo asociamos a los controles que van a responder a él.
            v.setOnClickListener(this);
            //categoria.setOnClickListener(this);
            //contactar.setOnClickListener(this);
            //txtUbicacion.setOnClickListener(this);
            //txtRuta.setOnClickListener(this);
            //ruta.setOnClickListener(this);


        }


        @Override
        public void onClick(View v) {

            escucha.onClick(this, obtenerIdContacto(getAdapterPosition()),v);

        }

        private int obtenerIdContacto(int posicion) {

            return Integer.parseInt(items.get(posicion).getId());

        }


    }

    @Override//AQUI SE INFLARÁ LA VISTA
    public AdaptadorRecyclerView.UsuariosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fila_recyclerview_usuarios, parent,false);

        UsuariosViewHolder holder=new UsuariosViewHolder(v);
        //return new ContactosViewHolder(v);
        return holder;
    }


    @Override//asignamos los valores a los elementos con el holder y la variable posición que nos llegan
    public void onBindViewHolder(AdaptadorRecyclerView.UsuariosViewHolder holder, int position) {

          //usuarios=items.get(position);

        /*COMIENZA A PINTAR LAS VIEWS. EL CONTROL TITULO (CONTIENE EL NOMBRE) Y CUANDO SE HA REALIZADO UN FILTRADO EN EL SEARCHRVIEW SE MODIFICA
        PONIENDO LOS CARACTERES QUE COINCIDAN CON LA BÚSQUEDA DE OTRO COLOR...*/
   /*     if (filter.toString().equals("")) {//Antes de haber realizado alguna filtración se pintan los controles asociados al listview sin modificaciones.
            holder.titulo.setText(contactos.getNombre());//Pinta el textview normal

        }else{//Ha habido filtrado: pinta los caracteres del textview que correspondan en otro color y el resto permanece igual

            //AQUI
            itemValue = contactos.getNombre();

            int startPos = itemValue.toLowerCase(Locale.US).indexOf(filter.toLowerCase(Locale.US));
            int endPos = startPos + filter.length();

            if (startPos != -1) // This should always be true, just a sanity check
            {
                Spannable spannable = new SpannableString(itemValue);
                ColorStateList color = new ColorStateList(new int[][]{new int[]{}}, new int[]{Color.RED});//No ponen bien los colores traidos desde res?
                TextAppearanceSpan highlightSpan = new TextAppearanceSpan(null, Typeface.BOLD, -1, color, null);

                spannable.setSpan(highlightSpan, startPos, endPos, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                holder.titulo.setText(spannable);//Pinta los cambios
            } else
                holder.titulo.setText(itemValue);//El resto permanece igual

        }
*/

        holder.nombre.setText(items.get(position).getUsername());
        holder.email.setText(items.get(position).getEmail());
        holder.telefono.setText(items.get(position).getTelefono());





        //holder.txtObservaciones.setText(items.get(position).getObservaciones());

        //Evento scroll en una textView
       // holder.txtObservaciones.setMovementMethod(new ScrollingMovementMethod());

        //holder.categoria.setImageResource(R.drawable.imgcontacto3);
        //holder.ubicacion.setImageResource(R.drawable.icono_ubicacion);

        //holder.descripcion.setText("CATEGORIA");

     /*   if (contactos.getId_Categoria() == 1) {
            holder.descripcion.setText(R.string.categoria_familia);
            //holder.categoria.setImageResource(R.drawable.furgopeque);
        }else if(contactos.getId_Categoria() == 2){
            holder.descripcion.setText(R.string.categoria_amigos);
        }else if(contactos.getId_Categoria() == 3){
            holder.descripcion.setText(R.string.categoria_compañeros);
        }else if(contactos.getId_Categoria() == 4){
            holder.descripcion.setText(R.string.categoria_otros);
        }else if(contactos.getId_Categoria() == 5){
            holder.descripcion.setText(R.string.categoria_importado);
        }*/

    }


    @Override//establecemos el tamaño del arrayList con pojo.size
    public int getItemCount() {
        return items.size();

    }

}