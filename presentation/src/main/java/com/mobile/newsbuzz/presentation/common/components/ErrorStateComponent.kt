package com.mobile.newsbuzz.presentation.common.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mobile.newsbuzz.presentation.R

/**
 * Composable for displaying an error state component.
 */
@Composable
fun ErrorStateComponent(
    modifier: Modifier = Modifier,
    message: String = stringResource(R.string.an_unknown_error_occurred_please_try_again)
) {
    Column(
        modifier = modifier.testTag(stringResource(R.string.error_state_component)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.vertical_arrangement))
    ) {
        Text(
            text = message,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )
    }
}
