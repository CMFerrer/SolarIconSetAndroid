package com.chiksmedina.solar.boldduotone.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.FoldersGroup

public val FoldersGroup.FolderSecurity: ImageVector
    get() {
        if (_folderSecurity != null) {
            return _folderSecurity!!
        }
        _folderSecurity = Builder(name = "FolderSecurity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.7979f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                verticalLineTo(6.9497f)
                curveTo(2.0f, 6.0672f, 2.0f, 5.6259f, 2.0694f, 5.2584f)
                curveTo(2.3746f, 3.6403f, 3.6403f, 2.3746f, 5.2584f, 2.0694f)
                curveTo(5.6259f, 2.0f, 6.0672f, 2.0f, 6.9497f, 2.0f)
                curveTo(7.3364f, 2.0f, 7.5298f, 2.0f, 7.7156f, 2.0174f)
                curveTo(8.5167f, 2.0923f, 9.2765f, 2.407f, 9.8959f, 2.9205f)
                curveTo(10.0396f, 3.0396f, 10.1763f, 3.1763f, 10.4497f, 3.4497f)
                lineTo(11.0f, 4.0f)
                curveTo(11.8158f, 4.8158f, 12.2237f, 5.2237f, 12.7121f, 5.4954f)
                curveTo(12.9804f, 5.6447f, 13.2651f, 5.7626f, 13.5604f, 5.8468f)
                curveTo(14.0979f, 6.0f, 14.6747f, 6.0f, 15.8284f, 6.0f)
                horizontalLineTo(16.2021f)
                curveTo(18.8345f, 6.0f, 20.1506f, 6.0f, 21.0062f, 6.7695f)
                curveTo(21.0849f, 6.8402f, 21.1598f, 6.9151f, 21.2305f, 6.9938f)
                curveTo(22.0f, 7.8493f, 22.0f, 9.1655f, 22.0f, 11.7979f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 13.0f)
                curveTo(9.25f, 11.4812f, 10.4812f, 10.25f, 12.0f, 10.25f)
                curveTo(13.5188f, 10.25f, 14.75f, 11.4812f, 14.75f, 13.0f)
                curveTo(14.75f, 14.2588f, 13.9043f, 15.32f, 12.75f, 15.6465f)
                verticalLineTo(17.5f)
                curveTo(12.75f, 17.9142f, 12.4142f, 18.25f, 12.0f, 18.25f)
                curveTo(11.5858f, 18.25f, 11.25f, 17.9142f, 11.25f, 17.5f)
                verticalLineTo(15.6465f)
                curveTo(10.0957f, 15.32f, 9.25f, 14.2588f, 9.25f, 13.0f)
                close()
                moveTo(10.75f, 13.0f)
                curveTo(10.75f, 12.3096f, 11.3096f, 11.75f, 12.0f, 11.75f)
                curveTo(12.6904f, 11.75f, 13.25f, 12.3096f, 13.25f, 13.0f)
                curveTo(13.25f, 13.6904f, 12.6904f, 14.25f, 12.0f, 14.25f)
                curveTo(11.3096f, 14.25f, 10.75f, 13.6904f, 10.75f, 13.0f)
                close()
            }
        }
        .build()
        return _folderSecurity!!
    }

private var _folderSecurity: ImageVector? = null