package dev.chiksmedina.solar.lineduotone.security

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
import dev.chiksmedina.solar.lineduotone.SecurityGroup

val SecurityGroup.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(
            name = "Bomb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 14.5f)
                moveToRelative(-7.5f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 15.0f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, -15.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 7.0f)
                lineTo(15.0f, 9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.9811f, 2.3532f)
                curveTo(18.1668f, 1.8823f, 18.8332f, 1.8823f, 19.0189f, 2.3532f)
                lineTo(19.6733f, 4.0124f)
                curveTo(19.73f, 4.1562f, 19.8438f, 4.27f, 19.9876f, 4.3267f)
                lineTo(21.6468f, 4.9811f)
                curveTo(22.1177f, 5.1668f, 22.1177f, 5.8332f, 21.6468f, 6.0189f)
                lineTo(19.9876f, 6.6733f)
                curveTo(19.8438f, 6.73f, 19.73f, 6.8438f, 19.6733f, 6.9876f)
                lineTo(19.0189f, 8.6468f)
                curveTo(18.8332f, 9.1177f, 18.1668f, 9.1177f, 17.9811f, 8.6468f)
                lineTo(17.3267f, 6.9876f)
                curveTo(17.27f, 6.8438f, 17.1562f, 6.73f, 17.0124f, 6.6733f)
                lineTo(15.3532f, 6.0189f)
                curveTo(14.8823f, 5.8332f, 14.8823f, 5.1668f, 15.3532f, 4.9811f)
                lineTo(17.0124f, 4.3267f)
                curveTo(17.1562f, 4.27f, 17.27f, 4.1562f, 17.3267f, 4.0124f)
                lineTo(17.9811f, 2.3532f)
                close()
            }
        }
            .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
