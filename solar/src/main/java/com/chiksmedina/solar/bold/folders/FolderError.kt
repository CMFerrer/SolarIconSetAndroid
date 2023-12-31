package com.chiksmedina.solar.bold.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FoldersGroup

val FoldersGroup.FolderError: ImageVector
    get() {
        if (_folderError != null) {
            return _folderError!!
        }
        _folderError = Builder(
            name = "FolderError", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0694f, 5.2584f)
                curveTo(2.0f, 5.6259f, 2.0f, 6.0672f, 2.0f, 6.9497f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                verticalLineTo(11.7979f)
                curveTo(22.0f, 9.1655f, 22.0f, 7.8493f, 21.2305f, 6.9938f)
                curveTo(21.1598f, 6.9151f, 21.0849f, 6.8402f, 21.0062f, 6.7695f)
                curveTo(20.1506f, 6.0f, 18.8345f, 6.0f, 16.2021f, 6.0f)
                horizontalLineTo(15.8284f)
                curveTo(14.6747f, 6.0f, 14.0979f, 6.0f, 13.5604f, 5.8468f)
                curveTo(13.2651f, 5.7626f, 12.9804f, 5.6447f, 12.7121f, 5.4954f)
                curveTo(12.2237f, 5.2237f, 11.8158f, 4.8158f, 11.0f, 4.0f)
                lineTo(10.4497f, 3.4497f)
                curveTo(10.1763f, 3.1763f, 10.0396f, 3.0396f, 9.8959f, 2.9205f)
                curveTo(9.2765f, 2.407f, 8.5167f, 2.0923f, 7.7156f, 2.0174f)
                curveTo(7.5298f, 2.0f, 7.3364f, 2.0f, 6.9497f, 2.0f)
                curveTo(6.0672f, 2.0f, 5.6259f, 2.0f, 5.2584f, 2.0694f)
                curveTo(3.6403f, 2.3746f, 2.3746f, 3.6403f, 2.0694f, 5.2584f)
                close()
                moveTo(9.9697f, 11.4697f)
                curveTo(10.2626f, 11.1768f, 10.7374f, 11.1768f, 11.0303f, 11.4697f)
                lineTo(12.0f, 12.4393f)
                lineTo(12.9697f, 11.4697f)
                curveTo(13.2626f, 11.1768f, 13.7374f, 11.1768f, 14.0303f, 11.4697f)
                curveTo(14.3232f, 11.7626f, 14.3232f, 12.2374f, 14.0303f, 12.5303f)
                lineTo(13.0607f, 13.5f)
                lineTo(14.0303f, 14.4697f)
                curveTo(14.3232f, 14.7626f, 14.3232f, 15.2374f, 14.0303f, 15.5303f)
                curveTo(13.7374f, 15.8232f, 13.2626f, 15.8232f, 12.9697f, 15.5303f)
                lineTo(12.0f, 14.5607f)
                lineTo(11.0303f, 15.5303f)
                curveTo(10.7374f, 15.8232f, 10.2626f, 15.8232f, 9.9697f, 15.5303f)
                curveTo(9.6768f, 15.2374f, 9.6768f, 14.7626f, 9.9697f, 14.4697f)
                lineTo(10.9393f, 13.5f)
                lineTo(9.9697f, 12.5303f)
                curveTo(9.6768f, 12.2374f, 9.6768f, 11.7626f, 9.9697f, 11.4697f)
                close()
            }
        }
            .build()
        return _folderError!!
    }

private var _folderError: ImageVector? = null
