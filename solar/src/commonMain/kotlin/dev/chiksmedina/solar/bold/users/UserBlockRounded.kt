package dev.chiksmedina.solar.bold.users

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
import dev.chiksmedina.solar.bold.UsersGroup

val UsersGroup.UserBlockRounded: ImageVector
    get() {
        if (_userBlockRounded != null) {
            return _userBlockRounded!!
        }
        _userBlockRounded = Builder(
            name = "UserBlockRounded", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.0f, 15.75f)
                curveTo(16.7574f, 15.75f, 15.75f, 16.7574f, 15.75f, 18.0f)
                curveTo(15.75f, 18.3473f, 15.8287f, 18.6763f, 15.9693f, 18.97f)
                lineTo(18.9701f, 15.9693f)
                curveTo(18.6763f, 15.8287f, 18.3474f, 15.75f, 18.0f, 15.75f)
                close()
                moveTo(20.0307f, 17.0299f)
                lineTo(17.0299f, 20.0307f)
                curveTo(17.3236f, 20.1713f, 17.6526f, 20.25f, 18.0f, 20.25f)
                curveTo(19.2426f, 20.25f, 20.25f, 19.2426f, 20.25f, 18.0f)
                curveTo(20.25f, 17.6526f, 20.1713f, 17.3237f, 20.0307f, 17.0299f)
                close()
                moveTo(14.25f, 18.0f)
                curveTo(14.25f, 15.9289f, 15.9289f, 14.25f, 18.0f, 14.25f)
                curveTo(20.0711f, 14.25f, 21.75f, 15.9289f, 21.75f, 18.0f)
                curveTo(21.75f, 20.0711f, 20.0711f, 21.75f, 18.0f, 21.75f)
                curveTo(15.9289f, 21.75f, 14.25f, 20.0711f, 14.25f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.3267f, 13.4807f)
                curveTo(13.7841f, 14.3951f, 12.75f, 16.0768f, 12.75f, 18.0f)
                curveTo(12.75f, 19.0693f, 13.0697f, 20.0639f, 13.6187f, 20.8935f)
                curveTo(13.0991f, 20.9638f, 12.5572f, 21.001f, 12.0f, 21.001f)
                curveTo(8.134f, 21.001f, 5.0f, 19.2101f, 5.0f, 17.001f)
                curveTo(5.0f, 14.7918f, 8.134f, 13.001f, 12.0f, 13.001f)
                curveTo(13.2041f, 13.001f, 14.3372f, 13.1747f, 15.3267f, 13.4807f)
                close()
            }
        }
            .build()
        return _userBlockRounded!!
    }

private var _userBlockRounded: ImageVector? = null
