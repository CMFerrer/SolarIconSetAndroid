package dev.chiksmedina.solar.broken.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.NetworkItProgrammingGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 16.001f)
                lineTo(19.0f, 16.0005f)
                curveTo(20.6569f, 16.0002f, 22.0002f, 17.3432f, 22.0005f, 19.0f)
                curveTo(22.0007f, 20.6569f, 20.6578f, 22.0002f, 19.0009f, 22.0005f)
                curveTo(17.3441f, 22.0007f, 16.0007f, 20.6578f, 16.0005f, 19.001f)
                lineTo(16.0f, 16.001f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.001f, 16.001f)
                lineTo(5.001f, 16.0005f)
                curveTo(3.3441f, 16.0002f, 2.0008f, 17.3432f, 2.0005f, 19.0f)
                curveTo(2.0002f, 20.6569f, 3.3432f, 22.0002f, 5.0f, 22.0005f)
                curveTo(6.6569f, 22.0007f, 8.0002f, 20.6578f, 8.0005f, 19.001f)
                lineTo(8.001f, 16.001f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 8.0f)
                lineTo(19.0f, 8.0005f)
                curveTo(20.6569f, 8.0007f, 22.0002f, 6.6578f, 22.0005f, 5.001f)
                curveTo(22.0007f, 3.3441f, 20.6578f, 2.0008f, 19.0009f, 2.0005f)
                curveTo(17.3441f, 2.0002f, 16.0007f, 3.3432f, 16.0005f, 5.0f)
                lineTo(16.0f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.001f, 8.0f)
                lineTo(5.001f, 8.0005f)
                curveTo(3.3441f, 8.0007f, 2.0008f, 6.6578f, 2.0005f, 5.001f)
                curveTo(2.0002f, 3.3441f, 3.3432f, 2.0008f, 5.0f, 2.0005f)
                curveTo(6.6569f, 2.0002f, 8.0002f, 3.3432f, 8.0005f, 5.0f)
                lineTo(8.001f, 8.0f)
                close()
            }
        }
            .build()
        return _command!!
    }

private var _command: ImageVector? = null
