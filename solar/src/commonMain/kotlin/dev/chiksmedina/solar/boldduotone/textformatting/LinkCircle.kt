package dev.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5f, 8.75f)
                curveTo(7.7051f, 8.75f, 6.25f, 10.2051f, 6.25f, 12.0f)
                curveTo(6.25f, 13.7949f, 7.7051f, 15.25f, 9.5f, 15.25f)
                curveTo(11.2949f, 15.25f, 12.75f, 13.7949f, 12.75f, 12.0f)
                curveTo(12.75f, 11.5858f, 13.0858f, 11.25f, 13.5f, 11.25f)
                curveTo(13.9142f, 11.25f, 14.25f, 11.5858f, 14.25f, 12.0f)
                curveTo(14.25f, 14.6234f, 12.1234f, 16.75f, 9.5f, 16.75f)
                curveTo(6.8766f, 16.75f, 4.75f, 14.6234f, 4.75f, 12.0f)
                curveTo(4.75f, 9.3766f, 6.8766f, 7.25f, 9.5f, 7.25f)
                curveTo(9.9142f, 7.25f, 10.25f, 7.5858f, 10.25f, 8.0f)
                curveTo(10.25f, 8.4142f, 9.9142f, 8.75f, 9.5f, 8.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.75f, 12.0f)
                curveTo(17.75f, 13.7949f, 16.2949f, 15.25f, 14.5f, 15.25f)
                curveTo(14.0858f, 15.25f, 13.75f, 15.5858f, 13.75f, 16.0f)
                curveTo(13.75f, 16.4142f, 14.0858f, 16.75f, 14.5f, 16.75f)
                curveTo(17.1234f, 16.75f, 19.25f, 14.6234f, 19.25f, 12.0f)
                curveTo(19.25f, 9.3766f, 17.1234f, 7.25f, 14.5f, 7.25f)
                curveTo(11.8766f, 7.25f, 9.75f, 9.3766f, 9.75f, 12.0f)
                curveTo(9.75f, 12.4142f, 10.0858f, 12.75f, 10.5f, 12.75f)
                curveTo(10.9142f, 12.75f, 11.25f, 12.4142f, 11.25f, 12.0f)
                curveTo(11.25f, 10.2051f, 12.7051f, 8.75f, 14.5f, 8.75f)
                curveTo(16.2949f, 8.75f, 17.75f, 10.2051f, 17.75f, 12.0f)
                close()
            }
        }
            .build()
        return _linkCircle!!
    }

private var _linkCircle: ImageVector? = null
