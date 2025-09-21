package dev.chiksmedina.solar.boldduotone.users

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
import dev.chiksmedina.solar.boldduotone.UsersGroup

val UsersGroup.UserHands: ImageVector
    get() {
        if (_userHands != null) {
            return _userHands!!
        }
        _userHands = Builder(
            name = "UserHands", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.9047f, 15.8918f)
                curveTo(4.149f, 13.8151f, 5.909f, 12.25f, 8.0001f, 12.25f)
                horizontalLineTo(16.0001f)
                curveTo(18.0911f, 12.25f, 19.8511f, 13.8151f, 20.0955f, 15.8918f)
                lineTo(20.7449f, 21.4124f)
                curveTo(20.7933f, 21.8237f, 20.4991f, 22.1965f, 20.0877f, 22.2449f)
                curveTo(19.6763f, 22.2933f, 19.3036f, 21.999f, 19.2552f, 21.5876f)
                lineTo(18.6057f, 16.0671f)
                curveTo(18.4503f, 14.7458f, 17.3305f, 13.75f, 16.0001f, 13.75f)
                horizontalLineTo(8.0001f)
                curveTo(6.6697f, 13.75f, 5.5499f, 14.7458f, 5.3944f, 16.0671f)
                lineTo(4.7449f, 21.5876f)
                curveTo(4.6965f, 21.999f, 4.3238f, 22.2933f, 3.9124f, 22.2449f)
                curveTo(3.5011f, 22.1965f, 3.2068f, 21.8237f, 3.2552f, 21.4124f)
                lineTo(3.9047f, 15.8918f)
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
        }
            .build()
        return _userHands!!
    }

private var _userHands: ImageVector? = null
