package dev.chiksmedina.solar.lineduotone.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.UsersGroup

val UsersGroup.UserBlock: ImageVector
    get() {
        if (_userBlock != null) {
            return _userBlock!!
        }
        _userBlock = Builder(
            name = "UserBlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 13.3271f)
                curveTo(14.0736f, 13.1162f, 13.0609f, 13.0f, 12.0f, 13.0f)
                curveTo(7.5817f, 13.0f, 4.0f, 15.0147f, 4.0f, 17.5f)
                curveTo(4.0f, 19.9853f, 4.0f, 22.0f, 12.0f, 22.0f)
                curveTo(17.6874f, 22.0f, 19.3315f, 20.9817f, 19.8068f, 19.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.1715f, 18.8284f)
                curveTo(15.8954f, 19.5523f, 16.8954f, 20.0f, 18.0f, 20.0f)
                curveTo(20.2091f, 20.0f, 22.0f, 18.2091f, 22.0f, 16.0f)
                curveTo(22.0f, 14.8954f, 21.5523f, 13.8954f, 20.8284f, 13.1715f)
                moveTo(15.1715f, 18.8284f)
                curveTo(14.4477f, 18.1045f, 14.0f, 17.1046f, 14.0f, 16.0f)
                curveTo(14.0f, 13.7909f, 15.7909f, 12.0f, 18.0f, 12.0f)
                curveTo(19.1046f, 12.0f, 20.1045f, 12.4477f, 20.8284f, 13.1715f)
                moveTo(15.1715f, 18.8284f)
                lineTo(20.8284f, 13.1715f)
            }
        }
            .build()
        return _userBlock!!
    }

private var _userBlock: ImageVector? = null
