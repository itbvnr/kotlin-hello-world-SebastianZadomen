package cat.itb.m78.exercices

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventStart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.serialization.RouteEncoder
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.myImage
import org.jetbrains.compose.resources.painterResource
import kotlin.math.PI


@Composable
fun HelloWorldApp() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.Center)) {
            Text("Welcome!", modifier = Modifier.align(Alignment.CenterHorizontally))
            Text("Start learning now")
            Spacer(modifier = Modifier.height(10.dp))

            Box {Modifier.align(Alignment.Center) }
            Button(onClick = { }) {
                Text(
                    "Login",
                    color = Color.White,
                )

            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {  }) {
                Text("Register", color = Color.White, modifier = Modifier.padding(5.dp))
            }
            fun ViewImage() {
                Image(
                    painter = painterResource(Res.drawable.myImage),
                    modifier = Modifier.size(100.dp),
                    contentDescription = null
                )
            }
        }
    }
}








