package com.bita.counterapp

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp



@Composable
fun Counter(count: Int) {

    var (valueCount, setValueCount) = remember {
        mutableStateOf(count)
    }
    fun removeCount() {
        if(valueCount > 0) {
            setValueCount(valueCount - 1)
        } else {
            setValueCount(0)
        }

    }

    fun addCount() {
        setValueCount(valueCount + 1)
    }



    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Row (modifier = Modifier
            .padding()
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){

            val countString = valueCount.toString()

            Button(onClick = { removeCount() }) { Text(text = "remove") }

            Box(
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
            )
            {
                Text(text = countString, textAlign = TextAlign.Center)
            }

            Button(onClick = { addCount() }) { Text(text = "Add") }

        }
    }

}