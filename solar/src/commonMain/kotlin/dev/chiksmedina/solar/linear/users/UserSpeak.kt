package dev.chiksmedina.solar.linear.users

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
import dev.chiksmedina.solar.linear.UsersGroup

val UsersGroup.UserSpeak: ImageVector
    get() {
        if (_userSpeak != null) {
            return _userSpeak!!
        }
        _userSpeak = Builder(
            name = "UserSpeak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 17.5f)
                curveTo(18.0f, 19.9853f, 18.0f, 22.0f, 10.0f, 22.0f)
                curveTo(2.0f, 22.0f, 2.0f, 19.9853f, 2.0f, 17.5f)
                curveTo(2.0f, 15.0147f, 5.5817f, 13.0f, 10.0f, 13.0f)
                curveTo(14.4183f, 13.0f, 18.0f, 15.0147f, 18.0f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 2.0f)
                curveTo(19.0f, 2.0f, 21.0f, 3.2f, 21.0f, 6.0f)
                curveTo(21.0f, 8.8f, 19.0f, 10.0f, 19.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 4.0f)
                curveTo(17.0f, 4.0f, 18.0f, 4.6f, 18.0f, 6.0f)
                curveTo(18.0f, 7.4f, 17.0f, 8.0f, 17.0f, 8.0f)
            }
        }
            .build()
        return _userSpeak!!
    }

private var _userSpeak: ImageVector? = null
