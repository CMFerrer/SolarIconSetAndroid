package com.chiksmedina.solar.broken.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ArrowsActionGroup

val ArrowsActionGroup.Login3: ImageVector
    get() {
        if (_login3 != null) {
            return _login3!!
        }
        _login3 = Builder(
            name = "Login3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 16.0f)
                curveTo(8.0f, 18.8284f, 8.0f, 20.2426f, 8.8787f, 21.1213f)
                curveTo(9.52f, 21.7626f, 10.4466f, 21.9359f, 12.0f, 21.9827f)
                moveTo(8.0f, 8.0f)
                curveTo(8.0f, 5.1716f, 8.0f, 3.7574f, 8.8787f, 2.8787f)
                curveTo(9.7574f, 2.0f, 11.1716f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 2.0f, 19.2426f, 2.0f, 20.1213f, 2.8787f)
                curveTo(21.0f, 3.7574f, 21.0f, 5.1716f, 21.0f, 8.0f)
                verticalLineTo(10.0f)
                verticalLineTo(14.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 18.8284f, 21.0f, 20.2426f, 20.1213f, 21.1213f)
                curveTo(19.3529f, 21.8897f, 18.175f, 21.9862f, 16.0f, 21.9983f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 16.857f, 3.0f, 18.0355f, 3.7322f, 18.7678f)
                curveTo(4.4645f, 19.5f, 5.643f, 19.5f, 8.0f, 19.5f)
                moveTo(3.7322f, 5.2322f)
                curveTo(4.4645f, 4.5f, 5.643f, 4.5f, 8.0f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                moveTo(15.0f, 12.0f)
                lineTo(12.5f, 14.5f)
                moveTo(15.0f, 12.0f)
                lineTo(12.5f, 9.5f)
            }
        }
            .build()
        return _login3!!
    }

private var _login3: ImageVector? = null
