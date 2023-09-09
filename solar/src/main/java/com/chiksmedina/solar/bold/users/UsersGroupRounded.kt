package com.chiksmedina.solar.bold.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.UsersGroup

public val UsersGroup.UsersGroupRounded: ImageVector
    get() {
        if (_usersGroupRounded != null) {
            return _usersGroupRounded!!
        }
        _usersGroupRounded = Builder(name = "UsersGroupRounded", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.001f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.001f, 17.001f)
                arcToRelative(7.0f, 4.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcToRelative(7.0f, 4.0f, 0.0f, true, false, -14.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9996f, 17.0007f)
                curveTo(20.9996f, 18.6576f, 18.9641f, 20.0007f, 16.4788f, 20.0007f)
                curveTo(17.211f, 19.2003f, 17.7145f, 18.1958f, 17.7145f, 17.0021f)
                curveTo(17.7145f, 15.807f, 17.2098f, 14.8015f, 16.4762f, 14.0007f)
                curveTo(18.9615f, 14.0007f, 20.9996f, 15.3438f, 20.9996f, 17.0007f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9996f, 6.001f)
                curveTo(17.9996f, 7.6578f, 16.6565f, 9.001f, 14.9996f, 9.001f)
                curveTo(14.6383f, 9.001f, 14.292f, 8.9371f, 13.9712f, 8.8201f)
                curveTo(14.4443f, 7.988f, 14.7145f, 7.0255f, 14.7145f, 5.9999f)
                curveTo(14.7145f, 4.975f, 14.4447f, 4.0132f, 13.9722f, 3.1815f)
                curveTo(14.2927f, 3.0647f, 14.6387f, 3.001f, 14.9996f, 3.001f)
                curveTo(16.6565f, 3.001f, 17.9996f, 4.3441f, 17.9996f, 6.001f)
                close()
            }
        }
        .build()
        return _usersGroupRounded!!
    }

private var _usersGroupRounded: ImageVector? = null
