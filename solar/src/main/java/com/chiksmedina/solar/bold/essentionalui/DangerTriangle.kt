package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.DangerTriangle: ImageVector
    get() {
        if (_dangerTriangle != null) {
            return _dangerTriangle!!
        }
        _dangerTriangle = Builder(
            name = "DangerTriangle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.3117f, 10.7615f)
                curveTo(8.2301f, 5.5872f, 9.6892f, 3.0f, 12.0f, 3.0f)
                curveTo(14.3107f, 3.0f, 15.7699f, 5.5872f, 18.6883f, 10.7615f)
                lineTo(19.0519f, 11.4063f)
                curveTo(21.4771f, 15.7061f, 22.6897f, 17.856f, 21.5937f, 19.428f)
                curveTo(20.4978f, 21.0f, 17.7864f, 21.0f, 12.3637f, 21.0f)
                horizontalLineTo(11.6363f)
                curveTo(6.2136f, 21.0f, 3.5022f, 21.0f, 2.4063f, 19.428f)
                curveTo(1.3103f, 17.856f, 2.5229f, 15.7061f, 4.9481f, 11.4063f)
                lineTo(5.3117f, 10.7615f)
                close()
                moveTo(12.0f, 7.25f)
                curveTo(12.4142f, 7.25f, 12.75f, 7.5858f, 12.75f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.4142f, 12.4142f, 13.75f, 12.0f, 13.75f)
                curveTo(11.5858f, 13.75f, 11.25f, 13.4142f, 11.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.5858f, 11.5858f, 7.25f, 12.0f, 7.25f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                curveTo(13.0f, 15.4477f, 12.5523f, 15.0f, 12.0f, 15.0f)
                curveTo(11.4477f, 15.0f, 11.0f, 15.4477f, 11.0f, 16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
            .build()
        return _dangerTriangle!!
    }

private var _dangerTriangle: ImageVector? = null
