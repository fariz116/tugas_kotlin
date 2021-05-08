package com.ilhamfidatama.androidwithkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_movie.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MovieFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MovieFragment : Fragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        //setup recycleview with adapter
        val movieAdapter = MovieAdapter(Utils.movies)
        movieAdapter.notifyDataSetChanged()
        rv_movie.adapter = movieAdapter
        rv_movie.setHasFixedSize(true)
        rv_movie.layoutManager = LinearLayoutManager(context)

        btn_save.setOnClickListener {
            movieAdapter.addData(getForm())
            clearForm()
        }

        btn_delete.setOnClickListener {
            val index = getIndex()
            if (isNotOutRange(index)) movieAdapter.deleteData(index)
            else noticeOutRange()
            clearForm()
        }

        btn_update.setOnClickListener {
            val index = getIndex()
            if (isNotOutRange(index)) movieAdapter.updateData( getForm(),index)
            else noticeOutRange()
            clearForm()
        }

        btn_insert.setOnClickListener {
            val index = getIndex()
            if (isNotOutRange(index)) movieAdapter.insertData( getForm(),index)
            else noticeOutRange()
            clearForm()
        }


    }

    private fun getForm(): Movie{
        val name = edit_name.text.toString()
        val popularity = edit_pupularity.toString()
        val imageIndex =  (0 until Utils.images.size).random()

        return Movie(name, popularity.toDouble(), Utils.images[imageIndex])
    }

    private fun getIndex() : Int{
        val index = edit_row.toString()

        return if(index.isNotEmpty()) index.toInt() else 0
    }

    private fun clearForm(){
        edit_name.setText("")
        edit_pupularity.setText("")
        edit_row.setText("")
    }
    private fun isNotOutRange(index : Int ): Boolean = index < Utils.movies.size

    private fun noticeOutRange(){
        Toast.makeText(context, "Out of range of index list", Toast.LENGTH_LONG).show()
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment MovieFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            MovieFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}