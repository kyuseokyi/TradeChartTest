package com.example.tradechart

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        try {
            com.scichart.charting.visuals.SciChartSurface.setRuntimeLicenseKey("wv2EOfL+DioOF0IHeuxlJ3RcR095j5hC4YDm9S+f5sssvSZTbHU7a2jk8JeeazGueebb4oTN7qZ2rwVKq/YcUqWEs6d2z7aa2OOR4kBABL57IEUWLnovNMq3CYY3/MGa/fgyg7i6khnBlq9oVg13MVzqhupIJ0Vh7y08jK45QvZyl8C06PQzUH2vfG5rpWx9hXZ+kpzMvOmycW6vfLABUtd191GmYyvjBE6r+P8CaXX+Na4bNQ4DtYA+/74aqSBkZCDMTfbTDlsaN60lYoZAI9FPtbci5kRJu3CN/WmQDNP4iPd25bd07ZKMtDXs+tAE68qpbSVTIy+aIaUzrG086NSShLeqV6RnzeET1vCcGsMvxmRZfnjo5RhPeiCkDI3qkfbWfBUrlHVUGDZXuwc0gaby7rEySximCQehw1Zymyy9lwHravlPVYw753N4uYRZrYuBlZxFwI/IgzrEMSD119ktdVbvKDa9YL8oW0tRyh3voEza1YE1S7mwi1GjSayPOU/Y/66Ztl0nlldNgK31bLTmuSmD3oxSb2lrkzJG8t4Y65UZ9NnyVog99XJtYGadgD0uvGP+cQ==")
        } catch (e: Exception) {
            Log.e("SciChart", "Error when setting the license", e)
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
