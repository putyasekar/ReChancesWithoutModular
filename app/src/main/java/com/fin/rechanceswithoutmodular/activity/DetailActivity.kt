package com.fin.rechanceswithoutmodular.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.model.ContentModel
import kotlinx.android.synthetic.main.activity_product_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val KEY_PRODUCTS = "key_products"
    }

    private var product: ContentModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        icon_back_detail.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        product = intent.getParcelableExtra(KEY_PRODUCTS)

        product_title.text = product?.title
        product_price.text = product?.price
        detail_product.text = product?.desc
        Glide.with(this).load(product?.image).apply(RequestOptions().override(600))
            .into(image_detail_product)

    }
}