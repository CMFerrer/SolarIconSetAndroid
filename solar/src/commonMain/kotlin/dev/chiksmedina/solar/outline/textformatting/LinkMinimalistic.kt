package dev.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.LinkMinimalistic: ImageVector
    get() {
        if (_linkMinimalistic != null) {
            return _linkMinimalistic!!
        }
        _linkMinimalistic = Builder(
            name = "LinkMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 6.75f)
                curveTo(5.1005f, 6.75f, 2.75f, 9.1005f, 2.75f, 12.0f)
                curveTo(2.75f, 14.8995f, 5.1005f, 17.25f, 8.0f, 17.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 17.25f, 9.75f, 17.5858f, 9.75f, 18.0f)
                curveTo(9.75f, 18.4142f, 9.4142f, 18.75f, 9.0f, 18.75f)
                horizontalLineTo(8.0f)
                curveTo(4.2721f, 18.75f, 1.25f, 15.7279f, 1.25f, 12.0f)
                curveTo(1.25f, 8.2721f, 4.2721f, 5.25f, 8.0f, 5.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 5.25f, 9.75f, 5.5858f, 9.75f, 6.0f)
                curveTo(9.75f, 6.4142f, 9.4142f, 6.75f, 9.0f, 6.75f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.2499f, 11.9999f)
                curveTo(8.2499f, 11.5857f, 8.5857f, 11.2499f, 8.9999f, 11.2499f)
                horizontalLineTo(14.9999f)
                curveTo(15.4141f, 11.2499f, 15.7499f, 11.5857f, 15.7499f, 11.9999f)
                curveTo(15.7499f, 12.4142f, 15.4141f, 12.7499f, 14.9999f, 12.7499f)
                horizontalLineTo(8.9999f)
                curveTo(8.5857f, 12.7499f, 8.2499f, 12.4142f, 8.2499f, 11.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 5.25f)
                curveTo(14.5858f, 5.25f, 14.25f, 5.5858f, 14.25f, 6.0f)
                curveTo(14.25f, 6.4142f, 14.5858f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(16.0f)
                curveTo(18.8995f, 6.75f, 21.25f, 9.1005f, 21.25f, 12.0f)
                curveTo(21.25f, 14.8995f, 18.8995f, 17.25f, 16.0f, 17.25f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 17.25f, 14.25f, 17.5858f, 14.25f, 18.0f)
                curveTo(14.25f, 18.4142f, 14.5858f, 18.75f, 15.0f, 18.75f)
                horizontalLineTo(16.0f)
                curveTo(19.7279f, 18.75f, 22.75f, 15.7279f, 22.75f, 12.0f)
                curveTo(22.75f, 8.2721f, 19.7279f, 5.25f, 16.0f, 5.25f)
                horizontalLineTo(15.0f)
                close()
            }
        }
            .build()
        return _linkMinimalistic!!
    }

private var _linkMinimalistic: ImageVector? = null
