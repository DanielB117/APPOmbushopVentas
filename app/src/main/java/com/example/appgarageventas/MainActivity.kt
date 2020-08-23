package com.example.appgarageventas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    companion object {
        val LOG_TAG = "kiko"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun stringRequest() {
        Log.i(LOG_TAG, "stringRequest")

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)

        val url = "http://garage-venta.ombushop.com"

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(url,
            Response.Listener<String> { response ->
                // Display the first 100 characters of the response string.
                Log.i(LOG_TAG, "Response is: ${response.substring(0, 100)}")
            },
            Response.ErrorListener { error ->
                error.printStackTrace()
                Log.e(LOG_TAG, "That didn't work!")
            })

        // Add the request to the RequestQueue.
        queue.add(stringRequest)
    }

    /**
     * Llamada GET que devuelve un JSONobject
     */
    fun jsonObjectRequest() {
        Log.i(LOG_TAG, "jsonObjectRequest")

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)

        val url ="https://secure.ombushop.com/api/products?secret=66981711eab9ca20a7acf4b4c0414d4d025725078ac98ded32f74b66f0d16c6f"

        // Request a JSONObject response from the provided URL.
        val jsonObjectRequest = JsonObjectRequest( url, null,
            Response.Listener { response ->
                Log.i(LOG_TAG, "Response is: $response")
            },
            Response.ErrorListener { error ->
                error.printStackTrace()
                Log.e(LOG_TAG, "That didn't work!")
            }
        )

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest)
    }

    /**
     * Llamada POST que envia un JSONObject y devuelve un JSONobject
     */
    fun jsonObjectRequestPost() {
        Log.i(LOG_TAG, "jsonObjectRequestPost")

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)

        val url = "https://secure.ombushop.com/api/products?secret=66981711eab9ca20a7acf4b4c0414d4d025725078ac98ded32f74b66f0d16c6f"

        val jsonObject = JSONObject()
        jsonObject.put("imgProducto", "none")
        jsonObject.put("edtCodigo", "text")
        jsonObject.put("tvDescripcion", "text")
        jsonObject.put("tvStock", "text")
        jsonObject.put("tvActualizado", "text")
        // Request a JSONObject response from the provided URL.
        val jsonObjectRequest = JsonObjectRequest(url, jsonObject,
            Response.Listener { response ->
                Log.i(LOG_TAG, "Response is: $response")
            },
            Response.ErrorListener { error ->
                error.printStackTrace()
                Log.e(LOG_TAG, "That didn't work!")
            }
        )

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest)
    }

    fun jsonArrayRequest() {
        Log.i(LOG_TAG, "jsonArrayRequest")

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)

        val url = "https://secure.ombushop.com/api/products?secret=66981711eab9ca20a7acf4b4c0414d4d025725078ac98ded32f74b66f0d16c6f"

        // Request a JSONArray response from the provided URL.
        val jsonArrayRequest = JsonArrayRequest(url,
            Response.Listener { response ->
                Log.i(LOG_TAG, "Response is: $response")
            },
            Response.ErrorListener { error ->
                error.printStackTrace()
                Log.e(LOG_TAG, "That didn't work!")
            }
        )

        // Add the request to the RequestQueue.
        queue.add(jsonArrayRequest)
    }

    fun jsonArrayRequestPost() {
        Log.i(LOG_TAG, "jsonArrayRequestPost")

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)

        val url = "https://secure.ombushop.com/api/products?secret=66981711eab9ca20a7acf4b4c0414d4d025725078ac98ded32f74b66f0d16c6f"

        val jsonArray = JSONArray()
        jsonArray.put(1)
        jsonArray.put(2)
        jsonArray.put(3)

        // Request a JSONArray response from the provided URL.
        val jsonArrayRequest = JsonArrayRequest(
            Request.Method.POST, url, jsonArray,
            Response.Listener { response ->
                Log.i(LOG_TAG, "Response is: $response")
            },
            Response.ErrorListener { error ->
                error.printStackTrace()
                Log.e(LOG_TAG, "That didn't work!")
            }
        )

        // Add the request to the RequestQueue.
        queue.add(jsonArrayRequest)
    }
}
