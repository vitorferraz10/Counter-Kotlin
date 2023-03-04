package com.bita.counterapp

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bita.counterapp.viewModel.CounterViewModel


    @Composable
    fun ComponentCounter(){

         var actionsCounter = CounterViewModel()
         var countNumberInit = 0

        val (valueCount, setValueCount) = remember {
            mutableStateOf(countNumberInit)
        }

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Row(modifier = Modifier
                .padding()
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center){

                val countString = valueCount.toString()

                Button(onClick = { setValueCount(actionsCounter.removeCount(valueCount)) }) { Text(text = "remove") }

                Box(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
                )
                {
                    Text(text = countString, textAlign = TextAlign.Center)
                }

                Button(onClick = { setValueCount(actionsCounter.addCount(valueCount)) }) { Text(text = "Add") }

            }
        }
    }
