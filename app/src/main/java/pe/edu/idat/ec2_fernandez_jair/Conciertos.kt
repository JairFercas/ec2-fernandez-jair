package pe.edu.idat.ec2_fernandez_jair

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EjemploCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .size(width = 240.dp, height = 100.dp), elevation = CardDefaults.cardElevation(defaultElevation = 10.dp), colors = CardDefaults.cardColors(containerColor = Color.White, contentColor = Color.Magenta), shape = MaterialTheme.shapes.large, border = BorderStroke(1.dp, Color.Black)
    ) {
        Column(Modifier.padding(15.dp)) {

            Text(text = "Moviles 2")
            Text(text = "Moviles 2")
            Text(text = "Moviles 2")
            Text(text = "Moviles 2")
        }
    }
}