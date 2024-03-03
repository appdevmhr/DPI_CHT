package com.appdevmhr.dpi_cht

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appdevmhr.dpi_cht.ui.theme.DPI_CHTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DPI_CHTTheme {
                // A surface container using the 'background' color from the theme
               Screen(
                   title = "Department of Chemical",
                   data = "The Department of Chemical Engineering is one of the largest Department of Dhaka Polytechnic Institute. In the year 1964 Chemical technology course was started under the Bangladesh Technical Education Board and entry qualification is Secondary School Certificate (SSC i.e.10 years of schooling).In this Department Diploma in Chemical Engineering (specialization in Food Technology) was started in 1980 financed by Denmark Government. At that time all the teachers of Chemical Department were trained from India in different field of Food under the Scholarship of Denmark Government. From 2001 Department of Chemical and Food Engineering offering completely separate course of Food Technology. The Department has 12 Faculty members including 3 Guest Teacher, 5 technical support staff and 3 MLSS. There are 20% reserve seat for female students, 15% for Vocational and 5% for Disable students. Now Department of Chemical and Food Technology has120 seats (Group A-60 & Group B-60) in each shift per Technology and total entry is 480 per year.\n" +
                           "\n" +
                           "Chemical and Food Engineering Department is well furnished with modern Equipment’s. the Department has 10 laboratory/workshop two of them are established by International Labor Organization (ILO).Dhaka Polytechnic Institute got Accreditation to run two Competency Based Training and Assessment (CBT&A) Program in Agro-Based Food Sector. It is also a Registered Training Organization (RTO) to run Recognition of Prior Learning (RPL) course. Department started Skill Training on National Skill Certificate in 1. Food Processing and Quality Control level-l and level-ll. National Skill Certificate in baking level-ll. Department also offering RPL course on National Skill Certificate in Food Processing and Quality Control level-l time to time.\n" +
                           "\n" +
                           "After completion Diploma in Engineering program maximum of the students are going to job market some of them are going for higher education in Dhaka University of Engineering and Technology (DUET) at Gazipur or other Public or Privet University in home or abroad. In DUET they can take admission in Bachelor of Food Engineering, Bachelor of Mechanical Engineering and also Bachelor of Instrumentation and Process control. In private University they can study in Bachelor of triple E and also Bachelor of in Textile Engineering.\n" +
                           "\n" +
                           "A Graduate in Chemical Diploma works as a Sub-Assistance Engineering the field of different Chemical factory like Fertilizer factory, Paper and Pulp industry, Gas field, Steel mill, Petroleum industry, Textile industry etc. A Graduate in Food Diploma works as a Sub-Assistance Engineer in the field of different Food Industry and some of them also become Entrepreneur."
               )
            }
        }
    }
}

@Composable
fun Screen(
    title: String,
    data: String
) {
    val scr = rememberScrollState()
    Surface(
        modifier = Modifier
            .verticalScroll(scr)
            .fillMaxSize()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background
    ) {

        Column {
            Text(
                style = TextStyle(
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W900
                ),
                text = title,
            )
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.drawable.et),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            GreetingDPICST(data = data)
        }

    }
}

@Composable
fun GreetingDPICST(data: String, modifier: Modifier = Modifier) {
    Text(
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold
        ),
        textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
        text = data,
        modifier = modifier
    )
}