package com.example.mystud

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mystud.ui.theme.MyStudTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Halo(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Home Screen", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.LightGray
                ),
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "icon menu"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "notification "
                        )
                    }
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "about"
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "icon add")
            }
        },
        bottomBar = {
            BottomAppBar (
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.ArrowBack ,contentDescription = "icon back")
                    }
                }
            )
        },

        modifier = modifier
    ) { paddingValues ->
        HaloContent(modifier = Modifier.padding(paddingValues))

    }
}

@Composable
fun HaloContent(modifier: Modifier = Modifier) {
    var expandedEinstein by remember {
        mutableStateOf(false)

    }
    var expandedNewton by remember {
        mutableStateOf(false)

    }

    var expandedGojo by remember {
        mutableStateOf(false)
    }

    var expandedAsta by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp) // Add space between items
    ) {

        // Albert Einstein section
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.albert_einstein),
                    contentDescription = "Foto Albert Eistein",
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .clickable { expandedEinstein = !expandedEinstein },
                    contentScale = ContentScale.Crop
                )

                Icon(
                    imageVector = Icons.Default.CheckCircle, contentDescription = "icon check",
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(20.dp),
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = "Albert Einstein", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "Once said:", fontWeight = FontWeight.SemiBold, fontSize = 15.sp)

                if (expandedEinstein) {
                    Text(text = "“The more I learn, the more I realize how much I don't know.”")
                }
            }
        }

        //Isaac Newton section
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.isaac_newton),
                    contentDescription = "Foto Isaac Newton",
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .clickable { expandedNewton = !expandedNewton },
                    contentScale = ContentScale.Crop
                )

                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "icon check",
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(20.dp),
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = "Isaac Newton", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "Once said:", fontWeight = FontWeight.SemiBold, fontSize = 15.sp)

                if (expandedNewton) {
                    Text(text = "“Whence arises all that order and beauty we see in the world?”")
                }
            }
        }

        //Gojo
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.gojo),
                    contentDescription = "Foto Gojo",
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .clickable { expandedGojo = !expandedGojo},
                    contentScale = ContentScale.Crop
                )

                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "icon check",
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(20.dp),
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = "Satoru Gojo", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "Once said:", fontWeight = FontWeight.SemiBold, fontSize = 15.sp)

                if (expandedGojo) {
                    Text(text = "“Whence Dying to win and risking death to win are completely different, Megumi.”")
                }
            }
        }

        //Asta
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.asta),
                    contentDescription = "Foto Asta",
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .clickable { expandedAsta = !expandedAsta },
                    contentScale = ContentScale.Crop
                )

                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "icon check",
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(20.dp),
                    tint = Color.Blue
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = "Asta", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "Once said:", fontWeight = FontWeight.SemiBold, fontSize = 15.sp)

                if (expandedAsta) {
                    Text(text = "“You need to stand your ground no matter how pathetic you are!”")
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
private fun HaloPriview() {
    Halo()
}

