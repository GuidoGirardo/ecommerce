package com.damaris.ecommerce_vyza.ui.screens.auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.damaris.ecommerce_vyza.R
import com.damaris.ecommerce_vyza.ui.theme.Rounded8

// agregue
import com.damaris.ecommerce_vyza.ui.modelview.AuthViewModel

@Composable
fun RegisterScreen(
    loginClick: () -> Unit,
    viewModel: AuthViewModel
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = { },
            modifier = Modifier.fillMaxWidth(),
            shape = Rounded8,
            placeholder = {
                Text("User")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { },
            modifier = Modifier.fillMaxWidth(),
            shape = Rounded8,
            placeholder = {
                Text("Mail")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { },
            modifier = Modifier.fillMaxWidth(),
            shape = Rounded8,
            placeholder = {
                Text("Password")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                viewModel.registerUser("email@email.com", "123sdsd")
            },
            shape = Rounded8
        ) {
            Text(text = stringResource(id = R.string.rs_register))
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = stringResource(id = R.string.rs_have_an_account),
            modifier = Modifier
                .clickable { loginClick() }
        )

    }
}