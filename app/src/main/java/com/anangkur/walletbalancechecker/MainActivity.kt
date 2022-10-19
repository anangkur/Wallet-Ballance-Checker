package com.anangkur.walletbalancechecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val bottomSheetState = rememberModalBottomSheetState(
                initialValue = ModalBottomSheetValue.Hidden,
                skipHalfExpanded = true,
            )

            MaterialTheme {
                ModalBottomSheetLayout(
                    sheetContent = {
                        Box(modifier = Modifier.defaultMinSize(minHeight = 1.dp)) {
                        }
                    },
                    content = {
                        Scaffold(
                            topBar = {
                                TopAppBar(
                                    title = {
                                        Text(text = stringResource(id = R.string.app_name))
                                    },
                                )
                            },
                            content = { it.apply {

                            } }
                        )
                    },
                    sheetState = bottomSheetState,
                    sheetElevation = 50.dp,
                    sheetShape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
                )
            }
        }
    }
}