package com.example.myuipertama.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun ActivitasPertama(modifier : Modifier){
    Column ( modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
    horizontalAignment = Aligment.CenterHorizontally
        ){
            Text(stringResource(R.string.prodi),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold)

        }
}
