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

val TextFormattingGroup.LinkCircle: ImageVector
    get() {
        if (_linkCircle != null) {
            return _linkCircle!!
        }
        _linkCircle = Builder(
            name = "LinkCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 9.1005f, 5.1005f, 6.75f, 8.0f, 6.75f)
                curveTo(8.4142f, 6.75f, 8.75f, 6.4142f, 8.75f, 6.0f)
                curveTo(8.75f, 5.5858f, 8.4142f, 5.25f, 8.0f, 5.25f)
                curveTo(4.2721f, 5.25f, 1.25f, 8.2721f, 1.25f, 12.0f)
                curveTo(1.25f, 15.7279f, 4.2721f, 18.75f, 8.0f, 18.75f)
                curveTo(11.7279f, 18.75f, 14.75f, 15.7279f, 14.75f, 12.0f)
                curveTo(14.75f, 11.5858f, 14.4142f, 11.25f, 14.0f, 11.25f)
                curveTo(13.5858f, 11.25f, 13.25f, 11.5858f, 13.25f, 12.0f)
                curveTo(13.25f, 14.8995f, 10.8995f, 17.25f, 8.0f, 17.25f)
                curveTo(5.1005f, 17.25f, 2.75f, 14.8995f, 2.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.25f, 12.0f)
                curveTo(21.25f, 14.8995f, 18.8995f, 17.25f, 16.0f, 17.25f)
                curveTo(15.5858f, 17.25f, 15.25f, 17.5858f, 15.25f, 18.0f)
                curveTo(15.25f, 18.4142f, 15.5858f, 18.75f, 16.0f, 18.75f)
                curveTo(19.7279f, 18.75f, 22.75f, 15.7279f, 22.75f, 12.0f)
                curveTo(22.75f, 8.2721f, 19.7279f, 5.25f, 16.0f, 5.25f)
                curveTo(12.2721f, 5.25f, 9.25f, 8.2721f, 9.25f, 12.0f)
                curveTo(9.25f, 12.4142f, 9.5858f, 12.75f, 10.0f, 12.75f)
                curveTo(10.4142f, 12.75f, 10.75f, 12.4142f, 10.75f, 12.0f)
                curveTo(10.75f, 9.1005f, 13.1005f, 6.75f, 16.0f, 6.75f)
                curveTo(18.8995f, 6.75f, 21.25f, 9.1005f, 21.25f, 12.0f)
                close()
            }
        }
            .build()
        return _linkCircle!!
    }

private var _linkCircle: ImageVector? = null
