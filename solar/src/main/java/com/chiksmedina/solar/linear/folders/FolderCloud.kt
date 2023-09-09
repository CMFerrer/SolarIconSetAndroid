package com.chiksmedina.solar.linear.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.FoldersGroup

public val FoldersGroup.FolderCloud: ImageVector
    get() {
        if (_folderCloud != null) {
            return _folderCloud!!
        }
        _folderCloud = Builder(name = "FolderCloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 6.9497f)
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
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                verticalLineTo(6.9497f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.9524f, 11.8852f)
                curveTo(13.1907f, 11.8072f, 13.4471f, 11.7647f, 13.7143f, 11.7647f)
                curveTo(13.9762f, 11.7647f, 14.2277f, 11.8055f, 14.462f, 11.8806f)
                moveTo(10.0465f, 12.8533f)
                curveTo(9.939f, 12.8338f, 9.8279f, 12.8235f, 9.7143f, 12.8235f)
                curveTo(8.7675f, 12.8235f, 8.0f, 13.5346f, 8.0f, 14.4118f)
                curveTo(8.0f, 15.2889f, 8.7675f, 16.0f, 9.7143f, 16.0f)
                horizontalLineTo(13.7143f)
                curveTo(14.9767f, 16.0f, 16.0f, 15.0519f, 16.0f, 13.8824f)
                curveTo(16.0f, 12.9554f, 15.3572f, 12.1676f, 14.462f, 11.8806f)
                moveTo(10.0465f, 12.8533f)
                curveTo(9.9548f, 12.6242f, 9.9048f, 12.3763f, 9.9048f, 12.1176f)
                curveTo(9.9048f, 10.9481f, 10.9281f, 10.0f, 12.1905f, 10.0f)
                curveTo(13.3664f, 10.0f, 14.3348f, 10.8226f, 14.462f, 11.8806f)
                moveTo(10.0465f, 12.8533f)
                curveTo(10.2722f, 12.8944f, 10.4821f, 12.9765f, 10.6667f, 13.091f)
            }
        }
        .build()
        return _folderCloud!!
    }

private var _folderCloud: ImageVector? = null
