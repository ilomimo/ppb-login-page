package com.example.mylogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.foundation.clickable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() //  buat layar full tanpa batas tepi

        setContent {
            LoginScreen() // <<<  isi yang bener
        }
    }
}

@Composable
fun LoginScreen() {
    // setting kolom dari atas ke bawah
    Column(
        modifier = Modifier.fillMaxSize(), // Biar kolomnya nutupin seluruh layar
        verticalArrangement = Arrangement.Center, // Biar isinya di tengah layar (atas-bawah)
        horizontalAlignment = Alignment.CenterHorizontally // Biar isinya di tengah layar (kiri-kanan)
    ) {
        // menampilkan gambar dari file drawable (gambar a.png)
        Image(
            painter = painterResource(id = R.drawable.a), // Gambar yang dipakai
            contentDescription = "Login image", //  cuma buat bantu orang buta (aksesibilitas)
            modifier = Modifier.size(200.dp) // Ukuran gambarnya 200 dp
        )

        // menampilkan tulisan "Welcome Back" gede dan tebal
        Text(
            text = "Welcome Back", // Tulisan yang muncul
            fontSize = 28.sp, // Ukuran huruf besar
            fontWeight = FontWeight.Bold // Huruf dibuat tebel
        )

        // setting jarak kecil 4dp
        Spacer(modifier = Modifier.height(4.dp)) // Spacer itu buat ngasih jarak kosong

        // menampilkan tulisan kecil di bawah "Welcome Back"
        Text(text = "Login to your account")

        // setting jarak lagi 16dp
        Spacer(modifier = Modifier.height(16.dp))

        // setting kotak buat ngetik Email
        OutlinedTextField(
            value = "", // Isinya masih kosong
            onValueChange = {}, //  buat update teks nanti, sekarang masih kosong
            label = {
                Text(text = "Email address") // Label di dalam kotak input
            }
        )

        // setting jarak lagi 16dp
        Spacer(modifier = Modifier.height(16.dp))

        // setting kotak buat ngetik Password
        OutlinedTextField(
            value = "", // Isinya masih kosong
            onValueChange = {}, //  buat update teks nanti, sekarang masih kosong
            label = {
                Text(text = "Password") // Label di dalam kotak input
            }
        )

        Spacer(modifier = Modifier.height(16.dp)) // kasih jarak 16 dp

        Button(onClick = { /* nanti buat klik login */ }) {
            Text(text = "Login") // tulisan dalam tombol
        }

        Spacer(modifier = Modifier.height(32.dp)) // jarak 32 dp

        Text(
            text = "Forgot Password?",
            modifier = Modifier.clickable { /* nanti buat klik forgot password */ }
        )

        Spacer(modifier = Modifier.height(32.dp)) // jarak 32 dp lagi

        Text(text = "Or sign in with") // tulisan biasa

        Spacer(modifier = Modifier.height(32.dp)) // kasih jarak 32 dp
        Row(
            modifier = Modifier
                .fillMaxWidth() // Biar Row-nya selebar layar
                .padding(40.dp), // Dikasih jarak 40 dp dari pinggir
            horizontalArrangement = Arrangement.SpaceEvenly // Biar gambar-gambar diratain jaraknya
        )

        {
            Image(
                painter = painterResource(id = R.drawable.fb),
                contentDescription = "Facebook",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        // Facebook clicked
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        // Google clicked
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "Twitter",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        // Twitter clicked
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    LoginScreen()
}