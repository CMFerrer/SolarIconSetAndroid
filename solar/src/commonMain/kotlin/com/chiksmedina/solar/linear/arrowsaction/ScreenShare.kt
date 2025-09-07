package com.chiksmedina.solar.linear.arrowsaction

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.linear.ArrowsActionGroup

val ArrowsActionGroup.ScreenShare: ImageVector
    get() {
        if (_screenShare != null) {
            return _screenShare!!
        }
        _screenShare = Builder(
            name = "ScreenShare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 8.0f)
                curveTo(8.0f, 5.1716f, 8.0f, 3.7574f, 8.8787f, 2.8787f)
                curveTo(9.7574f, 2.0f, 11.1716f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 2.0f, 19.2426f, 2.0f, 20.1213f, 2.8787f)
                curveTo(21.0f, 3.7574f, 21.0f, 5.1716f, 21.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 18.8284f, 21.0f, 20.2426f, 20.1213f, 21.1213f)
                curveTo(19.2426f, 22.0f, 17.8284f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(11.1716f, 22.0f, 9.7574f, 22.0f, 8.8787f, 21.1213f)
                curveTo(8.0f, 20.2426f, 8.0f, 18.8284f, 8.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 19.5f)
                curveTo(5.643f, 19.5f, 4.4645f, 19.5f, 3.7322f, 18.7678f)
                curveTo(3.0f, 18.0355f, 3.0f, 16.857f, 3.0f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 7.143f, 3.0f, 5.9645f, 3.7322f, 5.2322f)
                curveTo(4.4645f, 4.5f, 5.643f, 4.5f, 8.0f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 16.0f)
                verticalLineTo(8.0f)
                moveTo(14.5f, 8.0f)
                lineTo(17.0f, 10.5f)
                moveTo(14.5f, 8.0f)
                lineTo(12.0f, 10.5f)
            }
        }
            .build()
        return _screenShare!!
    }

private var _screenShare: ImageVector? = null
