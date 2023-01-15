package com.arad.cleanarchitecture.register

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arad.cleanarchitecture.R
import com.arad.cleanarchitecture.ui.theme.CleanArchitectureTheme

class RegisterActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureTheme {
                SettingScreen()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun SettingScreen(){
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(modifier = Modifier.padding(24.dp)){
                UserName()
                Button(onClick = { /*TODO*/ }) {
                    Text(stringResource(R.string.submit))
                }
            }
        }
    }

    @Composable
    private fun UserName() {
        OutlinedTextField(
            value = "",
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            onValueChange = { },
            label = { Text(stringResource(R.string.enter_your_name)) },
            isError = false,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { }
            ),
        )
    }
}