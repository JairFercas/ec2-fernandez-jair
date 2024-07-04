package pe.edu.idat.ec2_fernandez_jair

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun EjemploCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .size(width = 240.dp, height = 100.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Magenta
        ),
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Column(Modifier.padding(15.dp)) {

            Text(text = "Moviles 2")
            Text(text = "Moviles 2")
            Text(text = "Moviles 2")
            Text(text = "Moviles 2")
        }
    }
}
@Composable
fun ItemRecycler(conciertosmusicales: Conciertomusical){
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), shape = MaterialTheme.shapes.medium, modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = Color.White) ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = mascota.nombre, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = mascota.raza)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = mascota.raza)

            }

        }

    }
}




fun listarMascotas(): List<Conciertomusical> {
    return listOf(
        Conciertomusical("cantante 1", "sudamerica", "03/07/2024" ),
        Conciertomusical("cantante 2", "sudamerica", "03/07/2024" ),
        Conciertomusical("cantante 3", "sudamerica", "03/07/2024" ),
        Conciertomusical("cantante 4", "sudamerica", "03/07/2024" ),
        Conciertomusical("cantante 5", "sudamerica", "03/07/2024"),
        Conciertomusical("cantante 6", "europa", "03/07/2024"),
        Conciertomusical("cantante 7", "europa", "03/07/2024"),
        Conciertomusical("cantante 8", "europa", "03/07/2024"),
        Conciertomusical("cantante 9", "europa", "03/07/2024"),
        Conciertomusical("cantante 10", "europa", "03/07/2024"),
    )
}