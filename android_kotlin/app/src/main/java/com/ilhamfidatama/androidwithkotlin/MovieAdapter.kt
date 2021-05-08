package com.ilhamfidatama.androidwithkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_movie.view.*


@Suppress("UNREACHABLE_CODE")
class MovieAdapter (private var movielist: MutableList<Movie>):RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    fun deleteData(index : Int){
        movielist.removeAt(index)
        notifyItemRemoved(index)
    }

    fun updateData(movie : Movie, index : Int){
        movielist[index] = movie
        notifyItemChanged(index)
    }

    fun addData(movie : Movie){
        movielist.add(movie)
        notifyDataSetChanged()
    }

    fun insertData(movie : Movie, index : Int){
        movielist.add(index, movie)
        notifyItemInserted(index)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.MovieViewHolder {
        TODO("Not yet implemented")
        LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.binding(movielist[position])
    }

    override fun getItemCount(): Int = movielist.size

    inner class MovieViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun binding(movie: Movie){
            itemView.tv_name.text = movie.name
            itemView.tv_popularity.text = movie.popularity.toString()

            //setup Image
            Glide.with(itemView)
                .load(movie.imagePath)
                .apply(RequestOptions.circleCropTransform().override(75,75))
                .into(itemView.tv_logo)

            //setup clicklistener of list
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "movie ${movie.name}", Toast.LENGTH_SHORT).show()
            }
        }

    }




}