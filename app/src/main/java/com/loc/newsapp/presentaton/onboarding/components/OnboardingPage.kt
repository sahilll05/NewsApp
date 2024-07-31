package com.loc.newsapp.presentaton.onboarding.components
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.loc.newsapp.presentaton.onboarding.Page
import androidx.compose.foundation.layout.Spacer
import com.loc.newsapp.presentaton.onboarding.Dimens.MediumPadding1
import androidx.compose.foundation.layout.padding
import com.loc.newsapp.presentaton.onboarding.Dimens.MediumPadding2
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.colorResource
import android.R
import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview
import com.loc.newsapp.ui.theme.NewsAppTheme
import com.loc.newsapp.presentaton.onboarding.pages
import android.content.res.Configuration.UI_MODE_NIGHT_YES

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
){

    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f) ,
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.black)
        )
        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.tab_indicator_text)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES,showBackground = true)
@Composable
fun OnBoardingPagePreview(){
    NewsAppTheme {
        OnBoardingPage(
            page = pages[0]
        )

    }

}
