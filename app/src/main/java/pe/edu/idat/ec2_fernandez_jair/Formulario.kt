package pe.edu.idat.ec2_fernandez_jair

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun Formulario(){
    var nombre by rememberSaveable {mutableStateOf("")}
    var apellidos by rememberSaveable {mutableStateOf("")}
    var dni by rememberSaveable {mutableStateOf("")}
    var celular by rememberSaveable {mutableStateOf("")}
    var email by rememberSaveable {mutableStateOf("")}
    var programa by rememberSaveable {mutableStateOf("")}
    var color by rememberSaveable {mutableStateOf("")}

    Box(
        Modifier
            .fillMaxSize()
            .padding(start = 25.dp, end = 25.dp, bottom = 30.dp, top = 30.dp)) {
        Column {
            Text(text = "Informacion")
            espacio(tamanio = 2)
            OutlinedTextField(value = nombre, onValueChange = {nombre=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Nombre")}, maxLines = 1, singleLine = true)
            espacio(tamanio = 2)
            OutlinedTextField(value = apellidos, onValueChange = {apellidos=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Apellidos")}, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
            espacio(tamanio = 2)
            OutlinedTextField(value = dni, onValueChange = {dni=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "DNI")}, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
            espacio(tamanio = 2)
            OutlinedTextField(value = celular, onValueChange = {celular=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Ingrese su talla")}, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
            espacio(tamanio = 2)
            OutlinedTextField(value = email, onValueChange = {email=it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Ingrese su email")}, maxLines = 1, singleLine = true)
            espacio(tamanio = 4)
            Text(text = "Seleccione los Programas que domine:")
            Row {
                Checkbox(checked = true, onCheckedChange = null)
                Text(text = "MS SQL Server")
            }
            espacio(tamanio = 4)
            Row {
                Checkbox(checked = true, onCheckedChange = null)
                Text(text = "MS SQL Server")
            }
            espacio(tamanio = 4)
            Row {
                Checkbox(checked = true, onCheckedChange = null)
                Text(text = "MS SQL Server")
            }
            espacio(tamanio = 4)
            Row {
                Checkbox(checked = true, onCheckedChange = null)
                Text(text = "MS SQL Server")
            }
            OutlinedTextField(value = programa  , onValueChange = {programa =it}, modifier = Modifier.fillMaxWidth(), label = { Text(text = "Ingrese otro programa")}, maxLines = 1, singleLine = true)
            espacio(tamanio = 2)
            Text(text = "Seleccione su color favorito:")
            EjemploRadioButton(color = color) {
                color=it
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Acceder")
            }

        }
    }

}

@Composable
fun espacio(tamanio: Int){
    Spacer(modifier = Modifier
        .height(tamanio.dp))
}

@Composable
fun EjemploRadioButton(color: String, onItemSelected:(String)->Unit){ //Unite es el Void de Java
    Column(Modifier.fillMaxWidth(0.5f)){
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
            RadioButton(selected = color == "Azul", onClick = {onItemSelected("Azul")} )
            Text(text = "Azul", Modifier.padding(top = 8.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
            RadioButton(selected = color == "Rojo", onClick = {onItemSelected("Rojo")} )
            Text(text = "Rojo", Modifier.padding(top = 8.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
            RadioButton(selected = color == "Verde", onClick = {onItemSelected("Verde")} )
            Text(text = "Verde", Modifier.padding(top = 8.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
            RadioButton(selected = color == "Otro", onClick = {onItemSelected("Otro")} )
            Text(text = "Otro", Modifier.padding(top = 8.dp))
        }
    }
}