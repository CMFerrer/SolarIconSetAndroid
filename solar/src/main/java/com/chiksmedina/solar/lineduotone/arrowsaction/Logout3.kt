package com.chiksmedina.solar.lineduotone.arrowsaction

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
import com.chiksmedina.solar.lineduotone.ArrowsActionGroup

val ArrowsActionGroup.Logout3: ImageVector
    get() {
        if (_logout3 != null) {
            return _logout3!!
        }
        _logout3 = Builder(
            name = "Logout3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0017f, 7.0f)
                curveTo(8.0138f, 4.825f, 8.1103f, 3.6471f, 8.8786f, 2.8787f)
                curveTo(9.7573f, 2.0f, 11.1715f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 2.0f, 19.2426f, 2.0f, 20.1213f, 2.8787f)
                curveTo(21.0f, 3.7574f, 21.0f, 5.1716f, 21.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 18.8284f, 21.0f, 20.2426f, 20.1213f, 21.1213f)
                curveTo(19.2426f, 22.0f, 17.8284f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(11.1715f, 22.0f, 9.7573f, 22.0f, 8.8786f, 21.1213f)
                curveTo(8.1103f, 20.3529f, 8.0138f, 19.175f, 8.0017f, 17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
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
                moveTo(15.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                moveTo(6.0f, 12.0f)
                lineTo(8.0f, 14.0f)
                moveTo(6.0f, 12.0f)
                lineTo(8.0f, 10.0f)
            }
        }
            .build()
        return _logout3!!
    }

private var _logout3: ImageVector? = null
