package com.bita.counterapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bita.counterapp.viewModel.ViewModelCount


class CounterMainActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            Surface {
                ComponentCounter()
            }

        }

    }

}

@Composable
    fun ComponentCounter(){

    val countActions = ViewModelCount()

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Row(modifier = Modifier
                .padding()
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center){

                val countString = countValue.toString()

                CustomButtons("Remove")

                Box(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
                )
                {
                    Text(text = countString, textAlign = TextAlign.Center)
                }

                CustomButtons("Add")

            }
        }
    }



