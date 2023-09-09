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

public val UsersGroup.UserHandUp: ImageVector
    get() {
        if (_userHandUp != null) {
            return _userHandUp!!
        }
        _userHandUp = Builder(name = "UserHandUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(14.2091f, 10.0f, 16.0f, 8.2091f, 16.0f, 6.0f)
                curveTo(16.0f, 3.7909f, 14.2091f, 2.0f, 12.0f, 2.0f)
                curveTo(9.7909f, 2.0f, 8.0f, 3.7909f, 8.0f, 6.0f)
                curveTo(8.0f, 8.2091f, 9.7909f, 10.0f, 12.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7278f, 5.818f)
                curveTo(2.6273f, 5.4162f, 2.2201f, 5.1719f, 1.8183f, 5.2723f)
                curveTo(1.4164f, 5.3728f, 1.1721f, 5.78f, 1.2726f, 6.1818f)
                lineTo(1.6545f, 7.7097f)
                curveTo(2.3593f, 10.5287f, 4.496f, 12.7495f, 7.2502f, 13.5787f)
                lineTo(7.2502f, 18.0519f)
                curveTo(7.2502f, 18.9504f, 7.2501f, 19.6996f, 7.3301f, 20.2944f)
                curveTo(7.4145f, 20.9222f, 7.6002f, 21.489f, 8.0556f, 21.9445f)
                curveTo(8.5111f, 22.3999f, 9.0779f, 22.5856f, 9.7057f, 22.67f)
                curveTo(10.3005f, 22.75f, 11.0497f, 22.75f, 11.9482f, 22.7499f)
                horizontalLineTo(12.0522f)
                curveTo(12.9507f, 22.75f, 13.6999f, 22.75f, 14.2947f, 22.67f)
                curveTo(14.9225f, 22.5856f, 15.4892f, 22.3999f, 15.9447f, 21.9445f)
                curveTo(16.4002f, 21.489f, 16.5859f, 20.9222f, 16.6703f, 20.2944f)
                curveTo(16.7502f, 19.6996f, 16.7502f, 18.9504f, 16.7502f, 18.052f)
                lineTo(16.7502f, 13.859f)
                curveTo(17.7313f, 14.1514f, 18.4808f, 15.0039f, 18.6058f, 16.067f)
                lineTo(19.2553f, 21.5876f)
                curveTo(19.3037f, 21.9989f, 19.6764f, 22.2932f, 20.0878f, 22.2448f)
                curveTo(20.4992f, 22.1964f, 20.7934f, 21.8237f, 20.745f, 21.4123f)
                lineTo(20.0956f, 15.8918f)
                curveTo(19.8512f, 13.815f, 18.0912f, 12.2499f, 16.0002f, 12.2499f)
                horizontalLineTo(8.0847f)
                curveTo(5.6413f, 11.6764f, 3.7196f, 9.7852f, 3.1098f, 7.3459f)
                lineTo(2.7278f, 5.818f)
                close()
            }
        }
        .build()
        return _userHandUp!!
    }

private var _userHandUp: ImageVector? = null
