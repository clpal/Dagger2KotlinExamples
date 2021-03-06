package clpal.example.kotlin.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import clpal.example.kotlin.dagger2.R.layout.activity_main
import clpal.example.kotlin.dagger2.di.DaggerCarInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var hondaCar: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        DaggerCarInjector.create().injectFields(this)

        hondaCar.drive()
    }
}
