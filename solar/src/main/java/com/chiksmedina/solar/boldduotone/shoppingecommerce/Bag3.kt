package com.chiksmedina.solar.boldduotone.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Bag3: ImageVector
    get() {
        if (_bag3 != null) {
            return _bag3!!
        }
        _bag3 = Builder(
            name = "Bag3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5739f, 4.6915f)
                curveTo(4.7407f, 5.3829f, 4.5212f, 6.5534f, 4.0823f, 8.8943f)
                lineTo(3.3323f, 12.8943f)
                curveTo(2.7151f, 16.186f, 2.4065f, 17.8318f, 3.3062f, 18.9159f)
                curveTo(4.2059f, 20.0f, 5.8805f, 20.0f, 9.2295f, 20.0f)
                horizontalLineTo(14.7704f)
                curveTo(18.1195f, 20.0f, 19.794f, 20.0f, 20.6937f, 18.9159f)
                curveTo(21.5934f, 17.8318f, 21.2849f, 16.186f, 20.6677f, 12.8943f)
                lineTo(19.9177f, 8.8943f)
                curveTo(19.4787f, 6.5534f, 19.2593f, 5.3829f, 18.4261f, 4.6915f)
                curveTo(17.5929f, 4.0f, 16.4021f, 4.0f, 14.0204f, 4.0f)
                horizontalLineTo(9.9795f)
                curveTo(7.5979f, 4.0f, 6.407f, 4.0f, 5.5739f, 4.6915f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0004f, 9.2502f)
                curveTo(11.0219f, 9.2502f, 10.1875f, 8.6252f, 9.8782f, 7.7503f)
                curveTo(9.7402f, 7.3597f, 9.3117f, 7.155f, 8.9212f, 7.2931f)
                curveTo(8.5306f, 7.4311f, 8.3259f, 7.8596f, 8.464f, 8.2501f)
                curveTo(8.9784f, 9.7056f, 10.3665f, 10.7502f, 12.0004f, 10.7502f)
                curveTo(13.6343f, 10.7502f, 15.0224f, 9.7056f, 15.5368f, 8.2501f)
                curveTo(15.6749f, 7.8596f, 15.4702f, 7.4311f, 15.0796f, 7.2931f)
                curveTo(14.6891f, 7.155f, 14.2606f, 7.3597f, 14.1226f, 7.7503f)
                curveTo(13.8133f, 8.6252f, 12.9789f, 9.2502f, 12.0004f, 9.2502f)
                close()
            }
        }
            .build()
        return _bag3!!
    }

private var _bag3: ImageVector? = null
