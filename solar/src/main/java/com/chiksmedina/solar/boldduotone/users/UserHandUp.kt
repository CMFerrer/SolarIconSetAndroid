package com.chiksmedina.solar.boldduotone.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.UsersGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.818f, 5.2726f)
                curveTo(2.2199f, 5.1721f, 2.6271f, 5.4164f, 2.7275f, 5.8183f)
                lineTo(3.1095f, 7.3461f)
                curveTo(3.7193f, 9.7854f, 5.641f, 11.6766f, 8.0845f, 12.2502f)
                horizontalLineTo(15.9999f)
                curveTo(18.091f, 12.2502f, 19.851f, 13.8153f, 20.0953f, 15.892f)
                lineTo(20.7448f, 21.4125f)
                curveTo(20.7932f, 21.8239f, 20.4989f, 22.1966f, 20.0876f, 22.245f)
                curveTo(19.6762f, 22.2934f, 19.3035f, 21.9992f, 19.2551f, 21.5878f)
                lineTo(18.6056f, 16.0673f)
                curveTo(18.4501f, 14.746f, 17.3303f, 13.7502f, 15.9999f, 13.7502f)
                horizontalLineTo(7.9176f)
                lineTo(7.8372f, 13.7323f)
                curveTo(4.802f, 13.0578f, 2.4084f, 10.7264f, 1.6543f, 7.7099f)
                lineTo(1.2723f, 6.1821f)
                curveTo(1.1719f, 5.7802f, 1.4162f, 5.373f, 1.818f, 5.2726f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.75f)
                verticalLineTo(18.0f)
                curveTo(8.0f, 19.8856f, 8.0f, 20.8284f, 8.5858f, 21.4142f)
                curveTo(9.1716f, 22.0f, 10.1144f, 22.0f, 12.0f, 22.0f)
                curveTo(13.8856f, 22.0f, 14.8284f, 22.0f, 15.4142f, 21.4142f)
                curveTo(16.0f, 20.8284f, 16.0f, 19.8856f, 16.0f, 18.0f)
                verticalLineTo(13.75f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
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
