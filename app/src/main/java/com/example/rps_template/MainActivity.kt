package com.example.rockpaperscissors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rps_template.ui.theme.RPSTemplateTheme

// You do not need to change MainActivity. It starts the app and shows RockPaperScissorsApp().
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RPSTemplateTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        RockPaperScissorsApp()
                    }
                }
            }
        }
    }
}

// =====================================================================
// YOUR CODE STARTS HERE
// Commit and push to GitHub at the end of every stage.
// =====================================================================

// ---- Stage 1: enum classes -------------------------------------------
// Make an enum class called Move with ROCK, PAPER and SCISSORS.
// Make an enum class called Outcome with WIN, LOSE and DRAW.


// ---- Stage 2: decide who wins ----------------------------------------
// Write a function decide(player: Move, computer: Move): Outcome
// Use the rules table from the start of the lesson.


// ---- Stage 4: screens ------------------------------------------------
// Make an enum class called Screen with START, GAME and RESULTS.


// ---- The app ---------------------------------------------------------
// Stages 1 to 3: build your game inside this composable.
// Stage 4: this becomes the parent that chooses which screen to show.
@Composable
fun RockPaperScissorsApp() {
    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {
        Text("Rock, Paper, Scissors", fontSize = 32.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Your game goes here")
    }
}

// ---- Stage 4: your screens go below ----------------------------------
// StartScreen, GameScreen and ResultsScreen, each with its own preview.


// ---- Previews --------------------------------------------------------
@Preview(showBackground = true)
@Composable
fun RockPaperScissorsAppPreview() {
    RPSTemplateTheme() {
        RockPaperScissorsApp()
    }
}
