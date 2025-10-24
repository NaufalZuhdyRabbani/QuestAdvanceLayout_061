package com.example.myuipertama.ui.theme

import android.R.attr.fontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myuipertama.R


@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.univ),
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(25.dp))

        // ==== KARTU UTAMA ====
        CardProfile(
            gambar = R.drawable.logo_umy,
            nama = stringResource(R.string.nama),
            alamat = stringResource(R.string.alamat)
        )

        // ==== KARTU TAMBAHAN 1 ====
        CardProfile(
            gambar = R.drawable.logo_umy,
            nama = stringResource(R.string.nama1),
            alamat = stringResource(R.string.alamat1),
            noHp = stringResource(R.string.noHp)
        )

        // ==== KARTU TAMBAHAN 2 ====
        CardProfile(
            gambar = R.drawable.logo_umy,
            nama = stringResource(R.string.nama2),
            alamat = stringResource(R.string.alamat2),
            noHp = stringResource(R.string.noHp1)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}

@Composable
fun CardProfile(
    gambar: Int,
    nama: String,
    alamat: String,
    noHp: String? = null
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.DarkGray
        )
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(gambar),
                contentDescription = "Logo UMY",
                modifier = Modifier
                    .size(100.dp)
                    .padding(5.dp)
            )

            Spacer(modifier = Modifier.width(30.dp))

            Column {
                Text(
                    text = nama,
                    fontSize = 26.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color.White,
                    modifier = Modifier.padding(5.dp)
                )

                Text(
                    text = alamat,
                    fontSize = 18.sp,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 5.dp)
                )

                // Tampilkan nomor HP jika tersedia
                if (noHp != null) {
                    Text(
                        text = noHp,
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }
        }
    }
}


