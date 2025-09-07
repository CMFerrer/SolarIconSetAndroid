package com.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(
            name = "Command", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 8.0f)
                lineTo(19.0f, 8.0005f)
                curveTo(20.6569f, 8.0007f, 22.0002f, 6.6578f, 22.0005f, 5.001f)
                curveTo(22.0007f, 3.3441f, 20.6578f, 2.0008f, 19.0009f, 2.0005f)
                curveTo(17.3441f, 2.0002f, 16.0007f, 3.3432f, 16.0005f, 5.0f)
                lineTo(16.0f, 8.0f)
                lineTo(8.0005f, 8.0f)
                lineTo(8.0f, 5.0f)
                curveTo(7.9997f, 3.3432f, 6.6564f, 2.0002f, 4.9995f, 2.0005f)
                curveTo(3.3427f, 2.0008f, 1.9997f, 3.3441f, 2.0f, 5.001f)
                curveTo(2.0003f, 6.6578f, 3.3436f, 8.0007f, 5.0005f, 8.0005f)
                lineTo(8.0005f, 8.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 16.0f)
                lineTo(19.0f, 16.0005f)
                curveTo(20.6569f, 16.0002f, 22.0002f, 17.3432f, 22.0005f, 19.0f)
                curveTo(22.0007f, 20.6569f, 20.6578f, 22.0002f, 19.0009f, 22.0005f)
                curveTo(17.3441f, 22.0007f, 16.0007f, 20.6578f, 16.0005f, 19.001f)
                lineTo(16.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0005f, 16.0005f)
                lineTo(8.0005f, 16.001f)
                lineTo(8.0f, 19.001f)
                curveTo(7.9997f, 20.6578f, 6.6564f, 22.0007f, 4.9995f, 22.0005f)
                curveTo(3.3427f, 22.0002f, 1.9997f, 20.6569f, 2.0f, 19.0f)
                curveTo(2.0003f, 17.3432f, 3.3436f, 16.0002f, 5.0005f, 16.0005f)
                close()
            }
        }
            .build()
        return _command!!
    }

private var _command: ImageVector? = null
