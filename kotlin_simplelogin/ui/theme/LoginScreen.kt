package com.example.kotlin_simplelogin.ui.theme


import android.credentials.Credential
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.kotlin_simplelogin.MainActivity


@Composable
fun LoginScreen() {
    var user by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(text="Bem vindo!", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))

        Text(text="Faça Login em sua conta")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = user, onValueChange = {
            user = it
        }, label = {
            Text(text = "Nome de usuário")
        })
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Senha")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))
        Button (onClick = {
            Log.i("Credential", "user: $user password $password")
        } ) {
            Text(text = "Login")
        }

    }
}
