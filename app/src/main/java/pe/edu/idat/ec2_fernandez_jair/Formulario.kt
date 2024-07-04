package pe.edu.idat.ec2_fernandez_jair

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun Formulario(){
    var nombre by rememberSaveable {mutableStateOf("")}
    var apellidos by rememberSaveable {mutableStateOf("")}
    var dni by rememberSaveable {mutableStateOf("")}
    var celular by rememberSaveable {mutableStateOf("")}
    var email by rememberSaveable {mutableStateOf("")}

    Box(
        Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp, top = 30.dp)) {
        Column {
            Text(text = "Informacion")
            espacio(tamanio = 10)
            OutlinedTextField(value = nombre, onValueChange = {nombre=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Nombre")}, maxLines = 1, singleLine = true)
            espacio(tamanio = 10)
            OutlinedTextField(value = apellidos, onValueChange = {apellidos=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Apellidos")}, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
            espacio(tamanio = 10)
            OutlinedTextField(value = dni, onValueChange = {dni=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "DNI")}, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
            espacio(tamanio = 10)
            OutlinedTextField(value = celular, onValueChange = {celular=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Ingrese su talla")}, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
            espacio(tamanio = 10)
            OutlinedTextField(value = email, onValueChange = {email=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Ingrese su talla")}, maxLines = 1, singleLine = true)
            espacio(tamanio = 25)
            Text(text = "Seleccione los Programas que domine:")
            

        }
    }

}

@Composable
fun espacio(tamanio: Int){
    Spacer(modifier = Modifier
        .height(tamanio.dp))
}