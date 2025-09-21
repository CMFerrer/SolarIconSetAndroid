package dev.chiksmedina.solar.lineduotone.users

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
import dev.chiksmedina.solar.lineduotone.UsersGroup

val UsersGroup.UserHandUp: ImageVector
    get() {
        if (_userHandUp != null) {
            return _userHandUp!!
        }
        _userHandUp = Builder(
            name = "UserHandUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 21.5f)
                lineTo(19.3505f, 15.9795f)
                curveTo(19.1506f, 14.2804f, 17.7107f, 13.0f, 16.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(5.0f, 13.0f, 3.0672f, 10.2687f, 2.382f, 7.5279f)
                lineTo(2.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.0f)
                verticalLineTo(18.0f)
                curveTo(8.0f, 19.8856f, 8.0f, 20.8284f, 8.5858f, 21.4142f)
                curveTo(9.1716f, 22.0f, 10.1144f, 22.0f, 12.0f, 22.0f)
                curveTo(13.8856f, 22.0f, 14.8284f, 22.0f, 15.4142f, 21.4142f)
                curveTo(16.0f, 20.8284f, 16.0f, 19.8856f, 16.0f, 18.0f)
                verticalLineTo(13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.9f, strokeAlpha = 0.9f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
        }
            .build()
        return _userHandUp!!
    }

private var _userHandUp: ImageVector? = null
