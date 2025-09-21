package dev.chiksmedina.solar.bold.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.UsersGroup

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
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.0f)
                curveTo(14.2091f, 10.0f, 16.0f, 8.2091f, 16.0f, 6.0f)
                curveTo(16.0f, 3.7909f, 14.2091f, 2.0f, 12.0f, 2.0f)
                curveTo(9.7909f, 2.0f, 8.0f, 3.7909f, 8.0f, 6.0f)
                curveTo(8.0f, 8.2091f, 9.7909f, 10.0f, 12.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0001f, 12.25f)
                curveTo(5.909f, 12.25f, 4.149f, 13.8151f, 3.9047f, 15.8918f)
                lineTo(3.2552f, 21.4124f)
                curveTo(3.2068f, 21.8237f, 3.5011f, 22.1965f, 3.9124f, 22.2449f)
                curveTo(4.3238f, 22.2933f, 4.6965f, 21.999f, 4.7449f, 21.5876f)
                lineTo(5.3944f, 16.0671f)
                curveTo(5.5195f, 15.0039f, 6.2689f, 14.1515f, 7.2501f, 13.859f)
                lineTo(7.2501f, 18.052f)
                curveTo(7.25f, 18.9505f, 7.25f, 19.6997f, 7.33f, 20.2945f)
                curveTo(7.4144f, 20.9223f, 7.6001f, 21.4891f, 8.0555f, 21.9445f)
                curveTo(8.511f, 22.4f, 9.0778f, 22.5857f, 9.7056f, 22.6701f)
                curveTo(10.3004f, 22.7501f, 11.0496f, 22.75f, 11.948f, 22.75f)
                horizontalLineTo(12.0521f)
                curveTo(12.9505f, 22.75f, 13.6998f, 22.7501f, 14.2946f, 22.6701f)
                curveTo(14.9223f, 22.5857f, 15.4891f, 22.4f, 15.9446f, 21.9445f)
                curveTo(16.4001f, 21.4891f, 16.5858f, 20.9223f, 16.6702f, 20.2945f)
                curveTo(16.7501f, 19.6997f, 16.7501f, 18.9505f, 16.7501f, 18.052f)
                lineTo(16.7501f, 13.859f)
                curveTo(17.7312f, 14.1515f, 18.4807f, 15.0039f, 18.6057f, 16.0671f)
                lineTo(19.2552f, 21.5876f)
                curveTo(19.3036f, 21.999f, 19.6763f, 22.2933f, 20.0877f, 22.2449f)
                curveTo(20.4991f, 22.1965f, 20.7933f, 21.8237f, 20.7449f, 21.4124f)
                lineTo(20.0955f, 15.8918f)
                curveTo(19.8511f, 13.8151f, 18.0911f, 12.25f, 16.0001f, 12.25f)
                horizontalLineTo(8.0001f)
                close()
            }
        }
            .build()
        return _userHands!!
    }

private var _userHands: ImageVector? = null
