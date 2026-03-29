package io.mhdkhubbi.noteapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.mhdkhubbi.noteapp.R


@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {

    Column(modifier.fillMaxSize().padding(start = 20.dp, end = 20.dp, top = 20.dp)) {
        Text("Settings", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
        Spacer(Modifier.height(20.dp))
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp,)) {
                Text(
                    text = "Account Identity",fontSize = 20.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(16.dp),
                    textAlign = TextAlign.Center,
                )
                Row(Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,){
                    Icon(
                        painter = painterResource(R.drawable.profile),
                        contentDescription = "Profile",
                        tint = null,
                        modifier = Modifier
                            .clip(
                                RoundedCornerShape(
                                    35.dp,

                                    )
                            )
                            .size(70.dp, 70.dp)
                    )
                    Spacer(Modifier.width(15.dp))
                    Text("Muhammad Alkhubbi", fontSize = 20.sp, fontWeight = FontWeight.Medium)
                }
                Spacer(Modifier.height(15.dp))
                Row(Modifier.padding(start = 10.dp)){
                    Text("First Name: ", fontSize = 18.sp)
                    Spacer(Modifier.width(15.dp))

                }
                Spacer(Modifier.height(10.dp))
                Row(Modifier.padding(start = 10.dp)){
                    Text("Last Name: ",fontSize = 18.sp)
                    Spacer(Modifier.width(15.dp))
                }
                Spacer(Modifier.height(10.dp))
                Row() {
                    Spacer(Modifier.weight(1f))
                    Button(onClick = {}) {
                        Text("Save")
                    }
                }
                Spacer(Modifier.height(10.dp))
            }


        }
        Spacer(Modifier.height(20.dp))
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 20.dp)) {
                Text(
                    text = "Appearance", fontSize = 20.sp, fontWeight = FontWeight.SemiBold,
                )
                Spacer(Modifier.height(20.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Dark Mode", fontSize = 18.sp)
                    Spacer(Modifier.weight(1f))
                    Switch(true, onCheckedChange = {})
                }
                Spacer(Modifier.height(10.dp))

            }
        }


    }

}