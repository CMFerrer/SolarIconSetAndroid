package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.Exit: ImageVector
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = Builder(name = "Exit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.7072f, 2.4087f)
                curveTo(9.0f, 3.0357f, 9.0f, 4.1826f, 9.0f, 6.4764f)
                verticalLineTo(17.5236f)
                curveTo(9.0f, 19.8174f, 9.0f, 20.9643f, 9.7072f, 21.5913f)
                curveTo(10.4145f, 22.2183f, 11.4955f, 22.0297f, 13.6576f, 21.6526f)
                lineTo(15.9864f, 21.2465f)
                curveTo(18.3809f, 20.8288f, 19.5781f, 20.62f, 20.2891f, 19.7417f)
                curveTo(21.0f, 18.8635f, 21.0f, 17.5933f, 21.0f, 15.0529f)
                verticalLineTo(8.9471f)
                curveTo(21.0f, 6.4067f, 21.0f, 5.1365f, 20.2891f, 4.2583f)
                curveTo(19.5781f, 3.38f, 18.3809f, 3.1712f, 15.9864f, 2.7535f)
                lineTo(13.6576f, 2.3474f)
                curveTo(11.4955f, 1.9703f, 10.4145f, 1.7817f, 9.7072f, 2.4087f)
                close()
                moveTo(12.0f, 10.1686f)
                curveTo(12.4142f, 10.1686f, 12.75f, 10.52f, 12.75f, 10.9535f)
                verticalLineTo(13.0465f)
                curveTo(12.75f, 13.48f, 12.4142f, 13.8314f, 12.0f, 13.8314f)
                curveTo(11.5858f, 13.8314f, 11.25f, 13.48f, 11.25f, 13.0465f)
                verticalLineTo(10.9535f)
                curveTo(11.25f, 10.52f, 11.5858f, 10.1686f, 12.0f, 10.1686f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5472f, 4.5f)
                curveTo(5.4889f, 4.503f, 4.416f, 4.5483f, 3.7322f, 5.232f)
                curveTo(3.0f, 5.9643f, 3.0f, 7.1428f, 3.0f, 9.4998f)
                verticalLineTo(14.4998f)
                curveTo(3.0f, 16.8568f, 3.0f, 18.0353f, 3.7322f, 18.7676f)
                curveTo(4.416f, 19.4513f, 5.4889f, 19.4966f, 7.5472f, 19.4996f)
                curveTo(7.4998f, 18.8763f, 7.4999f, 18.1557f, 7.5f, 17.3768f)
                verticalLineTo(6.6227f)
                curveTo(7.4999f, 5.8439f, 7.4998f, 5.1233f, 7.5472f, 4.5f)
                close()
            }
        }
        .build()
        return _exit!!
    }

private var _exit: ImageVector? = null
