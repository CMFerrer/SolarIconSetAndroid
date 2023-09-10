package com.chiksmedina.solar.outline.users

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
import com.chiksmedina.solar.outline.UsersGroup

val UsersGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(
            name = "UserMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(9.3766f, 1.25f, 7.25f, 3.3767f, 7.25f, 6.0f)
                curveTo(7.25f, 8.6234f, 9.3766f, 10.75f, 12.0f, 10.75f)
                curveTo(14.6233f, 10.75f, 16.75f, 8.6234f, 16.75f, 6.0f)
                curveTo(16.75f, 3.3767f, 14.6233f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(8.75f, 6.0f)
                curveTo(8.75f, 4.2051f, 10.2051f, 2.75f, 12.0f, 2.75f)
                curveTo(13.7949f, 2.75f, 15.25f, 4.2051f, 15.25f, 6.0f)
                curveTo(15.25f, 7.7949f, 13.7949f, 9.25f, 12.0f, 9.25f)
                curveTo(10.2051f, 9.25f, 8.75f, 7.7949f, 8.75f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 15.25f)
                curveTo(16.5858f, 15.25f, 16.25f, 15.5858f, 16.25f, 16.0f)
                curveTo(16.25f, 16.4142f, 16.5858f, 16.75f, 17.0f, 16.75f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 16.75f, 19.75f, 16.4142f, 19.75f, 16.0f)
                curveTo(19.75f, 15.5858f, 19.4142f, 15.25f, 19.0f, 15.25f)
                horizontalLineTo(17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 12.25f)
                curveTo(12.9685f, 12.25f, 13.9019f, 12.3421f, 14.7746f, 12.5129f)
                curveTo(15.6217f, 11.7291f, 16.7549f, 11.25f, 18.0f, 11.25f)
                curveTo(20.6234f, 11.25f, 22.75f, 13.3766f, 22.75f, 16.0f)
                curveTo(22.75f, 17.7601f, 21.7927f, 19.2966f, 20.3703f, 20.1172f)
                curveTo(19.9973f, 20.9266f, 19.2985f, 21.5697f, 18.1196f, 22.0085f)
                curveTo(16.8099f, 22.4961f, 14.8681f, 22.75f, 12.0f, 22.75f)
                curveTo(9.9742f, 22.75f, 8.4193f, 22.6229f, 7.2262f, 22.3815f)
                curveTo(6.0365f, 22.1406f, 5.1559f, 21.7761f, 4.5264f, 21.2635f)
                curveTo(3.2474f, 20.222f, 3.2488f, 18.7638f, 3.2499f, 17.602f)
                lineTo(3.25f, 17.5f)
                curveTo(3.25f, 15.8661f, 4.4195f, 14.5396f, 5.9755f, 13.6643f)
                curveTo(7.5549f, 12.7759f, 9.6865f, 12.25f, 12.0f, 12.25f)
                close()
                moveTo(4.75f, 17.5f)
                curveTo(4.75f, 16.6487f, 5.3714f, 15.7251f, 6.7108f, 14.9717f)
                curveTo(8.0268f, 14.2315f, 9.8953f, 13.75f, 12.0f, 13.75f)
                curveTo(12.6061f, 13.75f, 13.194f, 13.79f, 13.7557f, 13.865f)
                curveTo(13.4322f, 14.5069f, 13.25f, 15.2322f, 13.25f, 16.0f)
                curveTo(13.25f, 18.3893f, 15.0141f, 20.3666f, 17.3108f, 20.7004f)
                curveTo(16.2401f, 21.0366f, 14.578f, 21.25f, 12.0f, 21.25f)
                curveTo(10.0258f, 21.25f, 8.5807f, 21.1252f, 7.5238f, 20.9113f)
                curveTo(6.4635f, 20.6967f, 5.8441f, 20.4022f, 5.4736f, 20.1004f)
                curveTo(4.7903f, 19.544f, 4.75f, 18.8078f, 4.75f, 17.5f)
                close()
                moveTo(18.0f, 12.75f)
                curveTo(16.2051f, 12.75f, 14.75f, 14.2051f, 14.75f, 16.0f)
                curveTo(14.75f, 17.7949f, 16.2051f, 19.25f, 18.0f, 19.25f)
                curveTo(19.7949f, 19.25f, 21.25f, 17.7949f, 21.25f, 16.0f)
                curveTo(21.25f, 14.2051f, 19.7949f, 12.75f, 18.0f, 12.75f)
                close()
            }
        }
            .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
