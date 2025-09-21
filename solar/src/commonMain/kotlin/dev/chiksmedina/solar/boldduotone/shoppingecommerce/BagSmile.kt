package dev.chiksmedina.solar.boldduotone.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.BagSmile: ImageVector
    get() {
        if (_bagSmile != null) {
            return _bagSmile!!
        }
        _bagSmile = Builder(
            name = "BagSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0828f, 11.8943f)
                curveTo(4.5217f, 9.5534f, 4.7412f, 8.3829f, 5.5743f, 7.6915f)
                curveTo(6.4075f, 7.0f, 7.5984f, 7.0f, 9.98f, 7.0f)
                horizontalLineTo(14.0209f)
                curveTo(16.4026f, 7.0f, 17.5934f, 7.0f, 18.4266f, 7.6915f)
                curveTo(19.2598f, 8.3829f, 19.4792f, 9.5534f, 19.9181f, 11.8943f)
                lineTo(20.6681f, 15.8943f)
                curveTo(21.2853f, 19.186f, 21.5939f, 20.8318f, 20.6942f, 21.9159f)
                curveTo(19.7945f, 23.0f, 18.12f, 23.0f, 14.7709f, 23.0f)
                horizontalLineTo(9.23f)
                curveTo(5.881f, 23.0f, 4.2064f, 23.0f, 3.3067f, 21.9159f)
                curveTo(2.407f, 20.8318f, 2.7156f, 19.186f, 3.3328f, 15.8943f)
                lineTo(4.0828f, 11.8943f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.75f, 5.9848f)
                curveTo(9.75f, 4.7422f, 10.7574f, 3.7348f, 12.0f, 3.7348f)
                curveTo(13.2426f, 3.7348f, 14.25f, 4.7422f, 14.25f, 5.9848f)
                verticalLineTo(6.9848f)
                curveTo(14.816f, 6.985f, 15.3119f, 6.9866f, 15.7499f, 6.9997f)
                curveTo(15.75f, 6.9948f, 15.75f, 6.9898f, 15.75f, 6.9848f)
                verticalLineTo(5.9848f)
                curveTo(15.75f, 3.9138f, 14.0711f, 2.2348f, 12.0f, 2.2348f)
                curveTo(9.9289f, 2.2348f, 8.25f, 3.9138f, 8.25f, 5.9848f)
                verticalLineTo(6.9848f)
                curveTo(8.25f, 6.9898f, 8.25f, 6.9948f, 8.2501f, 6.9998f)
                curveTo(8.6881f, 6.9866f, 9.184f, 6.9851f, 9.75f, 6.9849f)
                verticalLineTo(5.9848f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.8782f, 15.7503f)
                curveTo(10.1875f, 16.6252f, 11.0219f, 17.2502f, 12.0004f, 17.2502f)
                curveTo(12.9789f, 17.2502f, 13.8133f, 16.6252f, 14.1226f, 15.7503f)
                curveTo(14.2606f, 15.3597f, 14.6891f, 15.155f, 15.0796f, 15.2931f)
                curveTo(15.4702f, 15.4311f, 15.6749f, 15.8596f, 15.5368f, 16.2501f)
                curveTo(15.0224f, 17.7056f, 13.6343f, 18.7502f, 12.0004f, 18.7502f)
                curveTo(10.3665f, 18.7502f, 8.9784f, 17.7056f, 8.464f, 16.2501f)
                curveTo(8.3259f, 15.8596f, 8.5306f, 15.4311f, 8.9212f, 15.2931f)
                curveTo(9.3117f, 15.155f, 9.7402f, 15.3597f, 9.8782f, 15.7503f)
                close()
            }
        }
            .build()
        return _bagSmile!!
    }

private var _bagSmile: ImageVector? = null
