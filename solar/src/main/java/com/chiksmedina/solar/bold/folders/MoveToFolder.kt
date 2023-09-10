package com.chiksmedina.solar.bold.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FoldersGroup

val FoldersGroup.MoveToFolder: ImageVector
    get() {
        if (_moveToFolder != null) {
            return _moveToFolder!!
        }
        _moveToFolder = Builder(
            name = "MoveToFolder", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 11.7979f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7713f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.1972f, 19.8541f, 2.0332f, 18.3859f, 2.0056f, 15.7501f)
                horizontalLineTo(10.6937f)
                lineTo(8.4339f, 17.3935f)
                curveTo(8.0989f, 17.6371f, 8.0249f, 18.1062f, 8.2685f, 18.4412f)
                curveTo(8.5121f, 18.7762f, 8.9812f, 18.8502f, 9.3162f, 18.6066f)
                lineTo(13.4412f, 15.6066f)
                curveTo(13.6352f, 15.4655f, 13.75f, 15.24f, 13.75f, 15.0001f)
                curveTo(13.75f, 14.7601f, 13.6352f, 14.5346f, 13.4412f, 14.3935f)
                lineTo(9.3162f, 11.3935f)
                curveTo(8.9812f, 11.1499f, 8.5121f, 11.2239f, 8.2685f, 11.5589f)
                curveTo(8.0249f, 11.8939f, 8.0989f, 12.363f, 8.4339f, 12.6066f)
                lineTo(10.6937f, 14.2501f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 14.0f)
                lineTo(2.0f, 6.9497f)
                curveTo(2.0f, 6.0672f, 2.0f, 5.6259f, 2.0694f, 5.2584f)
                curveTo(2.3747f, 3.6403f, 3.6403f, 2.3746f, 5.2584f, 2.0694f)
                curveTo(5.626f, 2.0f, 6.0672f, 2.0f, 6.9498f, 2.0f)
                curveTo(7.3364f, 2.0f, 7.5298f, 2.0f, 7.7156f, 2.0174f)
                curveTo(8.5167f, 2.0923f, 9.2765f, 2.407f, 9.896f, 2.9205f)
                curveTo(10.0396f, 3.0396f, 10.1763f, 3.1763f, 10.4498f, 3.4497f)
                lineTo(11.0f, 4.0f)
                curveTo(11.8158f, 4.8158f, 12.2237f, 5.2237f, 12.7121f, 5.4954f)
                curveTo(12.9805f, 5.6447f, 13.2651f, 5.7626f, 13.5604f, 5.8468f)
                curveTo(14.0979f, 6.0f, 14.6748f, 6.0f, 15.8284f, 6.0f)
                horizontalLineTo(16.2021f)
                curveTo(18.8345f, 6.0f, 20.1507f, 6.0f, 21.0062f, 6.7695f)
                curveTo(21.0849f, 6.8402f, 21.1598f, 6.9151f, 21.2306f, 6.9938f)
                curveTo(22.0f, 7.8493f, 22.0f, 9.1655f, 22.0f, 11.7979f)
                close()
            }
        }
            .build()
        return _moveToFolder!!
    }

private var _moveToFolder: ImageVector? = null
