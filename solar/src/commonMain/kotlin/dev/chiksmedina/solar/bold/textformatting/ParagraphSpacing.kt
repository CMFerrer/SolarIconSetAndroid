package dev.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TextFormattingGroup

val TextFormattingGroup.ParagraphSpacing: ImageVector
    get() {
        if (_paragraphSpacing != null) {
            return _paragraphSpacing!!
        }
        _paragraphSpacing = Builder(
            name = "ParagraphSpacing", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.25f, 3.0f)
                curveTo(3.25f, 2.5858f, 3.5858f, 2.25f, 4.0f, 2.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 2.25f, 20.75f, 2.5858f, 20.75f, 3.0f)
                curveTo(20.75f, 3.4142f, 20.4142f, 3.75f, 20.0f, 3.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 3.75f, 3.25f, 3.4142f, 3.25f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.25f, 21.0f)
                curveTo(3.25f, 20.5858f, 3.5858f, 20.25f, 4.0f, 20.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 20.25f, 20.75f, 20.5858f, 20.75f, 21.0f)
                curveTo(20.75f, 21.4142f, 20.4142f, 21.75f, 20.0f, 21.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 21.75f, 3.25f, 21.4142f, 3.25f, 21.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5303f, 4.9697f)
                curveTo(12.2374f, 4.6768f, 11.7626f, 4.6768f, 11.4697f, 4.9697f)
                lineTo(8.4697f, 7.9697f)
                curveTo(8.1768f, 8.2626f, 8.1768f, 8.7374f, 8.4697f, 9.0303f)
                curveTo(8.7626f, 9.3232f, 9.2374f, 9.3232f, 9.5303f, 9.0303f)
                lineTo(11.25f, 7.3107f)
                verticalLineTo(16.6893f)
                lineTo(9.5303f, 14.9697f)
                curveTo(9.2374f, 14.6768f, 8.7626f, 14.6768f, 8.4697f, 14.9697f)
                curveTo(8.1768f, 15.2626f, 8.1768f, 15.7374f, 8.4697f, 16.0303f)
                lineTo(11.4697f, 19.0303f)
                curveTo(11.7626f, 19.3232f, 12.2374f, 19.3232f, 12.5303f, 19.0303f)
                lineTo(15.5303f, 16.0303f)
                curveTo(15.8232f, 15.7374f, 15.8232f, 15.2626f, 15.5303f, 14.9697f)
                curveTo(15.2374f, 14.6768f, 14.7626f, 14.6768f, 14.4697f, 14.9697f)
                lineTo(12.75f, 16.6893f)
                verticalLineTo(7.3107f)
                lineTo(14.4697f, 9.0303f)
                curveTo(14.7626f, 9.3232f, 15.2374f, 9.3232f, 15.5303f, 9.0303f)
                curveTo(15.8232f, 8.7374f, 15.8232f, 8.2626f, 15.5303f, 7.9697f)
                lineTo(12.5303f, 4.9697f)
                close()
            }
        }
            .build()
        return _paragraphSpacing!!
    }

private var _paragraphSpacing: ImageVector? = null
